package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.dto.Like;
import model.dto.Registeration;

public class RegisterationDAO {
	private JDBCUtil jdbcUtil = null;
	
	// JDBC 객체 생성
	public RegisterationDAO() {
		jdbcUtil = new JDBCUtil();
	}
	
	// [C] 새로운 수강 이벤트 생성
	public int create(Registeration rg) throws SQLException {
		String sql = "INSERT INTO REGISTERATION VALUES (?, ?, ?, ?)";
		Object[] param = new Object[] {
				rg.getRegisterationID(), rg.getUserID(), rg.getLectureID(), rg.getValidity()
		};
		
		jdbcUtil.setSqlAndParameters(sql, param);
		
		try {
			int result = jdbcUtil.executeUpdate();
			return result;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		} finally {
			jdbcUtil.commit();
			jdbcUtil.close();
		}
		
		return 0;
	} 
	
	// [D] 수강 취소
	public int remove(int registerationID) throws SQLException {
		String sql = "DELETE FROM REGISTERATION WHERE registerationID=?";
		
		jdbcUtil.setSqlAndParameters(sql, new Object[] {registerationID});
		
		try {				
			int result = jdbcUtil.executeUpdate();	
			return result;
		} catch (Exception ex) {
			jdbcUtil.rollback();
			ex.printStackTrace();
		}
		finally {
			jdbcUtil.commit();
			jdbcUtil.close();	
		}	
		
		return 0;
	}
	
	// [R] 해당 ID에 해당하는 수강 이벤트를 수강 도메인 클래스에 저장하여 반환
	public Registeration findRegisteration(int registerationID) throws SQLException {
		String sql = "SELECT * FROM REGISTERATION WHERE registerationID=?";
		
		jdbcUtil.setSqlAndParameters(sql, new Object[] {registerationID});
		
		try {
			ResultSet rs = jdbcUtil.executeQuery();		
			if (rs.next()) {						
				Registeration registeration = new Registeration(registerationID, rs.getInt("userID"), rs.getInt("lectureID"), rs.getInt("validity"));
				return registeration;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			jdbcUtil.close();		
		}
		
		return null;
	}
	
}

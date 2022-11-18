package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.dto.User;

public class UserDAO {
	private JDBCUtil jdbcUtil = null;
	
	// JDBC 객체 생성
	public UserDAO() {
		jdbcUtil = new JDBCUtil();
	}
	
	// [C] 새로운 사용자 생성
	public int create(User user) throws SQLException {
		String sql = "INSERT INTO USER VALUES (?, ?, ?)";
		Object[] param = new Object[] {user.getUserID(), user.getPw(), user.getMajor()};
		
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
	
	// [U] 기존의 사용자 정부 수정
	public int update(User user) throws SQLException {
		String sql = "UPDATE USER SET userID=?, pw=?, major=? WHERE userID=?";
		Object[] param = new Object[] {user.getPw(), user.getMajor(), user.getUserID()};
		
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
	
	// [D] 해당 ID를 사용하는 사용자 삭제
	public int remove(int userID) throws SQLException {
		String sql = "DELETE FROM USER WHERE userID=?";
		jdbcUtil.setSqlAndParameters(sql, new Object[] {userID});
		
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
	
	// [R] 해당 ID를 사용하는 사용자를 User 도메인 클래스에 저장하여 반환
	public User findUser(int userID) throws SQLException {
		String sql = "SELECT * FROM USER WHERE userID=?";
		
		jdbcUtil.setSqlAndParameters(sql, new Object[] {userID});
		
		try {
			ResultSet rs = jdbcUtil.executeQuery();
			if(rs.next()) {
				User user = new User(userID, rs.getString("pw"), rs.getString("major"));
				return user;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			jdbcUtil.close();
		}
		
		return null;
	}

}

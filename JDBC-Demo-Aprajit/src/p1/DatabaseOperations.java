package p1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DatabaseOperations {

	// old code use with jdbc 4 driver or with statement/ crearteStatement object
	// not with preparedStatement obj
	public boolean createCourse(String courseName, String category, int duration, int tests) throws Exception {
		Connection con = DatabaseUtil.con;

		String sqlStatement = "insert into courses values('" + courseName + "','" + category + "'," + duration + ","
				+ tests + ")";
		PreparedStatement ps = con.prepareStatement(sqlStatement);
		int rowsEffected = ps.executeUpdate();// DML- statement

		if (rowsEffected > 0)
			return true;
		else
			return false;

	}

	// new code use with jdbc 5 API driver with preparedStatement obj
	public boolean insertCourse(String courseName, String category, int duration, int tests) throws Exception {
		Connection con = DatabaseUtil.con;

		String sqlStatement = "insert into courses values(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sqlStatement);
		ps.setString(1, courseName);
		ps.setString(2, category);
		ps.setInt(3, duration);
		ps.setInt(4, tests);

		int rowsEffected = ps.executeUpdate();// DML- statement

		if (rowsEffected > 0)
			return true;
		else
			return false;

	}

	// new code use with jdbc 5 API driver with preparedStatement obj
	public boolean deleteCourseByName(String courseName) throws Exception {
		Connection con = DatabaseUtil.con;

		String sqlStatement = "delete from courses where coursename = ?";
		PreparedStatement ps = con.prepareStatement(sqlStatement);
		ps.setString(1, courseName);
	
		int rowsEffected = ps.executeUpdate();// DML- statement

		if (rowsEffected > 0)
			return true;
		else
			return false;

	}
	
	
	// delete courses on the basis of Category 
	
	// delete courses on the basis of category and test 
	
	// update course test value on the basis of courseName

	public List<Courses> getAllCourses() throws Exception {
		Connection con = DatabaseUtil.con;
		List<Courses> list = new ArrayList<>();

		String sql = "select * from courses";
		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();// bcoz its select query , does not change the database

		while (rs.next()) {
			String courseName = rs.getString("courseName");
			String category = rs.getString("category");
			int duration = rs.getInt("duration");
			int tests = rs.getInt("testinclude");

			Courses course = new Courses(courseName, category, duration, tests);
			list.add(course);
		}

		return list;
	}

}

import utils.DBUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DBRunner {

	private static final String URL = "db.url";
	private static final String USER = "db.user";
	private static final String PASSWORD = "db.password";

	/** 1 task */
	private static final String SELECT_ALL_STUDENTS  = "SELECT * FROM students";
	private static final String SELECT_ALL_GROUPS 	 = "SELECT * FROM groups";
	private static final String SELECT_ALL_TEACHERS  = "SELECT * FROM teachers";

	/** 2 task */
	private static final String CREATE_USER   	= "INSERT INTO students (name, group_id) VALUES (?,?)";
	private static final String CREATE_GROUP  	= "INSERT INTO groups (name) VALUES (?)";
	private static final String CREATE_SUBJECT  = "INSERT INTO subjects (name, description) VALUES (?,?)";
	private static final String CREATE_TEACHER  = "INSERT INTO teachers (name, experience, subject_id) VALUES (?,?,?)";

	/** 3 task */
	private static final String UPDATE_STUDENT	= "UPDATE students SET name=?, group_id=? WHERE id=?";
	private static final String UPDATE_TEACHER	= "UPDATE teachers SET name=?, experience=?, group_id=? WHERE id=?";
	private static final String UPDATE_SUBJECT	= "UPDATE subjects SET name=?, description=? WHERE id=?";
	private static final String UPDATE_GROUP	= "UPDATE groups SET name=? WHERE id=?";

	/** 4 task */
	private static final String GET_GROUP_OF_STUDENTS	= "SELECT * FROM students WHERE group_id=?";

	/** 5 task */
	private static final String GET_GROUPS_WITH_MATHEMATIC	= "SELECT * FROM groups WHERE";

	/** 6 task */
	private static final String GET_SUBJECTS_THAT_STUDIED_BY_ALL_GROUPS	= "";

	/** 7 task */
	private static final String GET_MOST_EXPERIENCED_TEACHER	= "SELECT * FROM teachers WHERE experience = (SELECT MAX(experience) FROM teachers);";
	private static final String GET_LESS_EXPERIENCED_TEACHER	= "SELECT * FROM teachers WHERE experience = (SELECT MIN(experience) FROM teachers);";

	/** 8 task */
	private static final String GET_TEACHERS_THAT_HAVE_EXPERIENCE_MORE_THAN_3_YEARS	= "SELECT * FROM teachers WHERE experience > 3;";

	/** 9 task */
	private static final String GET_GUMANITARIUM_SUBJECTS	= "SELECT * FROM subjects WHERE name IN ('history', 'literature', 'phylosophy')";
	private static final String GET_GUMANITARIUM_SUBJECTS2	= "SELECT * FROM subjects WHERE description LIKE %gumanitarium%";

	/** 10 task */
	private static final String GET_ALL_STUDENTS_AVG_MARK_ON_PHYSICS	= "";
	private static final String GET_GROUP_STUDENTS_AVG_MARK_ON_PHYSIC	= "";

	/** 11 task */
	private static final String GET_GROUP_WITH_MORE_THAN_3_STUDENTS_LEARN_PHYLOSOPHY	= "";



	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		ResultSet resultSet = null;
		Properties properties = new Properties();

		File file = new File("test.properties");
		FileInputStream fileInput = null;

		try {
			fileInput = new FileInputStream(file);
			properties.load(fileInput);
			fileInput.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


		try(Connection connection = DBUtils.getConnection(
				properties.getProperty(URL),
				properties.getProperty(USER),
				properties.getProperty(PASSWORD));
		PreparedStatement statement = connection.prepareStatement("")){


		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

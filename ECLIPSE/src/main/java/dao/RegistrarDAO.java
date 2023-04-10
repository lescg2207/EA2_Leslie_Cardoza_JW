package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.user;
import db.Db;

public class RegistrarDAO {
	
	public static void registerUser(user user) throws SQLException {
	    String sql = "INSERT INTO tb_user" +
	        "  (user_nom,  user_mail, user_pass, user_estado) VALUES " +
	        " (?, ?, ?, ?);";

	    try (Connection connection = Db.getConexion();
	        PreparedStatement ps = connection.prepareStatement(sql)) {
	    	ps.setString(1, user.getName());
	    	ps.setString(2, user.getEmail());
	    	ps.setString(3, user.getPass());
	    	ps.setInt(4, user.getEstado());

	        System.out.println(ps);
	        int result = ps.executeUpdate();
	        if (result == 0) {
	            throw new SQLException("ERROR!: Usuario no registrado");
	        }
	    } catch (SQLException e) {
	        printSQLException(e);
	        throw e;
	    }
	}
	
	private static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

}

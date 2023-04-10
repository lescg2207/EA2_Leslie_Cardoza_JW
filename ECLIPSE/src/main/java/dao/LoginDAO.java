package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.user;
import db.Db;

public class LoginDAO {
	Connection cn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public user logueo(String email, String pass) {
		user usuario = null;
		
		try {
			cn = Db.getConexion();
			
			String sql = "SELECT user_mail, user_pass FROM tb_user WHERE user_mail = ? AND user_pass = ?";
			ps = cn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				usuario = new user();
				usuario.setEmail(rs.getString("email"));
				usuario.setPass(rs.getString("pass"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				
				if (ps != null) {
					ps.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return usuario;
	}
	
	
	public boolean updatepass(String email, String pass, String newPass) {
		
		boolean resultado = false;
		
	    try {

	        cn = Db.getConexion();

	        String sql = "UPDATE Usuario SET password = ? WHERE email = ?";
	        ps = cn.prepareStatement(sql);
	        ps.setString(1, newPass);
	        ps.setString(2, email);
	        int filasAct = ps.executeUpdate();

	        if (filasAct == 1) {
	            resultado = true;
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (ps != null) {
	                ps.close();
	            }

	            if (cn != null) {
	                cn.close();
	            }
	        } catch (Exception e2) {
	            e2.printStackTrace();
	        }
	    }

	    return resultado;
	}
}

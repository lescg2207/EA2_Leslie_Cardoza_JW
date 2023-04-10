package bean;

public class user {

	private String name;
	private String email;
	private String pass;
	private int estado;
	public user(String name, String email, String pass, int estado) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.estado = estado;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public user() {
		super();
	}
	
	
	
	
	
	
	
	
	
}

package rovapp;

import java.util.ArrayList;

public class Usuarios {
	
	public int id;
	public String user;
	public String senha;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public ArrayList<Usuarios> listarUsuario(){
		
		ArrayList<Usuarios> listarUsuarios = new ArrayList<Usuarios>();
		
		Usuarios user1 = new Usuarios();
		user1.setId(1);
		user1.setUser("fernanda");
		user1.setSenha("fernanda");
		
		Usuarios user2 = new Usuarios();
		user2.setId(2);
		user2.setUser("admin");
		user2.setSenha("admin");
		
		listarUsuarios.add(user1);
		listarUsuarios.add(user2);	
		
		return listarUsuarios;
	}
	
	

}

package Principal;

public class Usuario {

	private int Id_usuario;
	private String Email;
	private String Nome;
	
	public Usuario(int id_usuario, String email, String nome) {
		super();
		Id_usuario = id_usuario;
		Email = email;
		Nome = nome;
	}
	public int getId_usuario() {
		return Id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		Id_usuario = id_usuario;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	
}
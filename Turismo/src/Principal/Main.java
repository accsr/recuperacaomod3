package Principal;

import java.util.List;
 
import Principal.DAO.UsuarioDAO;

public class Main {

	public static void main(String[] args) {
	
		// Criar objeto da Classe DAO do médico
		UsuarioDAO UsuarioDAO = new UsuarioDAO() ;
 
		// Criar médico
		
		Usuario Usuario1 = new Usuario();
		Usuario1.setEmail("augustoccsr@gmail.com");
		Usuario1.setNome("Augusto Cesar da Cunha Silva Resende");
		UsuarioDAO.criarUsuario(Usuario1);
	}

}



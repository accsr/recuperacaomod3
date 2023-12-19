package Principal.DAO;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import Principal.Conexao;
import Principal.Usuario;
 
public class UsuarioDAO {
	
	 private Connection conexao;
 
	
 
    public UsuarioDAO() {
 
        try {
 
            conexao = Conexao.conectar();
 
        } catch (SQLException e) {
 
            e.printStackTrace();
 
        }
 
    }
 
 
 
    public void criarUsuario(Usuario Usuario) {
 
        String sql = "INSERT INTO Medicos (nome, especialidade) VALUES (?, ?)";
 
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
 
            stmt.setString(1, Usuario.getEmail());
 
            stmt.setString(2, Usuario.getNome());
 
            stmt.executeUpdate();
 
        } catch (SQLException e) {
 
            e.printStackTrace();
 
        }
 
    }
    
    public void fecharConexao() {
 
        try {
 
            if (conexao != null && !conexao.isClosed()) {
 
                conexao.close();
 
            }
 
        } catch (SQLException e) {
 
            e.printStackTrace();
 
        }
 
    }
    
}
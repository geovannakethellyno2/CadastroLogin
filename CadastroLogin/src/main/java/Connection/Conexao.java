/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import static Connection.Conexao.conectar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GeovannaOliviera
 */
public class Conexao {
    public static Connection conectar() throws SQLException{
    
        String servidor = "localhost";// padrão
        String porta = "3306";//padrão
        String banco = "projetoLogin";
        String usuario = "root";// padrão
        String senha = "S3n4c@2026";// padrão
       // Montar a URL JDBC do MySQL.
        String url = "jdbc:mysql://" + servidor
                + ":" + porta + "/" + banco;
        
        return DriverManager.getConnection(url, usuario, senha);   
        
    }
    
    public static void main(String[] args) throws SQLException {
     
      // Abre a conexão e fecha automaticamente ao terminar.
        try (Connection conexao = conectar()) {

            if (conexao.isValid(5)) {
                System.out.println("Conectado ao MySQL com sucesso!");
            } else {
                System.out.println("A conexão não respondeu ao teste.");
            }

        } catch (SQLException erro) {

            System.out.println("Erro ao conectar ao banco:");
            System.out.println(erro.getMessage());

        }
    }
}

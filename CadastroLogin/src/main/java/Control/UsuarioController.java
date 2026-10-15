/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;


import Connection.Conexao;
import Model.Usuario;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * Model - define os dados a serem salvo
 * conexão - conectar ao banco de dados
 * view - define as nossa telas
 * Control - responsavel pelas ações (salvar, listar, excluir, atualizar, logar, deslogar)
 * @author GeovannaOliviera
 */
public class UsuarioController{
//throws SQLExcepition - é obrigatorio em metados que usam     
// Connection - conecta-se ao banco de dados
//PreparedStatement - prepara o comando insert para enviar ao banco    
    
 public void CadastrarUsuario(Usuario user) throws SQLException{
String sql = "INSERT INTO usuario " 
        + "(nome, cpf,sexo, email, senha, telefone, endereco," 
        + "dataNascimento) VALUES (?,?,?,?,?,?,?,?)";

try(Connection conexao = Conexao.conectar();
PreparedStatement comando = conexao.prepareStatement(sql)){
 comando.setString(1, user.getNome());
 comando.setString(2, user.getCpf());
 comando.setString(3, user.getSexo());
 comando.setString(4, user.getEmail());
 comando.setString(5, user.getSenha());
 comando.setString(6, user.getTelefone()); 
 comando.setString(7, user.getEndereco());
 comando.setString(8, user.getDataNascimento());
 // executando o comando dentro do mysql
 comando.executeUpdate();
  JOptionPane.showMessageDialog(null, "Usuário  cadastrado!");
 
 
 }catch(SQLException e){
     JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");

}
 }
}



   

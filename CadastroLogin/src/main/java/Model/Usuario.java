/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author GeovannaOliviera
 */
public class Usuario {
    
 /*primeira regra de segurança:
    - Todos os atributos são declarados como privados
    - Private informa que somente a classe Usuario pode acessar*/ 
    
 private String nome, dataNascimento, cpf, email, senha, telefone, endereco, sexo;
 
//Construtor- metodo que inicializa o objeto criado
 //Construtor-precisa ter o mesmo nome da classe
 
 public void Usuario(){
     
 }
 
 //SETTER- é ultilizado para cadastrar e atualizar dados
 // metado com parametro - quem chamar tem que passar texto
 
 public void setNome(String valor){
  this.nome = valor;    
 }
 public void setCpf(String valor){
  this.cpf = valor;
 }
 public void setDataNascimento(String valor){
  this.dataNascimento = valor;
 }
 public void setEmail(String email) {
  this.email = email;
 }
 public void setSenha(String senha) {
  this.senha = senha;
 }
 public void setTelefone(String telefone) {
  this.telefone = telefone;
 }
 public void setEndereco(String endereco) {
  this.endereco = endereco;
 }
 public void setSexo(String sexo) {
  this.sexo = sexo;
 }
 
 //GETTER - possibilidade ler o dado que tem na variavel
 // metodo com retorno tipo String
 // this - serve para indicar que a váriavel esta dentro da classe
 
 public String getNome(){
  return this.nome;
 }
 public String getDataNascimento() {
  return dataNascimento;
 }
 public String getCpf() {
  return cpf;
 }
 public String getEmail() {
  return email;
 }
 public String getSenha() {
  return senha;
 }
 public String getTelefone() {
  return telefone;
 }
 public String getEndereco() {
  return endereco;
 }
 public String getSexo() {
  return sexo;
 }

    }

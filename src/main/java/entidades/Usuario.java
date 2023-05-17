package entidades;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;


@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String login;
	private String senha;
	
	public Integer getId() {
		return this.id;
	}
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {
		return "Usuario [Login=" + login + ", Senha=" + senha + "]";
	}
	
}
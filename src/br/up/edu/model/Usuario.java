package br.up.edu.model;

public class Usuario
{
	//---------Atributos--------------
	
	private String nome;
	
	private String login;
		
	private String senha;
	
	
	//---------Construtores-----------
	
	
	public Usuario(String nome,String login,String senha)
	{
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		UsuarioLista.InserirUsuario(this);
	}
	
	
	//--------Getters & Setters-------

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getLogin()
	{
		return login;
	}

	public void setLogin(String login)
	{
		this.login = login;
	}

	public String getSenha()
	{
		return senha;
	}

	public void setSenha(String senha)
	{
		this.senha = senha;
	}

}

package br.up.edu.model;

import br.up.edu.seguranca.HashEnum;

public class Usuario
{
	//---------Atributos--------------
	
	private String nome;
	
	private String login;
		
	private byte[] senha;
		
	//---------Construtores-----------
		
	public Usuario(String nome,String login,String senha)
	{
		this.nome = nome;
		this.login = login;
		this.senha = UsuarioLogic.GerarHashSenha(senha,HashEnum.MD5.name());
		UsuarioLogic.InserirUsuario(this);
	}
	
	//---------OverrideToString-------
	
	@Override
	public String toString()
	{
		return "Usuário:\n"
				+ "Nome: " + nome + ".\nLogin: " + login + ".";
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

	public byte[] getSenha()
	{
		return senha;
	}

	public void setSenha(byte[] senha)
	{
		this.senha = senha;
	}

}

package br.up.edu.controller;

import br.up.edu.model.Usuario;

public class UsuarioController
{	
	public static Usuario InserirUsuario(String nome,String login, String senha)
	{
		return UsuarioControllerLogic.InserirUsuario(nome, login, senha);
	}
	
	public static boolean EfetuarLogin(String login, String senha)
	{
		return UsuarioControllerLogic.EfetuarLogin(login, senha);
	}
	
	public static boolean MudarNome(String nome,Usuario usuario)
	{
		return UsuarioControllerLogic.MudarNome(nome, usuario);
	}
	
	public static Usuario BuscarUsuarioPorLoginESenha(String login, byte[] senha)
	{
		return UsuarioControllerLogic.BuscarUsuarioPorLoginESenha(login, senha);
	}
	
	public static Usuario BuscarUsuarioPorLoginESenha(String login,String senha)
	{
		return UsuarioControllerLogic.BuscarUsuarioPorLoginESenha(login, senha);
	}
	
	public static String BuscarUsuarioPorNome(String nome)
	{
		return UsuarioControllerLogic.BuscarUsuarioPorNome(nome);
	}
	
	public static String BuscarUsuarioStringPorLoginESenha(String login, byte[] senha)
	{
		return UsuarioControllerLogic.BuscarUsuarioStringPorLoginESenha(login, senha);
	}
}

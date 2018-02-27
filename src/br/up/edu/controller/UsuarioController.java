package br.up.edu.controller;

import br.up.edu.model.Usuario;
import br.up.edu.model.UsuarioLista;

public class UsuarioController
{
	
	public static void InserirUsuario(String nome,String login, String senha)
	{
		new Usuario(nome,login,senha);		
	}
	
	public static boolean EfetuarLogin(String login, String senha)
	{
		return UsuarioLista.EfetuarLogin(login, senha);
	}
	
}

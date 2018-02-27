package br.up.edu.model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioLista
{
	//---------Atributos--------------
	
	private static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	//---------Construtores-----------	
	
	//--------Getters & Setters-------

	public static List<Usuario> getUsuarios()
	{
		return usuarios;
	}

	public static void setUsuarios(List<Usuario> usuarios)
	{
		UsuarioLista.usuarios = usuarios;
	}
	
	//----------M�todos----------------
	
	public static void InserirUsuario(Usuario usuario)
	{
		usuarios.add(usuario);
	}
	
	public static boolean EfetuarLogin(String login,String senha)
	{
		return usuarios.stream().anyMatch(u -> u.getLogin().equals(login)  // Por algum motivo, quando utilizo o operador de igualdade == ao inv�s do equals, ele sempre retorna false. TODO: Investigar o porqu�
											&& u.getSenha().equals(senha));
	}
	
}

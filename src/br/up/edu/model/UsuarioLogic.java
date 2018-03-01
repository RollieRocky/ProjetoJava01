package br.up.edu.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import br.up.edu.seguranca.SegurancaLogic;

public class UsuarioLogic
{
	//---------Atributos--------------
	
	private static List<Usuario> usuarios = new ArrayList<Usuario>();
	
	//--------Getters & Setters-------

	public static List<Usuario> getUsuarios()
	{
		return usuarios;
	}

	public static void setUsuarios(List<Usuario> usuarios)
	{
		UsuarioLogic.usuarios = usuarios;
	}
	
	//----------Métodos----------------
	
	public static void InserirUsuario(Usuario usuario)
	{
		usuarios.add(usuario);
	}
	
	public static boolean EfetuarLogin(String login,byte[] senha)
	{
		return usuarios.stream().anyMatch(u -> u.getLogin().equals(login)
											&& u.getSenha().equals(senha));
	}
	
	public static Optional<Usuario> BuscarUsuarioPorLoginSenha(String login,byte[] senha)
	{		
		return  usuarios.stream().filter(u -> u.getLogin().equals(login) 
											&& u.getSenha().equals(senha)).findFirst();
	}
	
	public static Optional<Usuario> BuscarUsuarioPorNome(String nome)
	{		
		return  usuarios.stream().filter(u -> u.getNome().equals(nome)).findFirst();
	}
	
	public static boolean AlterarNome(String nome,Usuario usuario)
	{		
		usuarios.get(usuarios.indexOf(usuario)).setNome(nome);
		return true;		
	}
	
	public static byte[] GerarHashSenha(String senha,String algoritmo)
	{
		return SegurancaLogic.GerarHash(senha,algoritmo);
	}
}

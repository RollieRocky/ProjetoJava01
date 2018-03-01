package br.up.edu.controller;

import java.util.Optional;

import br.up.edu.model.Usuario;
import br.up.edu.model.UsuarioLogic;
import br.up.edu.seguranca.HashEnum;

public class UsuarioControllerLogic
{
	public static Usuario InserirUsuario(String nome,String login, String senha)
	{
		return new Usuario(nome,login,senha);
	}
	
	public static boolean EfetuarLogin(String login, String senha)
	{
		byte[] senhaHash = UsuarioLogic.GerarHashSenha(senha,HashEnum.MD5.name());
		return UsuarioLogic.EfetuarLogin(login, senhaHash);
	}
	
	public static boolean MudarNome(String nome,Usuario usuario)
	{
		return UsuarioLogic.AlterarNome(nome, usuario);
	}
	
	public static Usuario BuscarUsuarioPorLoginESenha(String login, byte[] senha)
	{
		Optional<Usuario> usuario = UsuarioLogic.BuscarUsuarioPorLoginSenha(login, senha);
		if(!usuario.equals(null))  
			return usuario.get(); 
			else 
				return null;
	}
	
	public static Usuario BuscarUsuarioPorLoginESenha(String login, String senha)
	{
		byte[] senhaHash = UsuarioLogic.GerarHashSenha(senha,HashEnum.MD5.name());
		Optional<Usuario> usuario = UsuarioLogic.BuscarUsuarioPorLoginSenha(login, senhaHash);
		if(!usuario.equals(null))  
			return usuario.get(); 
			else 
				return null;
	}
	
	public static String BuscarUsuarioPorNome(String nome)
	{
		Optional<Usuario> usuario = UsuarioLogic.BuscarUsuarioPorNome(nome);
		if(!usuario.equals(null))  
			return usuario.get().toString(); 
			else 
				return "Usuário não encontrado!";
	}
	
	public static String BuscarUsuarioStringPorLoginESenha(String login, byte[] senha)
	{
		Optional<Usuario> usuario = UsuarioLogic.BuscarUsuarioPorLoginSenha(login, senha);
		if(!usuario.equals(null))  
			return usuario.get().toString(); 
			else 
				return null;
	}

}

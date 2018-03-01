package br.up.edu.view;

import br.up.edu.controller.UsuarioController;
import br.up.edu.model.Usuario;
import br.up.edu.utils.Console;

public class MenuLogic
{
	public static void Editar(Usuario userSession)
	{
		String nome = Console.LerEscrever("Ok!\nInsira o novo nome que deseja: ");
		if(UsuarioController.MudarNome(nome,userSession))
			Console.Escrever("Nome alterado para " + nome + " com sucesso!");
		else
			Console.Escrever("Ocorreu um erro ao alterar o nome. Mais informações abaixo.");	
	}
	
	public static void VerUsuario(Usuario userSession) 
	{
		String resposta = UsuarioController.BuscarUsuarioStringPorLoginESenha(userSession.getLogin(), userSession.getSenha());
		Console.Escrever(resposta);
	}
	
	public static Usuario EfetuarLogin()
	{
		return Menu.PrimeiroAcesso();
	}
	
	public static void Pesquisar()
	{
		String nome = Console.LerEscrever("Ok!\nInsira o nome do usuário que deseja achar: ");
		String resposta = UsuarioController.BuscarUsuarioPorNome(nome);
		Console.Escrever(resposta);
	}

	public static Usuario RefreshSession(Usuario userSession)
	{
		return UsuarioController.BuscarUsuarioPorLoginESenha(userSession.getLogin(), userSession.getSenha());
	}
	
	public static Usuario CadastrarUsuario()
	{
		
		String nome = Console.LerEscrever("Insira o seu nome: ");
		String login = Console.LerEscrever("Insira seu login: ");
		String senha = Console.LerEscrever("Insira sua senha: ");
		
		return UsuarioController.InserirUsuario(nome, login, senha);
	}

	public static Usuario LoginLogic()
	{
		String login = "";
		String senha = "";
		boolean permissaoContinuar = false;
		do 
		{
			
		login= Console.LerEscrever("Insira o seu login: ");
		senha = Console.LerEscrever("Insira sua senha: ");
		
		permissaoContinuar = UsuarioController.EfetuarLogin(login, senha);
		
		if(!permissaoContinuar)		
			Console.Escrever("Senha ou login errados!");
					
		}
		while(!permissaoContinuar);
		return UsuarioController.BuscarUsuarioPorLoginESenha(login, senha);
	}
	
	public static Usuario PrimeiroAcesso() 
	{
		String resposta = "";
		
		while(!InputValidoTelaPrincipal(resposta)) 		
			resposta = Console.LerEscrever("Você já está cadastrado em nossa plataforma?\nDigite S ou N");
		
		if(resposta.toLowerCase().equals("s")) 		
			return LoginLogic();		
		else 		
			return CadastrarUsuario();	
	}

	public static boolean InputValidoTelaPrincipal(String input)
	{
		return input.toLowerCase().equals("s") || input.toLowerCase().equals("n");
	}
	
	public static String GerarConteudoMenu() //Quando adicionar alguma funcionalidade, mexer nesta string para aparecer no menu.
	{
		return "Digite:\n"
				+ "1.Para editar seu nome.\n"
				+ "2.Para ver seu login.\n"
				+ "3.Para sair e fazer login com outra conta.\n"
				+ "4.Para encontrar alguém em nosso sistema.\n"
				+ "5.Para sair.";
	}
}


package br.up.edu.view;

import br.up.edu.controller.UsuarioController;
import br.up.edu.utils.Console;

public class Menu
{

	public static void TelaPrincipal()
	{
		PrimeiroAcesso();
		String conteudoMenu = MenuService.GerarConteudoMenu();

		do { // TODO: Verificar se vale a pena usar enum e if e else ou se devo mudar para switch.
			//TODO: Fazer valida��o de hash para as senhas, e n�o senha direta.
			int input = Integer.parseInt(Console.LerEscrever(conteudoMenu));
			// TODO: Implementar os seguintes m�todos:
			if (input == MenuOpcoes.Editar.ordinal())
			{
				
			} 
			else if (input == MenuOpcoes.VerUsuario.ordinal())
			{
				
			} 
			else if (input == MenuOpcoes.EfetuarLogin.ordinal())
			{
				
			} 
			else if (input == MenuOpcoes.Pesquisar.ordinal())
			{
				
			} 
			else
			{
				Console.Escrever("Op��o inv�lida. Favor insira uma op��o v�lida.");
			}
			
		}
		while(true); // TODO: Fazer uma valida��o melhor para este While.
		

	}
	
	public static void PrimeiroAcesso()
	{
		String resposta = "";
		
		while(!MenuService.InputValidoTelaPrincipal(resposta)) 		
			resposta = Console.LerEscrever("Voc� j� est� cadastrado em nossa plataforma?\nDigite S ou N");
		
		if(resposta.toLowerCase().equals("s")) 		
			TelaLogin();		
		else 		
			TelaCadastro();		
	}
	
	public static void TelaLogin() 
	{
		String login= Console.LerEscrever("Insira o seu login: ");
		String senha = Console.LerEscrever("Insira sua senha: ");
		
		if(UsuarioController.EfetuarLogin(login, senha))		
			Console.Escrever("Login efetuado com sucesso! ");	
		else 		
			Console.Escrever("Senha ou login errados!");		
	}
	
	public static void TelaCadastro()
	{
		String nome = Console.LerEscrever("Insira o seu nome: ");
		String login = Console.LerEscrever("Insira seu login: ");
		String senha = Console.LerEscrever("Insira sua senha: ");

		UsuarioController.InserirUsuario(nome, login, senha);
	}

}

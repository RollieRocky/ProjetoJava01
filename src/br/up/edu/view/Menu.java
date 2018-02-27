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
			//TODO: Fazer validação de hash para as senhas, e não senha direta.
			int input = Integer.parseInt(Console.LerEscrever(conteudoMenu));
			// TODO: Implementar os seguintes métodos:
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
				Console.Escrever("Opção inválida. Favor insira uma opção válida.");
			}
			
		}
		while(true); // TODO: Fazer uma validação melhor para este While.
		

	}
	
	public static void PrimeiroAcesso()
	{
		String resposta = "";
		
		while(!MenuService.InputValidoTelaPrincipal(resposta)) 		
			resposta = Console.LerEscrever("Você já está cadastrado em nossa plataforma?\nDigite S ou N");
		
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

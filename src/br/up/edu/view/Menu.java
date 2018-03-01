package br.up.edu.view;

import br.up.edu.model.Usuario;
import br.up.edu.utils.Console;

public class Menu
{

	public static void TelaPrincipal()
	{
		Usuario userSession = PrimeiroAcesso();
		String conteudoMenu = MenuLogic.GerarConteudoMenu();

		do {
			userSession = MenuLogic.RefreshSession(userSession);			
			int input = Integer.parseInt(Console.LerEscrever(conteudoMenu));
			
			if (input == MenuOpcoes.Editar.getOpcao())		
				MenuLogic.Editar(userSession);
			
			else if (input == MenuOpcoes.VerUsuario.getOpcao())			
				MenuLogic.VerUsuario(userSession);
			
			else if (input == MenuOpcoes.EfetuarLogin.getOpcao())			
				userSession = MenuLogic.EfetuarLogin();
							 
			else if (input == MenuOpcoes.Pesquisar.getOpcao())			
				MenuLogic.Pesquisar();
			
			else if(input == MenuOpcoes.Sair.getOpcao()) 			
				break;
			
			else			
				Console.Escrever("Opção inválida. Favor insira uma opção válida.");
			
			
		}
		while(true); // TODO: Fazer uma validação melhor para este While.
		
	}
	
	public static Usuario PrimeiroAcesso()
	{
		return MenuLogic.PrimeiroAcesso();
	}
	
	public static Usuario TelaLogin() 
	{
		return MenuLogic.LoginLogic();
	}
	
	public static Usuario TelaCadastro()
	{
		return MenuLogic.CadastrarUsuario();
	}

}

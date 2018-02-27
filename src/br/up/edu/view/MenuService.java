package br.up.edu.view;

public class MenuService
{
	//Faz validações relacionadas ao menu:
	
	public static boolean InputValidoTelaPrincipal(String input)
	{
		return input.toLowerCase().equals("s") || input.toLowerCase().equals("n");
	}
	
	public static String GerarConteudoMenu() //Quando adicionar alguma funcionalidade, mexer nesta string para aparecer no menu.
	{
		return "Digite:\n1.Para editar seu nome.\n2.Para ver seu login.\n3.Para entrar fazer login com outra conta.\n4.Para encontrar alguém em nosso sistema.";
	}

}

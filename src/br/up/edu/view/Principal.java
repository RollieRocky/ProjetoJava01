package br.up.edu.view;

import br.up.edu.utils.Console;

public class Principal
{
	public static void main(String[] args)
	{
		try 
		{
			Menu.TelaPrincipal();
		}
		catch(Exception ex)
		{
			Console.Escrever("Ops! Ocorreu um erro: " + ex.getMessage());
		}

	}

}

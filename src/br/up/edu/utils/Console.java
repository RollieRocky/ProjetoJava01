package br.up.edu.utils;

import java.util.Scanner;

public class Console
{
	static Scanner teclado = new Scanner(System.in);
	
	//Métodos relacionados ao uso do console.
	
	public static void Escrever(String mensagem) 
	{
		System.out.println(mensagem);
	}
	
	public static String Ler() 
	{
		return teclado.nextLine();
	}
	
	public static String LerEscrever(String mensagem)
	{
		Escrever(mensagem);
		return Ler();
	}
	
	public static void Pausar() 
	{
		Escrever("Pressione qualquer tecla para continuar! ");
		teclado.nextLine();
	}
	
	public static void LimparBuffer()
	{
		teclado.nextLine();
	}

}

package br.up.edu.seguranca;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SegurancaLogic
{

	public static byte[] GerarHash(String frase,String algoritmo) 
	{
		  try {
		    MessageDigest md = MessageDigest.getInstance(algoritmo);
		    md.update(frase.getBytes());
		    return md.digest();
		  } catch (NoSuchAlgorithmException e) {
		    return null;
		  }
	}
	
}

package br.up.edu.view;

public enum MenuOpcoes
{
	Editar(1),
	VerUsuario(2),
	EfetuarLogin(3),
	Pesquisar(4),
	Sair(5);
	
	private int opcao;
		
	MenuOpcoes(int valor)
	{
		opcao = valor;
	}
	
    public int getOpcao()
    {
        return opcao;
    }
   

}

package application;

import entities.Diretorios;
import entities.EscreverArquivos;
import entities.LerArquivos;

public class Program {

	public static void main(String[] args) {

		EscreverArquivos escrever = new EscreverArquivos();
		LerArquivos ler = new LerArquivos();
		Diretorios diretorio = new Diretorios();
		
		diretorio.propriedadesDoArquivo();
	}
	
	

}

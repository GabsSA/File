package entities;

import java.io.File;
import java.util.Scanner;

public class Diretorios {
	

	
	
	//Filtrar Diretorios
	public void pastasDoDiretorio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o Diretorio: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("PASTAS: ");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		sc.close();
	}
	
	//Listar Arquivos de um Diretorio
	public void arquivosDoDiretorio() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o Diretorio: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		File[] files = path.listFiles(File::isFile);
		System.out.println("Arquivos: ");
		
		for (File file : files) {
			System.out.println(file);
		}
		
		sc.close();
	}
	
	public void criarSubPasta() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o Diretorio: ");
		String strPath = sc.nextLine();
		
		
		boolean sucesso = new File(strPath + "\\subdir").mkdir();
		System.out.println("Pasta Criada !");
	}
	
	public void propriedadesDoArquivo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o diretorio do arquivo: ");
		String str = sc.nextLine();
		
		File file = new File(str);
		System.out.println("Nome do Arquivo: " + file.getName());
		System.out.println("Diretorio Completo: " + file.getPath());
		System.out.println("Pasta: " + file.getParent());
		sc.close();
	}

}

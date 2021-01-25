package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivos {
	
	
	
	//Ler arquivos delimitados por ;
	public void ler() {
		
		String path = "C:\\temp\\arquivo.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				String[] palavras = line.split(";");
				
				
				System.out.println("--------------------------");
				for (String p : palavras) {
					System.out.println("Palavra Lida: " + p);
				}
				
				line = br.readLine();
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}

}

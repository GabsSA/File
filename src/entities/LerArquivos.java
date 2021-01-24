package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivos {
	
	public void Ler() {
		
		String path = "C:\\temp\\teste.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}

}

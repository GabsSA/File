package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivos {
	
	public void Escrever() {
		String [] lines = new String[] {"TESTE", "LOUCO", "KILLER", "HAHA"};
		
		String path = "C:\\temp\\teste.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			
			for(String line : lines) {
				for(int i = 0; i< 10;i++) {
				bw.write(line);
				bw.newLine();
				}
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}

package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] lines = new String[] {"Good morning", "good afternoon", "good night"};
		
		String path = "C:\\Jogos\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ //argumento true no FileWriter forçará acrescimo, e não criação de novas linhas
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}

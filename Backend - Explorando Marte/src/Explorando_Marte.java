import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Explorando_Marte {
	public static Map map;
	static List<String> input = new ArrayList<>();
	static List<String> output = new ArrayList<>();
	
	public static void main (String []args) throws IOException{
		
		
		
		//Lendo arquivo de texto e criando Arraylist com o conteudo
		try{
			reader();
    
		}catch (FileNotFoundException e){
			System.out.println("The input file was not found.");
			System.exit(0);
		}
	    
	    //Criando mapa
		map = Map.createMap(input);
	    
	    //Executando os comandos do input
	    Sonda.executingCommands();
	    
	    //Imprimindo os Outputs
	    printOutput();
	    
	    
	}
	
	public static void reader() throws IOException{
		
		FileReader freader= new FileReader("input.txt");
	    
		BufferedReader inputFile = new BufferedReader(freader);
		String line = null;
		
	    //Criando ArrayList com as entradas
	    while ((line = inputFile.readLine())!= null) 
	    	input.add(line);
	    
	    inputFile.close();
	}
	
	public static void printOutput(){
		for (int i = 0; i < output.size() ; i++){
	    	System.out.println(output.get(i));
	    }
	}
}

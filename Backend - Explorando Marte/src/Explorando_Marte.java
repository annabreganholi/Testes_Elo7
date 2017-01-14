import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Explorando_Marte {
	public static Map map;
	static List<String> input = new ArrayList<>();
	
	public static void main (String []args) throws IOException{
		
		Sonda sonda;
		String[] sondaInitialPosition;
		List<String> output = new ArrayList<>();
		String commands;
		
		FileReader freader = new FileReader("input.txt");
	    BufferedReader inputFile = new BufferedReader(freader);
		String line = null;
	    //Criando ArrayList com as entradas
	    while ((line = inputFile.readLine())!= null) 
	    	input.add(line);
	    
	    //Criando mapa
	    map = new Map(Character.getNumericValue(input.get(0).charAt(0)), 
	    				Character.getNumericValue(input.get(0).charAt(2)));
	    
	    
	    for (int i=1; i<input.size();i++){
	    	//Criando Sonda e colocando posicao inicial
	    	sondaInitialPosition = input.get(i).split(" ");
	    	
	    	//Pegando primeiro e segundo valor do array de String, passando os dois primeiros para coordenadas, e o terceiro para char (Direcao)
	    	sonda = new Sonda(Integer.parseInt(sondaInitialPosition[0]), 
	    			Integer.parseInt(sondaInitialPosition[1]), 
	    			sondaInitialPosition[2].charAt(0));
	    	//Indo para os comandos da sonda
	    	i++;
	    	
	    	//Realizando operacoes de caminho
	    	commands = input.get(i);
	    	
	    	for (int j = 0; j < input.get(i).length() ; j++){
	    		if (commands.charAt(j) == 'L' || commands.charAt(j) == 'R'){
	    			sonda.changeDirection(commands.charAt(j));
	    		}else if (commands.charAt(j) == 'M'){
	    			sonda.move();
	    		}
	    		
	    	}
	    	
	    	//Salvando as posicoes finais
	    	output.add((map.getMapX() - sonda.actualPosition[0])+ " " + 
	    								sonda.actualPosition[1] + " " + 
	    								sonda.direction);

	    }
	    
	    for (int i = 0; i < output.size() ; i++){
	    	System.out.println(output.get(i));
	    }
	   
	    inputFile.close();
	}
}

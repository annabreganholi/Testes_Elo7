import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Explorando_Marte {
	public static Map map;	
	public static void main (String []args) throws IOException{
		
		FileReader freader=new FileReader("input.txt");
	    BufferedReader inputFile=new BufferedReader(freader);
		String line=null;
	    List<String> input = new ArrayList<>();
	    while ((line = inputFile.readLine())!= null) 
	    	input.add(line);
	    
	    
	        for (int i=0; i<input.size();i++)
	    System.out.println(input.get(i));    
	    //map = new Map();
	        inputFile.close();
	}
}

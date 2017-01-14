import java.util.List;


public class Map {
	static int[][] mapSize;
	static int maxX;
	
	public Map (int X, int Y){
		Map.mapSize = new int[X+1][Y+1]; // +1 porque a coordena do ponto superior direito sera um a mais que a posicao maxima do array
		Map.maxX = X;
	}
	
	public int getMapX(){
		return maxX;
	}
	public static Map createMap(List<String> input){
		return new Map(Character.getNumericValue(input.get(0).charAt(0)), 
				Character.getNumericValue(input.get(0).charAt(2)));
		  
	}
}

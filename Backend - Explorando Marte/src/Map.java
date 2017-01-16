import java.util.List;


public class Map {
	static int[][] mapSize;
	static int maxY;
	
	public Map (int X, int Y){
		Map.mapSize = new int[X+1][Y+1]; // +1 porque a coordena do ponto superior direito sera um a mais que a posicao maxima do array
		Map.maxY = Y;
	}
	
	public int getMapY(){
		return maxY;
	}
	public static Map createMap(List<String> input){
		return new Map(Character.getNumericValue(input.get(0).charAt(0)), 
				Character.getNumericValue(input.get(0).charAt(2)));
		  
	}
}

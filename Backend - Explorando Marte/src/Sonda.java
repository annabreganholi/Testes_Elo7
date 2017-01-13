
public class Sonda {
	
	int[] initialPosition = new int[2];
	int[] actualPosition = new int[2];
	char direction;
	
	public Sonda (int X, int Y, char direction){
		this.initialPosition[0] = X;
		this.initialPosition[1] = Y;
		this.actualPosition = this.initialPosition;
		this.direction = direction;
	}
	
	public void changeDirection (char newDirection){
		this.direction = newDirection;
	}
	
	public void changeActualPosition(){
		
	}
	
}

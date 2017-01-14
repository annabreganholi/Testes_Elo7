
public class Sonda {
	
	int[] initialPosition = new int[2];
	int[] actualPosition = new int[2];
	char direction;
	
	public Sonda (int X, int Y, char direction){
		this.initialPosition[0] = Explorando_Marte.map.getMapX() - X;
		this.initialPosition[1] = Y;
		this.actualPosition = this.initialPosition;
		this.direction = direction;
	}
	
	public void changeDirection (char newDirection){
		if (this.direction == 'N'){
			if (newDirection == 'L') this.direction = 'W';
			else if (newDirection == 'R') this.direction = 'E';
		}else if (this.direction == 'S'){
			if (newDirection == 'L')this.direction = 'E';
			else if (newDirection == 'R') this.direction = 'W';
		}else if (this.direction == 'E'){
			if (newDirection == 'L') this.direction = 'N';
			else if (newDirection == 'R') this.direction = 'S';
		}else if (this.direction == 'W'){
			if (newDirection == 'L') this.direction = 'S';
			else if (newDirection == 'R') this.direction = 'N';
		}
	}
	
	public void move(){
		if(direction == 'E'){
			this.actualPosition[0] = this.actualPosition[0] - 1; //Y mantem, X diminui 1 (numeracao do X esta invertido em relacao ao plano cartesiano da atividade
		}
		else if(direction == 'W'){
			this.actualPosition[0] = this.actualPosition[0] + 1; //Y mantem, X aumenta 1
		}
		else if(direction == 'N'){
			this.actualPosition[1] = this.actualPosition[1] + 1; //X mantem, Y aumenta 1
		}
		else if(direction == 'S'){
			this.actualPosition[1] = this.actualPosition[1] - 1; //X mantem, Y diminui 1
		}
	}
	
}

import static org.junit.Assert.*;


import org.junit.Test;


public class Explorando_MarteTest {

	@Test
	public void testMapSize(){
	    Map map = new Map(3, 2);
	    int result = map.getMapY();
	    assertEquals(2, result);
	}
	@Test
	public void testSondaInitialPosition(){
		Explorando_Marte.map = new Map (3, 3);
		Sonda sonda = new Sonda(3, 1, 'N');
		int [] position = sonda.initialPosition;
		int [] rightPos = {0,1};
		assertEquals(rightPos[0], position[0]);
		assertEquals(rightPos[1], position[1]);
		assertEquals('N', sonda.direction);
	}
	@Test
	public void testSondaChangeDirections(){
		Explorando_Marte.map = new Map (3, 3);
		Sonda sonda = new Sonda(3, 1, 'N');
		sonda.changeDirection('R');
		assertEquals('E', sonda.direction);
	}
	@Test
	public void testSondaMove(){
		Explorando_Marte.map = new Map (3, 3);
		Sonda sonda = new Sonda(3, 1, 'N');
		sonda.move();
		int[] rightPos = {0, 2};
		assertEquals(rightPos[0], sonda.actualPosition[0]);
		assertEquals(rightPos[1], sonda.actualPosition[1]);
	}
	@Test
	public void testOutput(){
		Explorando_Marte.input.add("5 5");
		Explorando_Marte.input.add("1 2 N");
		Explorando_Marte.input.add("LMLMLMLMM");
		Explorando_Marte.map = Map.createMap(Explorando_Marte.input);
		Sonda.executingCommands();
		Explorando_Marte.printOutput();
		assertEquals("1 3 N", Explorando_Marte.output.get(0));
		
	}
}

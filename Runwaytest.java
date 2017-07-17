import static org.junit.Assert.*
;


import org.junit.Test;

public class Runwaytest {

	
	
	@Test
	public void test_waitToLand1() {
		Runway runway = new Runway();
		runway.waitToLand(1);
		runway.waitToLand(2);
		assertEquals(1, runway.waitToLand(10));
	}
	
	@Test
	public void test_waitToLand2() {
		Runway runway = new Runway();
		runway.waitToLand(1);
		runway.waitToLand(2);
		assertEquals(0, runway.waitToLand(2));
	}
	@Test
	public void test_toTakeoff1() {
		Runway runway = new Runway();
		runway.waitToTakeOff(1);
		runway.waitToTakeOff(2);
		assertEquals(1, runway.waitToTakeOff(10));

	}
	@Test
	public void test_toTakeoff2() {
		Runway runway = new Runway();
		runway.waitToTakeOff(3);
		runway.waitToTakeOff(5);
		assertEquals(0, runway.waitToTakeOff(3));

	}
	//When there is a plane in the queue and the run way is clear.
	@Test
	public void landing1() {
		Runway runway = new Runway();
		runway.waitToLand(3);
		runway.clearRunway();
		assertEquals(1, runway.landing());
	}
	//When there is plane in the queue and the run way is not clear.
	@Test
	public void landing2() {
		Runway runway = new Runway();
		runway.waitToLand(3);
		assertEquals(0, runway.landing());
	}
	
	
	//when there is no plane in the landing que and runway is clear
	@Test
	public void landing3() {
		Runway runway = new Runway();
		runway.clearRunway();
		assertEquals(0, runway.landing());
	}
	
	
	//when there is no plane in landing queue and runway is not clear
	@Test
	public void landing4() {
		Runway runway = new Runway();
		assertEquals(0, runway.landing());
	}
	//When there is some one in the queue and the run way is clear.
	@Test
	public void takeOff1() {
		Runway runway = new Runway();
		runway.waitToTakeOff(3);
		runway.clearRunway();
		assertEquals(1, runway.takeOff());
	}
	//When there is plane in the take off queue and the run way is not clear.
	@Test
	public void takeOff2() {
		Runway runway = new Runway();
		runway.waitToTakeOff(3);
		assertEquals(0, runway.takeOff());
	}
	
	
	//when there is no plane in the takeOffQueue  and runway is clear
	@Test
	public void takeOff3() {
		Runway runway = new Runway();
		runway.clearRunway();
		assertEquals(0, runway.takeOff());
	}
	
	
	//when there is no plane in takeOffqueue and run way is not clear
	@Test
	public void takeOff4() {
		Runway runway = new Runway();
		assertEquals(0, runway.takeOff());
	}
	//when there is no plane in takeOffqueue and run way is not clear
	@Test
	public void clearRunway1() {
		Runway runway = new Runway();
		assertEquals(1, runway.clearRunway());
	}
	//when there is no plane in takeOffqueue and run way is not clear
	@Test
	public void clearRunway2() {
		Runway runway = new Runway();
		 runway.clearRunway();
		assertEquals(1, runway.clearRunway());
	}
}


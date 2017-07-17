
public interface Inter {

	
	
	public int waitToLand(int flightNumber);
	
	/*
	 * Description:Add planes to queue for landing. It returns 1 if adding is successful.
	 * 				It returns 0 if adding is not successful. 
	 * Precondition:A valid flight signal is received
	 * Post condition: The flight is added to the queue.
	 * Test cases: Flight number is unique 
	 * 				Flight number is not unique
	 
	 */
	
	public int waitToTakeOff(int flightNumber);
	
	/*
	 * Description:Add planes to queue for take off. It returns 1 if adding is successful.
	 * 				It returns 0 if adding is not successful. 
	 * Precondition:A valid flight signal is received.
	 * Post condition: The flight is added to the queue.
	 * Test cases: Flight number is unique 
	 * 				Flight number is not unique
	 */
		
	public int clearRunway();
	
	/*
	 * Description: It removes the plane from the run way and 
	 * 				make the run way empty .
	 * Precondition: There should be a plane in the run way 
	 * 				or run way should be empty.
	 * Post condition:the run way is clear.
	 * Test cases:The runway is empty 
	 * 				or the run way is occupied. 
	 */
		
	public int landing();
	
	/*
	 * Description: this method send the signal to the first plane 
	 * 				From the queue of landing. 
	 * 				It returns 1 if the landing is successful 
	 * 				and return o if the landing is not successful.
	 * Precondition: There should be some valid flight in the queue to land.
	 * 				run way should be empty.
	 * Post condition: The plane is removed from the landing queue 
	 * 				and stay in the run way.
	 * Test cases: if some one is the landing queue 
	 * 				and if the run way is clear,
	 */
		
	public int takeOff();
	
	/*
	 * Description: This method remove the flight from the
	 * take off queue and place it to run way.  
	 * 				It returns 1 if the take off is successful 
	 * 				and return o if the take off is not successful.
	 * Precondition: There should be some valid flight in the queue to take off 
	 * 				and the run way should be empty..
	 * Post condition: The plane is removed from the take off queue 
	 * 				and place on the run way.
	 * Test cases: if there is some one is the landing queue 
	 * 				and if the run way is clear
	 */

}

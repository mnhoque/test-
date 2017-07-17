import java.util.ArrayList;

public class Runway implements Inter{
	int flightnumber;
	boolean runwayIsEmpty = false;
	ArrayList<Integer> queueToLand = new ArrayList<Integer>();
	ArrayList<Integer> queueToTakeOff = new ArrayList<Integer>();
	

	
	public void generateFlight(){
		//generate unique flight number
		//to identify plane
	}
	public int waitToLand(int flightNumber){
		//generate a flight; add this flight to queToLand array
		for(int i = 0; i<queueToLand.size(); i++){
			if(queueToLand.get(i)==flightNumber){
				return 0;
			}
			
		}
		queueToLand.add(flightNumber);
		return 1;
		
	}
	public int waitToTakeOff(int flightNumber){
		//generate a flight; add this flight to toTakeOff array
		for(int i = 0; i<queueToTakeOff.size(); i++){
			if(queueToTakeOff.get(i)==flightNumber){
				return 0;
			}
		}
		queueToTakeOff.add(flightNumber);
		return 1;
	}
	public int clearRunway(){
		runwayIsEmpty = true;
		return 1;
		
		//set the boolean runwayIsEmpty to true;
	}
	public int landing(){
		if (runwayIsEmpty == true && queueToLand.size() != 0){
			queueToLand.remove(0);
			runwayIsEmpty=false;	
			return 1;
		}
		else{	
			return 0;
		}
		//check if the boolean runwayIsEmpty is true
		//check who is at the head of the arrayqueToLand;
		//return 1 if the run way is empty and remove it from the array;
		//return 0 if the run way is not empty;
		
	}
	
	public int takeOff(){
		if(runwayIsEmpty== true && queueToTakeOff.size() != 0){
			queueToTakeOff.remove(0);
			runwayIsEmpty=false;	
			return 1;
		}
		else{
			
			return 0;
		}
		//check if the boolean runwayIsEmpty is true
		//check who is at the head of the array to take off;
		//return 1 if the run way is empty and remove it from the array;
		//return 0 if the run way is not empty;
		
	}
	



}

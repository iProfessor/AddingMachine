package cse360assignment02;

public class AddingMachine {
	private int total;
	private String toReturn = "0";
	  
	  public AddingMachine () {
	    total = 0;
	  }
	  
	  public int getTotal () {
	    return total;	//stores calculation
	  }
	  
	  public void add (int value) {
		  this.total += value; //adds value to total
		  toReturn += " + " + value;
	  }

	  public void subtract (int value) {
		  this.total -= value;	//subtracts value from total
		  toReturn += " – " + value; //stores calculation
	  }

	  public String toString () {
	    return toReturn; //returns calculation "memory"
	  }

	  public void clear() {
		  total = 0;	//resets calculation total
		  toReturn = "0";	//resets "memory"
	  }
}

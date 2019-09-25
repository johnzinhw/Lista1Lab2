import java.util.ArrayList;
import java.util.Collections;

public class ex3array {
	public static void main(String[] args) {
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(34);
	    myNumbers.add(8);
	    myNumbers.add(14);
	    myNumbers.add(21);
	    myNumbers.add(32);
	    myNumbers.add(82);
	    myNumbers.add(56);

	    Collections.sort(myNumbers);  // Sort myNumbers

	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	  }
	}


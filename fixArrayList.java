import java.util.ArrayList;

public class fixArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> intNum = new ArrayList<Integer>();
		intNum.add(5);
		intNum.add(32);
		intNum.add(27);
		intNum.add(14);
		intNum.add(41);

		intNum.add(10);
		intNum.add(15);
		intNum.add(20);
		intNum.add(25);
		intNum.add(30);

		for (int i : intNum) {
			System.out.println(i);
		}
	}
}



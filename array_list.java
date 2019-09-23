
import java.util.ArrayList;

public class array_list {

	public static void main(String[] args) {
		ArrayList<String> carros = new ArrayList<String>();
		
		carros.add("palio");
		carros.add("prisma");
		carros.add("stilo");
		
		carros.set(1, "Honda");
		
		carros.remove(0);
		
		System.out.print(carros.get(0));
		
		carros.clear();
		
		System.out.println(carros);
		
	}

}


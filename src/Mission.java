import java.util.Scanner;

public class Mission {
	public static void main(String[] args) {
		System.out.println("몇x몇?");
		Scanner scanner1 = new Scanner(System.in);
		String inputValue = scanner1.nextLine();
		
		//input
		
		String[] splitedValue = inputValue.split("x");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		for(int i=1; i<first+1; i++) {
		for(int j=1; j<second+1; j++) {
			System.out.println(i*j);
		}
			
		}
	}
}

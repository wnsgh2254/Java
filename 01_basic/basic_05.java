import java.util.Scanner;
public class basic_05 {

	public static void main(String[] args) {
		
		Scanner yard = new Scanner(System.in);
		System.out.print("yard?  ");
		double num = yard.nextDouble();
		double num_2 = Math.round((num*91.44)*10) / 10.0;
		System.out.println(num + "yard = " + num_2+"cm");
		
		
		
		yard.close();
		
		
		

	}

}

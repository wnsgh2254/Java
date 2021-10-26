import java.util.Scanner;
public class loop_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Base :");
			double base = sc.nextDouble();


			System.out.print("Height : ");
			double height = sc.nextDouble();


			double width =	(Math.round(base*height/2 *10)) / 10;


			System.out.println("Triangle width : " + width);

			System.out.print("Continue ? ");
			String y = sc.next();

			if (y.equals("y") || y.equals("Y")) 
			{
				continue;
			}
			else
			{
				break;
			}


		} 

		sc.close();
	}

}

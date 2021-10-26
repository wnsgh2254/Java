import java.util.Scanner;
public class condition_3 {

	public static void main(String[] args) {
		String animal;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number? ");
		int num = sc.nextInt();
		
		switch (num)
		{
		case 1:
			animal = "dog" ;
			break;
			
		case 2:
			animal = "cat";
			break;
		
		case 3:
			animal = "chick";
			break;
			
		
		default:
			animal = "I don't know";
			break;
		}
		
		System.out.println(animal);
		sc.close();
		
	}
	
}
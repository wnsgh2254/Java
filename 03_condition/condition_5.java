import java.util.Scanner;
public class condition_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별 : ");
		String gender = sc.nextLine();
		
		System.out.print("나이 : ");		
		int age = sc.nextInt();
		
		
		
		
		if (gender.equals("M") && age >= 18) 
		{
			System.out.println("MAN");
		}
		
		else if (gender.equals("M") && age <18) 
		{
			System.out.println("BOY");
		}
		
		else if (gender.equals("F") && age >= 18) 
		{
			System.out.println("WOMAN");
		}
		
		else if (gender.equals("F") && age <18) 
		{
			System.out.println("GIRL");
		}
		
		
		
		
		sc.close();

	}

}

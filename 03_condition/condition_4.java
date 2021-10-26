import java.util.Scanner;

public class condition_4 {

	public static void main(String[] args) {
		int month = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number? ");
		int num = sc.nextInt();
		
		switch (num)
		{
		case 1:
			month = 31 ;
			break;
			
		case 2:
			month = 28;
			break;
		
		case 3:
			month = 31;
			break;
			
		case 4:
			month = 30;
			break;
		
		case 5:
			month = 31;
			break;
		
		case 6:
			month = 30;
			break;
			
		case 7:
			month = 31;
			break;
			
		case 8:
			month =31;
			break;
			
		case 9:
			month =30;
			break;
			
		case 10:
			month =31;
			break;
			
		case 11:
			month =30;
			break;
			
		case 12:
			month =31;
			break;		
		}
		
		System.out.println(month);
		sc.close();

	}

}

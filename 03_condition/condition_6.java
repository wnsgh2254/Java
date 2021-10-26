import java.util.Scanner;
public class condition_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		
		if ((year%400==0) || (year%100 != 0 && year% 4 ==0)) 
		{
			System.out.println("leap year");
		}
		
		else
		{
			System.out.println("common year");
		}
		
		sc.close();

	}

}

import java.util.Scanner;
public class operator_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		if (num1 > num2 && num1 > num2) 
		{
			System.out.print("1  ");
		}
		else 
		{
			System.out.print("0  ");
		}
		if (num1 == num2 && num1 == num3) 
		{
			System.out.print(1);
		}
		else 
		{
			System.out.print(0);
		}
		
		sc.close();

	}

}

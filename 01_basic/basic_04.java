import java.util.Scanner;
public class basic_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
				
		System.out.print("정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		int sum = num1+num2+num3;
		
		System.out.println("sum = " + sum);
		System.out.println("avg = " + (sum/3));		
		
		
		
		sc.close();
	}

}

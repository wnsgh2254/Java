import java.util.Scanner;
public class operator_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		
		int result1 = (num1>num2)? 1:0;
		int result2 = (num1<num2)? 1:0;
		int result3 = (num1>=num2)? 1:0;
		int result4 = (num1<=num2)? 1:0;
		
		
		System.out.println(num1+" > "+num2 + " --- "+result1);
		System.out.println(num1+" < "+num2 + " --- "+result2);
		System.out.println(num1+" >= "+num2 + " --- "+result3);
		System.out.println(num1+" <= "+num2 + " --- "+result4);
		
		
//		if (num1==num2) 
//		{
//			System.out.println(num1+" > "+num2 +" --- 0");
//			System.out.println(num1+" < "+num2 +" --- 0");
//			System.out.println(num1+" >= "+num2 +" --- 1");
//			System.out.println(num1+" <= "+num2 +" --- 1");
//		}
//		else if (num1 > num2)
//		{
//			System.out.println(num1+" > "+num2 +" --- 1");
//			System.out.println(num1+" < "+num2 +" --- 0");
//			System.out.println(num1+" >= "+num2 +" --- 1");
//			System.out.println(num1+" <= "+num2 +" --- 0");
//		}
//		else 
//		{
//			System.out.println(num1+" > "+num2 +" --- 0");
//			System.out.println(num1+" < "+num2 +" --- 1");
//			System.out.println(num1+" >= "+num2 +" --- 0");
//			System.out.println(num1+" <= "+num2 +" --- 1");
			
//		}
		sc.close();

	}
}

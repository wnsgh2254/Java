import java.util.Scanner;
public class condition_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num == 0) 
		{
			System.out.println("zero");
		}
		
		else if (num > 0) 
		{
			System.out.println("plus");
		}
		else
		{
			System.out.println("minus");
		}
		sc.close();
	}

}

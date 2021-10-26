import java.util.Scanner;
public class operator_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("민수의 키를 입력하세요 : ");
		int height1 = sc.nextInt();
		
		System.out.print("민수의 몸무게를 입력하세요 : ");
		int weight1 = sc.nextInt();
		
		System.out.print("기영이의 키를 입력하세요 : ");
		int height2 = sc.nextInt();
		
		System.out.print("기영이의 몸무게를 입력하세요 : ");
		int weight2 = sc.nextInt();
		
		if (height1 > height2 && weight1 > weight2) 
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
		
		
		
		
		
		sc.close();

	}

}

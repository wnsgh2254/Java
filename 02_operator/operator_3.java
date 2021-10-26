import java.util.Scanner;
public class operator_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
//		int num_1 = num1++;
//		int num_2 = --num2;
//		int mul = num_1 * num_2;
//		
//		
//		// 문제의 출력과 똑같이 만들기 위해 이렇게 작성했습니다.
//		System.out.print((num_1 +1) + " " + num_2 + " " + mul);
//		
//		
		
		// 밑에 코드는 문제의 요구사항에 맞게 작성했습니다.
		System.out.println( (num1++) + " " + (--num2) + " " + (num1*num2));

		
		
		
		
		
		
		sc.close();
	}

}

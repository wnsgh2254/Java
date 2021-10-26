import java.util.Scanner;
public class loop_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		int i = 0;

		if (num<0)  // 예외 처리
		{
			while (num<0) {
				System.out.print("양의 정수를 입력하세요 : ");
				num = sc.nextInt();			
			}
		}


		while (i <= num)   // 누적
		{
			sum += i;
			i++;	
		}
		sc.close();
		System.out.println(sum);
	}



}




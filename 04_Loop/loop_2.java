import java.util.Scanner;

public class loop_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("100 이하의 정수를 입력하세요 :");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = num; i <= 100; i++) {

			sum += i;


		}

		System.out.println(sum);


		sc.close();


	}

}

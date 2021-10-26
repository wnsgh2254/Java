import java.util.Scanner;
public class loop_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		int num = sc.nextInt();
		
		int sum = 0;
		
		int i = 1;

		while (i<=num) {
			sum += i;
			i++;
		}

		System.out.println(sum);

		sc.close();

	}

}

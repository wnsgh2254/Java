import java.util.Scanner;
public class nested_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();


		for (;;) {
			for (int i =1; (n*i)% 10 != 0; i++ ) 
			{
				System.out.print((n*i)+ " ");
			}
			System.out.println(n*10);
			break;
		}







		sc.close();

	}

}

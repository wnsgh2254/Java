import java.util.Scanner;

public class loop_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		int num = sc.nextInt();
		
		
		for (int i = 1; i<=10; i++) {
			
			System.out.print((num * i) +" ");
			
		}
		
		
		sc.close();
		
		

	}

}

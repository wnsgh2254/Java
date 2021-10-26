import java.util.Scanner;
public class nested_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 숫자를 입력하세요 : ");
		int n1 = sc.nextInt();
		
		System.out.print("열의 숫자를 입력하세요 : ");
		int n2 = sc.nextInt();
		
		int num = 1;
		
		for (int i= 0; i<n1; i++) 
		{
			for (int j=1; j<=n2; j++) 
			{
				System.out.print((num+i) * j + " " );
			}
			System.out.println("");
		}
		
		
		
		
		
		
		sc.close();

	}

}

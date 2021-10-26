import java.util.Scanner;
public class nested_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();
		
		
		
		int a = 1;
		
		for (int i=0; i<n; i++) 
		{
			for (int j=0; j<n; j++) 
			{
				if (a>=10) 
				{
					a = 1;
				}
				System.out.print(a + " ");
				a = a + 2;
			}
			System.out.println("");
		}
		
		
		
		sc.close();
	}

}

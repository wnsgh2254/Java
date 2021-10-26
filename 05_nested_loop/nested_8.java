import java.util.Scanner;
public class nested_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();





		int a = 1;



		for (int i =0; i<n; i++) 
		{	
			for (int x = 0; x <i; x++) 
			{
				System.out.print("  ");
			}




			for (int j = 0; j<(n-i); j++) 
			{
				System.out.print(a + " ");
				a++;
			}
			System.out.println("");
		}


		sc.close();

	}

}

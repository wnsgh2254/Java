import java.util.Scanner;
public class nested_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요 : ");
		int n = sc.nextInt();

		for (int i = n - 1 ; i>=0; i--) 
		{
			for (int a = 1; a< (n+i); a++)
			{
				if (a <( n- i))  
				{
					System.out.print(" ");
				}
				else 
				{
					System.out.print("*"); 
				}
			}
			System.out.println("*"); 
		}
		sc.close();

	}

}

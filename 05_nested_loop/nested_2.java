import java.util.Scanner;
public class nested_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n1 = sc.nextInt();

		System.out.print("정수를 입력하세요 : ");
		int n2 = sc.nextInt();

		if (n1>n2) 
		{
			for (int i=1; i<=9; i++) 
			{
				for (int j=0; j<=(n1-n2); j++) 
				{
					System.out.print((n1-j) +"*" + i + "=" + ((n1-j)*i) +"   ");
				}
				System.out.println("");
				
				
			}
		}
		else if (n1<n2) 
		{
			for (int i=1; i<=9; i++) 
			{
				for (int j=0; j<=(n2-n1); j++) 
				{
					System.out.print((n1+j) + "*" + i + "=" + ((n1+j)*i) +"   " );
				}
				System.out.println("");
				
				
			}
		}
		else 
		{
			for (int i=1; i<=9; i++) 
			{
				System.out.println(n1 + "*" + i + "=" + (n1*i));
				System.out.println("");
			}
		}
		sc.close();

	}

}

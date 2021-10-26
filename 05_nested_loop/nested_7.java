import java.util.Scanner;
public class nested_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int n = sc.nextInt();

		
		for (int i= (n-1); i>=0; i--) 
		{				
			for (int j = 0; (j+1)!=(i+1); j++) 
			{
				System.out.print("  ");
			}
		
			for (int a = 1; a<=(n-i); a++)  
			{							
				System.out.print(a+" ");
			}


			System.out.println("");

		}




		sc.close();

	}

}

import java.util.Scanner;
public class nested_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자연수를 입력하세요 : ");
		int num = sc.nextInt();
		
		
		for (int i = 0; i<num; i++) 
		{
			for (int j = 0; j<i+1; j++) 
			{
				 System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();

	}

}

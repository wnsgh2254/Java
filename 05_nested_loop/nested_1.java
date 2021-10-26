import java.util.ArrayList;
import java.util.Scanner;
public class nested_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요 :");
		int n = sc.nextInt();


		ArrayList<Integer> num_list = new ArrayList<>();
		int a = 1;
		int len = 0;
		int sum = 0;


		for (;;) {	
			num_list.add(a);   
			sum += a ;  
			a += 2; 



			if (sum>=n) 
			{
				break;
			}
			else 
			{
				continue;
			}
		}

		for (int i : num_list) 
		{
			len++;				
		}	




		System.out.println(len + " " + sum);




		sc.close();

	}


}

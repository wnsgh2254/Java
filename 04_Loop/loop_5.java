import java.util.Scanner;
import java.util.*;
public class loop_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = sc.nextInt();


		ArrayList<Integer> num_list = new ArrayList<>();

		int a = 0;

		while (num != 0)
		{

 
			if (num % 3 != 0 && num % 5 != 0) 
			{
				num_list.add(num);
			}
			System.out.print("정수를 입력하세요 : ");
			num = sc.nextInt();


		}
		
		for (int i : num_list) 
		{
			a++;				
		}	
		System.out.println(a);




		sc.close();

	}

}

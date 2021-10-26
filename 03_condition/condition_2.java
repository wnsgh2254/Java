import java.util.Scanner;
public class condition_2 {

	public static void main(String[] args) {
		String sentence;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳을 입력하세요 : ");
		String letter = sc.nextLine();
		
		switch (letter)
		{
		case "A":
			sentence = "Excellent" ;
			break;
			
		case "B":
			sentence = "Good";
			break;
		
		case "C":
			sentence = "Usually";
			break;
			
		case "D":
			sentence = "Effort";
			break;
			
		case "F":
			sentence = "Failure";
			break;
		default:
			sentence = "error";
			break;
		}
		
		System.out.println(sentence);
		
		sc.close();
		
		
		
		
		
		
		

	}

}

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class User 
{
	String userId,password;
	static int count;
	ArrayList<User> list = new ArrayList<User>();

	public User(String userId,String password) 
	{
		this.userId = userId;
		this.password = password;
	}

	void SignUp(String userId, String password)
	{	
		list.add(new User(userId, password));
		count++;
	}

	void Login(String userId, String password) 
	{
		for (User i : list) 
		{
			if (userId.equals(i.userId) && password.equals(i.password)) 
			{
				System.out.println("환영합니다.");
				break;
			}
			else
			{
				System.out.println("아이디 또는 비밀번호를 확인하세요.");
			}
		}

	}	
	void PrintAll() 
	{
		for(User obj : list) 
		{
			System.out.println("{" + obj.userId + "," + obj.password + "}");
		}
	}

	void Save() throws IOException 
	{
		FileWriter fr = (new FileWriter("./data/user.csv"));
		BufferedWriter out = new BufferedWriter(fr);
		for (User j : list) 
		{
			
			out.write("{" + j.userId + "," + j.password + "}");
			out.newLine();
			
		}
		out.close();
		fr.close();
	}

}



public class Miniproject_user {

	public static void main(String[] args) throws IOException {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		User us = new User("asdf","qwer");
		//		ArrayList<User> list = new ArrayList<User>();

		while(n != 4) 
		{
			System.out.println("=======================");
			System.out.println("1. Sign Up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("5. Save");
			System.out.println("=======================");
			System.out.print("번호를 입력하세요 : ");
			n = sc.nextInt();

			switch(n) {
			case 1:
				System.out.print("Id : ");
				String newId = sc.next();

				System.out.print("Password : ");
				String newPassword = sc.next();

				us.SignUp(newId, newPassword);
				break;
			case 2: 
				System.out.print("Id : ");
				String id = sc.next();

				System.out.print("Password : ");
				String ps = sc.next();

				us.Login(id, ps);
				break;

			case 3:
				us.PrintAll();
				break;
			case 4:
				break;


			case 5:

				us.Save();
				break;


			}


		}


		sc.close();


	}

}

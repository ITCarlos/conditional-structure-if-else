import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("What time is it? ");
		int n = input.nextInt();

		if (n < 12) {
			System.out.println("Good morning");
		} 
		else if (n < 18) {
			System.out.println("Good afternoon!");
		} 
		else {
			System.out.println("Good night");
		}

		input.close();

	}

}

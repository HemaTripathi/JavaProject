import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num ;
		int count =0;
		
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i = 1; i<num; i++) {
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println("This is Prime number");
		else
			System.out.println("This is a composite number");

	}

}

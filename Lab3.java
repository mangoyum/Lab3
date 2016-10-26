import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		//instantiate scanner
		Scanner scan = new Scanner(System.in);
		//prompt user to enter integer
		System.out.println("Learn your squares and cubes!");
		
		
		//initialize variable
		int number = 0; //instantiating number variable that user will put in
		int i = 0;//general practice to value at 0
		
		String cont = "y";//initializing a string variable for the continue question
	
		
		//create a loop
		while (cont.equalsIgnoreCase("y")) {//for the continue question
			System.out.println("Please enter a valid integer");
			number = scan.nextInt();//user input of number 
			System.out.println("Number \t" + "Square \t" + "Cube");//spacing the numbers into a table
			
			for  (i=1; i<= number; i++){
				int square = i * i;
				int cube = i * square;
				System.out.println(i + "\t" + square + "\t" + cube);
			}
			System.out.println("Continue? y/n:");
			cont = scan.next();
			//prompt user to input integer
			//calculation of square and cube
			//output of number, square and cube
		
			// ask if they want to continue
		}
			
		System.out.println("Goodbye");
		//break or goodbye statement
		scan.close();
	}

}

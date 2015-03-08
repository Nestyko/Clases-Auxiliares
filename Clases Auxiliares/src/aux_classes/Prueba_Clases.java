package aux_classes;
import java.util.Scanner;

import aux_classes.strings.StrFunction;


public class Prueba_Clases{

	private static Scanner input = new Scanner(System.in);

	public static void main (String[] args){

		System.out.print("Please enter your favorite number: ");
		int number = input.nextInt();
		Print.cls();
		Print.outSln(number+"");
		
		int[] numbers = new int[]{
			4,5,8,6,7
		};
		
		Integer[] numbs =  new Integer[numbers.length];
		for (int i = 0; i < numbs.length; i++) {
			numbs[i] = Integer.valueOf(numbers[i]);
		}
		
		StrFunction.toString(numbs);
		
		
		
		




		}//main
}//class
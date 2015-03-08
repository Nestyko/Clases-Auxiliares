package aux_classes;

import java.util.Random;

import aux_classes.strings.StrFunction;


public class Prueba_Clases{


	private static Random rand =  new Random();
	
	public static void main (String[] args){

		int[] numeros =  new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(50);
		}
		
		System.out.println(StrFunction.toString(numeros));
		
		
		




		}//main
}//class
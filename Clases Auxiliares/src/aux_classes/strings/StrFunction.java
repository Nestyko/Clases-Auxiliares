package aux_classes.strings;


public class StrFunction{
	

	
	public static int distancia_primera_ultima(String cadena, char buscar){
		return (cadena.lastIndexOf(buscar)-cadena.indexOf(buscar));
	}
	
	
	
	
	
	public static int sumatoria_digitos(String cadena){
		int sum = 0;
		for (int i = 0; i < cadena.length(); i++) {
			switch(cadena.charAt(i)){
			case '1': sum+= 1; break;
			case '2': sum+= 2; break;
			case '3': sum+= 3; break;
			case '4': sum+= 4; break;
			case '5': sum+= 5; break;
			case '6': sum+= 6; break;
			case '7': sum+= 7; break;
			case '8': sum+= 8; break;
			case '9': sum+= 9; break;
			}
		}
		return sum;
	}
	
	public static int contar_palabra(String cadena, String buscar){
		cadena = cadena.toLowerCase();
		buscar = cadena.toLowerCase();
		int coincidencias = 0;
		int aux = 0;
		while (aux <= cadena.length()){
			if(cadena.indexOf(buscar,aux) != -1){
				coincidencias++;
				aux = cadena.indexOf(buscar,aux)+buscar.length();
			}
			else{
				break;
			}
		}
		return coincidencias;
	}
	/**
	 * Convierte un vector de cualquier tipo en un String separando cada elemento con 4 espacios.
	 * @param element Es un vector de cualquier tipo de variable.
	 * @return El vector en forma de String, cada elemento separado por 4 espacios
	 */
	public static <T> void toString(T[] element){
		for (int i = 0; i < element.length; i++) {
			if(element[i] != null){
				System.out.print( element[i]+"    ");
			}
		}
	}
	
//	/**
//	 * Convierte un vector en una cadena de caracteres, diviendo a cada elemento con 3 espacios 
//	 * @param vec es el vector
//	 * @return el vector como una cadena de caracteres(String)
//	 */
//	public static String toString(int[] vec){
//		String a = " ";
//		for (int i = 0; i < vec.length; i++) {
//			a = ( a + (vec[i]+ "   "));
//		}
//		return a;
//	}
//	
//	/**
//	 * Convierte un vector en una cadena de caracteres, diviendo a cada elemento con 3 espacios 
//	 * @param vec es el vector
//	 * @return el vector como una cadena de caracteres(String)
//	 */
//	public static String toString(short[] vec){
//		String a = " ";
//		for (int i = 0; i < vec.length; i++) {
//			a = ( a + (vec[i]+ "   "));
//		}
//		return a;
//	}
//	
//	/**
//	 * Convierte un vector en una cadena de caracteres, diviendo a cada elemento con 3 espacios 
//	 * @param vec es el vector
//	 * @return el vector como una cadena de caracteres(String)
//	 */
//	public static String toString(double[] vec){
//		String a = " ";
//		for (int i = 0; i < vec.length; i++) {
//			a = ( a + (vec[i]+ "   "));
//		}
//		return a;
//	}
//	
//	/**
//	 * Convierte un vector en una cadena de caracteres, diviendo a cada elemento con 3 espacios 
//	 * @param vec es el vector
//	 * @return el vector como una cadena de caracteres(String)
//	 */
//	public static String toString(float[] vec){
//		String a = " ";
//		for (int i = 0; i < vec.length; i++) {
//			a = ( a + (vec[i]+ "   "));
//		}
//		return a;
//	}
//	
//	/**
//	 * Convierte un vector en una cadena de caracteres, diviendo a cada elemento con 3 espacios 
//	 * @param vec es el vector
//	 * @return el vector como una cadena de caracteres(String)
//	 */
//	public static String toString(byte[] vec){
//		String a = " ";
//		for (int i = 0; i < vec.length; i++) {
//			a = ( a + (vec[i]+ "   "));
//		}
//		return a;
//	}
//	
//	/**
//	 * Convierte un vector en una cadena de caracteres, diviendo a cada elemento con 3 espacios 
//	 * @param vec es el vector
//	 * @return el vector como una cadena de caracteres(String)
//	 */
//	public static String toString(long[] vec){
//		String a = " ";
//		for (int i = 0; i < vec.length; i++) {
//			a = ( a + (vec[i]+ "   "));
//		}
//		return a;
//	}
//	
//	/**
//	 * Convierte el numero en una cadena de caracteres(String)
//	 * @param x Integer a convertir en String
//	 * @return El numero como String
//	 */
//	public static String toString(int x){
//		return x+"";
//	}
//	
//	/**
//	 * Convierte el numero en una cadena de caracteres(String)
//	 * @param x numero a convertir en String
//	 * @return El numero como String
//	 */
//	public static String toString(float x){
//		return x+"";
//	}
//	
//	/**
//	 * Convierte el numero en una cadena de caracteres(String)
//	 * @param x numero a convertir en String
//	 * @return El numero como String
//	 */
//	public static String toString(double x){
//		return x+"";
//	}
//	
//	/**
//	 * Convierte el numero en una cadena de caracteres(String)
//	 * @param x numero a convertir en String
//	 * @return El numero como String
//	 */
//	public static String toString(byte x){
//		return x+"";
//	}
//	
//	/**
//	 * Convierte el numero en una cadena de caracteres(String)
//	 * @param x numero a convertir en String
//	 * @return El numero como String
//	 */
//	public static String toString(short x){
//		return x+"";
//	}
//	
//	/**
//	 * Convierte el numero en una cadena de caracteres(String)
//	 * @param x numero a convertir en String
//	 * @return El numero como String
//	 */
//	public static String toString(long x){
//		return x+"";
//	}
	
	
	
}
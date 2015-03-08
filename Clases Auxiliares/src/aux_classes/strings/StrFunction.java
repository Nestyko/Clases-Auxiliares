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
	
	
	
}
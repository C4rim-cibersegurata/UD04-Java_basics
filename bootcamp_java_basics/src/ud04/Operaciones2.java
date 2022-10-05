package ud04;

public class Operaciones2 {

	public static void main(String[] args) {
		/* Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int, 
		   una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor. 
		A continuación muestra por pantalla: 
		• El valor de cada variable. 
		• La suma de N + A 
		• La diferencia de A - N 
		• El valor numérico correspondiente al carácter que contiene la variable C.  */
		Integer N=23;
		Double A=40.0;
		char C='y';
		System.out.println("N: "+N+" A: "+A+" C: "+C);
		System.out.println("N+A = "+(N+A));
		System.out.println("A-N = "+(A-N));
		System.out.println("Valor numeérico de C: "+Character.getNumericValue(C));

	}

}

package ud04;

public class Operaciones3 {

	public static void main(String[] args) {
		/* Escribe un programa _lava que realice lo siguiente: declarar dos variables X e Y de tipo int, 
		 * dos variables N y M de tipo double y asigna a cada una un valor. 
		 * A continuación muestra por pantalla:  El valor de cada variable,  La suma X + Y , La diferencia X — Y , El producto X Y , El cociente X / Y , El resto X % Y , La suma N + M , La diferencia N — M , El producto N * M , El cociente N / M , El resto N % M ,
		 *  La suma X + N , El cociente Y / M , El resto Y % M , El doble de cada variable , La suma de todas las variables , El producto de todas las variables 
		 */
		Integer X=10;
		Integer Y=13;
		Double N=42.0;
		Double M=73.0;
		System.out.println("X: "+X+"  Y: "+Y+"  N: "+N+"  M: "+M);
		System.out.println("Suma X+Y: "+X+"+"+Y+" = "+(X+Y)+"\nResta X-Y: "+X+"-"+Y+" = "+(X-Y)+"\nProducto X*Y: "+X+"x"+Y+" = "+(X*Y)+"\nDivisión X/Y: "+X+"/"+Y+" = "+((double)X/(double)Y)+"\nMódulo X%Y: "+(X%Y));
		System.out.println("\nSuma N+M: "+N+"+"+M+" = "+(N+M)+"\nResta N-M: "+N+"-"+M+" = "+(N-M)+"\nProducto N*M: "+N+"N"+M+" = "+(N*M)+"\nDivisión N/M: "+N+"/"+M+" = "+((double)N/(double)M)+"\nMódulo N%M: "+(N%M));
		System.out.println("\nSuma X+N: "+X+"+"+N+" = "+"\nDivisión Y/M: "+Y+"/"+M+" = "+((double)Y/(double)M)+"\nMódulo Y%M: "+(Y%M));
		System.out.println("\n2X: "+(2*X)+"  2Y: "+(2*Y)+"  2N: "+(2*N)+"  2M: "+(2*M));
		System.out.println("Suma de todas las variables: "+(X+Y+N+M));
		System.out.println("Producto de todas las variables: "+(X*Y*N*M));



	}

}

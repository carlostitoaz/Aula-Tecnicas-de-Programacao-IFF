
public class Fatorial {

	public static void main(String[] args) {
		System.out.println(calcularFatorial(5));
	}
	
	static int calcularFatorial(int numero) {
		
		if(numero == 0) {
			return 1;
		}
		else {
			return numero * calcularFatorial(numero - 1);  
											//5 * func(4) = 120
											//4 * func(3) = 24
											//3 * func(2) = 6
											//2 * func(1) = 2
											//1 * func(0) = 1

		} 
	}
}

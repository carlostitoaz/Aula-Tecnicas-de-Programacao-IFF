
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
		} 
	}
}

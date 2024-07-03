//	Usando funções, calcule o n-ésimo termo da sequência de Fibonacci, {1, 1, 2, 3, 5, 8, ...}:
//	=> de forma recursiva.
//	F(n) = 	{ 0  -> se n = 0
//			{ 1  ->	se n = 1
//			{ F(n − 1) + F(n − 2) ->  se n > 1

public class FibonacciSimples {

	public static void main(String[] args) {
			System.out.print(calcularFibonacciRecursivo(5));
	}
	
	static long calcularFibonacciRecursivo(int termo) {
		if(termo <= 2) {
			return 1;
		}
		else {
			return calcularFibonacciRecursivo(termo-1) + calcularFibonacciRecursivo(termo-2);
		} 	
	}	
}
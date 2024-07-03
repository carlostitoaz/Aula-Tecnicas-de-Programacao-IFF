//	Usando funções, calcule o n-ésimo termo da sequência de Fibonacci, {1, 1, 2, 3, 5, 8, ...}:
//	=> de forma iterativa.
//	=> de forma recursiva.
//	F(n) = 	{ 0  -> se n = 0
//			{ 1  ->	se n = 1
//			{ F(n − 1) + F(n − 2) ->  se n > 1	


public class FibonacciCompletoTimer {

	public static void main(String[] args) {
		
		for (int termo = 1; termo <= 48; termo++) {
			System.out.print("\n\nTermo: " + termo + "-->\t");
			
			long horarioDoInicio = System.currentTimeMillis();
			System.out.print(calcularFibonacciIterativo(termo) + " \t");
			long horarioDoFim =  System.currentTimeMillis();
			System.out.print("Tempo: " + (horarioDoFim - horarioDoInicio) / 1000f + "  ||\t\t");

			horarioDoInicio = System.currentTimeMillis();
			System.out.print(calcularFibonacciRecursivo(termo) + " \t");
			horarioDoFim =  System.currentTimeMillis();
			System.out.print("Tempo: " + (horarioDoFim - horarioDoInicio) / 1000f + "  ||\t\t");
			
			
			horarioDoInicio = System.currentTimeMillis();
			System.out.print(calcularFibonacciRecursivoTernario(termo) + " \t");
			horarioDoFim =  System.currentTimeMillis();
			System.out.print("Tempo: " + (horarioDoFim - horarioDoInicio) / 1000f);
		}
	}
	
	static long calcularFibonacciIterativo(int termo) {
		long atual = 0;
		long anterior = 0;

        for (int i = 1; i <= termo; i++) {
            if (i == 1) {
                atual = 1;
                anterior = 0;
            } else {
                atual = atual + anterior;
                anterior = atual - anterior;
            }
        }
        return atual;
    }
	
	static long calcularFibonacciRecursivo(int termo) {
		if(termo <= 2) {
			return 1;
		}
		else {
			return calcularFibonacciRecursivo(termo-1) + calcularFibonacciRecursivo(termo-2);
		} 	
	}
	
	static long calcularFibonacciRecursivoTernario(int termo) {
		return (termo <= 2) ? 1 : calcularFibonacciRecursivo(termo-1) + calcularFibonacciRecursivo(termo-2);
	}
	
}
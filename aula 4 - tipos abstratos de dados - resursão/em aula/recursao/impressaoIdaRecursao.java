
public class impressaoIdaRecursao {

	public static void main(String[] args) {
		impressaoSequenciaNumerica(20);
	}

	private static void impressaoSequenciaNumerica(int n) {
		if (n > 0) {
			System.out.print(" " + n);			
			impressaoSequenciaNumerica(n - 1);
		}
	}
	
}

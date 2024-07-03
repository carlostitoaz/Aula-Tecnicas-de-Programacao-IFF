
public class SomaRecursiva1aN {

	public static void main(String[] args) {
		System.out.println("Soma do intervalo de 0 a N:" + somarIntervalo(10));
	}

	static int somarIntervalo(int n) {
		if (n > 0) {
			return n + somarIntervalo(n - 1);
		}
		return 0;
	}
}


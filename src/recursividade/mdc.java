package recursividade;

public class mdc {
	public static void main(String[] args) {
		System.out.println("MDC Iterativo: " + mdcIterativo(10, 2));
		System.out.println("MDC Recursivo: " + mdcRecursivo(10, 2));
		
	}

	private static int mdcRecursivo(int m, int n) {
		int r = m%n;
		if(r == 0){
			return n;
		}
		return mdcRecursivo(n,r);	
	}

	public static int mdcIterativo(int m, int n){
		int r;
			do{
			r = m%n;
			m = n;
			n = r;
			} while (r != 0);
		return m;
	}

}

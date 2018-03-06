package recursividade;

public class Misterio {

	public static void main(String[] args) {
		System.out.println("exemplo1(4) = " + exemplo1(4));
		System.out.println("exemplo2(5): ");
		exemplo2(5);
		
	}

	 private static int exemplo1(int x){
	   	 if (x <=0){
	   		 return 0;
	   	 }
	   	 return (x + exemplo1(x-1));
	    }

	
	private static void exemplo2(int n){
		if(n == 0){
			System.out.println("Zero");
			return;
		}
		System.out.println(n);
		System.out.println(n);
		exemplo2(n-1);
	}

}

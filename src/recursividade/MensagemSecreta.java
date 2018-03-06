package recursividade;

public class MensagemSecreta {
 	public static void main(String[] args) {
       	System.out.println(decifrar("o?i? maolbu ndot", 0));
 	}
 	private static String decifrar(String msg, int i) {
 		//System.out.println("entrei");
       	if (i + 1 > msg.length()) {
            	return ", ";
       	}
       	return msg.charAt(i) + decifrar(msg, i + 2) + msg.charAt(i + 1);  
	}
 }
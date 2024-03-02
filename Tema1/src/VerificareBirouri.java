
public class VerificareBirouri {

	public static void main(String[] args) {

		Sertar s1 = new Sertar(12,4,5);
		Sertar s2 = new Sertar(12,4,5);
		Birou b1= new Birou(s1,s2,14,10,120);
	
		b1.printBirou();

	}

}


public class Sertar {
	private int l,w,h;

	public Sertar(int l, int w, int h) {
		this.l = l;
		this.w = w;
		this.h = h;
	}

	public int getL() {
		return l;
	}

	public int getw() {
		return w;
	}

	public int getH() {
		return h;
	}
	
	public void printSertar() {
		System.out.println("Sertarul are o lungime de: "+l+"cm\nAre o inaltime de: "+h+"cm\nSi o latime de: "+w+"cm");
	}
}

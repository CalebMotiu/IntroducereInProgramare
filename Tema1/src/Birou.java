
public class Birou {
	
private Sertar a,b;
private int l,h,w;

public Birou(Sertar a, Sertar b, int l, int h, int w) {
	super();
	this.a = a;
	this.b = b;
	if (a.getL()>l || b.getL()>l)
	{System.out.println("Sertarul este prea lung");}
	else {this.l = l;}
	if(a.getH()+b.getH()>h)
	{System.out.println("Sertarele sunt prea inalte");}
	else {this.h = h;}
	if (a.getw()>w||a.getw()>w)
	{System.out.println("sertarul este prea lat");}
	else {this.w = w;}
}
public void printBirou()
{
System.out.print("Biroul are o lungime de " + l + "cm\nO inaltime de " + h + "cm\nSi o latime de " + w
		+ "cm\nBiroul are si doua sertare: \n1: ");
a.printSertar();
System.out.print("2: ");
b.printSertar();
}


}

public class Konverteriproov{
	public static void main(String[] args){
		Konverter k=new Konverter(1);
		System.out.println("1 miil on millimeetrites: " + k.millimeetrites() + " mm, kilomeetrites: " + k.kilomeetrites() + " km, meetrites: " + k.meetrites() + " m, detsimeetrites: " + k.detsimeetrites() + " dm, sentimeetrites: " + k.sentimeetrites() + " cm.");
	}
}

/* 


java Konverteriproov
1 miil on millimeetrites: 1609344.0 mm, kilomeetrites: 1.609344 km, meetrites: 1609.344 m, detsimeetrites: 16093.44 dm, sentimeetrites: 160934.4 cm.

*/
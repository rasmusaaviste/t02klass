public class Konverter{
	double pikkus;
	
	public Konverter(double pikkus){
		if(pikkus<0){
			throw new RuntimeException("Pikkus peab olema positiivne arv!");
		}
		this.pikkus=pikkus;
	}	
		
	public double kilomeetrites(){
		return pikkus*1.609344;
	}
			
	public double meetrites(){
		return pikkus*1609.344;
	}
				
	public double detsimeetrites(){
		return pikkus*16093.44;
	}
				
	public double sentimeetrites(){
		return pikkus*160934.4;
	}
				
	public double millimeetrites(){
		return pikkus*1609344;
	}
			
}
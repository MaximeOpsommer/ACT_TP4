package structure;

public class Part {

	private Portion[][] part;
	
	public Part(Portion[][] part) {
		this.part = part;
	}
	
	public Portion[][] getPart() {
		return this.part;
	}
	
	public boolean estRectangulaire() {
		return (this.part.length != this.part[0].length);
	}
	
	public boolean portionsVoisines() {
		 
		return true;
	}
	
	public int getNbJambon() {
		int res = 0;
		for(Portion[] tab : this.part) {
			for(Portion p : tab) {
				if(p.estJambon())
					res++;
			}
		}
		return res;
	}
	
	public boolean estValide(int maxSize, int minJambons) {
		return (this.estRectangulaire() && (this.part.length * this.part[0].length) < maxSize && this.getNbJambon() >= minJambons);
	}
	
}

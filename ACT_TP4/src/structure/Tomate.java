package structure;

public class Tomate extends Portion {

	public Tomate(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean estJambon() {
		return false;
	}
	
	@Override
	public String toString() {
		return "T";
	}
	
}

package structure;

public class Jambon extends Portion {

	public Jambon(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean estJambon() {
		return true;
	}
	
	@Override
	public String toString() {
		return "J";
	}
	
}

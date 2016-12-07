package structure;

public abstract class Portion {
	
	private int x;
	private int y;
	
	public Portion(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public abstract boolean estJambon();
	
	public abstract String toString();

}

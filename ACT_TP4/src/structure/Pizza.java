package structure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

public class Pizza {
	
	private Portion[][] pizza;
	private int jambonsMinPart;
	private int surfaceMaxPart;
	
	@SuppressWarnings("resource")
	public Pizza(File file) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str = br.readLine();
		String[] infos = str.split(" ");
		if(infos.length != 4)
			throw new Exception("Informations de la pizza non renseignées au début du fichier");
		
		int height = Integer.parseInt(infos[0]);
		int width = Integer.parseInt(infos[1]);
		this.jambonsMinPart = Integer.parseInt(infos[2]);
		this.surfaceMaxPart = Integer.parseInt(infos[3]);
		
		pizza = new Portion[height][width];
		char[] tmp = new char[width];
		
		for(int i = 0; i < height; i++) {
			tmp = br.readLine().toCharArray();
			for(int j = 0; j < width; j++) {
				switch(tmp[j]) {
				case 'T':
					pizza[i][j] = new Tomate(i, j);
					break;
				case 'H':
					pizza[i][j] = new Jambon(i, j);
					break;
				default:
					try {
						throw new Exception("Invalid character on line " + i + " column " + j);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public int getJambonsMinPart() {
		return this.jambonsMinPart;
	}
	
	public int getSurfaceMaxPart() {
		return this.surfaceMaxPart;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		int longueur = this.pizza.length;
		int largeur = this.pizza[0].length;
		for(int i = 0; i < longueur; i++) {
			for(int j = 0; j < largeur; j++) {
				builder.append(this.pizza[i][j].toString());
			}
			builder.append('\n');
		}
		return builder.toString();
	}
	
	public List<Part> decoupePizza(int maxSize, int minJambon) {
		return null;
	}

}

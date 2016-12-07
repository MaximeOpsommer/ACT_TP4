package certificat;

public interface Certificat {
	
	/**
	 * Retournera vrai SSi le certificat est bien correct pour le pb auquel il est associ�<br>
	 * (L'algorithme A du cours)
	 */
	public boolean estCorrect();
	
	/**
	 * Pour pouvoir enum�rer les certificats, on d�finit un ordre sur les certificats<br>
	 * Le certificat passe au suivant dans l'ordre choisi
	 */
	public void suivant();
	
	/**
	 * Le certificat est le dernier dans l'ordre choisi
	 */
	public boolean estDernier();
	
	/**
	 * Le certificat prend une valeur al�atoire
	 */
	public void alea();
	
	public void affiche();

}
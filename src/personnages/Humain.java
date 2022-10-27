package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;

	public Humain(String nom, String boissonFavorite) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
	}

	public String getNom() {
		return nom;
	}
	
	public String getBoissonFavorite(){
		return boissonFavorite;
	}
	
	
	public void direBonjour() {
		System.out.println("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+ boissonFavorite);
	}
	
	public void boire() {
		System.out.println("Mmmm, un bon verre de "+boissonFavorite+" !"+" GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		
	}
	
	
	public static void main(String[] args) {
		Humain Pierre = new Humain("Pierre","Fanta");
		Pierre.direBonjour();
		Pierre.boire();
	}
	

}

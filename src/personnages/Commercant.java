package personnages;

public class Commercant extends Humain {
	private String boissonFavorite = "thé";
	
	public Commercant(String nom, String boissonFavorite, int qteArgent) {
		super(nom,boissonFavorite,qteArgent);
	}
	
	public int seFaireExtorquer() {
		qteArgent-=qteArgent;
		System.out.println(parler("J'ai tout perdu! Le monde est vraiment trop injuste..."));
		return qteArgent;
	}
	public void recevoirArgent(int argent) {
		System.out.println(parler(argent+" sous! Je te remercie généreux donateur!"));
		gagnerArgent(argent);
	}
}

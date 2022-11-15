package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int qteArgent) {
		super(nom,"th�",qteArgent);
	}

	public int seFaireExtorquer() {
		int argentExtorque = getqteArgent();
		perdreArgent(argentExtorque);
		System.out.println(parler("J'ai tout perdu! Le monde est vraiment trop injuste..."));
		return argentExtorque;
	}

	public void recevoirArgent(int argent) {
		System.out.println(parler(argent + " sous! Je te remercie généreux donateur!"));
		gagnerArgent(argent);
	}
}

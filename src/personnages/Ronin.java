package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int qteArgent) {
		super(nom,boissonFavorite,qteArgent);
	}

	public void donner(Commercant beneficiaire) {
		int argentDonne = getqteArgent()*10/100;
		beneficiaire.gagnerArgent(argentDonne);
		perdreArgent(argentDonne);
		System.out.println(parler(beneficiaire.getNom()+" prend ces "+argentDonne+" sous"));
	}
	public void provoquer(Yakuza adversaire) {
		int force = 2*honneur;
		if(force >= adversaire.getReputaion()) {
			honneur++;
			gagnerArgent(adversaire.getqteArgent());
			System.out.println(parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!"));
			System.out.println(parler("Je t’ai eu petit yakusa!"));
		}
		else {
			honneur--;
			perdreArgent(getqteArgent());
			System.out.println(parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup"));
		}
	}
}

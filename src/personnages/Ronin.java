package personnages;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFavorite, int qteArgent) {
		super(nom,boissonFavorite,qteArgent);
	}

	public void donner(Commercant beneficiaire) {
		beneficiaire.gagnerArgent((qteArgent*10)/100);
		int perdu = (qteArgent*10)/100;
		perdreArgent((qteArgent*10)/100);
		System.out.println(parler(beneficiaire.getNom()+" prend ces "+perdu+" sous"));
	}
	public void provoquer(Yakuza adversaire) {
		int force = 2*honneur;
		if(force >= adversaire.getReputaion()) {
			honneur++;
			gagnerArgent(adversaire.qteArgent);
			System.out.println(parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!"));
			System.out.println(parler("Je t’ai eu petit yakusa!"));
		}
		else {
			honneur--;
			perdreArgent(qteArgent);
			System.out.println(parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup"));
		}
	}
}

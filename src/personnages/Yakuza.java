package personnages;

public class Yakuza extends Humain{
	private int reputation=0;
	private int comArgent;
	private String clan;
	public Yakuza(String nom, String boissonFavorite, int qteArgent, String clan) {
		super(nom,boissonFavorite,qteArgent);
		this.clan=clan;
	}
	public String getClan() {
		return clan;
	}
	public int getReputaion() {
		return reputation;
	}
	public void extorquer(Commercant victime) {
		reputation++;
		System.out.println(parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?"));
		System.out.println(parler(victime.getNom()+" si tu tiens à la vie donne moi ta bourse !"));
		comArgent=victime.seFaireExtorquer();
		gagnerArgent(comArgent);
	}
	public void seVanter(Commercant victime) {
		System.out.println(parler("J'ai piqué les "+comArgent+" sous de "+victime.getNom()+", ce qui me fait "+comArgent+" dans ma poche. Hi ! Hi !"));
	}
	
	public int perdre() {
		int argentPerdu=getqteArgent();
		System.out.println(parler("J'ai perdu mon duel et mes "+argentPerdu+" sous, snif j'ai désohonnoré le clan de "+clan+"."));
		perdreArgent(argentPerdu);
		reputation--;
		return argentPerdu;
	}
	
	public void gagner(int gain) {
		System.out.println(parler("Ce ronin pensait vraiment battre Yaku Le Noir du clan de "+clan+" ? Je l'ai dépouillé de ses "+gain+" sous."));
		gagnerArgent(gain);
		reputation++;
	}
	
	
}

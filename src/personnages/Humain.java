package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int qteArgent;

	public Humain(String nom, String boissonFavorite, int qteArgent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.qteArgent=qteArgent; 
	}

	public String getNom() {
		return nom;
	}
	
	public String getBoissonFavorite(){
		return boissonFavorite;
	}
	
	public int getqteArgent() {
		return qteArgent;
	}
	
	public String parler(String texte) {
		return "("+nom+")"+" - "+texte;
	}
	
	public void direBonjour() {
		System.out.println(parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+ boissonFavorite+"."));
	}
	
	public void boire() {
		System.out.println(parler("Mmmm, un bon verre de "+boissonFavorite+" !"+" GLOUPS !"));
	}
	
	public void acheter(String bien, int prix) {
		if(qteArgent>=prix) {
			System.out.println(parler("J'ai "+qteArgent+" sous en poche. Je vais pouvoir m'offrir "+bien+" a "+prix+" sous"));
			perdreArgent(prix);
		}
		else {
			System.out.println(parler("Je n'ai plus que "+qteArgent+" sous en poche. Je ne peux même pas m'offrir "+bien+" a "+prix+" sous"));
		}
	}
	
	public void gagnerArgent(int gain) {
		qteArgent+=gain;
	}
	
	public void perdreArgent(int perte) {
		qteArgent-=perte;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		Humain [] memoire = new Humain[30];
		int i=0;
		System.out.println("Bonjour "+ autreHumain.getNom());
		if(i<30){
			memoire[i]=autreHumain;
			i++;
		}
		else {
			memoire[0]=autreHumain;
			for(int j=0;j<30;j++){
				memoire[i+1]=memoire[i];
			}
			
		}
	}
	

}

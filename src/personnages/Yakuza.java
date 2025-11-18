package personnages;

public class Yakuza extends Humain{
	private int réputation=0;
	private String clan;
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom,boisson,argent);
		this.clan=clan;
	}
	public void extorquer(Commercant victime) {
		réputation+=1;
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() +", si tu tiens à la vie done moi ta bourse !");
		int temp = victime.SeFaireExtorquer();
		setArgent(getArgent() + temp);
		parler(" J'ai piqué les "+ temp+ " sous de "+ victime.getNom() +" ce qui me fait " + getArgent()+ " sous dans ma poche. Hi ! Hi!");
		
	}
	public int perdre() {
		int temp = getArgent();
		this.réputation-=1;
		parler("j'ai perdu mon duel et mes "+ temp + " sous, snif... J'ai déshonoré le clan de"+ clan);
		perdreArgent(temp);
		return temp;
	}
	public void gagner(int gain) {
		this.réputation+=1;
		parler("Ce ronin pensait vraiment battre"+ getNom()+ "du clan "+clan+" ? Je l'ai dépouillé de ses "+ gain + " sous." );
		gagnerArgent(gain);
		
	}
	public int getRéputation() {
		return réputation;
	}
	
}

package personnages;

public class Ronin extends Humain {
	private int honneur=1;
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	public void donner(Commercant beneficiare) {
		int temp=getArgent();
		temp=temp * 10 /100;
		parler(beneficiare.getNom() +" prend ces "+ temp + " sous.");
		beneficiare.recevoir(temp);
		perdreArgent(temp);
		
	}
	@Override
	public int getArgent() {
		return super.getArgent();
	}
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force >= adversaire.getRéputation()) {
			parler("Je t'ai eu petit yakuza!");
			honneur+=1;
			gagnerArgent(adversaire.perdre());
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
			honneur-=1;
		}
	}
}

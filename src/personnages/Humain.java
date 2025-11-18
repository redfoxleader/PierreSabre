package personnages;



public class Humain {
		private String nom;
		private String boisson;
		private int argent;
		public String getNom() {
			return nom;
		}
		public int getArgent() {
			return argent;
		}
		public void setBoisson(String boisson) {
			this.boisson = boisson;
		}
		public void setArgent(int argent) {
			this.argent = argent;
		}
		public void gagnerArgent(int montant) {
			argent+=montant;
		}
		public void perdreArgent(int montant) {
			argent-=montant;
		}
		protected void parler(String texte) {
			System.out.println("("+nom+")-" +  texte );
		}
		public void direBonjour() {
			parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
		}
		public void boire() {
			parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !" );
		}
		//feces
		public void acheter(String bien,int prix) {
			if (prix>argent) {
				parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien +" à " + prix +" sous.");
			}
			else {
				parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous");
				perdreArgent(prix);
			}
		}	
		public Humain(String nom, String boisson, int argent) {
			this.nom=nom;
			this.boisson=boisson;
			this.argent=argent;
		}
		
}


package exerciceVisiteur1;

public class ExpressionArithmetique {
	private Noeud racine;
	
	public ExpressionArithmetique(Noeud racine){
		this.racine = racine;
	}

	public Noeud getRacine() {
		return racine;
	}

	public void affichagePostfixe() {
		System.out.println("\n postfixe:");
		getRacine().affichagePostfixe();
		
	}

	public int calculerValeur() {
		return getRacine().calculer();
	}



	
}

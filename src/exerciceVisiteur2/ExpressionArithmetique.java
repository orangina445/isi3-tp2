package exerciceVisiteur2;


public class ExpressionArithmetique {
	private Noeud racine;
	
	public ExpressionArithmetique(Noeud racine){
		this.racine = racine;
	}

	public Noeud getRacine() {
		return racine;
	}

	public void afficherPostFixe() {
		System.out.println("\n postfixe:");
		PostFixeVisitor postFixeVisitor = new PostFixeVisitor();
		Noeud n = getRacine();
		n.accept(postFixeVisitor);
	}

	public int calculerValeur() {
		return getRacine().accept(new CalculVisitor());
	}

	
	public void afficherInFixe() {
		System.out.println("\n infixe:");
		getRacine().accept(new InfixeVisitor());
	}
	
}

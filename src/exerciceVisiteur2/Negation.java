package exerciceVisiteur2;


public class Negation extends OperateurUnaire{
	public Negation(Noeud n) {
		super("-", n);
	}

	@Override
	public int accept(Visitor v) {
		return v.visit(this);
	}
}

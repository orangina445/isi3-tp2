package exerciceVisiteur2;

public class Addition extends OperateurBinaire{
	public Addition(Noeud ng, Noeud nd) {
		super("+", ng, nd);
	}


	@Override
	public int accept(Visitor v) {
		return v.visit(this);
	}
}

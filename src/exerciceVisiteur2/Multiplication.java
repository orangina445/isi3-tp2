package exerciceVisiteur2;


public class Multiplication extends OperateurBinaire{

	public Multiplication( Noeud ng, Noeud nd) {
		super("*", ng, nd);
	}


	@Override
	public int accept(Visitor v) {
		return v.visit(this);
	}
}

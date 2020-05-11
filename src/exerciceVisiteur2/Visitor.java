package exerciceVisiteur2;

public interface Visitor {
    public int visit(Addition a);
    public int visit(Constante c);
    public int visit(Multiplication m);
    public int visit(Negation n);
    public int visit(OperateurBinaire ob);
    public int visit(OperateurUnaire ou);

}

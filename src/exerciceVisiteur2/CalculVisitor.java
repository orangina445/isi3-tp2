package exerciceVisiteur2;

public class CalculVisitor implements Visitor {
    @Override
    public int visit(Addition a) {
        return a.getOpG().accept(this) + a.getOpD().accept(this);
    }

    @Override
    public int visit(Constante c) {
        return c.getValeur();
    }

    @Override
    public int visit(Multiplication m) {
        return m.getOpG().accept(this) * m.getOpD().accept(this);
    }

    @Override
    public int visit(Negation n) {
        return -1 * n.getOpG().accept(this);
    }

    @Override
    public int visit(OperateurBinaire ob) {
        return 0;
    }

    @Override
    public int visit(OperateurUnaire ou) {
        return 0;
    }
}

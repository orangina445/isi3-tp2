package exerciceVisiteur2;

public class PostFixeVisitor implements Visitor {
    @Override
    public int visit(Addition a) {
        a.getOpG().accept(this);
        a.getOpD().accept(this);
        System.out.print(a.getOp());
        return 0;
    }

    @Override
    public int visit(Constante c) {
        System.out.print(c.getValeur());
        return 0;
    }

    @Override
    public int visit(Multiplication m) {
        m.getOpG().accept(this);
        m.getOpD().accept(this);
        System.out.print(m.getOp());
        return 0;
    }

    @Override
    public int visit(Negation n) {
        n.getOpG().accept(this);
        System.out.print(n.getOp());
        return 0;
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

package exerciceVisiteur2;

public class InfixeVisitor implements Visitor {
    @Override
    public int visit(Addition a) {
        a.getOpG().accept(this);
        System.out.print(a.getOp());
        a.getOpD().accept(this);
        return 0;
    }

    @Override
    public int visit(Constante c) {
        System.out.print(c.getValeur());
        return 0;
    }

    @Override
    public int visit(Multiplication m) {
        System.out.print("(");
        m.getOpG().accept(this);
        System.out.print(")");
        System.out.print(m.getOp());
        System.out.print("(");
        m.getOpD().accept(this);
        System.out.print(")");

        return 0;
    }

    @Override
    public int visit(Negation n) {
        System.out.print("(");
        System.out.print(n.getOp());
        n.getOpG().accept(this);
        System.out.print(")");
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

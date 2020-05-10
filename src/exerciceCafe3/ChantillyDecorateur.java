package exerciceCafe3;

public class ChantillyDecorateur extends Decorateur {
    protected ChantillyDecorateur(ProduitComposent pc) {
        super(pc);
        this.Nom="Chantilly";
        this.prix = 0.4;
    }
}

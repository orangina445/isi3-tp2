package exerciceCafe3;

public class CaramelDecorateur extends Decorateur {
    protected CaramelDecorateur(ProduitComposent pc) {
        super(pc);
        this.Nom = "Caramel";
        this.prix = 0.2;
    }
}

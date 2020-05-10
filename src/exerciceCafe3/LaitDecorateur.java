package exerciceCafe3;

public class LaitDecorateur extends Decorateur{
    protected LaitDecorateur(ProduitComposent pc) {
        super(pc);
        this.Nom = "Lait";
        this.prix = 0.1;
    }
}

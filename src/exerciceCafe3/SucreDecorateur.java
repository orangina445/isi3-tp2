package exerciceCafe3;

public class SucreDecorateur extends Decorateur {
    protected SucreDecorateur(ProduitComposent pc) {
        super(pc);
        this.Nom = "Sucre";
        this.prix=0.1;
    }
}

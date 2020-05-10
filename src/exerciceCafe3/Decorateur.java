package exerciceCafe3;

public abstract class Decorateur extends ProduitComposent {
    ProduitComposent p;
    protected String Nom = "Décorateur indéfini";
    protected double prix = 0.0;

    protected Decorateur(ProduitComposent pc){
        p = pc;
    }

    public String getName()
    {
        String rep = p.getName() + " "+ this.Nom;
        return rep;
    }

    public double getPrice(){
        return p.getPrice()+prix;
    }

}

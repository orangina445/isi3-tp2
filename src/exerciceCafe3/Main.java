package exerciceCafe3;



public class Main {

	public static void main(String[] args) {
		
		ProduitComposent produit = new Expresso();
		ProduitComposent es = new SucreDecorateur(produit);
		System.out.println(es.getName() + " : " + es.getPrice());

		ProduitComposent colombia = new Colombia();
		ProduitComposent cch = new ChantillyDecorateur(colombia);
		ProduitComposent cchc = new CaramelDecorateur(cch);
		System.out.println(cchc.getName() + " : " + cchc.getPrice());
		
	}
}

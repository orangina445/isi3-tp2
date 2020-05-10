package exerciceCafe1;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Boisson C = new Boisson("Colombia",0.5);
		Boisson E = new Boisson("Expresso",0.6);
		Boisson D = new Boisson("Deca",0.4);
		ArrayList<Boisson> listBoisson = new ArrayList<Boisson>();
		listBoisson.add(C);
		listBoisson.add(E);
		listBoisson.add(D);

		Distibuteur dist = new Distibuteur(listBoisson);

		dist.afficherBoissons();

		Scanner sc = new Scanner(System.in);
		System.out.println("choisissez la boisson");
		int rep = sc.nextInt();
		System.out.println(dist.getBoisson(rep));

		
	}
}

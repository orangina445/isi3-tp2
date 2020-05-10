package exerciceCafe2;


import exerciceCafe1.Boisson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//L'ajout de sucre ou de lait est facturé 0.1€, de caramel 0.2€ et de chantilly 0.4€.
		exerciceCafe2.Boisson C = new exerciceCafe2.Boisson("Colombia",0.5);
		exerciceCafe2.Boisson E = new exerciceCafe2.Boisson("Expresso",0.6);
		exerciceCafe2.Boisson D = new exerciceCafe2.Boisson("Deca",0.4);
		ArrayList<exerciceCafe2.Boisson> listBoisson = new ArrayList<>();
		listBoisson.add(C);
		listBoisson.add(E);
		listBoisson.add(D);

		Complement L = new Complement("Lait",0.1);
		Complement S = new Complement("Sucre",0.1);
		Complement Ca = new Complement("Caramel",0.2);
		Complement Ch = new Complement("Chantilly",0.4);

		ArrayList<Complement> listComplement = new ArrayList<Complement>();
		listComplement.add(L);
		listComplement.add(S);
		listComplement.add(Ca);
		listComplement.add(Ch);

		Distibuteur dist = new Distibuteur(listBoisson,listComplement);

		Scanner sc = new Scanner(System.in);
		dist.afficherProduits();
		System.out.println("choisir la boisson");
		int b = sc.nextInt();
		System.out.println("choisir les complement (0 pour finir)");
		List<Integer> choix = new ArrayList<Integer>();
		boolean limit = true;
		do{
			Integer c = sc.nextInt();
			if(c != 0){
				choix.add(c);
			}
			else{
				limit = false;
			}
		}while(limit);

		System.out.println(dist.getBoisson(b,choix));

		
	}
}

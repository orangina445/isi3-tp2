package exerciceCafe2;

import java.util.ArrayList;
import java.util.List;

public class Distibuteur {
    private List<Boisson> boissonList;
    private List<Complement> complementList;

    public Distibuteur(List<Boisson> b, List<Complement> c){
        this.boissonList = b;
        this.complementList = c;
    }

    public void afficherProduits(){
        int i =1;
        for(Boisson boisson : boissonList){
            System.out.println(i+") " + boisson.getName() + " : " + boisson.getPrice());
            i++;
        }
        i = 1;
        for(Complement c : complementList){
            System.out.println(i+")"+c.getName() + " : " + c.getPrice());
            i++;
        }
    }


    public String getBoisson(int indice, List<Integer> compl){

        double price = 0.0;
        Boisson b = boissonList.get(indice-1);
        List<Complement> choix = new ArrayList<Complement>();
        price += b.getPrice();
        for(Integer j : compl){
            Complement c = complementList.get(j-1);
            choix.add(c);
            price += c.getPrice();
        }
        String rep = "";
        rep += b.getName() + " avec ";
        for(Complement comp : choix){
            rep += comp.getName() + " ";
        }
        rep += price;
        return rep;
    }
}

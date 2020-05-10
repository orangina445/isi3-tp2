package exerciceCafe1;

import java.util.List;

public class Distibuteur {
    private List<Boisson> boissonList;

    public Distibuteur(List<Boisson> b){
        this.boissonList = b;
    }

    public void afficherBoissons(){
        int i =1;
        for(Boisson boisson : boissonList){
            System.out.println(i+") " + boisson.getName() + " : " + boisson.getPrice());
            i++;
        }
    }


    public String getBoisson(int indice){

        return ""+boissonList.get(indice-1).getName() + " pour " + boissonList.get(indice-1).getPrice();
    }
}

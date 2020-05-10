package exerciceCafe1;

public class Boisson {
    private String name;
    private double price;

    public Boisson(String n, double p){
        name = n;
        price = p;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}

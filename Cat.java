import java.util.*;

public class Cat {
    private String name;
    private double weight; 
    public void setName(){
        Scanner input = new Scanner(System.in);
        name = input.nextLine().toString();
    }

    public void setWeight(double aweight){
        weight = aweight;
    }

    public String getName(){
        return name;
    }
    
    public double getWeight(){
        return weight;
    }

    public void meow(){
        double rng = Math.random()*10;
        if(rng<=2.5){
            System.out.println("Grrrrr");
        }else{
            System.out.println("Meow!");
        }
    }
}

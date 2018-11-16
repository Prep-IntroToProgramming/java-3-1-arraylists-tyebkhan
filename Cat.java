import java.util.*; //imports java utilities

public class Cat {
    private String name; //creates a private variable to store the cats' names
    private double weight; //creates a private variable to store the cats' weights
    public void setName(){//creates scanner variable and gets user input for the cats' names
        Scanner input = new Scanner(System.in);
        name = input.nextLine().toString();
    }

    public void setWeight(double aweight){//sets the weight to the inputted parameter
        weight = aweight;
    }

    public String getName(){//returns the cat's name
        return name;
    }
    
    public double getWeight(){//returns the cat's wieght
        return weight;
    }

    public void meow(){//makes the cat meow
        double rng = Math.random();//creates a variable that stores a random number between 0 and 1
        if(rng<=.25){//gives a 25% chance to say grrr
            System.out.println("Grrrrr");
        }else{//cat says meow
            System.out.println("Meow!");
        }
    }
}

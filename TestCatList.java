import java.util.*; //imports java utilities
public class TestCatList{
    public static void main(String[] args){
        ArrayList <Cat> CatList = new ArrayList <Cat>(); //creates an arraylist of cats
        for(int i = 1; i<5; i++){ //for loop to populate the arraylist with 4 cats
            CatList.add(new Cat());
        }
        for(int i = 0; i<CatList.size(); i++){//for loop that uses the setName method to get user input to name the cats
            System.out.println("Enter the name of cat " + (i+1));
            CatList.get(i).setName();
        }
        for(Cat c:CatList){//modified for loop that uses the setWeight method to randomly assign each cat a weight then prints each cat's name and weight and has them meow with the meow method
            c.setWeight(Math.random()*10+5);
            System.out.println(c.getName() + " weighs " + c.getWeight());
            c.meow();
        }
    }
}
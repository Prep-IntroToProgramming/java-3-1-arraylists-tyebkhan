import java.util.*;
public class TestCatList{
    public static void main(String[] args){
        ArrayList <Cat> CatList = new ArrayList <Cat>();
        for(int i = 1; i<5; i++){
            CatList.add(new Cat());
        }
        for(int i = 0; i<CatList.size(); i++){
            System.out.println("Enter the name of cat " + (i+1));
            CatList.get(i).setName();
        }
        for(Cat c:CatList){
            c.setWeight(Math.random()*10+5);
            System.out.println(c.getWeight() + " " + c.getName());
            c.meow();
        }
    }
}
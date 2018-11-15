import java.util.*;
public class TestCatList{
    public static void main(String[] args){
        ArrayList <Cat> CatList = new ArrayList <Cat>();
        for(int i = 1; i<5; i++){
            CatList.add(new Cat());
        }
        CatList.get(0).setName("Cat0");
        CatList.get(1).setName("Cat1");
        CatList.get(2).setName("Cat2");
        CatList.get(3).setName("Cat3");
        for(Cat i:CatList){
            int x=0;
            CatList.get(x).setWeight(Math.random()*10+5);
            System.out.println(CatList.get(x).getWeight() + " " + CatList.get(x).getName());
            CatList.get(x).meow();
            x = x+1;
        }
    }
}

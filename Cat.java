
public class Cat {
private String name;
private double weight; 
public void setName(String aname){
    name = aname;
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
System.out.println("Meow!");
}
}

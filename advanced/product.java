import java.util.*;
public class Product {
    List listOfUsers = new ArrayList();
    int id;
    static int count=1;
    String name;
    float price;
    Product( String name, float price){
        this.id=count++;
        this.name=name;
        this.price=price;
    }
    public String toString(){
        return "Id: "+id + "\n" +
               "Name: " + name + "\n" +
               "Price: " + price +" $";
    }

}

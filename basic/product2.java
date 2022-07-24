import java.util.*;
public class Product {
    List listOfUsers = new ArrayList();
    int id;

    String name;
    float price;
    Product(int id, String name, float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public String toString(){
        return "Id: "+id + "\n" +
               "Name: " + name + "\n" +
               "Price: " + price +" $";
    }

}

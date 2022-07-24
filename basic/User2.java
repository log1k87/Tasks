import java.util.*;
public class User {
        int id;

        String firstName;
        String lastName;
        List listOfProducts = new ArrayList();
        float amountOfMoney;
        User(int id, String firstName, String lastName, float amountOfMoney){

            this.id=id;
            this.firstName=firstName;
            this.lastName=lastName;
            this.amountOfMoney=amountOfMoney;
        }

        public int getId(){return id;}

        public String toString(){
            return "Id: "+id + "\n" +
                   "Firstname: " + firstName + "\n"+
                   "Lastname: " + lastName + "\n" +
                    "Amount of money: " + amountOfMoney +
                    " $";
        }

}

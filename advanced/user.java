import java.util.*;
public class User {
        int id;
        static int count=1;
        String firstName;
        String lastName;
        List listOfProducts = new ArrayList();
        float amountOfMoney;
        User( String firstName, String lastName, float amountOfMoney){

            id=count++;
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

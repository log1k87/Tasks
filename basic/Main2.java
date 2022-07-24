import java.util.*;

public class Start {
    static List<Product> list = new ArrayList<>();
    static List<User> list2 = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static boolean flag=true;
static int count;
    static Map<Integer,List> productsByUserId = new HashMap<>();
    static Map<Integer,List> usersByProductId = new HashMap<>();///???????????????????????
    public static void main(String ...args) {

        list2.add(new User(1,"Max", "Maximov",1200));
        list2.add(new User(2,"Anton", "Antonov",1300));
        list2.add(new User(3,"Kate", "Katerinova",1700));



        list.add(new Product(1, "Wood",420));
        list.add(new Product(2, "Steel",520));
        list.add(new Product(3, "Bred",220));





        while (flag) {


            System.out.println(
                    "If you want to view list of products enter 1.\n" +
                            "If you want to view list of users enter 2.\n" +
                            "Enter 3 to bye product by the certain user\n"+
                            "Enter 4 to show what products where bought by the certain user\n"+
                            "Enter 5 to show what users bought the one certain product\n"+
                            "If you want to finish this program enter 0.\n\n"+
                            "Enter your number: ");
            int s5 = scanner.nextInt();
            if(s5==0){System.exit(1);}
            if (s5 == 1) {

                for (Product c : list) {
                    System.out.println(c);
                }
                System.out.println();
            }
            if (s5 == 2) {
                for (User z : list2) {
                    System.out.println(z);
                }
                System.out.println();
            }
            if (s5 == 3) {
                count++;
                User user =null;
                Product product = null;
                System.out.println("Enter user ID: ");
                int number =scanner.nextInt();

                for (User z : list2) {
                    if(number==z.id){user=z;}
                }
                System.out.println("Enter product ID: ");
                int number2 =scanner.nextInt();
                for (Product l : list) {
                    if(number2==l.id){product=l;

                    }
                }


                    user.amountOfMoney-=product.price;
                //amount=user.amountOfMoney;
                //user.amountOfMoney=amount;

                try {
                    if(user.amountOfMoney<product.price){throw new Exception();}

                    user.listOfProducts.add(product);

                    productsByUserId.put(user.id,user.listOfProducts);
                    product.listOfUsers.add(user);
                    usersByProductId.put(product.id,product.listOfUsers);
                    System.out.println("User " +user.firstName+" "+
                            user.lastName +    " successfully purchased " + product.name);
                    System.out.println();

                }
                catch (Exception e){System.out.println("User " +user.firstName+" "+
                        user.lastName +    " can not bye " + product.name +
                        " anymore. He has bought "+ count + " units of "+ product.name+
                        " and now he has less money on his bank account than the price of the "+
                        product.name+". \nHe has to bye something else.\n");
                }
            }
///////////////////////////////////////////
            if (s5 == 4) {
                User user =null;

                System.out.println("Enter user ID: ");
                int number =scanner.nextInt();


                for (User z : list2) {
                    if(number==z.id){user=z;}
                }
                System.out.println(count +" times this product was bought by: " + user.firstName + " "+ user.lastName);
                for (Map.Entry<Integer, List> mel : productsByUserId.entrySet()) {
                    if(mel.getKey()==user.id){
                        System.out.println(mel.getValue());}

                }
            }
/////////////////////////////////////////////////////////////////////////////////////
            if (s5 == 5) {
                Product product =null;

                System.out.println("Enter product ID: ");
                int number =scanner.nextInt();

                for (Product z : list) {
                    if(number==z.id){product=z;}
                }
                System.out.println(count +" times this user bought this product: " + product.name);
                for (Map.Entry<Integer, List> mel : usersByProductId.entrySet()) {
                    if(mel.getKey()==product.id){
                        System.out.println(mel.getValue());}

                }
            }

        }
///////////////////////////////////////////////////////////////////////////////////////////////////////////


    }
////////////////////////////////////////////////////////////////////////////////////

}



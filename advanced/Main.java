import java.util.*;

public class Main {
    static List<Product> list = new ArrayList<>();
    static List<User> list2 = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static boolean flag=true;
        public static void main(String ...args) {

                while (flag) {


                    System.out.println(
                            "If you want to create product enter 1.\n" +
                            "If you want to create user press 2.\n" +
                            "If you want to delete user press 3.\n" +
                            "If you want to delete product press 4.\n" +
                            "If you want to view list of products enter 5.\n" +
                            "If you want to view list of users enter 6.\n" +
                             "If you want to finish this program enter 0.\n\n"+
                            "Enter your number: ");
                    int s5 = scanner.nextInt();
                    if(s5==0){System.exit(1);}
                    if (s5 == 1) {
                        createProducts();
                    }
                    if (s5 == 2) {
                        createUsers();
                    }
                    ;
                    if (s5 == 3) {
                        list2.remove(list2.size() - 1);
                        for (User u : list2) {
                            System.out.println(u);
                        }
                    }
                    if (s5 == 4) {
                        list.remove(list.size() - 1);
                        for (Product p : list) {
                            System.out.println(p);
                        }
                    }

                    //////////////
                    if (s5 == 6) {
                        for (User z : list2) {
                            System.out.println(z);
                        }
                        System.out.println();
                    }
                    if (s5 == 5) {

                        for (Product c : list) {
                            System.out.println(c);
                        }
                        System.out.println();
                    }


                }
////////////////////////////////////////////////////////////////////////////////////

        }
public static void createUsers(){
    boolean flag=true;


    while (flag) {
        System.out.println("If you want stop to creating users enter -1, if you want to proceed enter 1: ");
        int s4 = scanner.nextInt();
        if(s4 ==-1){flag=false;}
        else {
            System.out.println("Enter First name: ");
            String s = scanner.next();
            System.out.println("Last name: ");
            String s2 = scanner.next();

            System.out.println("Amount of money: ");
            float s3 = scanner.nextFloat();
            list2.add(new User(s, s2, s3));
        }
    }

   // for (int i = 0; i <list.size() ; i++) {
     //   System.out.println(list.get(i));
    //}
        }

    public static void createProducts(){
        boolean flag=true;


        while (flag) {
            System.out.println("If you want stop to creating products enter -1, if you want to proceed enter 1: ");
            int s4 = scanner.nextInt();
            if(s4 ==-1){flag=false;}
            else {
                System.out.println("Enter name of the product: ");
                String s = scanner.next();
                System.out.println("Enter price of the product: ");
                float s3 = scanner.nextFloat();
                list.add(new Product(s, s3));
            }
        }

      //  for (int i = 0; i <list.size() ; i++) {
        //    System.out.println(list.get(i));
        //}

    }
}

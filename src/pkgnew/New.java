package pkgnew;

import java.util.Scanner;


public class New {
int max = 150;
    int index = 0;
    int profilenumber = 1;
    int deductor = 100;

    String[] names = new String[max];
    String[] email = new String[max];
    String[] address = new String[max];
    String[] birthday = new String[max];
    String[] age = new String[max];

    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
           New name;
        name = new New();
        name.Profile();
        
        
        
       

    }

    public void Profile() {
        Scanner sc = new Scanner(System.in);

        boolean profile = true;
        pro:
        while (profile) {
            System.out.println("  WELCOME ");
            System.out.println("Do you want to create your profile?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int down = sc.nextInt();
            if (down == 1) {
                ProfileEnter();
            } else if (down == 2) {
                System.exit(0);
            }

        }

    }
     public void ProfileEnter() {
        int profilenum = 1;
        Continue:
        while (true) {
            System.out.println(" ************************ ");
            System.out.println("Profile number " + profilenumber);
            System.out.print("Enter your name: ");
            names[index] = sc.next();
            System.out.print("Enter your email: ");
            age[index] = sc.next();
            System.out.print("Enter your age: ");
            age[index] = sc.next();
            System.out.print("Enter your birthday : ");
            birthday[index] = sc.next();
            System.out.print("Enter your address: ");
            address[index] = sc.next();
            profilenumber++;
            index++;
            deductor--;

            boolean whattodo = true;
            next:
            while (whattodo) {

                System.out.println(" ----------- ");
                System.out.println("What do you want to do next?");
                System.out.println("1. Add another profile.");
                System.out.println("2. Search some profiles.");
                System.out.println("3. View all profiles.");
                System.out.println("4. Exit.");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        continue Continue;
                    case 2:
                        System.out.println("Enter name!");
                        sc.nextLine();
                        String namessearch = sc.nextLine();

                        for (int m = 0; m < names.length; m++) {

                            if (namessearch.equals(names[m])) {
                                while (namessearch.equals(names[m])) {
                                    System.out.println(" --------------------");
                                    System.out.println("Name: " + names[m]);
                                    System.out.println("Age: " + age[m]);
                                    System.out.println("Address: " + address[m]);;
                                    System.out.println("Birthday: " + birthday[m]);
                                    System.out.println("-----------------------");
                                    continue next;
                                    
                                }
                            }
                        }
                        System.out.println("Profile not found");
                        continue next;
                    case 3:
                        for (int l = 0; l < names.length - deductor; l++) {
                            System.out.println(" ----------------");
                            System.out.println("Profile No. " + profilenum++ + "\n");

                            System.out.println("Name: " + names[l]);
                            System.out.println("Name: " + email[l]);
                            System.out.println("Age: " + age[l]);
                            System.out.println("Address: " + address[l]);
                            System.out.println("Birthday: " + birthday[l]);
                            System.out.println("----------------------");
                        }
                        continue next;
                    case 4:
                        System.exit(0);
                }

            }
        }

    }
}
        
        
     
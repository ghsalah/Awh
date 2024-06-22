import java.util.Scanner;

class Details {
    int p_id;
    String p_name;
    int p_price;

    
    void readDetailsFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        p_id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter product name: ");
        p_name = scanner.nextLine();
        System.out.print("Enter product price: ");
        p_price = scanner.nextInt();
    }
}

public class Productnew1 {
    public static void main(String[] args) {
        Details p1 = new Details();
        Details p2 = new Details();
        Details p3 = new Details();
        
        System.out.println("Enter details for Product 1:");
        p1.readDetailsFromUser();
        
        System.out.println("\nEnter details for Product 2:");
        p2.readDetailsFromUser();
        
        System.out.println("\nEnter details for Product 3:");
        p3.readDetailsFromUser();

        System.out.println("\nDetails of Product 1:");
        System.out.println("ID: " + p1.p_id);
        System.out.println("Name: " + p1.p_name);
        System.out.println("Price: " + p1.p_price);

        System.out.println("\nDetails of Product 2:");
        System.out.println("ID: " + p2.p_id);
        System.out.println("Name: " + p2.p_name);
        System.out.println("Price: " + p2.p_price);

        System.out.println("\nDetails of Product 3:");
        System.out.println("ID: " + p3.p_id);
        System.out.println("Name: " + p3.p_name);
        System.out.println("Price: " + p3.p_price);

        System.out.println("\n\nThe low price Product is ");

        if (p1.p_price>p2.p_price) {
            if (p1.p_price>p3.p_price) {
                System.out.println("\nDetails of Product 1:");
                System.out.println("ID: " + p1.p_id);
                System.out.println("Name: " + p1.p_name);
                System.out.println("Price: " + p1.p_price);
            }
            else{
                System.out.println("\nDetails of Product 3:");
                System.out.println("ID: " + p3.p_id);
                System.out.println("Name: " + p3.p_name);
                System.out.println("Price: " + p3.p_price);
            }
        }
        else{
            if (p2.p_price>p3.p_price) {
                System.out.println("\nDetails of Product 1:");
                System.out.println("ID: " + p2.p_id);
                System.out.println("Name: " + p2.p_name);
                System.out.println("Price: " + p2.p_price);
            }
            else{
                System.out.println("\nDetails of Product 3:");
                System.out.println("ID: " + p3.p_id);
                System.out.println("Name: " + p3.p_name);
                System.out.println("Price: " + p3.p_price);
            }
        }
    }
}

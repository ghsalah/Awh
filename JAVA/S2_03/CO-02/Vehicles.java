import java.util.Scanner;

class Vehicle {
    String manufacture;
    String colour;
    int year;
    String model;

    Vehicle(String manufacture, String colour, int year, String model) {
        this.manufacture = manufacture;
        this.colour = colour;
        this.year = year;
        this.model = model;
    }
}

class Car extends Vehicle {
    String bodystyle;

    Car(String manufacture, String colour, int year, String model, String bodystyle) {
        super(manufacture, colour, year, model);
        this.bodystyle = bodystyle;
    }

    void display() {
        System.out.println("manufacture: " + manufacture);
        System.out.println("colour: " + colour);
        System.out.println("year: " + year);
        System.out.println("model: " + model);
        System.out.println("bodystyle: " + bodystyle);
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of cars:");
        int n = input.nextInt();
        input.nextLine(); // Consume the newline

        Car[] car = new Car[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter manufacture:");
            String manufacture = input.nextLine();
            System.out.println("Enter colour:");
            String colour = input.nextLine();
            System.out.println("Enter year:");
            int year = input.nextInt();
            input.nextLine(); // Consume the newline
            System.out.println("Enter model:");
            String model = input.nextLine();
            System.out.println("Enter bodystyle:");
            String bodystyle = input.nextLine();

            car[i] = new Car(manufacture, colour, year, model, bodystyle);
        }

        for (int i = 0; i < n; i++) {
            car[i].display();
        }

        input.close();
    }
}

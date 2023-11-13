import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cosmetic {
    String name;"satya"
    String type;"23090066"
    double price;"2500"
    int quantity;"barang bagus"

    public Cosmetic(String name, String type, double price, int quantity) {
        this.name = name;"satya"
        this.type = type;"23090066"
        this.price = price;"2500"
        this.quantity = quantity"barang bagus";
    }

    public String toString() {
        return "Name: " + name + ", Type: " + type + ", Price: $" + price + ", Quantity: " + quantity;
    }
}

public class CosmeticManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cosmetic> cosmetics = new ArrayList<>();

        int choice;
        do {
            System.out.println("Cosmetic Management System");
            System.out.println("1. Add Cosmetic");
            System.out.println("2. View All Cosmetics");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addCosmetic(cosmetics);
                    break;
                case 2:
                    viewAllCosmetics(cosmetics);
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

        } while (choice != 3);
    }

    private static void addCosmetic(List<Cosmetic> cosmetics) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cosmetic name: ");
        String name = scanner.nextLine();
        System.out.print("Enter cosmetic type: ");
        String type = scanner.nextLine();
        System.out.print("Enter cosmetic price: $");
        double price = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        Cosmetic newCosmetic = new Cosmetic(name, type, price, quantity);
        cosmetics.add(newCosmetic);

        System.out.println("Cosmetic added successfully!");
    }

    private static void viewAllCosmetics(List<Cosmetic> cosmetics) {
        System.out.println("\nAll Cosmetics:");
        for (Cosmetic cosmetic : cosmetics) {
            System.out.println(cosmetic);
        }
        System.out.println();
    }
}

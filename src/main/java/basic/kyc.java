package basic;
import java.util.Scanner;

class Customer {
    String name;
    String dob;
    String contact;
    String email;
    String aadhaar;
    String pan;
}

public class kyc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();

        System.out.println("Enter customer details to open a Savings Bank account in KARTHIKA_BANK");
        System.out.print("Name: ");
        customer.name = scanner.nextLine();
        System.out.print("Date of Birth (dd-mm-yyyy): ");
        customer.dob = scanner.nextLine();
        System.out.print("Contact Number: ");
        customer.contact = scanner.nextLine();
        System.out.print("Email: ");
        customer.email = scanner.nextLine();
        System.out.print("Aadhaar Number: ");
        customer.aadhaar = scanner.nextLine();
        System.out.print("PAN: ");
        customer.pan = scanner.nextLine();


        System.out.println("\nApplication submitted successfully!");
        System.out.println("Customer Name: " + customer.name);

        scanner.close();
    }
}

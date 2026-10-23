//project of Programming 2
package app;

public class App {

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 3500);
        Product p2 = new Product(102, "Mouse", 80);

        Customer c1 = new Customer(
                "Ahmed",
                1001,
                "Makkah",
                "0501234567",
                "ahmed@gmail.com");

        Customer c2 = new Customer(
                "Sara",
                1002,
                "Jeddah",
                "0559876543",
                "sara@gmail.com");

        Product[] products = {p1, p2};
        Customer[] customers = {c1, c2};

        Organization org = new Organization(
                "Tech Store",
                "Makkah",
                1,
                products,
                customers);

        System.out.println(org);

        System.out.println("\n------------------");

        System.out.println(p1);

        System.out.println("\n------------------");

        System.out.println(c1);
    }
    
}

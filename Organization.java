package app;

public class Organization {
    private String name;
    private String address;
    private int id;

    private Product[] products;
    private Customer[] customers;

    public Organization() {
    }

    public Organization(String name, String address, int id,
                        Product[] products, Customer[] customers) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.products = products;
        this.customers = customers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        String result = "Organization ID: " + id +
                "\nName: " + name +
                "\nAddress: " + address + "\n";

        result += "\nProducts:\n";
        if (products != null) {
            for (Product p : products) {
                if (p != null)
                    result += p + "\n";
            }
        }

        result += "\nCustomers:\n";
        if (customers != null) {
            for (Customer c : customers) {
                if (c != null)
                    result += c + "\n";
            }
        }

        return result;
    }
}
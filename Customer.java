package app;

public class Customer {
    private String name;
    private int id;
    private String address;
    private String mobileNumber;
    private String email;

    public Customer() {
    }

    public Customer(String name, int id, String address, String mobileNumber, String email) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer ID: " + id +
                "\nName: " + name +
                "\nAddress: " + address +
                "\nMobile: " + mobileNumber +
                "\nEmail: " + email;
    }
}
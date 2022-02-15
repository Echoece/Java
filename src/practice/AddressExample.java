package practice;

public class AddressExample {
    private String name;
    private String address;
    private String City;
    private String Country;

    public AddressExample(String name, String address, String city, String country) {
        this.name = name;
        this.address = address;
        City = city;
        Country = country;
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

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}

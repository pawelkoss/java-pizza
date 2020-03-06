package model;

public class Address {
    private String city;
    private String street;
    private String zipCode;
    private String buildNumber;
    private String flatNumber;

    public Address() {
    }

    public Address(String city, String street, String zipCode, String buildNumber, String flatNumber) {
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
        this.buildNumber = buildNumber;
        this.flatNumber = flatNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }
}

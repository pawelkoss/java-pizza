package model;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private Address address;
    private List<ShopList> shopList;
    private Person person;
    private String extraInformation;
    private LocalDateTime created;
   // private OrderStatus status;



    public Order(Address address, List<ShopList> shopList, Person person, String extraInformation, LocalDateTime created) {
        this.address = address;
        this.shopList = shopList;
        this.person = person;
        this.extraInformation = extraInformation;
        this.created = created;
        //this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<ShopList> getShopList() {
        return shopList;
    }

    public void setShopList(List<ShopList> shopList) {
        this.shopList = shopList;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getExtraInformation() {
        return extraInformation;
    }

    public void setExtraInformation(String extraInformation) {
        this.extraInformation = extraInformation;
    }
}

package oops.Assignment.Discount;

import java.util.UUID;

public class Customer {
    private UUID id;
    private String name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public int getOrderCount() {
        return OrderCount;
    }

    public void setOrderCount(int orderCount) {
        OrderCount = orderCount;
    }

    public int getVistCount() {
        return vistCount;
    }

    public void setVistCount(int vistCount) {
        this.vistCount = vistCount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String deliveryAddress;
    private int OrderCount;
    private  int vistCount;
    private String city;

//    public int getVisitCount() {
//    }
}

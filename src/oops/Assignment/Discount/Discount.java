package oops.Assignment.Discount;

import java.util.Date;

public class Discount {
    private String customerName;
    private int discount;
    private Date validTill;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public Date getValidTill() {
        return validTill;
    }

    public void setValidTill(Date validTill) {
        this.validTill = validTill;
    }

    public int getDaysleft() {
        return daysleft;
    }

    public void setDaysleft(int daysleft) {
        this.daysleft = daysleft;
    }

    private int daysleft;


}

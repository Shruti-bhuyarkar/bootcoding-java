package oops;

public class FrequencyOfShopping {
    public static void main(String[] args) {
        int[] NumPurchased = {10, 8, 7, 5, 3, 0, 2};
        int[] buy = calculatediscount(NumPurchased);
        for (int i = 0; i < NumPurchased.length; i++) {
            System.out.println("Number of Shopping " + NumPurchased[i] + " = customer got " + buy[i] + "% Discount");
        }

    }

    public static int[] calculatediscount(int[] NumPurchased) {
        int[] buy = new int[(NumPurchased.length)];
        for (int i = 0; i < NumPurchased.length; i++) {
            int discount;
            int percentage = NumPurchased[i];
            discount = discounts(percentage);
            buy[i] = discount;
        }
        return buy;

    }

    public static int discounts(int dispercentage) {
        int discount;
        if (dispercentage >= 8) {
            discount = 50;
        } else if (dispercentage >= 5) {
            discount = 30;

        } else if (dispercentage >= 2) {
            discount = 20;

        } else{
            discount = 0;
             }

    return discount;
    }
}

//create a class box with 3 data members length , breadth and height (double )
// having 3 methods
//create box with 3 parameter
// create with 0 parameter
// print box with 0 parameter
//createBox()
//createBox(l,b.h)
//printBox()
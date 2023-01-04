package oops;

import java.net.SocketTimeoutException;

public class age {
    public static boolean inSeniorCitizen(int[] age) {
        for (int i = 0; i < age.length; i++) {
            if (age[i] >= 60) {
                return true;

            }
        }
        return false;
    }

    public static boolean inChild(int[] age) {
        for (int i = 0; i < age.length; i++) {
            if (age[i] <= 15) {
                return true;

            }
        }
        return false;
    }

    public static boolean inAdult(int[] age) {
        for (int i = 0; i < age.length; i++) {
            if (age[i] >=18 ) {
                return true;

            }
        }
        return false;
    }
    public static void main(String[] args)
        {
        int[] age={12,17,25,20,27,30};
            System.out.println(inSeniorCitizen(age));
            System.out.println(inChild(age));
            System.out.println(inAdult(age));
        }





}

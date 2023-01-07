package oops.Assignment.Discount;

import java.util.Random;

public class NameGenerator {

    private  static  String[] names = {"sharayu" , "Nachiket" , "Tanmay", "Abhishek" ,
                                        "Rashi", "Sakshi" , "Prerna" , "Atharva" ,
                                        "Mansawini" , "Sharavni" , "Shrikant" , "Shraddha" ,"Om"};

            private static final Random random = new Random();


    public static String getName(){
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];


    }
}

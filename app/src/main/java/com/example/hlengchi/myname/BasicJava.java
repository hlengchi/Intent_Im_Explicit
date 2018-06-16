package com.example.hlengchi.myname;

import org.apache.commons.lang3.StringUtils;

public class BasicJava {
    public static void main(String args[]){
//        double[] myNumber={3.2,9.2,8,5.2,6.1};
//        String myName="I Love Java Programming";
//
//        String[] split1=myName.split(" ");
//
//        for (int i=0;i<split1.length;i++){
//            System.out.print(split1[i]);
//           // System.out.print(" ");
//        }
//        System.out.println();
//
//        System.out.println("LowerCase: "+myName.toLowerCase());
//        System.out.println("Count the length of it: "+myName.length());
//        System.out.println("Substring :"+myName.substring(7,11));
//
//        StringBuilder re=new StringBuilder(myName);
//        re.reverse();
//
//        System.out.println("Reverse string :"+re);
//        System.out.println(StringUtils.reverse(myName));
//
//        for(int i=0;i<myNumber.length;i++){
//          System.out.println("Arrays : "+myNumber[i]);
//        }

        //--------------------------------------
//     int passcode=312;
//     String coffeeType;
//
//     switch (passcode){
//         case 555: coffeeType="Espresso";
//         break;
//         case 312: coffeeType="Vanilla latte";
//         break;
//         case 269: coffeeType="Drip coffee";
//         break;
//         default:coffeeType="Unknown";
//     }
//     System.out.println(coffeeType);

        //---create function
    //chourus(4);
     //likePhoto(10,"The best photo",true);

       // double totalChange=makeChange(20,50);

        //int totalRandomNumber=rollDice();
        System.out.println("Roll 1 : "+rollDice(8));
        System.out.println("Roll 2 : "+rollDice(10));


    }

    static public void chourus(int temperature){
        if (temperature>30) {
            System.out.println("It's hot outside!");
        }else if(temperature<5){
            System.out.println("Brr, consider wearing a jacket.");
        }else {
            System.out.println("Not too hot, not too cold.");
        }
    }
    static public int likePhoto(int currentLikes, String comment, boolean like){
        int totalLike;
        System.out.println("Feedback"+comment);
        if (like) {
            currentLikes=currentLikes+1;
        }
            //System.out.println("Number of likes: "+ currentLikes);
        return currentLikes;
    }

    static public double makeChange(double itemCost, double dollarsProvided){
        double change=dollarsProvided-itemCost;
        return change;
    }
    static public int rollDice(int sides){
        //random number between 0 and (almost)1
        double randomNumber=Math.random();
        //change rang to 0 to (almost)6
        randomNumber=randomNumber* sides;
        //shift rang up one
        int randonInt=(int) randomNumber+1;
        return randonInt;

    }

}


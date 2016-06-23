package ga.lab;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String charString;
        double summedDoubles;
        int findMiddle;

        //Problem 1
        stringLengthOrValue("I said");
        stringLengthOrValue("hey");
        stringLengthOrValue("whats up?");
        stringLengthOrValue("hello!");


        //Problem 2:

        reversedOrder();


        //Problem 3:
        System.out.println();
        maxValue(new int[]{2, 52, 7, 91, 10, 12});
        maxValue(new int[]{12, 1, 11});
        maxValue(new int[]{0, 14});
        maxValue(new int[]{100, 23, 29, 101, 1});
        System.out.println();


        //Problem 4:

        summedDoubles = sumOfValues(new double[]{12.1, 13.9, 7.0});
        //how do we print a variable to the command line
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{1.23, 2.09, 9.2});
        //how do we print a variable to the command line
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{1.01, 15.1, 22.27, 19.99});
        //how do we print a variable to the command line
        System.out.println(summedDoubles);

        summedDoubles = sumOfValues(new double[]{3.08, 4.1, 7.2, 3.0});
        //how do we print a variable to the command line
        System.out.println(summedDoubles);

        System.out.println();


        //Problem 5:
        charString = charsToString(new char[]{'h', 'e', 'l', 'l', 'o'});
        //how do we print a variable to the command line
        System.out.println(charString);

        charString = charsToString(new char[]{'t', 'h', 'e', 'r', 'e', '!'});
        //how do we print a variable to the command line
        System.out.println(charString);

        charString = charsToString(new char[]{'I', ' ', 'a', 'm', ' '});
        //how do we print a variable to the command line
        System.out.println(charString);

        charString = charsToString(new char[]{'A', ' ', 'S', 't', 'r', 'i', 'n', 'g', '.'});
        //how do we print a variable to the command line
        System.out.println(charString);

        System.out.println();


        //Problem 6:
        //Put your code for problem 6 here

        /* Create a List of type String with the variable name myStringList. At least 5 String values to the list. (You can
     put any 5 String values you want).
      */

        List<String> myStringList = new ArrayList<>();
        myStringList.add("Fassbinder");
        myStringList.add("Bergman");
        myStringList.add("Tarkovsky");
        myStringList.add("Kubrick");
        myStringList.add("Godard");


        //Problem 7:
        //reversedStringOrder(/*use the List you created in problem 6

        reversedStringOrder(myStringList);


        //Problem 8:
        // printOrAdd(/*use the List you created in problem 6);

        printOrAdd(myStringList);


        //Problem 9:
        //Create an int array of an odd size, with the variable name 'oddSizedArray'
        //Make sure the size is at least 5.

        System.out.println();
        //oddSizedArray(new int[]{24, 3, 56, 1000, 18});
        int[] oddSizedArray = new int[5];


        System.out.println();

        //Problem 10:
        findMiddle(oddSizedArray);
        //how do we print a variable to the command line
        System.out.println(findMiddle(oddSizedArray));

        System.out.println(findMiddle(new int[]{2,7,9,12,15}));
        //how do we print a variable to the command line

        System.out.println(findMiddle(new int[]{13, 91, 27, 99, 14, 36, 10}));
        //how do we print a variable to the command line

        System.out.println(findMiddle(new int[]{100, 1, 45, 1092, 76, 12, 34, 11, 145}));
        //how do we print a variable to the command line */

    }


      /*Problem 1: Write a function stringLengthOrValue that accepts one String parameter. This function should print
       the value of the String parameter to the command line if the length of the String is greater than 5. If the
       length of the String is less than 5, print the length of the String parameter.*/


    public static void stringLengthOrValue(String wordString) {

        if (wordString.length() > 5) {
            System.out.println(wordString);

        }

        if (wordString.length() < 5) {
            System.out.println(wordString.length());


        }

    }

    /* Write a function reversedOrder that accepts no parameters. This function should create an int array of size 10
    and assign values 0-9 to each index in the array by using a for loop. It should then print out the values in reverse
    order using a separate for loop inside the function. */

    public static void reversedOrder() {

        int[] reversedOrder = new int[10];


        System.out.println();

        for (int i = 0; i < 10; i++) {
            reversedOrder[i] = i;
            System.out.println(reversedOrder[i]);

        }
        System.out.println();

        for (int i = 9; i >= 0; i--) {
            reversedOrder[i] = i;
            System.out.println(reversedOrder[i]);

        }

    }

    /* Write a function maxValue that accepts one int array parameter. This function should loop through the array to
    return the max value in that array. If the array is of size 1, the max value is the only item in the array. If the
    array is of size 10, how do we keep a record of the current max value when looping through the array?
     */

    public static void maxValue(int[] arrayParameter) {

        int max = 0;

        for (int i = 0; i < arrayParameter.length; i++) {
            if (arrayParameter[i] > max) {
                max = arrayParameter[i];

            }

        }

        System.out.println(max);

    }

    /* Write a function sumOfValues that accepts a double array parameter. This function should loop through the array
    and ADD all the values in the array. It should then return the sum of the values. The sum must then be assigned to
    the variable summedDoubles and the value of the variable should then be printed to the command line.
     */

    public static double sumOfValues(double[] doubleArray) {

        double summedDoubles = 0;

        for (int i = 0; i < doubleArray.length; i++) {
            summedDoubles = summedDoubles + doubleArray[i];
        }
        return summedDoubles;
    }

    /* Write a function charsToString that takes in a char array parameter. This function should loop through the array
    and concatenate each char value into a String. It should then return the String that was created. The String must
    then be assigned to the variable charString and the value of the variable should then be printed to the command line.
     */

    public static String charsToString(char[] charArray) {

        String charStringA = "";

        for (int i = 0; i < charArray.length; i++) {
            charStringA = charStringA + charArray[i];
        }

        return charStringA;
    }

/* Write a function reversedStringOrder that accepts a List parameter of type String. The function should loop through
the List and print each String in reverse order to the command line (last String first). Use the List you created in
problem 6 as the parameter you give to the function.

List<String> myStringList = new ArrayList<>();
        myStringList.add("Fassbinder");
        myStringList.add("Bergman");
        myStringList.add("Tarkovsky");
        myStringList.add("Kubrick");
        myStringList.add("Godard");

 */

    public static void reversedStringOrder(List<String> myStringList) {

        String[] reversedStringOrder = new String[5];

        for (int i = 4; i >= 0; i--) {
            System.out.println(myStringList.get(i));


        }
    }

/* Write in a function printOrAdd that accepts a List parameter of type String. The function should print all values in
the list if the size of the List is equal to 10. If the size of the list is less than 10, add a String value to the list
that consists of the word "Java" concatenated with the current size of the list. Use the List you created in problem 6.
 */

    public static void printOrAdd(List<String> myStringList) {

        if (myStringList.size() == 10) {
            System.out.println(myStringList);

        } else {
            myStringList.add("Java" + myStringList.size());
            System.out.println(myStringList);

        }

    }

    /* Create an int array of an odd size with the variable name oddSizedArray. Make sure the size is at least 5. */

    public static int[] oddSizedArray(int[] oddList) {

        int[] oddSizedArray = new int[5];

        oddSizedArray[0] = 24;
        oddSizedArray[1] = 3;
        oddSizedArray[2] = 56;
        oddSizedArray[3] = 1000;
        oddSizedArray[4] = 18;



        for (int i = 0; i < oddSizedArray.length; i++) {
            System.out.println(oddSizedArray[i]);


        }
        return oddSizedArray;
    }

    /*Write a function findMiddle that accepts a int array parameter. The function should access the value of the item
    at the middle of the array. The function should then return that value and assign it to the int variable middleValue.
     Print the value of middleValue to the command line. Use the array you created in problem 9 for one of the examples.
     */

    public static int findMiddle(int[] oddSizedArray){

        int findMiddle = oddSizedArray.length / 2;
        return findMiddle;

    }

}


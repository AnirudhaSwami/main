/*
    Challenge: Calculate the Total Cost of an Item
    Test your understanding of Java Operators by completing a small coding challenge.

    Instructions
    Inside main(), complete the following steps:
    Declare two int variables named itemPrice and shippingCost, and assign them values
    Create an int variable named sum
    Calculate the total cost by adding itemPrice and shippingCost (store the result in sum)
    Print the total cost (sum)
*/

public class J005_Operators {
    public static void main(String [] args){
        int itemPrice, shippingCost;
        itemPrice = 100;
        shippingCost = 10;

        int sum = itemPrice + shippingCost;
        System.out.println(sum);
    }
}

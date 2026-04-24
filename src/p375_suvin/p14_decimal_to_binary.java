//14) Write a program to convert a decimal number to binary.

package p375_suvin;

public class p14_decimal_to_binary {
    public static void main(String[] args) {
        int num = 10;
        String binary = "";
        int temp = num;
        while (temp > 0) {
            binary = (temp % 2) + binary;
            temp = temp / 2;
        }
        System.out.println("Decimal " + num + " in binary is: " + binary);
    }
}

//output
//Decimal 10 in binary is: 1010

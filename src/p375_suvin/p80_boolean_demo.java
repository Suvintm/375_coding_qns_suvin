//80) Write a program to demonstrate the use of boolean data type.

package p375_suvin;

public class p80_boolean_demo {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);
        
        if (isJavaFun) {
            System.out.println("Let's code!");
        }
    }
}

//output
//Is Java fun? true
//Is fish tasty? false
//Let's code!

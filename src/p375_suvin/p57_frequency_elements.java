//57) Write a program to find the frequency of each element in an array.

package p375_suvin;

public class p57_frequency_elements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] fr = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited) fr[i] = count;
        }
        System.out.println("Element | Frequency");
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited) System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
    }
}

//output
//Element | Frequency
//    1    |    2
//    2    |    4
//    8    |    1
//    3    |    1
//    5    |    1

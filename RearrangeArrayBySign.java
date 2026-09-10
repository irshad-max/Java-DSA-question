import java.util.*;

public class RearrangeArrayBySign {
    public static void main(String[] args) {

        int arr[] = {3, 1, -2, -5, 2, -4};
        int n = arr.length;

        int result[] = new int[n];

        int pos = 0;
        int neg = 1;

        for (int num : arr) {

            if (num > 0) {
                result[pos] = num;
                pos += 2;
            } else {
                result[neg] = num;
                neg += 2;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
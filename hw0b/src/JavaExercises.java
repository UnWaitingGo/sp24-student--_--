import java.util.ArrayList;
import java.util.List;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    /**
     * 创建一个骰子对象
     * 
     * @return 返回一个包含骰子六个面的整数数组
     */
    public static int[] makeDice() {
        // 初始化一个长度为6的整数数组，用于表示骰子的六个面
        int[] dice = new int[6];
        // 遍历数组，为每个元素赋值从1到6，表示骰子的各个面
        for (int i = 0; i < 6; i++) {
            dice[i] = i + 1;
        }
        // 返回初始化完成的骰子数组
        return dice;
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        if (customer.equals("Ergun")) {
            return new String[] {"beyti", "pizza", "hamburger", "tea"};
        } else if (customer.equals("Erik")) {
            return new String[] {"sushi", "pasta", "avocado", "coffee"};
        } else {
            return new String[3];
        }
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        return max - min;
    }
    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        if (x == 1) {
            list.add(x);
        } else if (x % 2 == 0){
            list.add(x);
            hailstoneHelper(x / 2, list);
        } else {
            list.add(x);
            hailstoneHelper((3 * x + 1), list);
        }
        return list;
    }

}

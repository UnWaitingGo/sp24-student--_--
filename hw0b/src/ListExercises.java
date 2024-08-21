import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers
     * //sum：此方法采用列表 List<Integer> L，并返回该列表中元素的总和。如果列表为空，则该方法应返回 0。 */
	public static int sum(List<Integer> L) {
        //防止传入null的列表
        if (L == null || L.isEmpty()) {
            return 0;
        }
        //如果列表只有一个元素，直接返回该元素
        if (L.size() == 1) {
            return L.get(0);
        }
        //计算剩余部分的和
        int restSum = 0;
        for (int i = 1;i<L.size();i++) {
            restSum += L.get(i);
        }
        return L.get(0) + restSum;
    }    public static List<Integer> evens(List<Integer> L) {
        //evens：此方法采用列表 List<Integer> L，
        // 并返回一个包含给定列表的偶数的新列表。如果没有偶数元素，它应该返回一个空列表。
        List<Integer> evenNumbers = new ArrayList<>(); // 创建新列表用于存储偶数
        // 检查列表是否为空，如果是，则直接返回空列表
        if (L == null || L.isEmpty()) {
            return evenNumbers;
        }
        // 遍历列表，添加偶数到新列表中
        for (int number : L) {
            if (number % 2  == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    /** Returns a list containing the even numbers of the given list */


    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        //此方法采用两个列表 List<Integer> L1、List<Integer> L2，并返回一个新列表，其中同时包含两个给定列表中存在的元素。
        // 如果没有公共项，它应该返回一个空列表。
        List<Integer> commonNumbers = new ArrayList<>();
        if (L1 == null || L2 == null || L1.isEmpty() || L2.isEmpty()) {
            return commonNumbers;
        }
        for (int i = 0;i < L1.size();i++) {
            for (int j = 0;j < L2.size();j++) {
                if (L1.get(i) == L2.get(j)) {
                    commonNumbers.add(L1.get(i));
                }
            }
        }
        return commonNumbers;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // countOccurrencesOfC：此方法采用一个列表和一个字符 List<String> 单词、char c，
        // 并返回给定字符在字符串列表中的出现次数。如果该字符未出现在任何单词中，则应返回 0。
        if (words == null || words.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (String word : words) {
            if (word != null) {
                for (int j = 0;j<word.length();j++) {
                    if (word.charAt(j) == c) {
                        count ++;
                    }
                }
            }
        }
        return count;
    }
}

import java.util.ArrayList;
import java.util.List;

public class TistaSectionB {
    /*
       Add a method which takes a string and returns a version without the first and last char.
       For example, "Hello" should return "ell". The string length will be at least 2.
    */
    public static String takeoutFirstAndLast(String word) {
        if (word.length() >= 2) {
            return word.substring(1, word.length() - 1);
        } else {
            return null;
        }
    }

    /*
        Add a method which takes a list of integers, return a list of the integers, omitting any that are less than 0.
     */
    public static List<Integer> getNotNulls(List<Integer> myNums) {
        List<Integer> moreThenNull = new ArrayList<Integer>();
        for (int i = 0; i < myNums.size(); i++) {
            if (myNums.get(i) >= 0) {
                moreThenNull.add(myNums.get(i));
            }
        }
        return moreThenNull;


    }

    /*
        Write a method or functions in the major programming language of your choice that returns the longest word in a sentence and its length.
        For example, “The quick brown fox jumped over the lazy dog.” should return “jumped” and 6.
     */
    public static String getTheLongest(String sentence) {

        String[] sentenceArr = sentence.replaceAll("[^\\w\\s]", "").split(" ");
        String maxWord = "";

        int maxLength = 0;
        for (int i = 0; i < sentenceArr.length; i++) {
            if (sentenceArr[i].length() > maxLength) {
                maxWord = sentenceArr[i];
                maxLength = sentenceArr[i].length();
            }

        }
        return maxWord + " and " + maxLength;
    }

}

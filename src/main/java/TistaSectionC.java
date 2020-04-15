import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TistaSectionC {
    String sentence;
    String word;
    List<Integer> nums;

    @Before
    public void varSetUp() {
        sentence = "Wiktionary has grown beyond a standard dictionary and now includes a thesaurus, a rhyme guide, phrase books, language statistics and extensive appendices. ";
        word = "CoddingJava";
        nums = new ArrayList<Integer>(Arrays.asList(5, 6, 3, 2, 0, -5, -33));

    }

    @Test
    public void takeoutFirstAndLastTest() {
        System.out.println(TistaSectionB.takeoutFirstAndLast(word));
    }

    @Test
    public void getNotNullsTest() {
        System.out.println(TistaSectionB.getNotNulls(nums));
    }

    @Test
    public void getTheLongestTest() {
        System.out.println(TistaSectionB.getTheLongest(sentence));
    }

    /*
    	Add a method that returns the shortest word and length with unit tests.
     */
    public String getTheShortest(String sentence) {

        String[] sentenceArr = sentence.replaceAll("[^\\w\\s]", "").split(" ");
        String shortest = "";

        int minLength = Integer.MAX_VALUE;
        System.out.println(Arrays.toString(sentenceArr));
        shortest = sentenceArr[0];
        for (int i = 1; i < sentenceArr.length; i++) {
            if (sentenceArr[i].length() < shortest.length()) {
                shortest = sentenceArr[i];
                minLength = sentenceArr[i].length();
            }

        }
        return shortest + " and " + minLength;
    }

    @Test
    public void getTheShortest() {
        System.out.println(getTheShortest(sentence));
        System.out.println(getTheShortest("Tinkle, Tinkle little car\n" +
                "How I wonder what you are.\n" +
                "\n" +
                "Leaking oil every day\n" +
                "Having it your own way.\n" +
                "\n" +
                "\n" +
                "Source: https://www.familyfriendpoems.com/poem/tinkle-tinkle-little-car"));

    }

    @Test
    public void getShortest() {
        System.out.println(getTheShortest("Tinkle, Tinkle little car How I wonder what you are Leaking oil every day Having it your own way."));
    }
}

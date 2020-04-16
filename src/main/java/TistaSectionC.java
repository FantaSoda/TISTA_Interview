import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TistaSectionC {
    String sentence;
    String word;
    String expectedWithoutfirstAndLAst;
    String expectedlongest;
    List<Integer> nums;
     List<Integer>positiveNums;

    @Before
    public void varSetUp() {
        sentence = "Wiktionary has grown beyond a standard dictionary and now includes a thesaurus, a rhyme guide, phrase books, language statistics and extensive appendices. ";
       expectedlongest="Wiktionary and 10";
        word = "CoddingJava";
        expectedWithoutfirstAndLAst= "oddingJav";
        nums = new ArrayList<Integer>(Arrays.asList(5, 6, 3, 2, 0, -5, -33));
         positiveNums= new ArrayList<Integer>(Arrays.asList(5, 6, 3, 2, 0));

    }

    @Test
    public void takeoutFirstAndLastTest() {
        System.out.println(TistaSectionB.takeoutFirstAndLast(word));
        Assert.assertEquals(expectedWithoutfirstAndLAst,TistaSectionB.takeoutFirstAndLast(word));
    }

    @Test
    public void getNotNullsTest() {
        System.out.println(TistaSectionB.getNotNulls(nums));
          Assert.assertEquals(positiveNums,TistaSectionB.getNotNulls(nums));
    }

    @Test
    public void getTheLongestTest() {
        System.out.println(TistaSectionB.getTheLongest(sentence));
            Assert.assertEquals(expectedlongest, TistaSectionB.getTheLongest(sentence));
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
        Assert.assertEquals("a and 1",getTheShortest(sentence));

    }

    @Test
    public void getShortest() {
        System.out.println(getTheShortest("Tinkle, Tinkle little car How I wonder what you are Leaking oil every day Having it your own way."));
         Assert.assertEquals("I and 1",getTheShortest("Tinkle, Tinkle little car How I wonder what you are Leaking oil every day Having it your own way."));
    }
}

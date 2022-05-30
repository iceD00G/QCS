package com.mycompany.app;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import java.util.Random;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App app = new App();

    @Test
    public void testCF11(){
        assertEquals(App.findOverlappingPair("",""), Integer.MIN_VALUE);
    }

    @Test
    public void testCF12(){
        assertEquals(App.findOverlappingPair("bb","tbb"), 2);
    }

    @Test
    public void testCF13(){
        assertEquals(App.findOverlappingPair("aaaaa","taaaaa"), 5);
    }

    @Test
    public void testCF14(){
        assertEquals(App.findOverlappingPair("eeeeeeeeee","meeeeeeeeee"), 10);
    }

    @Test
    public void testCF15(){
        assertEquals(App.findOverlappingPair("tbb","bb"), 2);
    }

    @Test
    public void testCF16(){
        assertEquals(App.findOverlappingPair("hooooo","ooooo"), 5);
    }

    @Test
    public void testCF17(){
        assertEquals(App.findOverlappingPair("laaaaaaaaaa","aaaaaaaaaa"), 10);
    }

    @Test
    public void testCF21(){
        assertEquals(App.findShortestSuperstring(new String[]{"a","a"},2), "a");
    }

    @Test
    public void testCF22(){
        assertEquals(App.findShortestSuperstring(new String[]{"a","a","a","a","a","a","a"}, 7), "a");
    }

    @Test
    public void testCF23(){
        assertEquals(App.findShortestSuperstring(new String[]{"a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}, 52), "a");
    }

    @Test
    public void testCF24(){
        assertEquals(App.findShortestSuperstring(new String[]{"a","b"},2), "ab");
    }

    @Test
    public void testCF25(){
        System.out.println(App.findShortestSuperstring(new String[]{"a","b","c","d","e","f","g"},2));
        assertEquals(App.findShortestSuperstring(new String[]{"a","b","c","d","e","f","g"},7), "agfedcb");
    }

    @Test
    public void testCF26(){
        assertEquals(App.findShortestSuperstring(new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z", "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}, 52), "aZYXWVUTSRQPONMLKJIHGFEDCBAzyxwvutsrqponmlkjihgfedcb");
    }

    @Test
    public void testDF11(){
        assertEquals(App.findOverlappingPair("","A"), Integer.MIN_VALUE);
    }

    @Test
    public void testDF12(){
        assertEquals(App.findOverlappingPair("A",""), Integer.MIN_VALUE);
    }

    @Test
    public void testDF13(){
        assertEquals(App.findOverlappingPair("A","B"), Integer.MIN_VALUE);
    }

    @Test
    public void testDF14(){
        assertEquals(App.findOverlappingPair("AAAAAAAAAA","BBBBBBBBBB"), Integer.MIN_VALUE);
    }

    @Test
    public void testDF15(){
        String str1 = "";
        String str2 = "";
        for(int i = 0; i < 1000; i++){
            str1 += "A";
            str2 += "B";
        }
        assertEquals(App.findOverlappingPair(str1, str2), Integer.MIN_VALUE);
    }

    @Test
    public void testDF16(){
        assertEquals(App.findOverlappingPair("A","A"), 1);
    }
    @Test
    public void testDF17(){
        assertEquals(App.findOverlappingPair("AAAAAAAAAA","AAAAAAAAAA"), 10);
    }

    @Test
    public void testDF18(){
        String str1 = "";
        String str2 = "";
        for(int i = 0; i < 1000; i++){
            str1 += "A";
            str2 += "A";
        }
        assertEquals(App.findOverlappingPair(str1, str2), 1000);
    }

    @Test
    public void testDF19(){
        assertEquals(App.findOverlappingPair("A","BA"), 1);
    }

    @Test
    public void testDF20(){
        assertEquals(App.findOverlappingPair("AAAAAAAAAA","BAAAAAAAAA"), 9);
    }

    @Test
    public void testDF21(){
        String str1 = "";
        String str2 = "B";
        for(int i = 0; i < 1000; i++){
            str1 += "A";
            str2 += "A";
        }
        assertEquals(App.findOverlappingPair(str1, str2), 1000);
    }

    @Test
    public void testBB111(){
        App.findOverlappingPair("","");
    }

    @Test
    public void testBB112(){
        App.findOverlappingPair("a","");
    }

    @Test
    public void testBB113(){
        App.findOverlappingPair("","a");
    }

    @Test
    public void testBB114(){
        App.findOverlappingPair("A","B");
    }

    @Test
    public void testBB115(){
        App.findOverlappingPair("ABC","");
    }

    @Test
    public void testBB116(){
        App.findOverlappingPair("1","2");
    }

    @Test
    public void testBB117(){
        App.findOverlappingPair("111","222");
    }

    @Test
    public void testBB118(){
        App.findOverlappingPair(" "," ");
    }

    @Test
    public void testBB119(){
        App.findOverlappingPair("\n","\\");
    }

    @Test
    public void testBB121(){
        App.findOverlappingPair("","");
    }

    @Test
    public void testBB122(){
        App.findOverlappingPair("A","B");
    }

    @Test
    public void testBB211(){
        App.findShortestSuperstring(new String[]{""},1);
    }

    @Test
    public void testBB212(){
        App.findShortestSuperstring(new String[]{"",""},2);
    }

    @Test
    public void testBB213(){
        App.findShortestSuperstring(new String[]{"a","abc", "abcd"},3);
    }

    @Test
    public void testBB214(){
        App.findShortestSuperstring(new String[]{"1", "1234", "34"},3);
    }

    @Test
    public void testBB215(){
        App.findShortestSuperstring(new String[]{"\n"},1);
    }

    @Test
    public void testBB216(){
        App.findShortestSuperstring(new String[]{"\\","-","."},3);
    }

    @Test
    public void testBB221(){
        App.findShortestSuperstring(new String[]{"a"},-1);
    }

    @Test
    public void testBB222(){
        App.findShortestSuperstring(new String[]{"a", "a"},-1);
    }

    @Test
    public void testBB223(){
        App.findShortestSuperstring(new String[]{"a", "a"},0);
    }

    @Test
    public void testBB224(){
        App.findShortestSuperstring(new String[]{},0);
    }

    @Test
    public void testBB225(){
        App.findShortestSuperstring(new String[]{"a"},1);
    }

    @Test
    public void testBB226(){
        String[] arr = new String[1000];
        for(int i = 0; i < 1000; i++){
            arr[i]="a";
        }
        App.findShortestSuperstring(arr,1000);
    }
}
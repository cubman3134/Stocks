/**
 * Created by Raethor on 6/29/17.
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Stocks {
    public static void main(String[] args){
        Document doc = null;
        try {
            doc = Jsoup.connect("http://google.com").get();
        } catch (IOException e){
            e.printStackTrace();
        }
        String title = doc.title();
        System.out.println("Title: " + title);
    }
}

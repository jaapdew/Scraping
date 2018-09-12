import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ScrapingBitcoinData {

	
	public static void main(String[] args) {											
		try {																			
			Document doc = Jsoup.connect("https://www.binance.com/nl/trade/BTC_USDT").userAgent("Mozilla/17.0").get();
			Elements temp = doc.select("div.s1yysggs-0");
			System.out.println(temp.size());
			
			int i = 0;
			for(Element bitcoinData:temp) {
				System.out.println(i + " " + bitcoinData.getElementsByIndexEquals(0).text());
				i++;
			}
		}catch(IOException e) {
			e.printStackTrace();

	}
}

}
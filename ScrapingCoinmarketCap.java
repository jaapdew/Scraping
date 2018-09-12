import java.io.IOException;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ScrapingCoinmarketCap {
	static private List<Double> bitcoinHigh;
	static private List<Double> bitcoinLow;
	
	public static void main(String[] args) {
		try {																			
			Document doc = Jsoup.connect("https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20130428&end=20180911").userAgent("Mozilla/17.0").get();
			Elements temp = doc.select("tr.text-right");
			System.out.println(temp.size());
			
			int i = 0;
				System.out.println(i + "  High  " + "   Low   ");
			for(Element bitcoinData:temp) {
				//bitcoinHigh.add(Double.parseDouble(bitcoinData.getElementsByIndexEquals(2).text()));
				//bitcoinLow.add(Double.parseDouble(bitcoinData.getElementsByIndexEquals(3).text()));
				i++;
				System.out.println(i+ " " + bitcoinData.getElementsByIndexEquals(2).text()+ " " + bitcoinData.getElementsByIndexEquals(3).text());
			}
		}catch(IOException e) {
			e.printStackTrace();

		}
	}
	
	//<td data-format-fiat="" data-format-value="6534.25">6,534.25</td>
}

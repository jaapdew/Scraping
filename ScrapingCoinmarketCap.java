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
			Document doc = Jsoup.connect("https://bitcoincharts.com/charts/chart.json?m=bitstampUSD&SubmitButton=Draw&r=&i=&c=0&s=&e=&Prev=&Next=&t=S&b=&a1=&m1=10&a2=&m2=25&x=0&i1=&i2=&i3=&i4=&v=1&cv=0&ps=0&l=0&p=0&")
					.userAgent("Mozilla/17.0").get();
			Elements temp = doc.select("body");
			String data = temp.toString();
			
			//System.out.println(data);
			//System.out.println(data.substring(2, 13));
			System.out.println(data.substring(13));
			
		}catch(IOException e) {
			e.printStackTrace();

		}
	}
	
}

/*
 
			System.out.println(temp.size());
				int i = 0;
				System.out.println(i + "  High  " + "   Low   ");
				i =2;
			for(Element bitcoinData:temp) {
				//bitcoinHigh.add(Double.parseDouble(bitcoinData.getElementsByIndexEquals(2).text()));
				//bitcoinLow.add(Double.parseDouble(bitcoinData.getElementsByIndexEquals(3).text()));
				;
			//	System.out.println(i+ " " + bitcoinData.getElementsByIndexEquals(i).text()+ " " + bitcoinData.getElementsByIndexEquals(3).text());
				System.out.println(i+ " " + bitcoinData.getElementsByIndexEquals(i).text());
				i= i+8;
				*/

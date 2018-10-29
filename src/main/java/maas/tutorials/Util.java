package maas.tutorials;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import maas.Start;

public class Util {
	public static String[] getPurchaseList() {
		List<String> purchaseItems = new ArrayList<String>();
    	InputStream purchaseListInputStream = Start.class.getResourceAsStream("/purchase_list.txt");
    	BufferedReader br = new BufferedReader(new InputStreamReader(purchaseListInputStream));

    	try {
    		String line;
			while ((line = br.readLine()) != null) {
			  purchaseItems.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    	
    	return purchaseItems.toArray(new String[purchaseItems.size()]);
	}
}

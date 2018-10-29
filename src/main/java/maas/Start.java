package maas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Vector;
import java.util.regex.Pattern;


import maas.tutorials.BookBuyerAgent;
import maas.tutorials.Util;

public class Start {
    public static void main(String[] args) throws IOException {
    	List<String> agents = new Vector<>();
    	agents.add("seller_1:maas.tutorials.BookSellerAgent");
    	agents.add("seller_2:maas.tutorials.BookSellerAgent");
    	agents.add("seller_3:maas.tutorials.BookSellerAgent");
    	
    	String[] purchaseList = Util.getPurchaseList();
    	for(int i=0; i< purchaseList.length; i++) {
    		String agent = String.format("buyer_%d:maas.tutorials.BookBuyerAgent(%s)", i, purchaseList[i]);
    		agents.add(agent);
    	}
    	
    	List<String> cmd = new Vector<>();
    	cmd.add("-agents");
    	StringBuilder sb = new StringBuilder();
    	for (String a : agents) {
    		sb.append(a);
    		sb.append(";");
    	}
    	cmd.add(sb.toString());
        jade.Boot.main(cmd.toArray(new String[cmd.size()]));
    }
}

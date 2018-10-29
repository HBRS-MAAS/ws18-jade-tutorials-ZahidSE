package maas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Vector;
import java.util.regex.Pattern;

import maas.tutorials.BookBuyerAgent;

public class Start {
    public static void main(String[] args) throws IOException {
    	List<String> agents = new Vector<>();
    	agents.add("seller_1:maas.tutorials.BookSellerAgent");
    	agents.add("seller_2:maas.tutorials.BookSellerAgent");
    	agents.add("seller_3:maas.tutorials.BookSellerAgent");
    	
    	agents.add("buyer_1:maas.tutorials.BookBuyerAgent(In Search of Lost Time,The Great Gatsby,Moby Dick)");

    	List<String> cmd = new Vector<>();
    	cmd.add("-agents");
    	StringBuilder sb = new StringBuilder();
    	for (String a : agents) {
    		sb.append(a);
    		sb.append(";");
    	}
    	cmd.add(sb.toString());
        jade.Boot.main(cmd.toArray(new String[cmd.size()]));
    	
//    	if(Pattern.matches("\\d+", "895d"))
//	    {
//	        System.out.println("It's an integer!");
//	    }
    	

    }
}

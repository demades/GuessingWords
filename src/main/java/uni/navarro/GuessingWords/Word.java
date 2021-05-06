package uni.navarro.GuessingWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Word {
	
	Set<String> samples;
	private String n;
	int item; 
//	ArrayList<String> c;
//	public Word w;
	public int largo;
	private String initial;
	private char[] ch;
	public String dale;


	public Word() {
		item = new Random().nextInt(7);
		samples = new HashSet<String>();
		// Add items to ArrayList
		n = "banana";
		samples.add(n);
		n = "tomatos";
		samples.add(n);
		n = "oranges";
		samples.add(n);
		n = "apples";
		samples.add(n);
		n = "graves";
		samples.add(n);
		n = "pineapple";
		samples.add(n);
		n = "watermelon";
		samples.add(n);
		
	// Pick random member
		int i = 0;
		for(String obj : samples)
		{
		    if (i == item) {
		    	this.dale = generate(obj);
		    }		        		    	
		    i++;
		}
		return;
	}
	
	public String getDale() {
		return dale;
	}

	public void setDale(String dale) {
		this.dale = dale;
	}

	public String generate(String s) {
		largo = s.length();
		ch = new char[largo]; 
        // Copy symbol _ for every character
        for (int i = 0; i < s.length(); i++) {
            ch[i] = '_';
        }
        // Convert from char array to String and return
        initial = String.valueOf(ch);
		return initial;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}
}

package uni.navarro.GuessingWords;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class ResponseBean {
	
	private boolean active = false;
	int counter;
	Word w;
	
	public ResponseBean() {
		
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void onload() { 
    	w = new Word();	
	    if (active == false) {
	    	active = true;
	    	counter = 0;
	    }
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public Word getW() {
		return w;
	}

	public void setW(Word w) {
		this.w = w;
	}
}

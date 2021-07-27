package oop_programming.tv;

public class TVApp {

	public static void main(String[] args) {
		TV tv = new TV(7,20,false);
		
		tv.status();
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();
		
//		for(int i =0; i < 300; i ++) {
//			tv.power(true);
//			tv.channel(true);
//			tv.volume(false);
//			tv.status();
//		}
		
	}

}

package oop_programming.tv;

public class TV {

	private int channel;
	private int volume;
	private boolean power;
	
	TV(){
		
	}
	
	TV(int channel, int volume, boolean power) {
		this.channel = 7;
		this.volume = 20;
		this.power = false;
	}
	
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	
	
	void power(boolean on) {
		power = on;
	}
	
	void channel(int channel) {
		if (channel < 1) {
			channel = 255;
		} else if(channel > 255) {
			channel = 1;
		}
		this.channel = channel;	
	}
	
	void channel(boolean up) {
		if (up == true) {
			channel += 1;
			channel(channel);
		} else {
			channel -= 1;
			channel(channel);
		}
	}
	
	
	void volume(int volume) {
		if (volume < 0) {
			volume = 100;
		} else if(volume > 100) {
			volume = 0;
		}
		this.volume = volume;
	}
	
	void volume(boolean up) {
		if (up == true) {
			volume += 1;
			volume(volume);
		} else {
			volume -= 1;
			volume(volume);
		}
		
	}
	
	void status() {
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}


	
	
	
}

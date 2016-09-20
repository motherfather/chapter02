package bit2016.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	
	public TV(/* int ch */ int channel, int volume, boolean power) {
		this.channel = channel;
		// channel = ch; <- 이렇게도 하지만 관례상 이름을 같게 한다!!
		this.volume = volume;
		this.power = power;
	}
	
	public void status() {
		System.out.println(
				"channel = " + channel +
				", volume = " + volume +
				", power = " + power);
	}
	
	public void power(boolean on) {
		power = on;
	}
	
	public void volume(int volume) {
		this.volume = volume;
	}
	
	public void volume(boolean up) {
		if(up) {
			volume++;
		} else {
			volume--;
		}
	}
	
	public void channel(int channel) {
		this.channel = channel;
	}
	
	public void channel(boolean up) {
		if(up) {
			channel++;
		} else {
			channel--;
		}
	}
	
}

public class Timer {
	private int hours;
	private int minutes;
	private int seconds;

	public Timer(){
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public Timer(int hours, int minutes, int seconds){
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=minutes;
	}
	public int incrementHours(){
		if(hours<23){
			hours++;
		}
		else{
			hours=0;
			return hours;
		}
		
	}
	public int incrementMinutes(){
		if(minutes>59){
			hours++;
			minutes=1;
		}
		else{
			minutes++;
		}
	return minutes;
		
	}
	public int incrementSeconds(){
		if(seconds>59){
			minutes++;
			seconds=1;
		}
		else{
			seconds++;
		}
	return seconds;
	}

	public int decrementHours(){
		if(hours>1){
			hours--;
		}
		else{
			hours=0;
		}
	return hours;
	}
	public int decrementMinutes(){
		if(minutes>1){
			minutes--;
		}
		else{
			hours--;
			minutes=0;
		}
	return hours;
	}
	public int decrementSeconds(){
		if(seconds>1){
			seconds--;
		}
		else{
			minutes--;
			seconds=0;
		}

	}
	public int getHours(){
		return hours;
	}
	public int getMinutes(){
		return hours;
	}
	public int getSeconds(){
		return seconds;
	}
	
	public String toString () {
		return "Timer "+hours+":"+minutes+":"+seconds;
	}

	
}
  

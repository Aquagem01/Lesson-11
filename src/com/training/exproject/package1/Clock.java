package com.training.exproject.package1;

public class Clock {
	private int hour;
	private int minute;
	private int second;

	public Clock() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public Clock(int hour, int minute, int second) {
		if (hour < 0 || hour > 24) {
			hour = 0;
		}
		this.hour = hour;
		if (minute < 0 || minute > 60) {
			minute = 0;
		}
		this.minute = minute;
		if (second < 0 || second > 60) {
			second = 0;
		}
		this.second = second;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 24) {
			hour = 0;
		}
		this.hour = hour;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 60) {
			minute = 0;
		}
		this.minute = minute;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 60) {
			second = 0;
		}
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}
	
	
	
	public void increase(int hour, int minute, int second) { 
		int appMin = 0;
		int appHour = 0;
		
		if (this.second + second > 59) {
			appMin = (this.second + second)/60;
			this.second = (this.second + second)%60;
		}else {
			this.second = this.second + second;
		}
		
		if (this.minute + minute + appMin > 59) {
			appHour = (this.minute + minute + appMin)/60;
			this.minute = (this.minute + minute+appMin)%60;
		}else {
			this.minute = this.minute + minute + appMin;
		}
		
		if (this.hour + hour + appHour> 23) {
			this.hour = (this.hour + hour+appHour)%24;
		}else {
			this.hour = this.hour + hour + appHour;
		}
		//System.out.println (appMin);
		//System.out.println (appHour);
		
		
	}
	public void print() {
		System.out.print("Hour: "+getHour()+ " Minute: "+getMinute()+" Second: "+getSecond());
	}
	
	public void change(int hour, int minute, int second) { // Тут напишем через приведение к секундам (с нулями только разобраться
		int sumThis = howManySeconds (this.hour, this.minute, this.second);
		int sumDecrease = howManySeconds (hour, minute, second);
		
		System.out.print("\nSeconds in This time: "+sumThis +"\nSeconds in Decrease time: "+sumDecrease);
		
		int newTime;
		newTime = sumThis + sumDecrease;
		System.out.print("\nSeconds in New time: "+newTime);
		
		int exHour = newTime/3600;
		if (exHour < 0) {
			this.hour = 0;
		}else if (exHour > 23) {
			this.hour = exHour%24;
		}else {
			this.hour = exHour;
		}
		int exMinute = (newTime - exHour*3600)/60;
		if (exMinute < 0 ) {
			this.minute = 0;
		}else {
			this.minute = exMinute;
		}
		int exSecond = newTime - exHour*3600 - this.minute*60;
		if (exSecond < 0) {
			this.second = 0;
		}else {
			this.second = exSecond;
		}
		
	}
	public int howManySeconds(int hour, int minute, int second) {
		int sum = 0;
		
		if (hour == 0) {
			hour  = 0;
		}else {
			hour = hour*3600;
		}
		
		if (minute == 0) {
			minute = 0;
		}else {
			minute = minute*60;
		}
	
		sum = hour+minute+second;
		//System.out.print("\nSeconds in current time: "+sumThis);
		return sum;
	}
}



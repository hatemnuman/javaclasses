package com.class31;

public abstract class Mark {
	
	public abstract double getPercentage();
	

}

class studentA extends Mark{
	int sub1;
	int sub2;
	int sub3;
	
	studentA(int sub1, int sub2, int sub3){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		
		
	}

	@Override
	public double getPercentage() {
		double percantage=(sub1+sub2+sub3)/3;
		return percantage;
	}
	
	
}

class studentB extends Mark{
	int sub1;
	int sub2;
	int sub3;
	int sub4;
	public studentB(int sub1, int sub2, int sub3, int sub4) {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
	}
	@Override
	public double getPercentage() {
		double percantage=(sub1+sub2+sub3+sub4)/4;
		return percantage;
	}
	
	}
	


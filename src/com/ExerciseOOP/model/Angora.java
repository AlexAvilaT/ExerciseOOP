package com.ExerciseOOP.model;

public class Angora extends Cat {
	//properties
	
	private double mouthLong;
	//constructors
	
	public Angora()
	{
	}
	
	public Angora(int Id, String Name, int Age)
	{
		super(Id, Name, Age);
	}
	
	public Angora(int Id, String Name, int Age, double mouthLong)
	{
		
		super(Id, Name, Age);
		this.mouthLong = mouthLong;
		
	}
	
	//getter and setters
	public double getmouthLong()
	{
		return mouthLong;
	}
	
	public void setmouthLong()
	{
		this.mouthLong = mouthLong;
	}
	
//specific to ToString for mouthlong
	
@Override
public String ToString()
{
	return "Id:["+getId()+"], Name:["+getName()+"], Age["+getAge()+"], mouthLongitud["+mouthLong+"]";
}
@Override
public void Meow() {
	// TODO Auto-generated method stub
	
}
@Override
public void Scratch() {
	// TODO Auto-generated method stub
	
}

	
}

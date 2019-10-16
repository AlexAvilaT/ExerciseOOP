package com.ExerciseOOP.model;

public class Dog 
{
	public int id;
	private String Name;
	protected String Breed;
	public int age;
	public double Height;
	
	//crear objeto
	public Dog(int id, String Name, String Breed, int age, double Height)
	{
		this.id = id;
		this.Name = Name;
		this.Breed = Breed;
		this.age = age;
		this.Height = Height;
		
		
				
	}
	public Dog() {}
}

package com.ExerciseOOP.model;

public class Cat 
{
	//how to make a class
	private int Id;
	private String Name;
	private int Age;
	
	//constructors
	public Cat()
	{
	}
	public Cat(int Id, String Name, int Age)
	{
		this.Id = Id;
		this.Name = Name;
		this.Age = Age;
	}
	//getters and setters - debe haber un get y un set por propiedad
	//get 
	public int getId()
	{
		return Id;
	}
//Set
	public void setId(int Id)
	{
		this.Id = Id;
	}
	//get name
	public String getName()
	{
		return Name;
	}
	//set name
	public void setName(String Name)
	{
		this.Name = Name;
	}
	//get age 
	public int getAge()
	{
		return Age; 
	}
	//set age
	public void setAge(int Age)
	{
		this.Age = Age;
	}
}


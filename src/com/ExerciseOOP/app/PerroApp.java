package com.ExerciseOOP.app;

import com.ExerciseOOP.model.Dog;

public class PerroApp 
{

	public static void main(String[] args)
	{
		//way 1 instanciar el objeto de la clase
		Dog pluto;
		pluto = new Dog();
		//way 2
		
		Dog Tribilin = new Dog();
		
		pluto.age = 15;
		pluto.Height = 50;
		pluto.id = 10;
		
		
		System.out.println("pluto's age is:" + pluto.age);
		System.out.println("pluto's Height is:" + pluto.Height);
		System.out.println("pluto's id is:" + pluto.id);

		Dog firulais = new Dog(1, "Firulais", "Labrador", 6,6.0);
		System.out.println("firulais age is:" + firulais.age);
		System.out.println("firulais Height is:" + firulais.Height);
		System.out.println("firulais id is:" + firulais.id);
		
		Dog lucho = new Dog(1, "lucho", "");
		
	
	}

}

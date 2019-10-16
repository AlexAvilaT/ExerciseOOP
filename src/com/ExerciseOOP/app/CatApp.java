package com.ExerciseOOP.app;
import com.ExerciseOOP.model.Cat;
public class CatApp 
{

	public static void main(String[] args) 
	{
		Cat michi = new Cat();
		
		michi.setId(1);
		michi.setAge(3);
		michi.setName("michi");
		
		/*System.out.println("Michi's Id: "+michi.getId());
		System.out.println("Michi's Age: "+michi.getAge());
		System.out.println("Michi's Name: "+michi.getName());*/
		
		System.out.println(michi.ToString());
		
		Angora Tom = new Angora(2, "Tom", 4);
		
		
		
	}

}

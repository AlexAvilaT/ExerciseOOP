package com.ExerciseOOP.app;
import com.ExerciseOOP.model.Cat;
import com.ExerciseOOP.model.Persa;
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
		
		//System.out.println(michi.ToString());
		
		Cat michi;
		michi = new Persa();
		michi = new Angora();
		
		Persa Tom = new Persa(2, "Tom", 4);
		System.out.println(Tom.ToString());
		
		
	}

}

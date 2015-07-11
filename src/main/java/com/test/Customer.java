package com.test;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
 
public class Customer 
{
	private Set sets;

	public Set getSets() {
		return sets;
	}

	public void setSets(Set sets) {
		this.sets = sets;
	}

	@Override
	public String toString() {
		return "Customer [sets=" + sets + "]";
	}
	
	

	public void display()
	{
		
		Iterator<Set> itr = sets.iterator();
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
	}
	
	
}
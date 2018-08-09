package com.programming.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseNameInArray implements Comparable<ReverseNameInArray> {

	String name;
	int id;
	String Address;
	public ReverseNameInArray(String name, int id, String address) {
		this.name = name;
		this.id = id;
		Address = address;
	}
	@Override
	public String toString() {
		return "ReverseNameInArray [name=" + name + ", id=" + id + ", Address=" + Address + "]\n";
		
	}
	
	@Override
	public int compareTo(ReverseNameInArray o) {
		
			return this.name.compareTo(o.name);
	
	
	
	
	
	}
	
	
	
	public static void main(String[] args) {
		ReverseNameInArray r1= new ReverseNameInArray("vinay", 1,"kalpi");
		ReverseNameInArray r2= new ReverseNameInArray("vinay", 56,"kanpur");
		ReverseNameInArray r3= new ReverseNameInArray("lalla", 21,"bangalore");
		ReverseNameInArray r4= new ReverseNameInArray("mahi", 10,"mumbai");
		ReverseNameInArray r5= new ReverseNameInArray("priyanka", 5,"orai");
		
		
		ArrayList<ReverseNameInArray> a= new ArrayList<ReverseNameInArray>(Arrays.asList(r1,r2,r3,r4,r5));
		Collections.sort(a);
			
			if(r1.name.equalsIgnoreCase(r2.name))
				System.out.println("names are equal");
		
	}
	
	
	}

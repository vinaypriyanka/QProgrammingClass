package com.stringbuffer.concept;

public class ImportantMethods {
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer(20);
		System.out.println(sb.capacity());
		sb.ensureCapacity(400);
		System.out.println(sb.capacity());

		// public void trimToSize()
		StringBuffer sb1 = new StringBuffer("vinay");
		System.out.println(sb1.capacity());
		sb1.trimToSize();
		System.out.println(sb1.capacity());

		// public StringBuffer insert(int offset,String s)
		sb1.insert(3, " ");
		System.out.println(sb1);
		
		//public StringBuffer delete(int beginindex, int endindex)
		sb1.delete(0, 2);
		System.out.println(sb1);
		
		//public StringBuffer replace(int beginindex,int endindex,String s)
		StringBuffer sb2= new StringBuffer("kumar");
		
		sb2.replace(0, 1, "gupta");
		System.out.println(sb2);
		
		//String to String buffer conversion
		String s1="java";
		StringBuffer sv= new StringBuffer(s1);
		System.out.println(sv);
		
		
		
		//StringBuffer to String conversion
		StringBuffer sp= new StringBuffer("java");
		String s2= new String(sp);
		System.out.println(s2);
	}
}

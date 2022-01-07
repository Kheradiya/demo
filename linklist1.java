package linklist;

//Java program to remove elements
//in a LinkedList

import java.util.*;

public class linklist1 {

	public static void main(String args[])
	{
		LinkedList<String> ll = new LinkedList<>();

		ll.add("kavan");
		ll.add("vijay");
		ll.add(2, "anish");
		ll.remove(1);
		ll.add("null");
		ll.add("viraj");
		ll.add(4,"nihal");
	

		System.out.println(
			"Initial LinkedList " + ll);

//		ll.remove(1);
//
//		System.out.println(
//			"After the Index Removal " + ll);
//
//		ll.remove("kavan");
//
//		System.out.println(
//			"After the Object Removal " + ll);
	}
}

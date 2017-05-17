package com.Collect;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ImplClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<?> v=new Vector<Object>();
		Iterator<?> itr=v.iterator();
		ListIterator<?> litr=v.listIterator();
		Enumeration<?> e=v.elements();
		
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());
	}

}

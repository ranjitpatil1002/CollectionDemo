package com.Collect;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("Ranjit");
		l.add("Sumit");
		l.add("Vaibhav");
		l.add("Madhuri");
		System.out.println(l);//[ranjit,sumit,vaibhav,madhuri]
		
		ListIterator itr=l.listIterator();
		while(itr.hasNext()){
			String s=(String)itr.next();
			if(s.equals("Ranjit"))
				itr.remove();
			else if(s.equals("Vaibhav"))
				itr.add("Varsha");
			else if(s.equals("Sumit"))
				itr.set("Pranju");	
		}
		System.out.println(l);//[Pranju,Vaibhav,Varsha,Madhuri]
	}

}

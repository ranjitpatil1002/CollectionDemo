package com.Collect;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		for(int i=0;i<=10;i++){
			v.add(i);
		}
		System.out.println(v);//[0,1,2,3,.....,10]
		
		Iterator e=v.iterator();
		while(e.hasNext()){
			Integer I=(Integer)e.next();
			if(I%2==0)
				System.out.println(I);//[0,2,4,6,8,10]
			else
				e.remove();
		}
		System.out.println(v);//[0,2,4,6,8,10]
	}

}

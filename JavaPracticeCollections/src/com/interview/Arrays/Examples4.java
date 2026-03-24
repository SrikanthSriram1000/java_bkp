package com.interview.Arrays;

public class Examples4 {
	 public static void main(String args[]){    
		    //declaration and instantiation of an array  
		    int a[]=new int[5];  
		    a[0]=10;//initialization    
		    a[1]=11;    
		    a[2]=70;    
		    a[3]=40;    
		    a[4]=50;    
		   // a[1]=a[2];
		    //traversing array    
		    for(int i=1;i<a.length-1;i++){//length is the property of array    
		        System.out.println("i is ="+i +" and its value "+a[i]);
		        a[i]=a[i+1];
		    }  
		    System.out.println("======================");
		    for(int i=0;i<a.length-1;i++){//length is the property of array    
		        System.out.println("i is ="+i +" and its value "+a[i]);
		    } 
		 }  
}

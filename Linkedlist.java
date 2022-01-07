    package com.LinkedList;
    import java.util.*;  
    public class Linkedlist{  
     public static void main(String args[]){  
      
      LinkedList<String> al=new LinkedList<String>();  
      al.add("kavan");  
      al.add("vijay");  
      al.add("anish");  
      al.add("ravish");  
      
      Iterator<String> itr=al.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
      }  
     }  
    }  
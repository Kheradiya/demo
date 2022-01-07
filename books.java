package com.ArrayListbooks;
import javax.swing.Spring;
import java.util.*; 

class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}
public class books{
public static void main(String[] args) {  
   
	List<Book> list=new ArrayList<Book>();  
    
    Book b1=new Book(101,"Learn C","Yashwant Kanetkar","BPB",5);
    Book b2=new Book(102,"Databse  ","Forouzan","xyz",6); 
    Book b3=new Book(103,"OS ","Galvin","bnm",7); 

    list.add(b1);  
    list.add(b2);  
    list.add(b3);  

    for(Book b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  
package com.raquibul.helloeverything.scala

class Employee(id:Int, name:String){
  println("Hello from default constructor");
  println("id=" + id);
  
  def this(id:Int, name:String, address:String) = {
    this(id, name);
    
  }
  
  for (i <- 1 to 5) {
    println(i)
  }
  
  def printname {
    println("Name=" + name)
  }
  
  
}
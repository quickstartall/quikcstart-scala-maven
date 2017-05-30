package com.raquibul.helloeverything.scala

class Dog extends Animal {
  def companion = Dog
  
}

object Dog extends AnimalCounter {
  var name = "Rocky Dog "
  var color = "red"
  //animals = 4;
}
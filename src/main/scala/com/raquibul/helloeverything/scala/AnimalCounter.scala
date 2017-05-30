package com.raquibul.helloeverything.scala

abstract class AnimalCounter {
  var animals = 0
  //var someval = 1;
  def name: String
  def count() {
    animals += 1
    println("%d %ss created so far".format(animals, name))
  }
  
  def printHi {
    println("Hi from AnimalCounter");
  }
}
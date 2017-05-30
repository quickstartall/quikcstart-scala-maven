package com.raquibul.helloeverything.scala

abstract class Animal {
  def companion: AnimalCounter
  companion.count();
  companion.printHi;
}
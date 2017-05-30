package com.raquibul.helloeverything.scala

import scala.util.control.Breaks._;
/**
 * @author ${user.name}
 */
object App {
  var id = 1;
  val name = "Raquibul";

  def foo(x: Array[String]) = x.foldLeft("")((a, b) => a + b)

  def main(args: Array[String]) {
    //println( "Hello World!" )
    //println("concat arguments = " + foo(args))
    //printGreetings("Raquibul");
    //printGrade(80);
    //println(testTernaryOperator(0)) ;
    //testPatternMatch(1);
    //patternMatchWithAny("HelloEverything");
    //testWhileLoop;
    //testDoWhileLoop;
    //testForLoopWithTo;
    //testForLoopWithUntil
    //testForWithFiltering
    //printPrimeNumbers(100);
    //testForWithYield;
    //testForEach
    //testForEachWithLogic;
    //testFunctionAsVariable
    //testBreak
    //testInnerLoopBreak

    /*val result = addNumbers(12, 30);
    println(result);*/

    //testFunctionDefaultParamVal

    //testFunctionNamedParam
    //testFunctionAsParamter

    //testFunctionComposition
    //testAnonymousFunction
    //testAnonymousFunction2
    //testFunctionCurrying
    //testNestedFunction

    //new Student(1, "Raquibul").showDetails();

    /*HelloeEverything.sayHello(name);
    println(HelloeEverything.id)*/

    //Test Dog Counter

   
   /* println(Dog.name);
    new Dog
    println("Printing Count from Dog=" + Dog.animals) //print the count
    Dog.animals = 10; //change the dog count to 10
    new Dog*/
    

    //println(new Student(1, "SomeOne").flag)
    //new Employee(1, "Raquibul", "Rotterdam");
    
  }

  def printGreetings(name: Object) {
    id = 2;
    //name = "Some Other Name";
    println("Hello " + name + ". You are welcome!");
    println("id=" + this.id + "|name=" + name);
  }

  def printGrade(marks: Int) {
    if (marks >= 0 && marks < 50) {
      println("fail")
    } else if (marks >= 50 && marks < 60) {
      println("D Grade")
    } else if (marks >= 60 && marks < 70) {
      println("C Grade")
    } else if (marks >= 70 && marks < 80) {
      println("B Grade")
    } else if (marks >= 80 && marks < 90) {
      println("A Grade")
    } else if (marks >= 90 && marks <= 100) {
      println("A+ Grade")
    } else println("Invalid")
  }

  def testTernaryOperator(a: Int) = {
    if (a > 0) {
      "Positive"
    } else if (a < 0) {
      "Negative"
    } else {
      "Unknow"
    }
  };

  def testPatternMatch(x: Int) {
    x match {
      case 1 => {
        println("You are in case 1");
        println("Do some other stuff");
      }
      case 2 => {
        println("You are in case 2");
      }
      case _ =>
        {
          println("You are in case default");

        }

        println("inside match ==> The value of x=" + x); // This line will only be printed in default case
    }
    println("outside match ==> The value of x=" + x);
  }

  def patternMatchWithAny(x: Any) {
    x match {
      case 1                 => println("Case 1")
      case "Two"             => println("Case 2");
      case "HelloEverything" => println("case HelloEverything");
      case _                 => println("Case default");
    }
  }

  def testWhileLoop {
    var x = 10;
    while (x <= 20) {
      println(x);
      x = x + 2;
    }
  }

  def testDoWhileLoop {
    var x = 10;
    do {
      println(x);
      x = x + 2;
    } while (x < 20)
  }

  def testForLoopWithTo {
    for (x <- 1 to 10) {
      println(x);
    }
  }

  def testForLoopWithUntil {
    for (x <- 1 until 10) { //until excludes the end value. It will exclude 10. It prints 1-9. Useful in iterating String Array
      println(x);
    }
  }

  def testForWithFiltering {
    for (x <- 1 to 10 if x % 2 == 0) {
      println(x);
    }
  }

  def printPrimeNumbers(num: Int) {
    for (x <- 2 to num if (x == 2 || !isDivisible(x))) {
      println(x);
    }
  }

  private def isDivisible(a: Int): Boolean = {
    for (x <- 2 to a / 2) {
      if (a % x == 0) {
        return true;
      }
    }

    return false;
  }

  def testForWithYield {
    var result = for (a <- 1 to 10) yield a
    for (i <- result) {
      println(i)
    }
  }

  def testForinCollections {
    var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    for (i <- list) {
      println(i)
    }
  }

  def testForEach {
    var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    list.foreach {
      println // Print each element  
    }
    //list.foreach(print)
    // println
    // list.foreach((element: Int) => print(element + " "))
  }

  def testForEachWithLogic {
    var list = List(1, 2, 3, 4, 5, 6, 7, 8, 9);
    list.foreach((element: Int) => printOddEven(element));

  }

  private def printOddEven(element: Int) {
    if (element % 2 == 0) {
      println(element + " is even");
    } else {
      println(element + " is Odd");
    }
  }

  def testFunctionAsVariable {
    val double = (i: Int) => { i * 2 }; //This is called function literal

    println("Double of 3=" + double(3));
    println("Double of 7=" + double(7));

    println("\n\nExample of functional programing");
    val list = List.range(1, 5); //create a list from 1 through 4
    println("Original List=" + list)
    val result = list.map(double); //Look at the map function. It takes double function as argument
    println("after calling double function=" + result);
  }

  def testBreak {
    breakable { // Breakable method to avoid exception  
      for (i <- 1 to 10 by 2) {
        if (i == 7)
          break // Break used here
        else
          println(i)
      }
    }
  }

  def testInnerLoopBreak {
    for (i <- 1 to 3) {
      breakable {
        for (j <- 1 to 3) {
          if (i == 2 & j == 2)
            break
          println(i + " " + j)
        }
      }
    }
  }

  def addNumbers(x: Int, y: Int) = {
    x + y;
  }

  def testFunctionDefaultParamVal() {
    var result1 = addTwoNumbers(15, 2) // Calling with two values  
    var result2 = addTwoNumbers(15) // Calling with one value  
    var result3 = addTwoNumbers() // Calling without any value  
    println(result1 + "\n" + result2 + "\n" + result3);
  }

  def testFunctionNamedParam() {
    printParamValues(y = 15, x = 2)
    printParamValues(15)
    printParamValues()
  }

  def addTwoNumbers(x: Int = 0, y: Int = 0): Int = {
    x + y
  }

  def printParamValues(x: Int = 0, y: Int = 0) {
    println("You entered x=" + x + ",y=" + y)
  }

  def testFunctionAsParamter {
    functionExample(25, multiplyBy2)
  }

  def functionExample(a: Int, f: Int => Int) {
    println(f(a)) // Calling that function   
  }

  def multiplyBy2(a: Int): Int = {
    a * 2
  }

  def testFunctionComposition {
    var result = multiplyBy2(add2(10)) //Function composition  
    println(result)
  }

  def add2(a: Int): Int = {
    a + 2
  }

  def testAnonymousFunction {
    var mul = (x: Int, y: Int) => x * y
    println(mul(2, 3))

    /*val f2: Int => Double = myInt => {println(myInt); myInt};
    println(f2(3))*/
  }

  def testAnonymousFunction2 {
    var result1 = (a: Int, b: Int) => a + b // Anonymous function by using => (rocket)  
    var result2 = (_: Int) + (_: Int) // Anonymous function by using _ (underscore) wild card  
    println(result1(10, 10))
    println(result2(10, 10))
  }

  def testFunctionCurrying {
    var result = add(10)(10)(10)
    println("10 + 10 = " + result)
    var addIt = add(20)_;
    var result2 = addIt(3)(2);
    println("20 + 3 + 2 = " + result2)
  }

  def add(a: Int)(b: Int)(c: Int) = {
    a + b + c
  }

  def testNestedFunction {
    println("10+20+30=" + addThreeNumbers(10, 20, 30))
  }

  def addThreeNumbers(a: Int, b: Int, c: Int) = {
    def addTwoNumbers(x: Int, y: Int) = {
      x + y
    }

    addTwoNumbers(a, addTwoNumbers(b, c))
  }

}


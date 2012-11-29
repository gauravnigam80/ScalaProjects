package com.nigaga

object Returns {

  def getFour = 4
  def getFive() = 5
  def getSix() : Int = 6
  def getTuplesVersion1() : (Int,Int) = (5, 6)
  def getTuplesVersion2() = (6, 7)
  
  def main(args: Array[String]) {
    println(getFour)
    println(getFive)
    println(getSix)
    println(getTuplesVersion1)
    println(getTuplesVersion2)
    val a = getTuplesVersion1()
    println("with val a : " + a)
    val (b,c) = getTuplesVersion2()
    println("b: "+ b + " c "+ c)
    val (_,d) = getTuplesVersion2()
    println("d "+d)
    val data = List(1,2,3,4,5)
    var sum = 0
    for(i <- 0 to data.length - 1)
      sum += data(i);
      println("sum "+sum) 
      
    sum = 0;
    sum = data.reduceLeft(_+_)  
      println("sum in functional way : "+sum) 
    
      
  }
  
  
}
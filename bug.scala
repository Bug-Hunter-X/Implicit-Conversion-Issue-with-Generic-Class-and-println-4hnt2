```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object Main extends App {
  val myInt = new MyClass(10)
  myInt.printValue()

  val myString = new MyClass("Hello")
  myString.printValue()

  // The following line will cause an error
  val myList = new MyClass(List(1, 2, 3))
  myList.printValue() // This line will fail if you try to print List(1,2,3) directly
}
```
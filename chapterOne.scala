//a comment!
/* Another comment*/
/** A documentation comment */

object MyModule{
  def abs(n: Int): Int = {
  	if (n < 0) -n
  	else n
  }
  
  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int) : Int = 
    	if(n<= 0) acc
    	else go(n-1, n*acc)
    
    go(n,1)
  }
  
  private def formatfact(x: Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(x, factorial(x))
  }
  
  private def formatAbs(x:Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }
  
  def main(args: Array[String]): Unit =
  	println(formatAbs(-59))
  	println(formatfact(4))
}


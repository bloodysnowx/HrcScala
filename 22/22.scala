object Main extends App {
  val inputArray = io.StdIn.readLine().split(' ').map(_.toInt)
  def fibSub(n: Int, a: Int, b: Int): Seq[Int] = if (b <= n) b +: fibSub(n, b, a + b) else Nil
  def fib(n: Int) = fibSub(n, 0, 1)
  inputArray.map(fib).foreach(println)
}
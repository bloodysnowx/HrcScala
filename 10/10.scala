object Main extends App {
  val inputArray = io.StdIn.readLine().split(' ').map(_.toInt)
  inputArray.map({_ * 8}).foreach(println)
}
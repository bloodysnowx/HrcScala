object Main extends App {
  val inputArray = io.StdIn.readLine().split(' ').map(_.toInt)
  inputArray.map(n => n * (n + 1) / 2).foreach(println)
}
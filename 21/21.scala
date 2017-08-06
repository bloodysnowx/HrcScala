object Main extends App {
  val inputArray = io.StdIn.readLine().split(" 0")
  val inputMatrix = inputArray.map(_.trim.split(' ').map(_.toInt))
  inputMatrix.map(_.sum).foreach(println)
}
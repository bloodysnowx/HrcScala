object Main extends App {
  val inputMatrix = io.StdIn.readLine().split(" 0").map(_.trim.split(' ').map(_.toInt))
  inputMatrix.map(_.reverse.toSeq).foreach(println)
}
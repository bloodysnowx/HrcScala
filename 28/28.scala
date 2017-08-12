object Main extends App {
  val inputArray = io.StdIn.readLine().split(' ').map(_.toInt)
  (0 to (inputArray.size / 3 - 1)).map({ i => inputArray.slice(i * 3, i * 3 + 3).sorted.toSeq }).foreach(println)
}
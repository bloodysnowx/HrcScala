object Main extends App {
  val inputArray = io.StdIn.readLine().split(' ').map(_.toInt)
  (0 to (inputArray.size / 2 - 1)).map({ i => (inputArray(i * 2), inputArray(i * 2 + 1)) })
      .collect({ case (a: Int, b: Int) if a == b => a }).foreach(println)
}
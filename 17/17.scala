object Main extends App {
  val inputArray = io.StdIn.readLine().split(' ').map(_.toInt)
  (0 to (inputArray.size / 2 - 1)).map({ i => inputArray.slice(i * 2, i * 2 + 2) })
    .map({ x => if(x.max < 0 || x.min >= 0) 0 else 1 }).foreach(println)
}
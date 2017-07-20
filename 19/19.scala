object Main extends App {
  val inputArray = io.StdIn.readLine().split(' ').map(_.toInt)
  inputArray.collect({
    case x if x > 0 => (0 to x).toArray.reverse
    case x => (x to 0).toArray
  }).flatten.foreach(println)
}
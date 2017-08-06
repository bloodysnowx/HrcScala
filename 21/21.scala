object Main extends App {
  val inputArray = io.StdIn.readLine().split(" 0 ")
  val inputArrays = inputArray.map(_.split(' ').map(_.toInt))
  inputArrays.map(_.sum).foreach(println)
}
object Main extends App {
  val str = "GET0TH0TAR0AWAKE0IS0XXX0"
  // "4 15 7 0 22 17 11 22 2 13 4 17 20"
  val inputArray = io.StdIn.readLine().split(' ').map(_.toInt)
  inputArray.map(str.substring(_).split('0')(0)).foreach(print)
}
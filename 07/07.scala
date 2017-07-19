object Main extends App {
  val inputArray = io.StdIn.readLine().split(' ')
  inputArray.filterNot(_ == "0").foreach(println)
}
object Main extends App {
  val inputArray = io.StdIn.readLine().split(' ')
  inputArray.filter(_ == "0").foreach(println)
}
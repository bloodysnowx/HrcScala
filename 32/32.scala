object Main extends App {
  val str = "BAXBCXABAXCBAB"
  val inputArray = io.StdIn.readLine().split(' ')
  inputArray.map(inputStr => str.filter(c => c.toString.contains(inputStr)).length).foreach(println)
}
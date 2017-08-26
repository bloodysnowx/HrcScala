object Main extends App {
  val inputStr = io.StdIn.readLine()
  println(inputStr.filterNot(Set('A', 'E', 'I', 'O', 'U').contains))
}
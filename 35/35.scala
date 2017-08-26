object Main extends App {
  val inputStr = io.StdIn.readLine()
  inputStr.foldLeft[Seq[Char]](Nil)((x, y) => if(x.contains(y)) x else x :+ y).foreach(print)
}
object Main extends App {
  val values = Map(0 -> ('E', 13), 3 -> ('C', 23), 10 -> ('P', 20), 13 -> ('S', 3), 20 -> ('E', -1), 23 -> ('A', 10))

  def forward(x: Int): List[Char] = values.get(x).map({ y =>
    if(y._2 < 0) List(y._1)
    else y._1 :: forward(y._2)
  }).getOrElse(Nil)

  val inputArray = io.StdIn.readLine().split(' ').map(_.toInt)
  inputArray.map(forward).foreach(println)
}
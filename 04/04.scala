object Main extends App {
  val inputArray = io.StdIn.readLine().split(' ')
  (0 to (inputArray.size / 2 - 1)).map({ i => inputArray.slice(i * 2, i * 2 + 2).reverse }).map(println)
}
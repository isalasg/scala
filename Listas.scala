object Listas {
	def main(args: Array[String]) {
		// val listanumeros: List[Int] = List(1,2,3,4,5)

		val listanumeros = 1 :: (2 :: Nil)

		println(listanumeros)

		for (e <- listanumeros) {
			println(e)
		}
	}
}

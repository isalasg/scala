object For2 {
	def main(args: Array[String]) {
		for (
			i <- 1 to 10 
			if ((i%2) == 0)
		) println(i)
	}
}

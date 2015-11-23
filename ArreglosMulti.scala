object ArreglosMulti {
	def main(args: Array[String]) {
		val matriz = Array.ofDim[Double](2,2)

		matriz(0)(0) = 10
		matriz(0)(1) = 9
		matriz(1)(0) = 8
		matriz(1)(1) = 7

		println(matriz(0)(1))	// Imprime el 9

		for (e1 <- matriz)		// Imprime el arreglo completo
			for (e2 <- e1)
				println(e2)
	}
}

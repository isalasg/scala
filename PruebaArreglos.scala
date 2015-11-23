object PruebaArreglos {
	def main(args: Array[String]) {
		val arreglo = new Array[String](3)
		arreglo(0) = "Hola"
		arreglo(1) = "Mundo"
		arreglo(2) = "Cruel"
		for (e <- arreglo)
			println(e)
	}
}

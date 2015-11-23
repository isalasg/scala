object Ifsanidados {
	def main(args: Array[String]) {
		print("Dame la calificación: ")
		val calificacion = readDouble()
		if (calificacion < 70) println("Reprobado") else
		if (calificacion <= 80) println("Regular") else
		if (calificacion <= 90) println("Bien") else
		if (calificacion < 100) println("Muy bien") else
		println("Excelente")
	}
}


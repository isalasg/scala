object Ifelse {
	def main(args: Array[String]) {
		print("Dame tu edad: ")
		val edad = readInt()
		if (edad >= 18) println("Eres mayor de edad") else
			println("Eres menor de edad")
	}
}


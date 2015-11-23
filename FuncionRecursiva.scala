object FuncionRecursiva {
	def main(args: Array[String]) {
		print("Dame un número: ")
		val num = readInt()
		val fact = factorial(num)
		println("El factorial de " + num + " es " + fact)
	}

	def factorial(n: Int): Long = {
		if (n == 1) 1 else n * factorial(n-1)
	}
}

object FuncionSuma {
	def main(args: Array[String]) {
		print("Dame primer número: ")
		val n1 = readInt()
		print("Dame segundo número: ")
		val n2 = readInt()
		val r = suma(n1,n2)
		println("La suma es " + r)
	}

	def suma(n1: Int, n2: Int) = n1 + n2
}

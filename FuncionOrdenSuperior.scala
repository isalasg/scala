object FuncionOrdenSuperior {
	def main(args: Array[String]) {
		print("Dame primer número: ")
		val n1 = readInt()
		print("Dame segundo número: ")
		val n2 = readInt()
		val s = operacion(suma,n1,n2)
		println("La suma es " + s)
		val r = operacion(resta,n1,n2)
		println("La resta es " + r)
	}

	def suma(n1: Int, n2: Int) = n1 + n2
	def resta(n1: Int, n2: Int) = n1 - n2
	def operacion(f: (Int, Int) => Int, n1: Int, n2: Int) = f(n1,n2)
}

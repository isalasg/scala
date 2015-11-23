object Dowhile {
	def main(args: Array[String]) {
		var respuesta = ' '
		var suma = 0
		do {
			print("Dame un número: ")
			val num = readInt()
			suma = suma + num
			print("Desea sumar otro número [s/n]: ")
			respuesta = readChar()
		} while (respuesta == 's');
		println("La suma es " + suma)
	}
}

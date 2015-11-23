object While {
	def main(args: Array[String]) {
		var respuesta = 's'
		var suma = 0
		while (respuesta == 's') {
			print("Dame un número: ")
			val num = readInt()
			suma = suma + num
			print("Desea sumar otro número [s/n]: ")
			respuesta = readChar()
		}
		println("La suma es " + suma)
	}
}

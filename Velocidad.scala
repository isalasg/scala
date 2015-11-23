object Velocidad {
	def main(args: Array[String]) = {
		print("Dame la distanca recorrida: ")
		val distancia = readDouble()
		print("Dame el tiempo transcurrido: ")
		val tiempo = readDouble()
		val velocidad = distancia / tiempo
		println("La velocidad es " + velocidad)
	}
}


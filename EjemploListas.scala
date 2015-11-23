object EjemploListas {
	def main(args: Array[String]) {
		val listanombres: List[String] = List("Fulano","Zutano","Mangano","Perengano")

		println(listanombres.head) 		// Imprime "Fulano"
		println(listanombres.tail) 		// Imprime la lista sin el primer elemento
		println(listanombres.isEmpty)	// Imprime false
		println(listanombres.tail.tail.head)	// Imprime "Mangano"

		imprimirReversa(listanombres)	// Función recursiva que imprime al revés
	}

	def imprimirReversa(lista: List[String]) {
		if (!lista.isEmpty) {
			imprimirReversa(lista.tail)
			println(lista.head)
		}
	}
}

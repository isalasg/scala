object PruebaTravis {
	def main(args: Array[String]) {
		val ListaAlumnos = List("Juan","Maria","Pedro")
		imprimeLista(ListaAlumnos)
	}

	def imprimeLista(ListaAlumnos : List) {
		if (!ListaAlumnos.isEmpty) {
			println(ListaAlumnos.head)
			imprimeLista(ListaAlumnos.tail)
		}
	}
}
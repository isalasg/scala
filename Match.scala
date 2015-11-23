object Match {
	def main(args: Array[String]) {
		print("Dame un número: ")
		val num = readInt()
		num match {
			case 1 => println("Uno");
			case 2 => println("Dos");
			case 3 => println("Tres");
			case 4 => println("Cuatro");
			case 5 => println("Cinco");
			case _ => println("Otro")
		}
	}
}


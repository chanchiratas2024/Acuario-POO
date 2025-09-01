package acuario

fun demoTodo() {
    println("=== Demo Todo Acuario ===")

    // 1. Acuario rectangular
    val acuarioRect = Acuario(largo = 30, ancho = 20, alto = 50)
    acuarioRect.imprimirTamano()

    // Ajustamos volumen con setter
    acuarioRect.volumen = 60
    println("Después de ajustar volumen a 60 l:")
    acuarioRect.imprimirTamano()

    // 2. Acuario torre (cilíndrico)
    val torre = TanqueTorre(diametro = 30, alto = 50)
    torre.imprimirTamano()

    // 3. Crear peces e invocar comer()
    val peces: List<AccionPez> = listOf(Tiburon(), PezPayaso())
    peces.forEach {
        println("Pez en el acuario: color ${(it as Pez).color}")
        it.comer()
    }
}

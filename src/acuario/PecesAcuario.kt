package acuario


abstract class Pez {
    abstract val color: String
}

class Tiburon : Pez(), AccionPez {
    override val color: String = "gris"
    override fun comer() = println("Tiburón: cazar y comer peces")
}

class PezPayaso : Pez(), AccionPez {
    override val color: String = "dorado"
    override fun comer() = println("Pez Payaso: comer algas")
}

interface AccionPez {
    fun comer()  // método abstracto que todas las clases que implementen esta interfaz deben definir
}
data class Fish(val name: String, val isFreshWater: Boolean)
operator fun Unit.component2(): Any {

    fun main()  {
        val fishes = listOf(
            Fish("Pargo", true),
            Fish("Salmon", false),
            Fish("Atun", true),
            Fish("Tuna", false),
        );
        {

            val (freshWaterFishes, saltWaterFishes) = fishes.partition { it.isFreshWater }

            println("Pez de agua dulce: $freshWaterFishes")
            println("Pez de agua salada: $saltWaterFishes")


            // Crear un HashMap para almacenar los síntomas y las enfermedades
            val enfermedadesPeces = hashMapOf(
                "white spots" to "Ich",
                "red sores" to "hole disease"
            )

            // Imprimir el HashMap
            for ((sintoma, enfermedad) in enfermedadesPeces) {
                println("Síntoma: $sintoma - Enfermedad: $enfermedad")
            }
            val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
            println(cures.get("white spots"))
            println(cures["red sores"])
            println(cures["scale loss"])
            println(cures.getOrDefault("bloating", "sorry, I don't know"))
            println(cures.getOrElse("bloating") { "No cure for this" })
            val inventory = mutableMapOf("fish net" to 1)
            inventory.put("tank scrubber", 3)
            println(inventory.toString())
            inventory.remove("fish net")
            println(inventory.toString()
        }}
}
// Constante1
const val PI = 3.14159

fun main() {
    println("El valor de PI es $PI")
}
//Constante2
object Constants {
    const val CONSTANT2 = "object constant"
}
val foo = Constants.CONSTANT2

//Constante3
class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"

    }
}
fun String.hasSpaces(): Boolean {
    return this.find { it == ' ' } != null
}

// Funcion de Extension
fun String.hasSpaces(): Boolean {
    return this.find { it == ' ' } != null
}

fun main() {
    val text1 = "Hello World"
    val text2 = "HelloWorld"

    println("¿Contiene espacios? ${text1.hasSpaces()}") //  imprime Contiene espacios? true
    println("¿Contiene espacios? ${text2.hasSpaces()}") //  No imprime Contiene espacios? false
}
// Limitaciones de Extenciones
data class AquariumPlant(val color: String)

val AquariumPlant.isGreen: Boolean
    get() = this.color.equals("green", ignoreCase = true)

fun main() {
    val plant1 = AquariumPlant("green")
    val plant2 = AquariumPlant("red")

    println("La planta 1 es verde = ${plant1.isGreen}") //  Lee La planta 1 es verde es = true
    println("La planta 2 No es verde = ${plant2.isGreen}") // Lee La planta 2 es no es verde = false
}
// Receptores que aceptan valores NULL
fun String?.pull(): String? {
    return this?.apply {
        println("La cadena no es nula")
    }
}

fun main(){
    val text1: String? = "Hola"
    val text2: String? = null

    println(text1.pull()) // Leer La cadena no es nula: Hola, Kotlin
    println(text2.pull()) // No leer nada
}


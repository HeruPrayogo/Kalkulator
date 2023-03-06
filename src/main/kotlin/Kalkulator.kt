abstract class Kalkulator {
    abstract fun sum():Int
}

class penambahan(var angka1:Int, var angka2:Int):Kalkulator(){
    override fun sum(): Int {
        val a = angka1 + angka2
        return a
    }
}

class pengurangan(var angka1:Int, var angka2:Int):Kalkulator(){
    override fun sum(): Int {
        val a = angka1 - angka2
        return a
    }
}
class angkaPerkalian(var angka1:Int, var angka2:Int):Kalkulator(){
    override fun sum(): Int {
        val a = angka1 * angka2
        return a
    }
}


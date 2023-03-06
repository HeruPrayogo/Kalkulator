open class Kalkulator {
    open fun penambahan(){

    }
}

class penambahan(var angka1:Int, var angka2:Int):Kalkulator(){
    override fun penambahan() {
        val penambahan = angka1 + angka2
    }
}
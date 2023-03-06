open class Kalkulator {
    open fun penambahan(){

    }
}

class penambahan(var angka:Int):Kalkulator(){
    override fun penambahan() {
        val penambahan = angka + angka
    }
}
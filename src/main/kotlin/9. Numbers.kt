fun main(){
    val panjang = "20"
    val lebar = 12.6
    val tinggi = 10
    val volume : Double

    val p : String = panjang
    val l : Double = lebar
    val t : Int = tinggi
    val v = volume.toFloat()
}
fun hitungVolume(p : Double, l : Double, t : Double) : Float
    {
        val v = p * l * t

        println(hitungVolume(p, l, t))
        return v
    }

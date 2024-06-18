package kotlinsolutions

fun main() {
    val ArrayMeraj: Array<Int> = arrayOf(20, 40, 44, 50, 86,100)
    val ArrayMona: Array<Int> = arrayOf(20, 40, 44, 50, 86,100)
    var MerajWin = 0
    var MonaWin = 0

    if (ArrayMeraj.size == ArrayMona.size){
        for (i in 0 until ArrayMeraj.size){
            if (ArrayMeraj[i]>ArrayMona[i]){
                MerajWin++
            }else if (ArrayMona[i]>ArrayMeraj[i]){
                MonaWin++
            }



        }
        if (MerajWin>MonaWin){
            println("winner : meraj $MerajWin")

        }else if (MonaWin>MerajWin){
            println("winner : Mona $MonaWin")
        }else{
            println("equal")
        }
    }else{
        println("not equal")
    }

}

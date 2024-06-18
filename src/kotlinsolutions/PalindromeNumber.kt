package kotlinsolutions
fun isPalindromeNumber(number:Int):Boolean{
    var reversedNumber = 0
    var tempNumber = number
    while (tempNumber > 0){
        var remainder = tempNumber % 10
        reversedNumber = reversedNumber * 10 + remainder
        tempNumber /= 10
    }
    return number == reversedNumber;
}
fun main(){
    println(isPalindromeNumber(121).toString())
}
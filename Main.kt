fun main() {
   printGreeting()
    var remainder= modulus(50, 21)
    println(remainder)
    var sum= add(56, 78, 61, 41)
    println(sum)
    funFactAboutMe()


}
fun printGreeting(){
    var firstName= "Nataly"
    var greeting="Hello $firstName"
    println(greeting)

}

fun modulus(num1: Int, num2: Int): Int{
    var remainder= num1 % num2
    return remainder

}

fun add(num1: Int, num2: Int,num3: Int, num4: Int): Int{
    var sum= num1 + num2 + num3 + num4
    return sum

}

fun funFactAboutMe(){
    var word1= "I"
    var word2= "love"
    var word3= "badminton"
    var sentence= word1 + " " + word2 + " " + word3
    println(sentence)
}

fun main() {
    val i:Int = 1
    for(i in 1..100 step 2){
        when{
            i<50 -> println("smol ${i}")  //small
            i>=50 -> println("BIG  ${i}")
        }
    }
}
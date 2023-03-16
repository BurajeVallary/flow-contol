fun main() {
oddNumbers()
   var hope=words(arrayOf("Jane","Hope","AkiraChix","would","maximum","minimum","mango"))
    println(hope)
    serveDrinkDifferrent(3)
    serveDrinkDifferrent(12)
    serveDrinkDifferrent(30)
    buzz()


}
fun oddNumbers(){
    for (b in 1..100){
     if (b % 2!=0){
         println(b)
     }
    }
}
fun  words(names:Array<String>):Int{
    var add=0
    for (name in names ){
        if(name.length>5){
            add ++
        }
    }
return  add
}

fun serveDrinkDifferrent(age: Int) {
     when (age) {
        in 0..5 ->  println("Glass of milk")
        in 6..14 -> println("Bottle of fanta Orange")
        else -> println ("Bottle of Coca Cola")
    }
}
fun buzz(){
  for (item in 1..100){
       if(item %3==0&&item%5==0){
          println("FizzBuzz")

      }
       else if (item%5==0){
           println("Buzz")
       }
       else if (item %3==0){
          println("Fizz")
          }
      }
    }



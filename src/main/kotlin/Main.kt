fun main() {
oddNumbers()
   var hope=words(arrayOf("Jane","Hope","AkiraChix","would","maximum","minimum","mango"))
    println(hope)
    serveDrinkDifferrent(3)
    serveDrinkDifferrent(12)
    serveDrinkDifferrent(30)
    buzz()


}
// 1 Create a function that prints out all the odd numbers between 1 and 100
fun oddNumbers(){
    for (b in 1..100){
     if (b % 2!=0){
         println(b)
     }
    }
}
//2 Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun  words(names:Array<String>):Int{
    var add=0
    for (name in names ){
        if(name.length>5){
            add ++
        }
    }
return  add
}
// 3 You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of cocacola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.

fun serveDrinkDifferrent(age: Int) {
     when (age) {
        in 0..5 ->  println("glass of milk")
        in 7..14 -> println("bottle of fanta Orange")
        else -> println ("bottle of coca cola")
    }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
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



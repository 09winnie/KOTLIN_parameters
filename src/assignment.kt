fun main() {
   school()
    intro("Grace kendi",23)
    println(personality("Stable introvert"))
    fact("Tamara")
    fact("Michelle")
}
fun school(){
var name="Akirachix"
var a=(name[0])
var b=(name[2])
var c=(name[3])
println("$a$b$c")
}
fun intro(name:String,age:Int){
    println("Hi,my name is $name and i am $age years old.")
}
fun personality(a:String):Int{
    return a.length
}
fun fact(name: String) {
    if (name=="Tamara") {
println("That's me!")
}
    else{
        println("I don't know who that is.")

    }    }
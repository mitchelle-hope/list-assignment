fun main (){
    var call=names(listOf("misho","brenda","grace","judy","jane","queenter"))
    println(call)
    var k =height(listOf(66, 236,176))
    println(k)
    var misho=human("mitchelle",19,176,72)
    var grace=human("grace",23,140,66)
    var judy=human("judy",19,126,55)
    var queen=human("queen",23,177,77)

    var people = listOf("misho","grace","judy")
//    var adults=people.sortedByDescending { p->p.age}
//    println(adults)

    var angela =human("angela",44,178,88)
    var stacy = human("stacy",55,126,65)

    var list = mutableListOf(angela,stacy)
    println(people.plus(list))

    var rolex =car ("y88484",99)
    var nissan =car("w2535365",87)
    var lambhoghini= car("k366367",87)
    var tesla =car("54647",54)

    var mycars = listOf(rolex,nissan,lambhoghini,tesla)
    println(coverage(mycars))
}
fun names(name:List<String>):List<String>{
    var identity = mutableListOf<String>()
    name.forEachIndexed() { index, s ->
        if (index %2 ==0){

        }

    }
    return  identity
}
fun height(numb:List<Int>):String{
    var height = numb.sum()
    var meters = numb.average()
    var total = "$height,$meters"
    return total
    println(total)

}
data class human(var name:String,var age:Int,var height:Int,var weight:Int)
 fun individual(indidviduala:List<Any>):List<Any>{
     return listOf()
 }

data class car(var registration:String,var mileage:Int)

fun coverage(numbs:List<car>):Int{
    var mile = 0
    numbs.forEach { m-> m.mileage
        mile+= m.mileage
    }
    var miles = mile/numbs.count()
    return  miles
}
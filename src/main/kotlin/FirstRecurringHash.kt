fun firstRecurringHash(arrayOf: Array<Int>): Int? {

    var map = hashMapOf<Int, Any?>()

    for(i in 0 .. arrayOf.size){
        if(map[arrayOf[i]] != null){
            return arrayOf[i]
        }else{
            map[arrayOf[i]] = i
        }
    }
    return null;
}

fun main (){
    print(firstRecurringHash(arrayOf(4,1,4,1,2,3,2)))
}
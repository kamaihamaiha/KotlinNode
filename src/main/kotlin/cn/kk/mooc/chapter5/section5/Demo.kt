package cn.kk.mooc.chapter5.section5

fun main(){

   val persons = HashSet<Person>()
    (0..5).forEach {
        persons += Person(1,"Kk")
    }

    println(persons.size)
}

class Person(val age: Int, val name: String){

    override fun equals(other: Any?): Boolean {
        val other = (other as? Person)?: return false
        return other.age == age && other.name == name
    }

    override fun hashCode(): Int {
        return 0
    }
}
fun main() {
    val gender=Gender.MALE

    for (i in Gender.values()){
        println(i)
    }
    println(gender.getGender())

}

enum class Gender{
    MALE,
    FEMALE,
    OTHER;

    fun getGender(){
        println(this)
    }

}

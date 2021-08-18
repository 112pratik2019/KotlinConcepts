val name: String = "Pratik"


fun main() {
    println("+++ let +++")
    //Use Case - Avoid Null pointer exception
    letScope()

    println("+++ run +++")
    //Use Case - Combination of with and let . if we want to operate nullable object and avoid NullPointerException then we use run
    runScope()

    println("+++ with +++")
    //Use Case - Calling function on context object without providing the lambda result
    withScope()

    println("+++ apply +++")
    //Use case - “Apply these to the object”. It can be used to operate on members of the receiver object mostly to initialize members.
    applyScope()

    println("+++ also +++")
    //Use Case - It is used where we have to perform additional operations when we have initialized the object members.
    alsoScope()
}

/*
* Refers Context object by using 'it'
* Return value is the lambda result
* */

fun letScope() {
    val length = name?.let {
        println(it.reversed())
        println(it.capitalize())
        it.length
    }
    println(length)
}

/*
* Refers Context object by using 'this'
* Returns value is the lambda result
* */
fun runScope() {
    //val person: Person? =null
    val person = Person()
    val age = person?.run {
        println(this.name)
        this.age
    }
    println(age)

}

/*
* Refers Context object by using 'this'
* Return value is the lambda result
* */

fun withScope() {
    val person = Person()
    val age = with(person) {
        println(this.name)
        println(this.age)
        this.age
    }
    println(age)
}

/*
* Refers context object by using 'this'
* Return value is the context object
* */

fun applyScope() {
    val person = Person().apply {
        this.name = "Pratik k"
        this.age = "25"
    }
    println(person.name)
    println(person.age)
}

/*
* Refers context object by using 'it'
* Return value is the context object
* */

fun alsoScope() {
    val list = mutableListOf<Int>(1, 2, 3)

    list.also {
        it.add(4)
        it.removeAt(1)
    }
    println(list)
}

class Person {
    var name: String = "Pratik";
    var age: String = "25";
}




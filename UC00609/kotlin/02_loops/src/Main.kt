
fun main() {

    //while

    var i = -1;

    while (i > 0) {
        println(i)
        i--
    }

    println("---- do-while ----")
    i = 10
    do {

        println(i)
       // i-- //i-=1;

    }while (--i > 0)

    println("----")
    i = 1
    println(i++)
    println(i++)
    println(++i)

    // range

    println(1..10)

    // for
    println("-- for --")
    for(i in 'a'..'z') {
        println(i)
    }
    println("------")

    for(i in 1..<10) {
        println(i)
    }

    println("------")

    for(i in 1 until 10) {
        println(i)
    }

    println("------")

    for(i in 1..<10 step 2) {
        println(i)
    }

    println("------")
    for(i in 10 downTo 1 ) {
        println(i)
    }


    println("----")
    for(i in 'A'..'z') {
        print("$i ")
    }

    println("")
    println("----")

    for (i in 1..10){

        println("itr for")

        if (i % 2 != 0){
            continue
        }

        if (i == 5){
            break
        }
        println(i)
    }

    while (i < 100) {
        print("$i ")
        if (i == 50){
            break
        }
        if (i == 40){
            continue
        }
        i++
    }
    
}


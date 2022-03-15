fun main() {
    val lastsum =20000.0
    val regular = true
    val sum = 1200.0
    var newsum = sum
    println("Покупка: $sum руб.")
    if (lastsum > 1000 && lastsum <= 10000) {
        newsum -= 100
        println("После применения скидки 100 рублей: ${newsum}руб.")
    }
    else if (lastsum > 10000) {
        newsum *= 0.95
        println("Cкидка 5%: $newsum руб.")
    }

    if (regular == true) {
        newsum *= 0.99
        println("Cкидка 1%: $newsum руб.")
    }
    println("Сумма покупок: $newsum руб.")
    println("Скидка составила: ${sum - newsum} руб.")
}


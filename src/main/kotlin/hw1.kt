fun main() {
    println("For regular");
    println(calculateFee(100, 1000)) // 30
    println(calculateFee(100, 10_000)) // 25
    println(calculateFee(100, 50_000)) // 20
    println(calculateFee(100, 100_0000)) // 15

    println("For exclusive");
    println(calculateFee(100, 1000, true)) // 25
    println(calculateFee(100, 10_000, true)) // 20
    println(calculateFee(100, 50_000, true)) // 15
    println(calculateFee(100, 100_0000, true)) // 10
}

fun calculateFee(currentSale: Long, previousSaleSum: Long, exclusive: Boolean = false): Double {
    var percent = when {
        previousSaleSum > 50_000 -> 15
        previousSaleSum > 10_000 -> 20
        previousSaleSum > 1_000 -> 25
        else -> 30
    }

    percent = if (exclusive) percent - 5 else percent
    return currentSale * (percent / 100.0);
}
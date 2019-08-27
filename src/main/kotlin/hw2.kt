fun main() {
    val weight = 100.1
    val height = 1.87
    val index = bodyMassIndex(weight, height);
    val verdict = when {
        index < 16 -> "Выраженный дефицит массы тела"
        index < 18.5 -> "Недостаточная (дефицит) масса тела"
        index < 24.99 -> "Норма"
        index < 30 -> "Избыточная масса тела (предожирение)"
        index < 35 -> "Ожирение"
        index < 40 -> "Ожирение резкое"
        else -> "Очень резкое ожирение"
    }
    println(verdict)
}

fun bodyMassIndex(weight: Double, height: Double): Double {
    return weight / (height * height);
}
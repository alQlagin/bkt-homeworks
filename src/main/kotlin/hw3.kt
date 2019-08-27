fun main() {
    println(formatTime(30))
    println(formatTime(90))
    println(formatTime(60 * 6))
    println(formatTime(60 * 60))
    println(formatTime(60 * 60 * 2))
    println(formatTime(60 * 60 * 20))
    println(formatTime(60 * 60 * 24 * 60))
    println(formatTime(60 * 60 * 24 * 400))
}

fun formatTime(fullSeconds: Int): String {
    val fullMinutes = fullSeconds / 60;
    if (fullMinutes < 1) {
        return "less a minute ago";
    }
    val minutes = fullMinutes % 60;
    val fullHours = fullMinutes / 60;
    if (fullHours < 1) {
        return if (minutes > 1) "$minutes minutes ago" else "a minute ago"
    }
    val hours = fullHours % 24;
    val fullDays = fullHours / 24;
    if (fullDays < 1) {
        return if (hours > 1) "$hours hours ago" else "an hour ago"
    }
    // @TODO approximately (month may have another days count)
    val days = fullDays % 30;
    val fullMonth = fullDays / 30;
    if (fullMonth < 1) {
        return if (days > 1) "$days days ago" else "a day ago"
    }
    val month = fullMonth % 12;
    val fullYears = fullMonth / 12;
    if (fullYears < 1) {
        return if (month > 1) "$month months ago" else "a month ago"
    }
    return "some years ago"
}
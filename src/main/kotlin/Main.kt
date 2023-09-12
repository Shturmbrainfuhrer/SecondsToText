fun main (){
    val seconds = 1488
    val text = agoToText(seconds)
    println(text)
}


fun agoToText(seconds: Int): String {
    return when {
        seconds <= 60 -> "был(а) только что"
        seconds < 60 * 60 -> "был(а) ${minutesToText(seconds / 60)} назад"
        seconds < 24 * 60 * 60 -> "был(а) ${hoursToText(seconds / (60 * 60))} назад"
        seconds < 48 * 60 * 60 -> "был(а) вчера"
        seconds < 72 * 60 * 60 -> "был(а) позавчера"
        else -> "был(а) давно"
    }
}

fun minutesToText(minutes: Int) : String {
        return when {
            minutes % 10 == 1 && minutes != 11 -> "$minutes минуту"
            minutes % 10 in 2..4 && minutes % 100 !in 12..14 -> "$minutes минуты"
            else -> "$minutes минут"
        }
    }

fun hoursToText(hours: Int) : String {
    return when {
        hours % 10 == 1 && hours != 11 -> "$hours час"
        hours % 10 in 2..4 && hours % 100 !in 12..14 -> "$hours часа"
        else -> "$hours часов"
    }
}
fun main(){
    println("Nhập một ngày trong tuần: ")
    var w = readLine()?.toString() ?: ""

    when(w){
        "monday" -> println("Thứ 2")
        "tuesday" -> println("Thứ 3")
        "wednesday" -> println("Thứ 4")
        "thursday" -> println("Thứ 5")
        "friday" -> println("Thứ 6")
        "saturday" -> println("Thứ 7")
        "sunday" -> println("Chủ nhật")
        else -> println("Không phải ngày trong tuần")
    }
}
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by orcun on 8/6/2017.
 */

fun main(args: Array<String>) {

    println("Enter your birthday: ")

    print("The day you born: ")
    var inputDay = Scanner(System.`in`)
    val day = inputDay.nextInt()

    print("The month you born: ")
    var inputMonth = Scanner(System.`in`)
    val month = inputMonth.nextInt()

    print("The year you born: ")
    var inputYear = Scanner(System.`in`)
    val year = inputYear.nextInt()


    val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd")
    simpleDateFormat.timeZone = TimeZone.getTimeZone("UTC")

    val bornValue: String = "$year-$month-$day"
    val bornDate = simpleDateFormat.parse(bornValue)
    println("Your birthday is: $bornValue")


    val dateNow: String = simpleDateFormat.format(Date().time)
    val yearOfNow: Int = dateNow.split("-")[0].toInt()
    val monthOfNow: Int = dateNow.split("-")[1].toInt()
    val dayOfNow: Int = dateNow.split("-")[2].toInt()


    val yearOfLive: Int = yearOfNow - year

    val monthOfLive: Int
    val totalMonthOfLive = yearOfLive * 12
    if (monthOfNow < month) {
        monthOfLive = totalMonthOfLive - (month - monthOfNow)
    }
    else {
        monthOfLive = totalMonthOfLive + (monthOfNow - month)
    }

    val daysOfLive: Float
    val totalDaysOfLive: Float = (monthOfLive * 30.4368499).toFloat()
    if (dayOfNow < day) {
        daysOfLive = totalDaysOfLive - (day - dayOfNow)
    }
    else {
        daysOfLive = totalDaysOfLive + (dayOfNow - day)
    }


    println("You are $yearOfLive years old.")
    println("You are $monthOfLive months old.")
    println("You are $daysOfLive days old.")



}
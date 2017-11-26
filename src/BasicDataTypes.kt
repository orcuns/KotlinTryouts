/**
 * Created by orcun on 8/6/2017.
 */

fun main(args: Array<String>) {

    // print the area of rectangle
    val width: Double = 3.0
    val height: Double = 4.0

    val perimeter = 2.0 * (height + width)

    var area = 0.0
    area = width * height

    System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter)
    System.out.printf("Area is %.1f * %.1f) = %.2f \n", height, width, area)

}
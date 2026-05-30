abstract class Shape {
    abstract fun calculateArea(): Double
}

class Circle(private val radius: Double) : Shape() {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}

class Square(private val side: Double) : Shape() {
    override fun calculateArea(): Double {
        return side * side
    }
}

fun processShapes(shapes: List<Shape>, action: (Double) -> Unit) {
    for (shape in shapes) {
        val area = shape.calculateArea()
        action(area)
    }
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(2.0),
        Square(4.0)
    )

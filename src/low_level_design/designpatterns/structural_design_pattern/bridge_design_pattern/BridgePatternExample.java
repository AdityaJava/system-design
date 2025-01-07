package low_level_design.designpatterns.structural_design_pattern.bridge_design_pattern;

/*
Explanation of Solution
Separation of Abstraction and Implementation: The Shape abstraction is independent of the DrawingStyle implementation.

Flexibility: New shapes or drawing styles can be added without modifying existing classes.

Reduction of Class Explosion: Instead of having VectorCircle, RasterCircle, etc., we now have just Circle, Rectangle, and the drawing styles.

This pattern is ideal for scenarios where the abstraction and implementation need to evolve independently.

 */
// Implementor interface
interface DrawingStyle {
    void draw(String shapeType);
}

// Concrete Implementors
class VectorDrawing implements DrawingStyle {
    @Override
    public void draw(String shapeType) {
        System.out.println("Drawing " + shapeType + " using Vector style.");
    }
}

class RasterDrawing implements DrawingStyle {
    @Override
    public void draw(String shapeType) {
        System.out.println("Drawing " + shapeType + " using Raster style.");
    }
}

// Abstraction
abstract class Shape {
    protected DrawingStyle drawingStyle;

    protected Shape(DrawingStyle drawingStyle) {
        this.drawingStyle = drawingStyle;
    }

    public abstract void draw();
}

// Refined Abstractions
class Circle extends Shape {
    public Circle(DrawingStyle drawingStyle) {
        super(drawingStyle);
    }

    @Override
    public void draw() {
        drawingStyle.draw("Circle");
    }
}

class Rectangle extends Shape {
    public Rectangle(DrawingStyle drawingStyle) {
        super(drawingStyle);
    }

    @Override
    public void draw() {
        drawingStyle.draw("Rectangle");
    }
}

// Client Code
public class BridgePatternExample {
    public static void main(String[] args) {
        DrawingStyle vectorStyle = new VectorDrawing();
        DrawingStyle rasterStyle = new RasterDrawing();

        Shape circle = new Circle(vectorStyle);
        Shape rectangle = new Rectangle(rasterStyle);

        circle.draw(); // Output: Drawing Circle using Vector style.
        rectangle.draw(); // Output: Drawing Rectangle using Raster style.
    }
}

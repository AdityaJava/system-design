package low_level_design.designpatterns.structural_design_pattern.bridge_design_pattern;

// Tightly Coupled Classes
class VectorCircle {
    public void draw() {
        System.out.println("Drawing Circle using Vector style.");
    }
}

class RasterCircle {
    public void draw() {
        System.out.println("Drawing Circle using Raster style.");
    }
}

class VectorRectangle {
    public void draw() {
        System.out.println("Drawing Rectangle using Vector style.");
    }
}

class RasterRectangle {
    public void draw() {
        System.out.println("Drawing Rectangle using Raster style.");
    }
}

// Client Code
public class ProblemWithoutBridge {
    public static void main(String[] args) {
        // Drawing different shapes with different styles
        VectorCircle vectorCircle = new VectorCircle();
        vectorCircle.draw(); // Output: Drawing Circle using Vector style.

        RasterRectangle rasterRectangle = new RasterRectangle();
        rasterRectangle.draw(); // Output: Drawing Rectangle using Raster style.
    }
}

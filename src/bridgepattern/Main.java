package bridgepattern;

public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(3.0f, vectorRenderer);
        Shape square = new Square(6.0f, rasterRenderer);

        circle.draw();
        square.draw();
    }
}

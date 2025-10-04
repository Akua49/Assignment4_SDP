package bridgepattern;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Rendering a Circle in vector format with radius: " + radius);
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Rendering a Square in vector format with side: " + side);
    }
}

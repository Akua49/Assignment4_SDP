package bridgepattern;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Rendering a Circle in raster format with radius: " + radius);
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Rendering a Square in raster format with side: " + side);
    }
}

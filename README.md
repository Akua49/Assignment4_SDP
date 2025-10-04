## UML Diagram

```mermaid
classDiagram
    class Shape {
        <<abstract>>
        -Renderer renderer
        +Shape(Renderer)
        +draw()* void
    }
    
    class Circle {
        -float radius
        +Circle(float, Renderer)
        +draw() void
    }
    
    class Square {
        -float side
        +Square(float, Renderer)
        +draw() void
    }
    
    class Renderer {
        <<interface>>
        +renderCircle(float) void
        +renderSquare(float) void
    }
    
    class VectorRenderer {
        +renderCircle(float) void
        +renderSquare(float) void
    }
    
    class RasterRenderer {
        +renderCircle(float) void
        +renderSquare(float) void
    }
    
    Shape <|-- Circle
    Shape <|-- Square
    Renderer <|.. VectorRenderer
    Renderer <|.. RasterRenderer
    Shape o--> Renderer

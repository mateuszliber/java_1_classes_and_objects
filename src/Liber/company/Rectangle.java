package Liber.company;

class Rectangle
{
    double rectangleHeigt;  //Wysokość prostokąta
    double rectangleWidth;  //Szerokość prostokąta
    Point vertex;   //Lewy dolny wierzchołek prostokąta
    Point middlePoint; //środek prostokata

    Rectangle(double rectangleHeigt, double rectangleWidth)
    {
        this.rectangleHeigt = 0.0;
        this.rectangleWidth = 0.0;
        this.vertex = new Point(0, 0);
        this.middlePoint = new Point(0, 0);
    }

    Rectangle(double rectangleHeigt, double rectangleWidth, Point vertex)
    {
        this.rectangleHeigt = rectangleHeigt;
        this.rectangleWidth = rectangleWidth;
        this.vertex = vertex;
    }

    public String toString()
    {
        return "[Wysokość: "+rectangleHeigt+", Szerokość: "+rectangleWidth+"] Wierzchołek: " + vertex.toString();
    }

    //Obliczanie pola powierzchni prostokąta
    double rectangleArea()
    {
        return rectangleHeigt*rectangleWidth;
    }

    //Obliczanie obwodu prostokąta
    double rectangleCircuit()
    {
        return (rectangleHeigt*2) + (rectangleWidth*2);
    }

    //Obliczenie współrzędnych środka prostokąta
    Point centerPoint()
    {
        return new Point((vertex.x + (rectangleWidth/2)), (vertex.y + (rectangleHeigt/2)));
    }

    //Przesunięcie współrzędnych o wektor
    void vertexEdit(double dx, double dy)
    {
        this.vertex = new Point((this.vertex.x + dx),(this.vertex.y + dy));
    }

    //Czy prostokąt przecina okrąg
    boolean ifCuts(Circle testedCircle)
    {
        return testedCircle.cuts(this);
    }
}
package Liber.company;

class Circle
{
    double radius;  //Promień okręgu
    Point center;   //współrzędne środka okręgu
    double pi = 3.14;

    Circle(double radius)
    {
        this.radius = 0.0;
        this.center = new Point(0, 0);
    }

    Circle(double radius, Point center)
    {
        this.radius = radius;
        this.center = center;
    }

    public String toString()
    {
        return "[Srodek okręgu: "+center.toString()+", Promień: "+radius;
    }

    //Obliczanie pola powierzchni okręgu
    double circleArea()
    {
        return radius*radius*pi;
    }

    //Obliczanie obwodu okręgu
    double circleCircuit()
    {
        return 2*pi*radius;
    }

    //Przesunięcie współrzędnych o wektor
    void setCenter(double dx, double dy)
    {
        this.center = new Point((this.center.x + dx),(this.center.y + dy));
    }

    //Czy Okrąg mieści się w Prostokącie
    boolean contain(Rectangle testedRectangle)
    {
        if((center.x - radius)<(testedRectangle.vertex.x)){return false;}
        else if((center.x + radius)>(testedRectangle.vertex.x + testedRectangle.rectangleWidth)){return false;}
        else if((center.y - radius)<(testedRectangle.vertex.y)){return false;}
        else if((center.y + radius)>(testedRectangle.vertex.y +testedRectangle.rectangleHeigt)){return false;}
        else {return true;}
    }

    //Czy Okrąg przecina Prostokąt
    boolean cuts(Rectangle testedRectangle)
    {
        if(this.contain(testedRectangle)){return false;} else return true;
    }
}
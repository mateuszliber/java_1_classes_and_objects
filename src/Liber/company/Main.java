package Liber.company;

public class Main
{
    public static void main(String[] args)
    {
        Point vertex1;
        vertex1 = new Point(-1, 1);
        System.out.println("Wierzchołek: "+vertex1);

        Point vertex2;
        vertex2 = new Point(0, 5.5);
        System.out.println("Wierzchołek okręgu: "+vertex2);

        Rectangle object1;
        object1 = new Rectangle(3,4, vertex1);
        double p1 = object1.rectangleArea();
        double o1 = object1.rectangleCircuit();

        System.out.println("Dane Wejściowe: "+object1);
        System.out.println("Pole prostokata: "+p1);
        System.out.println("Obwód prostokata: "+o1);
        System.out.println("Środek geometryczny figury: "+object1.centerPoint());

        object1.vertexEdit(-1, 3);
        System.out.println("Dane po przesunięciu :"+object1);
        System.out.println("Środek geometryczny figury po przesunięciu: "+object1.centerPoint());

        Circle object2;
        object2 = new Circle(3, vertex2);
        double p2 = object2.circleArea();
        double o2 = object2.circleCircuit();
        System.out.println("Dane Wejściowe okręgu: "+object2);
        System.out.println("Pole Okręgu: "+p2);
        System.out.println("Obwód Okręgu: "+o2);

        boolean z2 = object2.contain(object1);
        System.out.println("Czy okrąg zawiera się w prostokącie: "+z2);
        boolean c2 = object2.cuts(object1);
        System.out.println("Czy okrąg przecina prostokąt: "+c2);

        boolean c1 = object1.ifCuts(object2);
        System.out.println("Czy prostokąt przecina okrąg");
    }
}
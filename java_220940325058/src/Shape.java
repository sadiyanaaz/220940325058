/*
        Write a program to create a class named shape. In this class we have three
        sub classes circle, triangle and square, each class has two member function
        named draw () and erase (). Create these using Runtime Polymorphism concepts. (10 Marks)
        */


public class Shape
{
    void draw()
    {
        System.out.println("Shape : draw the shape");
    }

    void erase()
    {
        System.out.println("Erase : erase the drawn shape");
    }
}

class Circle extends Shape
{
    void draw()
    {
        System.out.println("Circle : Drawing circle");
    }

    void erase()
    {
        System.out.println("Circle : Erasing circle");
    }
}

class Square extends Shape
{
    void draw()
    {
        System.out.println("Square : Drawing square");
    }

    void erase()
    {
        System.out.println("Square : Erasing square");
    }
}

class Triangle extends Shape
{
    void draw()
    {
        System.out.println("Triangle : Drawing triangle");
    }

    void erase()
    {
        System.out.println("Triangle : Erasing triangle");
    }
}

class Main10
{
    public static void main(String[] args)
    {
        Shape c = new Circle();
        c.draw();
        c.erase();

        Shape s = new Square();
        s.draw();
        s.erase();

        Shape t = new Triangle();
        t.draw();
        t.erase();

    }
}

package rectangle;

import java.util.Scanner;

public class Rectangle {

    private double height = 0;
    private double width = 0;

    public Rectangle(double height, double width) {
        setHeight(height);
        setWidth(width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getValidWidth(){
        try{
            width = 0;
            System.out.printf("Please enter a valid width for the triangle:%n");
            Scanner keyboard = new Scanner(System.in);
            do {
                width = keyboard.nextInt();
            } while (width )
        }catch (Exception e);
        return width;
    }
    public double getValidHeight(){}
}

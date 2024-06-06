package baiduthi;

public class Circle {
    protected double centerX;
    protected double centerY;
    protected double radius;
    protected String color;

//    constractor
    public Circle(){
        centerX = 0;
        centerY = 0;
        radius = 1;
    }

    public Circle(double centerX, double centerY, double radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(double centerX, double centerY, double radius, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.color = color;
    }

//    getter
    public double getCenterX(){
        return centerX;
    }
    public double getCenterY(){
        return centerY;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }

//    setter
    public void setCenterX(double centerX){
        this.centerX = centerX;
    }
    public void setCenterY(double centerY){
        this.centerY = centerY;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
    }

//    method
    public String render(){
        return "Hình tròn có tọa độ tâm là : X = " + this.centerX + ", " + " Y = " + this.centerY + ", bán kính R = " + this.radius + ", có màu " + this.color;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
}

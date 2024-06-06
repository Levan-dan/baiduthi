package baiduthi;

public class Cylinder extends Circle {
    private double height;

//    goi constractor
    public Cylinder(double centerX, double centerY, double radius, double height){
        super(centerX, centerY, radius);
        this.height = height;
    }

//    getter setter
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

//    method
    public double getVolumOfCylinder(){
        return Math.PI * Math.pow(radius,2) * height;
    }

    public String render(){
        return "Hình trụ có tọa độ tâm là : X = " + this.centerX + ", " + " Y = " + this.centerY + ", bán kính R = " + this.radius + ", có màu " + this.color + ", chiều cao " + this.height;
    }

}

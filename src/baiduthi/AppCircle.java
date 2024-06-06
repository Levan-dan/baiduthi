package baiduthi;

public class AppCircle {
    public static void main(String[] args) {
//        Đối tượng Circle
        Circle circle = new Circle();
        Circle circle1 = new Circle(5.5, 6.6, 8.0, "green");

        System.out.println("Thông tin của các hình tròn là:");
        System.out.println(circle.render());
        System.out.println(circle1.render());
        System.out.println();

        circle.setColor("black");
        circle.setColor("yellow");
        System.out.println("Thông tin của các hình tròn sau khi thay đổi là:");
        System.out.println(circle.render());
        System.out.println(circle1.render());
        System.out.println();

        System.out.println("Diện thích của các hình tròn là:");
        System.out.println(circle.render() + " ---> có diện tích = " + circle.getArea());
        System.out.println(circle1.render() + " ---> có diện tích = " + circle1.getArea());
        System.out.println("<--------------------------------------------------------------------------------------------------------------------------->");
        System.out.println();


//        Đối tượng Cylinder
        Cylinder cylinder = new Cylinder(4, 6, 2, 8);
        cylinder.setColor("red");
        System.out.println(cylinder.render() + " ===>  thể tích của hình trụ đó là : " + cylinder.getVolumOfCylinder());

    }
}

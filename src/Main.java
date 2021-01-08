public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3,3);

        double triangleA_Area = triangleA.findArea();
        System.out.println(triangleA_Area);

        double triangleB_Area = triangleB.findArea();
        System.out.println(triangleB_Area);
    }

}

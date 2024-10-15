public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle tri1 = new RightTriangle(3, 4);
        double tri1Hyp = tri1.Hypotenuse();
        RightTriangle tri2 = new RightTriangle(6.5, 10.7);
        double tri2Hyp = tri2.Hypotenuse();
        System.out.println(tri1Hyp);
        System.out.println(tri2Hyp);
    }
}

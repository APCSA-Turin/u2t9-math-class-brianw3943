public class RightTriangle {
    private double base;
    private double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double Hypotenuse() {
        double hypotenuse = Math.sqrt(Math.pow(base, 2) +Math.pow(height, 2));
        return hypotenuse;
    }
}

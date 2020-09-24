public class Circle {
    private double D;
    private double R;

    public Circle(int D, double R) {
        this.D = D;
        this.R = R;
    }

    public double getD() {
        return D;
    }

    public double getR() {
        return R;
    }

    public static void D(double R){

        System.out.println("D = " + (R * 2));
    }
}

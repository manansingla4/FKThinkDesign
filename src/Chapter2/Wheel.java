package Chapter2;

class Wheel {
    private int rim;
    private double tire;

    Wheel(int rim, double tire) {
        this.rim = rim;
        this.tire = tire;
    }

    double diameter() {
        return rim + tire * 2;
    }

    double circumference() {
        return diameter() * Math.PI;
    }
}

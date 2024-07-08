package by.tms.lesson2429onl.model;

public class Operation {
    private double nam1;
    private double nam2;
    private double result;
    private String type;

    public Operation(double nam1, double nam2, String type) {
        this.nam1 = nam1;
        this.nam2 = nam2;
        this.type = type;
    }

    public double getNam1() {
        return nam1;
    }

    public void setNam1(double nam1) {
        this.nam1 = nam1;
    }

    public double getNam2() {
        return nam2;
    }

    public void setNam2(double nam2) {
        this.nam2 = nam2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "nam1=" + nam1 +
                ", nam2=" + nam2 +
                ", result=" + result +
                ", type='" + type + '\'' +
                '}';
    }
}

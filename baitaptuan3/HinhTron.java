package baitaptuan3;

public class HinhTron {

    private double bankinh;
    final double pi = 3.14;

    public double getbankinh() {
        return bankinh;
    }

    public void setbankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public double tinhduongkinh() {
        return bankinh * 2;
    }

    public double tinhchuvi() {
        return 2 * bankinh * pi;
    }

    public double tinhdientich() {
        return bankinh * bankinh * pi;
    }
}

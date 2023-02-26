package baitaptuan3;

class HinhVuong {

    private double canh;

    public double getcanh() {
        return this.canh;
    }

    public void setcanh(double canh) {
        this.canh = canh;
    }

    public double tinhchuvi() {
        return canh * 4;
    }

    public double tinhdientich() {
        return canh * canh;
    }
}

package baitaplab3;

public class Triangle {
    private Float width;
    private Float heght;

    public Triangle() {
    }

    public Triangle(Float width, Float heght) {
        this.width = width;
        this.heght = heght;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getHeght() {
        return heght;
    }

    public void setHeght(Float heght) {
        this.heght = heght;
    }

    @Override
    public String toString() {
        return "Triangle[width= " + width+ ", height = " + heght + "]";
    }
    
    
}
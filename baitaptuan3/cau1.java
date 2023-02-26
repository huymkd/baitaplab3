package baitaptuan3;

import java.util.Scanner;

public class cau1 {

    public static void main(String[] args) {
        HinhTron hinhtron = new HinhTron();
        System.out.println("Hinh Tron");
        System.out.println("Nhap ban kinh:");
        Scanner scanner = new Scanner(System.in);
        hinhtron.setbankinh(scanner.nextDouble());
        System.out.println("Duong kinh hinh tron= " + hinhtron.tinhduongkinh());
        System.out.println("Chu vi hinh tron= " + hinhtron.tinhchuvi());
        System.out.println("Dien tich hinh tron= " + hinhtron.tinhdientich());

        HinhVuong hinhvuong = new HinhVuong();
        System.out.println("Hinh Vuong");
        System.out.println("Nhap canh hinh vuong:");
        hinhvuong.setcanh(scanner.nextDouble());
        System.out.println("Chu vi hinh vuong= " + hinhvuong.tinhchuvi());
        System.out.println("Dien tich hinh vuong= " + hinhvuong.tinhdientich());
    }
}

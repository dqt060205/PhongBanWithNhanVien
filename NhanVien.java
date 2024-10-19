public class NhanVien {
    private String tenNhanVien;         // Các biến thông số
    public final double luongCoBan = 750;
    private double heSoLuong;
    public final double LUONG_MAX = 20000;

    public NhanVien() {                 //Constructor
        tenNhanVien = "Unknown";
        //luongCoBan = 0;
        heSoLuong = 0;
    }
    public NhanVien(String tenNhanVien, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        //this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }
    //Setter
    public void setTenNhanVien(String tenNhanVien) {    
        this.tenNhanVien = tenNhanVien;
    }
    /*public void setluongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }*/
    public void setHeSoLuong(double heSoLuong) {
        if (heSoLuong * this.luongCoBan >= LUONG_MAX){
            System.out.println("Khong the dat he so luong nay");
        }
        else {
            this.heSoLuong = heSoLuong;
        }
    }
    //Getter
    public String getTenNhanVien() {
        return this.tenNhanVien;
    }
    public double getLuongCoBan() {
        return this.luongCoBan;
    }
    public double getHeSoLuong() {
        return this.heSoLuong;
    }
    // Hàm tăng lương
    public boolean tangLuong(double heSoTang) {
        if ((this.heSoLuong + heSoTang) * this.luongCoBan > LUONG_MAX) {
            System.out.println("Khong the tang he so luong");
            return false;
        }
        else {
            this.setHeSoLuong(this.heSoLuong + heSoTang);
            return true;
        }
    }
    // Hàm tính lương
    public double tinhLuong() {
        return this.luongCoBan * this.heSoLuong;
    }
    //Hàm in thông tin nhân viên
    public void inTTin() {
        System.out.println("Ten nhan vien: " + this.tenNhanVien);
        //System.out.println("Luong co ban: " + this.luongCoBan);
        System.out.println("He so luong: " + this.heSoLuong);
        System.out.println("Luong cua nhan vien: " + this.tinhLuong());
    }
}

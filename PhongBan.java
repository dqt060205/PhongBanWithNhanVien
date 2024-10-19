public class PhongBan {
    private String tenPhongBan;
    private byte soNhanVien = 0; //Chỉ số cao nhất của stack = Số nhân viên - 1
    public final byte SO_NV_MAX = 100;

    public NhanVien[] nhanVienList = new NhanVien[SO_NV_MAX]; // Mảng lưu nhân viên

    //Constructor
    public PhongBan() {
        tenPhongBan = "Unknown";
    }
    public PhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    //Setter
    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    //Getter
    public String getTenPhongBan() {
        return this.tenPhongBan;
    }
    public byte getSoNhanVien() {
        return this.soNhanVien;
    }

    //Hàm thêm nhân viên vào cuối danh sách (Theo cấu trúc stack)
    public boolean themNV(NhanVien nhanVien) {
        if (soNhanVien >= SO_NV_MAX) {
            return false;
        }
        else {
            nhanVienList[soNhanVien++] = nhanVien;
            return true;
        }
    }

    //Hàm xoá nhân viên ở cuối (theo cấu trúc stack)
    public NhanVien xoaNV() {
        if (soNhanVien == 0) {
            return null;
        }
        else {
            NhanVien xoaNhanVien = nhanVienList[--soNhanVien];
            nhanVienList[soNhanVien] = null;
            return xoaNhanVien;
        }
    }
    //Hàm tính tổng lương của phòng ban
    public double tongLuong() {
        double tongLuong = 0;
        for (int i = 0; i < soNhanVien; i++) {
            tongLuong += nhanVienList[i].tinhLuong();
        }
        return tongLuong;
    }
    //Hàm in thông tin nhân viên phòng ban
    public void inTTin() {
        System.out.print("Ten phong ban: " + getTenPhongBan() +"\n");
        System.out.print("So nhan vien: " + getSoNhanVien() + "\n");
        System.out.println("Danh sach nhan vien cua phong ban: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhan vien so " + (i + 1) + ":");
            nhanVienList[i].inTTin();
        }
    }
}

/*import java.util.Scanner;
public class TestNV {
    public static void main(String[] args) {
        NhanVien nhanVienList[] = new NhanVien[SO_NV_MAX];
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        int soNhanVien = sc.nextInt();


        // Nhập thông tin cho nhân viên
        for (int i = 0; i < soNhanVien; i++) {
            System.out.print("Nhap ten nhan vien so " + (i + 1) + ": ");
            String tenNhanVien = sc.next();
            System.out.print("Nhap luong co ban cua nhan vien: ");
            Double luongCoban = sc.nextDouble();
            System.out.print("Nhap he so luong cua nhan vien: ");
            Double heSoluong = sc.nextDouble();
            nhanVienList[i] = new NhanVien(tenNhanVien, heSoluong, luongCoban);
        }
        int taskNumber;
        do {
            System.out.print("""
                              1: In thong tin nhan vien
                              2: Hien thi luong nhan vien
                              3: Tang luong nhan vien
                              0: Dong chuong trinh
                             Hay nhap thao tac can lam:  """);
            taskNumber = sc.nextInt();
            switch(taskNumber) {
                case 1: {
                    System.out.print("Nhap so thu tu nhan vien: ");
                    int nhanVienNum = sc.nextInt() - 1;
                    nhanVienList[nhanVienNum].inTTin();
                    break;
                }
                case 2: {
                    System.out.print("Nhap so thu tu nhan vien: ");
                    int nhanVienNum = sc.nextInt() - 1;
                    System.out.printf("Luong cua nhan vien %s la: %.3f\n",nhanVienList[nhanVienNum].getTenNhanVien(),
                    nhanVienList[nhanVienNum].tinhLuong());
                    break;
                }
                case 3: {
                    System.out.print("Nhap so thu tu nhan vien: ");
                    int nhanVienNum = sc.nextInt() - 1;
                    System.out.print("Nhap so luong tang: ");
                    Double heSoTang = sc.nextDouble();
                    nhanVienList[nhanVienNum].tangLuong(heSoTang);
                    break;
                }
                case 0: {
                    System.out.println("Ket thuc chuong trinh");
                    break;
                }
                default: {
                    System.out.println("Thao tac khong hop le");
                    break;
                }
            }
        } while (taskNumber != 0);
        sc.close();
    }
}
*/
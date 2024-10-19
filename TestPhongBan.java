import java.util.Scanner;

public class TestPhongBan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phong ban muon tao: ");
        int soPhongBan = sc.nextInt();
        PhongBan[] phongBanList = new PhongBan[soPhongBan];
        
        //Nhập thông tin cho các phòng ban
        for (int i = 0; i < soPhongBan; i++) {
            System.out.println("Phong ban so " + (i + 1) + " :");
            System.out.print("Nhap ten phong ban: ");
            String tenPhongBan = sc.next();
            phongBanList[i] = new PhongBan(tenPhongBan);
            System.out.println("Nhap thong tin cho nhan vien trong phong ban: ");
            while (true) {
                System.out.println("Nhan 1 de them nhan vien moi, nhan 0 de ket thuc:");
                int opCheck = sc.nextInt();
                if (opCheck == 0) break;
                System.out.print("Nhap ten nhan vien: ");
                String tenNhanVien = sc.next();
                //System.out.print("Nhap luong co ban cua nhan vien: ");
                //Double luongCoban = sc.nextDouble();
                System.out.print("Nhap he so luong cua nhan vien: ");
                Double heSoluong = sc.nextDouble();
                NhanVien nhanVien = new NhanVien(tenNhanVien, heSoluong);//, luongCoban);
                if (phongBanList[i].themNV(nhanVien) == true){
                    System.out.println("Them nhan vien thanh cong!");
                }
                else {
                    System.out.println("Them nhan vien that bai!");
                }
            }
            System.out.println("Ket thuc them nhan vien cho phong ban " + phongBanList[i].getTenPhongBan());
        }
        
        int taskNumber;
        do {
            System.out.print("""
                              1: In thong tin phong ban
                              2: Them nhan vien cho phong ban
                              3: Xoa nhan vien cua phong ban
                              4: Tinh tong luong cua ca phong ban
                              0: Dong chuong trinh
                             Hay nhap thao tac can lam:   """);
            taskNumber = sc.nextInt();
            switch(taskNumber) {
                case 1 ->  {
                    System.out.print("Nhap so phong ban: ");
                    int phongBanIndex = sc.nextInt();
                    phongBanList[phongBanIndex - 1].inTTin();
                }
                case 2 ->  {
                    System.out.print("Nhap so phong ban: ");
                    int phongBanIndex = sc.nextInt();
                    System.out.print("Nhap ten nhan vien: ");
                    String tenNhanVien = sc.next();
                    //System.out.print("Nhap luong co ban cua nhan vien: ");
                    //Double luongCoban = sc.nextDouble();
                    System.out.print("Nhap he so luong cua nhan vien: ");
                    Double heSoluong = sc.nextDouble();
                    NhanVien nhanVien = new NhanVien(tenNhanVien, heSoluong);//, luongCoban);
                    if (phongBanList[phongBanIndex - 1].themNV(nhanVien)) {
                        System.out.println("Them nhan vien thanh cong!");
                    }
                    else {
                        System.out.println("Them nhan vien that bai!");
                    }
                }
                case 3 ->  {
                    System.out.print("Nhap so phong ban: ");
                    int phongBanIndex = sc.nextInt();
                    NhanVien xoaNhanVien = phongBanList[phongBanIndex - 1].xoaNV();
                    if (xoaNhanVien == null) {
                        System.out.println("Phong ban khong co nhan vien de xoa!");
                    }
                    else {
                        System.out.println("Da xoa nhan vien " + xoaNhanVien.getTenNhanVien() +" thanh cong!");
                    }
                }
                case 4 ->  {
                    System.out.print("Nhap so phong ban: ");
                    int phongBanIndex = sc.nextInt();
                    System.out.println("Tong luong cua ca phong ban la: " + phongBanList[phongBanIndex - 1].tongLuong());
                }
                case 0 ->  {
                    System.out.println("Ket thuc chuong trinh.");
                }
                default ->  {
                    System.out.println("Thao tac khong hop le, hay thao tac lai");
                }
            }
        } while (taskNumber != 0);
        sc.close();
    }
}

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, ParseException {
        Scanner scanner = new Scanner(System.in);
        QuanLyBaoCao ql = new QuanLyBaoCao();

        BaoCao bc1 = new BaoCaoKhoaLuan("Bao cao khoa luan", "10/02/2021", "drive.com", "bảo", 9.0, 21.0, "good");
        BaoCao bc2 = new BaoCaoDoAnNganh("Bao cao do an nganh", "10/02/2021", "drive.com", "nhân", 9.0, 21.0);
        BaoCao bc3 = new BaoCaoThucTap("Bao cao thuc tap", "10/02/2021", "drive.com", "lâm", 9.0, "good");

        ql.themBaoCao(bc1);
        ql.themBaoCao(bc2);
        ql.themBaoCao(bc3);


        int choose;
        do {
            Menu.MenuMain();
            choose = 100;
            do {
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException ex) {
                    System.out.print("Lựa chọn không hợp lệ !!! Thử lại: ");
                }
            } while (choose == 100);

            switch (choose) {
                case 1:
                    Menu.MenuLoaiBaoCao();
                    System.out.println("Nhập 4: Xem tất cả báo cáo");
                    System.out.print("Lựa chọn của bạn là:");
                    int choose1 = Integer.parseInt(scanner.nextLine());
                    switch (choose1) {
                        case 1:
                            ql.hienThiTheoLoai("BaoCaoDoAnNganh");
                            break;
                        case 2:
                            ql.hienThiTheoLoai("BaoCaoKhoaLuan");
                            break;
                        case 3:
                            ql.hienThiTheoLoai("BaoCaoThucTap");
                            break;
                        case 4:
                            ql.hienThiDS();
                            break;
                    }
                    break;
                case 2:
                    Menu.MenuLoaiBaoCao();
                    System.out.print("Lựa chọn của bạn là:");
                    int choose2 = Integer.parseInt(scanner.nextLine());
                    switch (choose2) {
                        case 1:
                            ql.themBaoCao("BaoCaoDoAnNganh");
                            break;
                        case 2:
                            ql.themBaoCao("BaoCaoKhoaLuan");
                            break;
                        case 3:
                            ql.themBaoCao("BaoCaoThucTap");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Gán hội đồng cho khóa luận tốt nghiệp");
                    ql.themHoiDong(1);
                    System.out.println("Đã gán thành công!!");
                    break;
                case 4:
                    ql.sapXepTheoThoiGian(null);
                    break;
                case 5:
                    ql.sapXepTheoTen(null);
                    break;
                case 6:
                    boolean check = false;
                    do {
                        System.out.print("Thời gian từ: ");
                        String fromDate = scanner.nextLine();
                        System.out.print("Thời gian đến: ");
                        String toDate = scanner.nextLine();
                        try {
                            ql.timKiemTheoKhoangThoiGian(fromDate, toDate).forEach(bc -> bc.hienThi());
                        } catch (ParseException ex) {
                            check = true;
                            System.out.print("Khong hop le\n");
                        }
                    } while (check);
                    break;
                case 7:
                    System.out.println("Nhập tên cần tìm: ");
                    String name = scanner.nextLine();
                    ql.timKiemTheoTen(name).forEach(bc -> bc.hienThi());
                    break;
            }
        } while (choose > 0 && choose <= 7);
    }
}
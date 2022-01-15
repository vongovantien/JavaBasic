import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public abstract class BaoCao {
    protected static final Scanner scanner = new Scanner(System.in);
    private static int dem;
    protected static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
    private int maBaoCao = ++dem;
    protected String tenBaoCao;
    protected Date ngayBaoCao;
    protected String tapTinBaoCao;
    protected List<SinhVien> sinhVien = new ArrayList<>();
    protected String tenGVHD;
    protected double diemBaoCao;


    public void themSV() {
        if(this.sinhVien.stream().count() < 2){
            System.out.print("Ho va ten sinh vien: ");
            String ht = scanner.nextLine();
            System.out.print("Khoa hoc: ");
            String kh = scanner.nextLine();
            System.out.print("Gioi tinh: ");
            String gioiTinh = scanner.nextLine();
            System.out.print("Nam sinh: ");
            String namS = scanner.nextLine();
            System.out.print("Chuyen nganh: ");
            String chuyeNganh = scanner.nextLine();
            SinhVien sv = new SinhVien(ht, kh, gioiTinh, namS, chuyeNganh);
            this.sinhVien.add(sv);
        }
        else{
            System.out.println("Đã đủ số lượng sinh viên !! Tối đa hai sinh vien");
        }
    }

    public void nhapBC() throws ParseException {
        System.out.print("Nhập tên báo cáo: ");
        this.tenBaoCao = scanner.nextLine();
        boolean check = false;
        do {
            try {
                check = false;
                System.out.print("Nhập ngày báo cáo: ");
                this.ngayBaoCao = F.parse(scanner.nextLine());
            } catch (Exception e) {
                check = true;
                System.out.println("Ngày không hợp lệ !! Nhập lại !!");
            }
        } while (check == true);
        System.out.print("Chuỗi link báo cáo: ");
        this.tapTinBaoCao = scanner.nextLine();
        System.out.print("Tên giảng viên hướng dẫn: ");
        this.tenGVHD = scanner.nextLine();
        System.out.print("Điểm của báo cáo: ");
        this.diemBaoCao = Double.parseDouble(scanner.nextLine());
    }


    public void hienThi() {
        System.out.printf("Tên báo cáo: %s\n", this.tenBaoCao);
        System.out.printf("Ngày báo cáo: %s\n", this.F.format(ngayBaoCao));
        System.out.printf("Chuỗi link báo cáo: %s\n", this.tapTinBaoCao);
        System.out.printf("Tên giảng viên hướng dẫn: %s\n", this.tenGVHD);
        System.out.printf("Điểm của báo cáo: %.1f\n", this.diemBaoCao);
        System.out.print("===Sinh viên thực hiện báo cáo\n");
        this.sinhVien.forEach(h -> h.hienThi());
    }

    public int getMaBaoCao() {
        return maBaoCao;
    }

    public void setMaBaoCao(int maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    public String getTenBaoCao() {
        return tenBaoCao;
    }

    public void setTenBaoCao(String tenBaoCao) {
        this.tenBaoCao = tenBaoCao;
    }

    public Date getNgayBaoCao() {
        return ngayBaoCao;
    }

    public void setNgayBaoCao(Date ngayBaoCao) {
        this.ngayBaoCao = ngayBaoCao;
    }

    public String getTenGVHD() {
        return tenGVHD;
    }

    public void setTenGVHD(String tenGVHD) {
        this.tenGVHD = tenGVHD;
    }

    public double getDiemBaocao() {
        return diemBaoCao;
    }

    public void setDiemBaocao(double diemBaocao) {
        this.diemBaoCao = diemBaocao;
    }

    public List<SinhVien> getSinhVien() {
        return sinhVien;
    }


    public String getTapTinBaoCao() {
        return tapTinBaoCao;
    }

    public void setTapTinBaoCao(String tapTinBaoCao) {
        this.tapTinBaoCao = tapTinBaoCao;
    }
}

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaoCaoKhoaLuan extends BaoCao {
    private double tyLeDaoVan;
    private GiangVien gVPhanBien;
    private String danhGiaGV;
    private List<GiangVien> dsHoiDong = new ArrayList<>();


    public BaoCaoKhoaLuan(String t, String nbc, String tt, String gv, double d, double tl, String dg) throws ParseException {
        this.tenBaoCao = t;
        this.ngayBaoCao = F.parse(nbc);
        this.tapTinBaoCao = tt;
        this.tenGVHD = gv;
        this.diemBaoCao = d;
        this.danhGiaGV = dg;
        this.tyLeDaoVan = tl;
    }

    public void hienThi() {
        super.hienThi();
        System.out.print("Thông tin thành viên hội đồng:\n");
        this.dsHoiDong.forEach(h -> h.hienThi());
    }

    @Override
    public void nhapBC() throws ParseException {
        super.nhapBC();
        this.themSV();
        this.themSV();
        System.out.print("Tỷ lệ đạo văn:");
        this.tyLeDaoVan = Double.parseDouble(scanner.nextLine());
        System.out.print("Đánh giá của giảng viên: ");
        this.danhGiaGV = scanner.nextLine();
    }

    public void ganHoiDong(HoiDong hd) {
        this.dsHoiDong.add(hd.CHU_TICH.get());
        this.dsHoiDong.add(hd.THU_KY.get());
        this.dsHoiDong.add(hd.PHAN_BIEN.get());
        this.dsHoiDong.add(hd.UY_VIEN.get());
        this.dsHoiDong.add(hd.HUONG_DAN.get());
    }

    public BaoCaoKhoaLuan() {
    }

    public double getTyLeDaoVan() {
        return tyLeDaoVan;
    }

    public void setTyLeDaoVan(double tyLeDaoVan) {
        this.tyLeDaoVan = tyLeDaoVan;
    }

    public String getDanhGiaGV() {
        return danhGiaGV;
    }

    public void setDanhGiaGV(String danhGiaGV) {
        this.danhGiaGV = danhGiaGV;
    }

    public List<GiangVien> getDsHoiDong() {
        return dsHoiDong;
    }

    public void setDsHoiDong(List<GiangVien> dsHoiDong) {
        this.dsHoiDong = dsHoiDong;
    }
}

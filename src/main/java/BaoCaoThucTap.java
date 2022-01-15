import java.text.ParseException;

public class BaoCaoThucTap extends BaoCao {

    private String danhGiaDoanhNghiep;

    public BaoCaoThucTap(String t, String nbc, String tt, String gv, double d, String danhGia) throws ParseException {
        this.tenBaoCao = t;
        this.ngayBaoCao = F.parse(nbc);
        this.tapTinBaoCao = tt;
        this.tenGVHD = gv;
        this.diemBaoCao = d;
        this.danhGiaDoanhNghiep = danhGia;
    }

    public BaoCaoThucTap() {
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Đánh giá của doanh nghiệp : " + this.danhGiaDoanhNghiep);
    }

    public String getDanhGiaDoanhNghiep() {
        return danhGiaDoanhNghiep;
    }

    public void setDanhGiaDoanhNghiep(String danhGiaDoanhNghiep) {
        this.danhGiaDoanhNghiep = danhGiaDoanhNghiep;
    }
}

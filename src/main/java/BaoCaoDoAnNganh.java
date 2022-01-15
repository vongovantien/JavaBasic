import java.text.ParseException;

public class BaoCaoDoAnNganh extends BaoCao {

    private double tyLeDaoVan;

    public BaoCaoDoAnNganh() {
    }

    public BaoCaoDoAnNganh(String t, String nbc, String tt, String gv, double d, double dv) throws ParseException {
        this.tenBaoCao = t;
        this.ngayBaoCao = F.parse(nbc);
        this.tapTinBaoCao = tt;
        this.tenGVHD = gv;
        this.diemBaoCao = d;
        this.tyLeDaoVan = dv;
    }

    @Override
    public void nhapBC() throws ParseException {
        super.nhapBC();

        System.out.print("Tỷ lệ đạo văn:");
        this.tyLeDaoVan = scanner.nextDouble();
        this.themSV();
        this.themSV();
        this.themSV();
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Tỷ lệ đạo văn: %.1f\n", tyLeDaoVan);
    }

    public void setTyLeDaoVan(double tyLeDaoVan) {
        this.tyLeDaoVan = tyLeDaoVan;
    }
}

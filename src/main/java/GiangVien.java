public class GiangVien {
    private String hoTen;
    private String nhiemVu;
    private String hocVi;
    private String hocHam;
    private Double diem;
    private String danhGia;

    public GiangVien(String ht, String nv, String hv, String hh, Double d, String dg) {
        this.hoTen = ht;
        this.nhiemVu = nv;
        this.hocVi = hv;
        this.hocHam = hh;
        this.diem = d;
        this.danhGia = dg;
    }

    public void hienThi(){
        System.out.printf("Ho va ten giang vien: %s\n", this.hoTen);
        System.out.printf("Diem: %.1f\n", this.diem);
        System.out.printf("Nhiem vu: %s\n", this.nhiemVu);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNhiemVu() {
        return nhiemVu;
    }

    public void setNhiemVu(String nhiemVu) {
        this.nhiemVu = nhiemVu;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public String getDanhGia() {
        return danhGia;
    }

    public void setDanhGia(String danhGia) {
        this.danhGia = danhGia;
    }
}

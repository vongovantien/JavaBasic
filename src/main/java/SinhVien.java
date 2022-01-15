public class SinhVien {

    private static int dem;
    private int maSV = ++dem;
    private String hoTen;
    private String khoaHoc;
    private String gioiTinh;
    private String namSinh;
    private String chuyenNganh;

    public SinhVien(String ht, String kh, String gt, String ns, String cn) {
        this.hoTen = ht;
        this.khoaHoc = kh;
        this.gioiTinh = gt;
        this.namSinh = ns;
        this.chuyenNganh = cn;
    }

    public void hienThi() {
        System.out.printf("Họ tên : %s\n", this.hoTen);
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}


import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyBaoCao {
    protected static final SimpleDateFormat F = new SimpleDateFormat("dd/MM/yyyy");
    private List<BaoCao> ds = new ArrayList<>();


    public void themHoiDong(int maBc) {
        HoiDong hd = null;

        ((BaoCaoKhoaLuan) this.ds.stream().filter(bc -> bc.getMaBaoCao() == maBc).findFirst().get()).ganHoiDong(hd);

    }

    public void suaBC(int maBc) throws ParseException {
        this.ds.stream().filter(bc -> bc.getMaBaoCao() == maBc).findFirst().get().nhapBC();
    }


    //Tìm kiếm báo cáo theo tên
    public List<BaoCao> timKiemTheoTen(String name) {
        return this.ds.stream().filter(s -> s.getTenBaoCao()
                .contains(name)).collect(Collectors.toList());
    }


    //Xem báo cáo theo loại báo cáo
    public List<BaoCao> hienThiTheoLoai(String loai) {
        if(loai.isEmpty())
            loai = null;
        try {
            Class myClass = Class.forName(loai);

            List<BaoCao> bc = this.ds.stream().filter(b -> myClass.isInstance(b)).collect(Collectors.toList());

            bc.forEach(b -> b.hienThi());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    //Tìm kiếm theo khoảng thời gian
    public List<BaoCao> timKiemTheoKhoangThoiGian(String fromDate, String toDate) throws ParseException {
        Date d = F.parse(fromDate);
        Date d2 = F.parse(toDate);
        return this.ds.stream().filter(bc -> {
            if (bc.getNgayBaoCao().getTime() >= d.getTime() && bc.getNgayBaoCao().getTime() <= d2.getTime())
                return true;
            return false;
        }).collect(Collectors.toList());
    }

    //Sắp xếp báo cáo theo thời gian
    public List<BaoCao> sapXepTheoThoiGian(String loaiBc) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        if (loaiBc != null || loaiBc != "") {
            Class myClass = Class.forName(loaiBc);

            List<BaoCao> ds2 = this.ds.stream().filter(bc -> myClass.isInstance(bc)).collect(Collectors.toList());
            ds2.sort((bc1, bc2) -> bc1.getNgayBaoCao().compareTo(bc2.getNgayBaoCao()));

            return ds2;
        } else {
            this.ds.sort((bc1, bc2) -> bc1.getTenBaoCao().compareTo(bc2.getTenBaoCao()));
        }
        return null;
    }

    //Sắp xếp tăng dần theo tên
    public List<BaoCao> sapXepTheoTen(String loaiBc) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if (loaiBc != null || loaiBc != "") {
            Class myClass = Class.forName(loaiBc);

            BaoCao b = (BaoCao) myClass.getDeclaredConstructor(null).newInstance();

            List<BaoCao> ds2 = this.ds.stream().filter(bc -> myClass.isInstance(bc)).collect(Collectors.toList());
            ds2.sort((bc1, bc2) -> bc1.getTenBaoCao().compareTo(bc2.getTenBaoCao()));

            return ds2;
        } else {
            this.ds.sort((bc1, bc2) -> bc1.getTenBaoCao().compareTo(bc2.getTenBaoCao()));
        }

        return null;
    }

    //Xóa báo cáo theo mã
    public void xoaBc(int maBc) {
        this.ds.remove(this.ds.stream().filter(bc -> bc.getMaBaoCao() == maBc).findFirst().get());
    }


    //Thêm báo cáo vào danh sách
    public void themBaoCao(String loai) throws ClassNotFoundException {
        try {
            Class myClass = Class.forName(loai);

            BaoCao bc = (BaoCao) myClass.getDeclaredConstructor(null).newInstance();

            bc.nhapBC();
            this.ds.add(bc);
        } catch (ParseException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void themBaoCao(BaoCao bc) {
        this.ds.add(bc);
    }

    public void hienThiDS() {
        this.ds.forEach(bc -> bc.hienThi());
    }

    public List<BaoCao> getDs() {
        return ds;
    }

    public void setDs(List<BaoCao> ds) {
        this.ds = ds;
    }
}

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.GregorianCalendar;

public enum HoiDong {
    CHU_TICH {
        @Override
        public GiangVien get() {
            GiangVien chuTich = new GiangVien("V", "CT", "CHU TICH", "Thac Si", 5.0, "Good");

            return chuTich;
        }
    },
    THU_KY {
        @Override
        public GiangVien get() {
            GiangVien thuKy = new GiangVien("V", "THU KY", "THU KY", "Thac Si", 5.0, "Good");

            return thuKy;
        }
    },
    PHAN_BIEN {
        @Override
        public GiangVien get() {
            GiangVien phanBien = new GiangVien("V", "PHAN BIEN", "C", "Thac Si", 5.0, "Good");

            return phanBien;
        }
    },
    UY_VIEN {
        @Override
        public GiangVien get() {
            GiangVien uyVien = new GiangVien("V", "UY VIEN", "UY VIEN", "Thac Si", 5.0, "Good");

            return uyVien;
        }
    },
    HUONG_DAN {
        @Override
        public GiangVien get() {
            GiangVien uyVien = new GiangVien("V", "HUONG DAN", "HUONG DAN", "Thac Si", 5.0, "Good");

            return uyVien;
        }
    };

    public abstract GiangVien get();
//        public abstract BigDecimal tinhLai(BigDecimal st);
}

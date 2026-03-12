package Slide1;

public class Xe {
	private String hangXe;
    private int namSanXuat;

    public String getHangXe() {
        return this.hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public int getNamSanXuat() {
        return this.namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }
    public Xe() {
    }
    public Xe(String hangXe, int namSanXuat) {
        this.hangXe = hangXe;
        this.namSanXuat = namSanXuat;
    }

    @Override
    public String toString() {
        System.out.println(" HANG XE: "+this.hangXe);
        System.out.println(" NAM SAN XUAT: "+ this.namSanXuat);
        return "";
    }
}

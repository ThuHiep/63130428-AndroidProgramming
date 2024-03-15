package cntt.edu.lvnangcao.model;

public class Country {
    String TenQG;
    int soLuongDan;
    String tenfileanhlaco;

    public Country(String tenQG, int soLuongDan, String tenfileanhlaco) {
        TenQG = tenQG;
        this.soLuongDan = soLuongDan;
        this.tenfileanhlaco = tenfileanhlaco;
    }

    public String getTenQG() {
        return TenQG;
    }

    public void setTenQG(String tenQG) {
        TenQG = tenQG;
    }

    public int getSoLuongDan() {
        return soLuongDan;
    }

    public void setSoLuongDan(int soLuongDan) {
        this.soLuongDan = soLuongDan;
    }

    public String getTenfileanhlaco() {
        return tenfileanhlaco;
    }

    public void setTenfileanhlaco(String tenfileanhlaco) {
        this.tenfileanhlaco = tenfileanhlaco;
    }
}

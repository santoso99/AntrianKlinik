package skripsi.dita.antrianklinik.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Dita on 13/05/2018.
 */

public class Klinik {
    @SerializedName("kode_ruang")
    @Expose
    private String kode_ruang;

    @SerializedName("ruang")
    @Expose
    private String ruang;

    @SerializedName("nama_dokter")
    @Expose
    private String nama_dokter;

    @SerializedName("hari")
    @Expose
    private String hari;

    @SerializedName("jam_mulai")
    @Expose
    private String jam_mulai;

    @SerializedName("jam_selesai")
    @Expose
    private String jam_selesai;

   /* private String klinik;
    private String jam;
    private String dokter;*/

    public String getKode_ruang() {
        return kode_ruang;
    }
    public void setKode_ruang(String kode_ruang) {
        this.kode_ruang = kode_ruang;
    }

    public String getRuang() {
        return ruang;
    }
    public void setRuang(String ruang) {
        this.ruang = ruang;
    }

    public String getNama_dokter() {
        return nama_dokter;
    }
    public void setNama_dokter(String nama_dokter) {
        this.nama_dokter = nama_dokter;
    }

    public String getHari() {
        return hari;
    }
    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJam_mulai() {
        return jam_mulai;
    }
    public void setJam_mulai(String jam_mulai) {
        this.jam_mulai = jam_mulai;
    }

    public String getJam_selesai() {
        return jam_selesai;
    }
    public void setJam_selesai(String jam_selesai) {
        this.jam_selesai = jam_selesai;
    }

    public Klinik(){

    }
    public Klinik(String ruang) {
        this.ruang = ruang;
    }

    /*public String getKlinik() {
        return klinik;
    }

    public void setKlinik(String klinik) {
        this.klinik = klinik;
    }

    */
}

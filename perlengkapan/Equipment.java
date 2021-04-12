/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perlengkapan;

/**
 *
 * @author Acer Gk
 */
public class Equipment {
    private String paket;
    protected String merk;
    protected String os;
    protected String app;
    protected String u_app;
    private long total;

    public String getPaket() {
        return paket;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    protected String getMerk() {
        return merk;
    }

    protected void setMerk(String merk) {
        this.merk = merk;
    }

    protected String getOs() {
        return os;
    }

    protected void setOs(String os) {
        this.os = os;
    }

    protected String getApp() {
        return app;
    }

    protected void setApp(String app) {
        this.app = app;
    }

    protected String getU_app() {
        return u_app;
    }

    protected void setU_app(String u_app) {
        this.u_app = u_app;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
    
    public void show_e (String paket, String merk, String os, String app, String u_app, long total){
        System.out.println("\nPaket               :" + paket );
        System.out.println("Merk                :" + merk);
        System.out.println("Operating System    :" + os);
        System.out.println("Application         :" + app);
        System.out.println("Utility Application :" + u_app);
        System.out.println("Harga Paket         : Rp." + total);
    }
        
    protected void display_h(String type, String merk, String spec, long harga){
        System.out.println(type);
        System.out.println(merk);
        System.out.println(spec);
        System.out.println(harga);
    }
    
    protected void display_s (String os, String adv_os, String dis_os, String app, String f_app, String u_app, String f_utility)
    {
        System.out.println(os);
        System.out.println(adv_os);
        System.out.println(dis_os);
        System.out.println(app);
        System.out.println(f_app);
        System.out.println(u_app);
        System.out.println(f_utility);
    }
    
    
    
}

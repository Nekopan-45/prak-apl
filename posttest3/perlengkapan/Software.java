package perlengkapan;

public class Software extends Equipment{
    
    private String adv_os;
    private String dis_os;
    private String f_app;
    private String f_utility;
    private static int countSoftware;

    public Software(String os, String app, String u_app, String adv_os, String dis_os, String f_app, String f_utility) {
        super(os, app, u_app);
        this.adv_os = adv_os;
        this.dis_os = dis_os;
        this.f_app = f_app;
        this.f_utility = f_utility;
        countSoftware++;
    }

    public String getUtilapp() {
        return u_app;
    }

    public void setUtilapp(String u_app) {
        this.u_app = u_app;
    }

    public String getF_app() {
        return f_app;
    }

    public void setF_app(String f_app) {
        this.f_app = f_app;
    }

    public String getF_utility() {
        return f_utility;
    }

    public void setF_utility(String f_utility) {
        this.f_utility = f_utility;
    }

    public String getAdv_os() {
        return adv_os;
    }

    public void setAdv_os(String adv_os) {
        this.adv_os = adv_os;
    }

    public String getDis_os() {
        return dis_os;
    }

    public void setDis_os(String dis_os) {
        this.dis_os = dis_os;
    }

    public static int getCountSoftware() {
        return countSoftware;
    }

    public static void setCountSoftware(int countSoftware) {
        Software.countSoftware = countSoftware;
    }
    
    
    @Override
    public void display_s (String os, String adv_os, String dis_os, String app, String f_app, String u_app, String f_utility)
    {
        System.out.println("\nOperating System    :" + os);
        System.out.println("Kelebihan OS        :" + adv_os);
        System.out.println("Kekurangan OS       :" + dis_os);
        System.out.println("Application         :" + app);
        System.out.println("Fungsi App          :" + f_app);
        System.out.println("Utility App         :" + u_app);
        System.out.println("Fungsi App          :" + f_utility);
    }
}

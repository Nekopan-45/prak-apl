package perlengkapan;

public class Main {

    public static void main(String[] args) {
        Software OSWindows = new Software();
        Software OSUbuntu = new Software();
        
        Hardware TypeMouse = new Hardware();
        Hardware TypeKeyboard = new Hardware();
        
        Equipment Ryzen5 = new Equipment();
        Equipment Intel5 = new Equipment();
        
        OSWindows.setOs("Windows 10 Pro");
        OSWindows.setAdv_os("Multitasking lebih optimal dan Lebih mudah dipakai");
        OSWindows.setDis_os("Lisensi yang berbayar");
        OSWindows.setApp("Google Chrome");
        OSWindows.setF_app("Mengakses internet, mendownload data dan masih banyak fungsi lainnya");
        OSWindows.setUtilapp("VLC Media Player");
        OSWindows.setF_utility("Untuk memutar file jenis video dan audio");
        
        OSUbuntu.setOs("Ubuntu Linux");
        OSUbuntu.setAdv_os("Bersifat open source yang artinya gratis");
        OSUbuntu.setDis_os("Tidak mendukung untuk install game");
        OSUbuntu.setApp("File Manager");
        OSUbuntu.setF_app("Mengakses file, mengatur file dan menghapus file");
        OSUbuntu.setUtilapp("AVAST Anti Virus");
        OSUbuntu.setF_utility("Untuk mencegah virus masuk ke komputer");
        
        TypeMouse.setType("Mouse Gaming");
        TypeMouse.setMerk("Gamen GM 1200");
        TypeMouse.setSpec("3200 DPI and RGB Color");
        TypeMouse.setHarga(120000);
        
        TypeKeyboard.setType("Mechanical Gaming Keyboard");
        TypeKeyboard.setMerk("MSI GK-701");
        TypeKeyboard.setSpec("Backlight 7 colors and K/B Weight 620g");
        TypeKeyboard.setHarga(3169000);
        
        Ryzen5.setPaket("PC Gaming Ryzen 5 3500u");
        Ryzen5.setMerk("Acer");
        Ryzen5.setOs("Windows 10 Pro");
        Ryzen5.setApp("Bonus GTA V ");
        Ryzen5.setU_app("Bonus Avast Anti-virus");
        Ryzen5.setTotal(10000000);
        
        Intel5.setPaket("Laptop Gaming Intel 5 Gen 10");
        Intel5.setMerk("Asus");
        Intel5.setOs("Windows 10 Home");
        Intel5.setApp("Bonus Genshin Impact");
        Intel5.setU_app("Bonus Adobe Premiere Pro CC");
        Intel5.setTotal(15000000);
        
        OSWindows.display_s(OSWindows.getOs(), OSWindows.getAdv_os(), OSWindows.getDis_os(), OSWindows.getApp(), OSWindows.getF_app(), OSWindows.getUtilapp(), OSWindows.getF_utility());
        OSUbuntu.display_s(OSUbuntu.getOs(), OSUbuntu.getAdv_os(), OSUbuntu.getDis_os(), OSUbuntu.getApp(), OSUbuntu.getF_app(), OSUbuntu.getUtilapp(), OSUbuntu.getF_utility());
        TypeMouse.display_h(TypeMouse.getType(),TypeMouse.getMerk() , TypeMouse.getSpec(), TypeMouse.getHarga());
        TypeKeyboard.display_h(TypeKeyboard.getType(),TypeKeyboard.getMerk() , TypeKeyboard.getSpec(), TypeKeyboard.getHarga());
        Ryzen5.show_e(Ryzen5.getPaket(), Ryzen5.getMerk(), Ryzen5.getOs(), Ryzen5.getApp(), Ryzen5.getU_app(), Ryzen5.getTotal());
        Intel5.show_e(Intel5.getPaket(), Intel5.getMerk(), Intel5.getOs(), Intel5.getApp(), Intel5.getU_app(), Intel5.getTotal());
    }
    
}

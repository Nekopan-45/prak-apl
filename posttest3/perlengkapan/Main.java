package perlengkapan;

public class Main {

    public static void main(String[] args) {
        Software OSWindows = new Software(
                "Windows 10 Pro",
                "Multitasking lebih optimal dan Lebih mudah dipakai",
                "Lisensi yang berbayar",
                "Google Chrome",
                "Mengakses internet, mendownload data dan masih banyak fungsi lainnya",
                "VLC Media Player",
                "Untuk memutar file jenis video dan audio"
        );
        Software OSUbuntu = new Software(
                "Ubuntu Linux",
                "Bersifat open source yang artinya gratis",
                "Tidak mendukung untuk install game",
                "File Manager",
                "Mengakses file, mengatur file dan menghapus file",
                "AVAST Anti Virus",
                "Untuk mencegah virus masuk ke komputer"
        );
        
        Hardware TypeMouse = new Hardware(
                "Mouse Gaming",
                "Gamen GM 1200",
                "3200 DPI and RGB Color",
                120000
        );
        
        Hardware TypeKeyboard = new Hardware(
                "Mechanical Gaming Keyboard",
                "MSI GK-701",
                "Backlight 7 colors and K/B Weight 620g",
                3169000
        );
        
        Equipment Ryzen5 = new Equipment(
                "PC Gaming Ryzen 5 3500u",
                "Acer",
                "Windows 10 Pro",
                "Bonus GTA V ",
                "Bonus Avast Anti-virus",
                10000000
        );
        
        Equipment Intel5 = new Equipment(
                "Laptop Gaming Intel 5 Gen 10",
                "Asus",
                "Windows 10 Home",
                "Bonus Genshin Impact",
                "Bonus Adobe Premiere Pro CC",
                15000000
        );
        
        OSWindows.display_s(OSWindows.getOs(), OSWindows.getAdv_os(), OSWindows.getDis_os(), OSWindows.getApp(), OSWindows.getF_app(), OSWindows.getUtilapp(), OSWindows.getF_utility());
        OSUbuntu.display_s(OSUbuntu.getOs(), OSUbuntu.getAdv_os(), OSUbuntu.getDis_os(), OSUbuntu.getApp(), OSUbuntu.getF_app(), OSUbuntu.getUtilapp(), OSUbuntu.getF_utility());
        System.out.println("\nJumlah Software     : " + Software.getCountSoftware());
        TypeMouse.display_h(TypeMouse.getType(),TypeMouse.getMerk() , TypeMouse.getSpec(), TypeMouse.getHarga());
        TypeKeyboard.display_h(TypeKeyboard.getType(),TypeKeyboard.getMerk() , TypeKeyboard.getSpec(), TypeKeyboard.getHarga());
        System.out.println("\nJumlah Hardware     : " + Hardware.getCountHardware());
        Ryzen5.show_e(Ryzen5.getPaket(), Ryzen5.getMerk(), Ryzen5.getOs(), Ryzen5.getApp(), Ryzen5.getU_app(), Ryzen5.getTotal());
        Intel5.show_e(Intel5.getPaket(), Intel5.getMerk(), Intel5.getOs(), Intel5.getApp(), Intel5.getU_app(), Intel5.getTotal());
        System.out.println("\nJumlah Paket Gaming : " + Equipment.getCountEquipment());
    }
    
}

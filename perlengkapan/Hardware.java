package perlengkapan;

public class Hardware extends Equipment{
    private long harga;
    private String spec;
    private String type;
    
    public String getSpec() 
    {
        return spec;
    }

    public void setSpec(String spec) 
    {
        this.spec = spec;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public long getHarga()
    {
        return harga;
    }
    
    public void setHarga(long harga)
    {
        this.harga = harga;
    }
    @Override
    public void display_h(String type, String merk, String spec, long harga)
    {
        System.out.println("\nJenis            :" + type);
        System.out.println("Merk             :" + merk);
        System.out.println("Spesifikasi      :" + spec);
        System.out.println("Harga            :Rp. " + harga);
    }
    
}
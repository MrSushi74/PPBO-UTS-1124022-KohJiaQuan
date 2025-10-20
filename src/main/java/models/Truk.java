package models;

public class Truk extends LandVehicle implements Kargoable{
    private int jumlahRoda;

    public Truk(String nama, int jumlahRoda){
        super(nama, BahanBakar.DIESEL, 3, jumlahRoda);
    }

    @Override
    public String getDetails(){
        return "Truk "+super.getNama()+", Kapasitas Orang : "+super.getKapasitasOrang()+", Jumlah Roda : "+this.getJumlahRoda();
    }

    @Override
    public void loadKargo(){
        System.out.println("Masuk Barang Truk");
    }
    public void unloadKargo(){
        System.out.println("Turun Barang Truk");
    }
}

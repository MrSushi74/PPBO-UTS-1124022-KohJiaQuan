package models;

public class Pesawat extends AirVehicle implements Kargoable{
    private boolean isTempur;
    private int jumlahRoda;

    public Pesawat(String nama, int kapasitasOrang, boolean isTempur, int jumlahRoda){
        super(nama, kapasitasOrang);
        this.isTempur = isTempur;
        this.jumlahRoda = jumlahRoda;
    }

    public boolean getIsTempur(){
        return this.isTempur;
    }
    public int getJumlahRoda(){
        return this.jumlahRoda;
    }

    @Override
    public String getDetails(){
        return "Pesawat " + super.getNama()+", Kapasitas Orang : "+super.getKapasitasOrang()+", Jumlah roda : "+this.getJumlahRoda();
    }

    @Override
    public void loadKargo(){
        System.out.println("Masuk Barang Pesawat");
    }
    public void unloadKargo(){
        System.out.println("Turun Barang Pesawat");
    }
}

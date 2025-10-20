package models;

public abstract class LandVehicle extends Kendaraan{
    private int jumlahRoda;

    public LandVehicle (String nama, BahanBakar bahanBakar, int kapasitasOrang, int jumlahRoda){
        super(nama, bahanBakar, kapasitasOrang);
        this.jumlahRoda = jumlahRoda;
    }

    public int getJumlahRoda(){
        return this.jumlahRoda;
    }
}

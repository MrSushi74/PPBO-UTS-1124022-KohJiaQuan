package models;

public abstract class AirVehicle extends Kendaraan{
    public AirVehicle(String nama, int kapasitasOrang){
        super(nama, BahanBakar.AVTUR, kapasitasOrang);
    }
}

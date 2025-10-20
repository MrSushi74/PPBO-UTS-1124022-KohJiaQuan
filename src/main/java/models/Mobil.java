package models;

public class Mobil extends LandVehicle{

    public Mobil (String nama, BahanBakar bahanBakar, int kapasitasOrang){
        super(nama, bahanBakar, kapasitasOrang,4);
    }

    @Override
    public String getDetails(){
        return "Mobil "+super.getNama()+", Kapasitas Orang : "+super.getKapasitasOrang()+", Jumlah Roda : "+this.getJumlahRoda();
    }
}

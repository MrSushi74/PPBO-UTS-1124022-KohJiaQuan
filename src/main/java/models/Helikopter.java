package models;

public class Helikopter extends Kendaraan{
    private int jumlahBalingBaling;

    public Helikopter(String nama, int kapasitasOrang, int jumlahBalingBaling){
        super(nama, BahanBakar.AVTUR, kapasitasOrang);
        this.jumlahBalingBaling = jumlahBalingBaling;
    }

    public int getJumlahBalingBaling(){
        return this.jumlahBalingBaling;
    }

    @Override
    public String getDetails(){
        return "Helikopter "+super.getNama()+", kapasitas orang : "+super.getKapasitasOrang()+", Jumlah Roda : "+this.getJumlahBalingBaling();
    }
}

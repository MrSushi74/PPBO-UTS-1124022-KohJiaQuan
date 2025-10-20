package models;

public abstract class Kendaraan {
    private String nama;
    private BahanBakar bahanBakar;
    private int kapasitasOrang;


    public Kendaraan(String nama, BahanBakar bahanBakar, int kapasitasOrang){
        this.nama = nama;
        this.bahanBakar = bahanBakar;
        this.kapasitasOrang = kapasitasOrang;
    }

    public BahanBakar getBahanBakar (){
        return this.bahanBakar;
    }

    public String getNama (){
        return this.nama;
    }

    public int getKapasitasOrang(){
        return this.kapasitasOrang;
    }

    public String getBahanBakarToString(){
        switch (bahanBakar){
            case BENSIN :
                return "Besi";
            case DIESEL :
                return "Diesel";
            case AVTUR  :
                return "Avtur";
        }
        return "Non-Existent";
    }

    public abstract String getDetails();
}

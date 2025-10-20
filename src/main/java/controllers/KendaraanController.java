package controllers;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class KendaraanController {
    List<Kendaraan> kendaraanList;

    public KendaraanController(){
        this.kendaraanList = new ArrayList<>();
    }

    //mobil
    public void addKendaraan(String nama, BahanBakar bahanBakar, int kapasitasOrang){
        this.kendaraanList.add(new Mobil(nama, bahanBakar, kapasitasOrang));
    }

    //Truk
    public void addKendaraan(String nama, int jumlahRoda){
            this.kendaraanList.add(new Truk(nama, jumlahRoda));
    }

    //Helikopter
    public void addKendaraan(String nama, int kapasitasOrang, int jumlahBalingBaling){
        this.kendaraanList.add(new Helikopter(nama, kapasitasOrang, jumlahBalingBaling));
    }

    //Pesawat
    public void addKendaraan(String nama, int kapasitasOrang, boolean isTempur, int jumlahRoda){
        this.kendaraanList.add(new Pesawat(nama, kapasitasOrang, isTempur, jumlahRoda));
    }

    //getAll
    public List<Kendaraan> getAll(){
        return this.kendaraanList;
    }
}

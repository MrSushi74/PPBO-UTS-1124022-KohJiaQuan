package views;

import controllers.KendaraanController;
import models.BahanBakar;
import models.Kendaraan;
import utils.CLIUtils;
import java.util.List;

public class KendaraanView {
    KendaraanController kendaraanController;

    public KendaraanView(){
        kendaraanController = new KendaraanController();
    }

    public void render() {
        this.printMenu();
        int menu = CLIUtils.getInt();
        CLIUtils.getString();
        while (menu != 0) {
            switch (menu) {
                case 1:
                    this.handleTambahKendaraan();
                    break;
                case 2:
                    this.handlePrintKendaraan();
                    break;
                case 3:
                    this.renderListView(true);
                    break;
                case 0:
                    return;
            }
            this.printMenu();
            menu = CLIUtils.getInt();
            CLIUtils.getString();
        }
    }

    private void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah kendaraan");
        System.out.println("2. Tampilkan semua kendaraan");
        System.out.println("3. Urutkan kendaraan berdasarkan kapasitas");
        System.out.println("0. Keluar");
    }

    private void handleTambahKendaraan() {
        String tipe = CLIUtils.askForString("Masukkan Tipe kendaraan: (mobil/truk/helikopter/pesawat)");
        switch (tipe) {
            case "mobil":
                String namaMobil = CLIUtils.askForString("Input Nama Mobil");
                int kapasitasMobil = CLIUtils.askForInt("Input Kapasitas Mobil");
                BahanBakar bahan = getBahanBakar();
                kendaraanController.addKendaraan(namaMobil,bahan,kapasitasMobil);
                break;
            case "truk":
                String namaTruk = CLIUtils.askForString("Input Nama Truk");
                int jumlahRoda = CLIUtils.askForInt("Input Jumlah Roda Truk");
                kendaraanController.addKendaraan(namaTruk, jumlahRoda);
                break;
            case "helikopter":
                String namaHelikopter = CLIUtils.askForString("Input Nama Truk");
                int kapasitasHelikopter = CLIUtils.askForInt("Input Kapasitas Helikopter");
                int jumlahBalingBaling = CLIUtils.askForInt("Input Jumlah Baling Baling Helikopter");
                kendaraanController.addKendaraan(namaHelikopter, kapasitasHelikopter, jumlahBalingBaling);
                break;
            case "pesawat":
                String namaPesawat = CLIUtils.askForString("Input Nama Pesawat");
                int kapasitasPesawat = CLIUtils.askForInt("Input Kapasitas Pesawat");
                int jumlahRodaPesawat = CLIUtils.askForInt("Input Jumlah Roda Pesawat");
                int isTempur = CLIUtils.askForInt("Tempur atau bukan? (1 true/0 false)");
                kendaraanController.addKendaraan(namaPesawat,kapasitasPesawat, isTempur == 1, jumlahRodaPesawat);
                break;
        }
    }
    private BahanBakar getBahanBakar(){
        int choice = CLIUtils.askForInt("1.BENSIN 2.DIESEL 3.AVTUR");
        switch (choice){
            case 1 :
                return BahanBakar.BENSIN;
            case 2 :
                return BahanBakar.DIESEL;
            case 3 :
                return BahanBakar.AVTUR;
        }
        return BahanBakar.BENSIN;
    }


    private void handlePrintKendaraan() {
        List<Kendaraan> kendaraanList = this.kendaraanController.getAll();
        for (int i = 0; i < kendaraanList.size(); i++) {
            Kendaraan kendaraan = kendaraanList.get(i);
            System.out.println(kendaraan.getDetails());
        }
    }

    public void renderListView(boolean sortedByVolumeAscending) {
        var kendaraanObject = kendaraanController.getAll();
        kendaraanObject.sort(new Object3DComparator(sortedByVolumeAscending));
        handleSortKendaraan(kendaraanObject);
    }

    private void handleSortKendaraan(List<Kendaraan> kendaraanList) {
        for (int i = 0; i < kendaraanList.size(); i++) {
            Kendaraan kendaraanObject = kendaraanList.get(i);
            System.out.println(kendaraanObject.getDetails());
        }
    }
}

package views;

import models.Kendaraan;

import java.util.Comparator;

public class Object3DComparator implements Comparator<Kendaraan> {
    boolean isAscending;

    public Object3DComparator() {
        this(true);
    }

    public Object3DComparator(boolean isAscending) {
        this.isAscending = isAscending;
    }

    @Override
    public int compare(Kendaraan k1, Kendaraan k2) {
        boolean isO1LargerThanO2 = k1.getKapasitasOrang() > k2.getKapasitasOrang();
        if (isAscending != isO1LargerThanO2) {
            return -1;
        }
        return 1;
    }
}

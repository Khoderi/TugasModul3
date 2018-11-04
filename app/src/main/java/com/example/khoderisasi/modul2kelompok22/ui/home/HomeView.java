package com.example.khoderisasi.modul2kelompok22.ui.home;

import com.example.khoderisasi.modul2kelompok22.data.model.DataCar;

import java.util.List;

public interface HomeView {
    void successShowCar(List<DataCar> dataCars);
    void failedShowCar(String message);

}

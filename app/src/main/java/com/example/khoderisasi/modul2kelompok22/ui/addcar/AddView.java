package com.example.khoderisasi.modul2kelompok22.ui.addcar;


public interface AddView {

    String getName();

    String getMerk();

    String getModel();

    String getYear();

    void successAddCar();

    void failedAddCar();
}
package com.company.hw3;

import java.time.LocalDate;

public class PersonelData {

    private LocalDate birthDate;
    private String address;
    private long ssn;

    public PersonelData(LocalDate birthDate, long ssn){
        this.birthDate = birthDate;
        this.ssn = ssn;

    }

    PersonelData(int year, int month, int day, long ssn){

        this.birthDate = LocalDate.of(year,month,day);

    }

    public LocalDate getBirthDate(){
        return birthDate;


    }
    public String getAddress(){
        return address;


    }
    public long getSsn(){
        return ssn;

    }

    public String setAddress(String address){
        return this.address = address;

    }
}

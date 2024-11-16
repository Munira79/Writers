package com.example.writer;


import java.io.Serializable;

public class Writer implements Serializable {
    private String name;
    private String birthDate;
    private String deathDate;
    private String[] notableWorks;

    public Writer(String name, String birthDate, String deathDate, String[] notableWorks) {
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.notableWorks = notableWorks;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getDeathDate() {
        return deathDate;
    }

    public String[] getNotableWorks() {
        return notableWorks;
    }
}


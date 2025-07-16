package br.edu.unifei.ecot12;

import java.util.ArrayList;
import java.util.Calendar;

public class Event {
    private String name;
    private Calendar date;
    private String description;
    private ArrayList<Being> beings = new ArrayList<Being>();
    private Locality local;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Being> getBeings() {
        return beings;
    }

    public void setBeings(ArrayList<Being> beings) {
        this.beings = beings;
    }

    public Locality getLocal() {
        return local;
    }

    public void setLocal(Locality local) {
        this.local = local;
    }

}

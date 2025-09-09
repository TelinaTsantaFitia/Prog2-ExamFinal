package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pointage {
    private LocalDate date;
    private List<Mission> missions = new ArrayList<>();

    public Pointage(LocalDate date) {
        this.date = date;
    }

    public void ajouterMission(Mission m) {
        missions.add(m);
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public LocalDate getDate() {
        return date;
    }



}


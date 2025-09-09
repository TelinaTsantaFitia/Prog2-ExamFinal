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

    public static boolean pointageDay(Pointage p) {
        double total = 0;
        for (Mission m : p.getMissions()) {
            double q = m.getQuota();
            if (q <= 0 || q > 1) throw new IllegalArgumentException("Quota invalide : " + q);
            total += q;
        }
        return Math.abs(total - 1.0) < 0.0001;
    }

    public static long getDays(Prestataire p, LocalDate debut, LocalDate fin) {
        return p.getPointages().stream()
                .filter(pt -> !pt.getDate().isBefore(debut) && !pt.getDate().isAfter(fin))
                .filter(pt -> pt.getMissions().stream().noneMatch(m ->
                        m.getType() == Mission.TypeTravail.ABS_PAYÉE ||
                                m.getType() == Mission.TypeTravail.ABS_NON_PAYÉE))
                .count();
    }

    public static double calculerSalaire(Prestataire p, LocalDate debut, LocalDate fin) {
        long jours = getDays(p, debut, fin);
        return jours * p.getTjm();
    }

}


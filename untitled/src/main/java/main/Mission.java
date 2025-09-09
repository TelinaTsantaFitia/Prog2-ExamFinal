package main;

public class Mission {
    public enum TypeTravail {
        ENSEIGNEMENT, ADMINISTRATION, COMMUNICATION, RD,
        ABS_PAYÉE, ABS_NON_PAYÉE
    }

    private TypeTravail type;
    private float quota;
    private String description;

    public Mission(TypeTravail type, float quota, String description) {
        if (quota <= 0 || quota > 1) {
            throw new IllegalArgumentException("Quota invalide : " + quota);
        }
        this.type = type;
        this.quota = quota;
        this.description = description;
    }

    public TypeTravail getType() {
        return type;
    }

    public float getQuota() {
        return quota;
    }
}

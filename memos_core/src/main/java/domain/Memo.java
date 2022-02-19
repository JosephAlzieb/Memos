package domain;

import java.time.LocalDate;

public class Memo {

    private int id;
    private  String titel;
    private  final LocalDate von;
    private  final LocalDate bis;
    private  String beschreibung;
    private  boolean erledigt;
    private int person;

    public Memo(int id, String titel, LocalDate von, LocalDate bis, String beschreibung, boolean erledigt, int person) {
        this.id = id;
        this.titel = titel;
        this.von = von;
        this.bis = bis;
        this.beschreibung = beschreibung;
        this.erledigt = erledigt;
        this.person = person;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public LocalDate getVon() {
        return von;
    }


    public LocalDate getBis() {
        return bis;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public boolean isErledigt() {
        return erledigt;
    }

    public void setErledigt(boolean erledigt) {
        this.erledigt = erledigt;
    }


}

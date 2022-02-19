package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class MemoTest {

    @Test
    @DisplayName("Erstelle eine Memo, und später ändere die Beschreibung und Titel")
    void test_1(){
        LocalDateTime von = LocalDateTime.of(2022,1,10,12,00);
        LocalDateTime bis = LocalDateTime.of(2022,1,10,14,00);
        Memo arzt_termin = new Memo(1, "Arzt Termin", von, bis, "Haubtstraße 11", false, 1);
        arzt_termin.setBeschreibung("Haubtstraße 11, Herr Mu");
        arzt_termin.setTitel("Zahnarzt");
        assertThat(arzt_termin.getBeschreibung()).isEqualTo("Haubtstraße 11, Herr Mu");
        assertThat(arzt_termin.getTitel()).isEqualTo("Zahnarzt");
    }

    @Test
    @DisplayName("Memo dauert zwei Stunden")
    void test_2(){
        LocalDateTime von = LocalDateTime.of(2022,1,10,12,00);
        LocalDateTime bis = LocalDateTime.of(2022,1,10,14,00);
        Memo arzt_termin = new Memo(1, "Arzt Termin", von, bis, "Haubtstraße 11", false, 1);
        assertThat(arzt_termin.getDaur()).isEqualTo(2);
    }

    @Test
    @DisplayName("Memo als erledigt markieren")
    void test_3(){
        LocalDateTime von = LocalDateTime.of(2022,1,10,12,00);
        LocalDateTime bis = LocalDateTime.of(2022,1,10,14,00);
        Memo arzt_termin = new Memo(1, "Arzt Termin", von, bis, "Haubtstraße 11", false, 1);

        arzt_termin.setErledigt(true);
        assertThat(arzt_termin.isErledigt()).isEqualTo(true);
    }
}

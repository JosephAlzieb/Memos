package services;

import domain.Memo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import repository.MemoRepository;
import servives.MemoService;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class MemoServiceTest {
    MemoRepository repository = mock(MemoRepository.class);

    @Test
    @DisplayName("eine Memo holen")
    void test_1(){
        LocalDateTime von = LocalDateTime.of(2022,1,10,12,00);
        LocalDateTime bis = LocalDateTime.of(2022,1,10,14,00);
        Memo arzt_termin = new Memo(1, "Arzt Termin", von, bis, "Haubtstraße 11", false, 1);

        MemoService service = new MemoService(repository);
        when(repository.getMemoById(1)).thenReturn(arzt_termin);

        Memo result = service.getMemoById(1);
        verify(repository).getMemoById(anyInt());
        assertThat(result.getTitel()).isEqualTo("Arzt Termin");
    }

    @Test
    @DisplayName("memos von einer Person zeigen")
    void test_2(){
        LocalDateTime von = LocalDateTime.of(2022,1,10,12,00);
        LocalDateTime bis = LocalDateTime.of(2022,1,10,14,00);
        Memo arzt_termin = new Memo(1, "Arzt Termin", von, bis,"Haubtstraße 11", false, 1);
        Memo fussBall = new Memo(2, "Fußball", von, bis, "Bes", false, 1);

        MemoService service = new MemoService(repository);
        when(repository.getMemoByPersonId(anyInt())).thenReturn(List.of(arzt_termin, fussBall));

        List<Memo> result = service.getAlleMemos(1);
        verify(repository).getMemoByPersonId(anyInt());
    }
}

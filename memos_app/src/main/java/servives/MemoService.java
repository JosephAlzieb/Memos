package servives;

import domain.Memo;
import repository.MemoRepository;

import java.util.List;

public class MemoService {

    private MemoRepository repository;

    public MemoService(MemoRepository repository) {
        this.repository = repository;
    }

    public void saveMemo (Memo memo){
        repository.saveMemo(memo);
    }

    public Memo getMemoById (int id){
        return repository.getMemoById(id);
    }

    public List<Memo> getAlleMemos(int id){
        return repository.getMemoByPersonId(id);
    }
}

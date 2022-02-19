package repository;

import domain.Memo;

import java.util.List;

public interface MemoRepository {

    public Memo getMemoById(int id);
    public List<Memo> getMemoByPersonId(int personId);
    public void saveMemo(Memo memo);
}

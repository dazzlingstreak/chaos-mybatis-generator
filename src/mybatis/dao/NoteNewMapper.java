package dao;

import model.NoteNew;

public interface NoteNewMapper {
    int insert(NoteNew record);

    int insertSelective(NoteNew record);

    NoteNew selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NoteNew record);

    int updateByPrimaryKeyWithBLOBs(NoteNew record);

    int updateByPrimaryKey(NoteNew record);
}
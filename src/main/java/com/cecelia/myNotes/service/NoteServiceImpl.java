package com.cecelia.myNotes.service;

import com.cecelia.myNotes.dao.NoteMapper;
import com.cecelia.myNotes.pojo.Note;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteMapper noteMapper;

    public Note getById(int id){
        Note note = new Note();
        note.setId(id);
        Note note1 = noteMapper.selectOne(note);
        return note1;
    }

    public int updateById(Note note){
        return noteMapper.updateByPrimaryKey(note);
    }
}

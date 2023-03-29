package com.cecelia.myNotes.dao;

import com.cecelia.myNotes.pojo.Note;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoteMapper extends tk.mybatis.mapper.common.Mapper<Note> {
}

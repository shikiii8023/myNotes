package com.cecelia.myNotes;

import com.cecelia.myNotes.dao.NoteMapper;
import com.cecelia.myNotes.pojo.Note;
import com.cecelia.myNotes.pojo.User;
import com.cecelia.myNotes.service.NoteServiceImpl;
import com.cecelia.myNotes.service.UserServiceImpl;
import com.cecelia.myNotes.utils.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.time.zone.ZoneRulesProvider;

//@SpringBootTest
@SpringBootTest
@SpringJUnitConfig //没有这个注解，mapper就无法注入
@MapperScan(value = "com.cecelia.myNotes.dao")
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
class MyNotesApplicationTests {

    @Resource
    private UserServiceImpl userService;

    @Autowired
    private NoteServiceImpl noteService;

    @Test
    void testUser() {
        log.info("=========[START]=========");
        log.info(System.getProperty("java.version"));

        //先设置日期为夏令时
        User updateUser = new User();
        updateUser.setId(1);
        updateUser.setCreateTime(DateUtil.stringToDate("1948-05-02"));
        userService.updateById(updateUser);

        //从数据库查询数据
        User getUser = userService.getById(1);
        log.info(getUser.getCreateTime().toString());

        log.info("=========[OVER]=========");
    }

    @Test
    void testNote() {
        log.info("=========[START]=========");
        log.info(System.getProperty("java.version"));
        log.info(ZoneRulesProvider.getVersions("UTC").lastEntry().getKey());

        //先设置日期为夏令时//先设置日期为夏令时
//        Note updateNote = new Note();
//        updateNote.setId(1);
//        updateNote.setCreateTime(DateUtil.stringToDate("1948-05-02"));
//        updateNote.setUpdateTime(DateUtil.stringToDate("1989-04-16"));
//        noteService.updateById(updateNote);

        //从数据库查询数据
        Note getNote = noteService.getById(1);
        log.info(getNote.toString());
        log.info(getNote.getCreateTime().toString());
        log.info(getNote.getUpdateTime().toString());

        //262  1948报错  1989正常

        log.info("=========[OVER]=========");
    }

}

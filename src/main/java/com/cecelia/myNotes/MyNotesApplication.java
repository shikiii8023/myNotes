package com.cecelia.myNotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(value = "com.cecelia.myNotes.dao")
@EntityScan(value = "com.cecelia.myNotes.pojo")
public class MyNotesApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyNotesApplication.class, args);

    }

}

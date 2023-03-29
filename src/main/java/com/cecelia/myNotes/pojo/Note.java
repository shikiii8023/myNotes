package com.cecelia.myNotes.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "notes")
public class Note {

    private int id;

    private String title;

    private String content;

    private int owner;

    private Date createTime;

    private Date updateTime;
}

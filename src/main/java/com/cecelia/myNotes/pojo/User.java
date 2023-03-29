package com.cecelia.myNotes.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user")
public class User {

    private int id;

    private String username;

    private String password;

    private String nickName;

    private int role;

    private String telNo;

    private String status;

    private Date createTime;
}

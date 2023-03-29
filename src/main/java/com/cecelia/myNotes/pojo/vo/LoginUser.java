package com.cecelia.myNotes.pojo.vo;

import com.cecelia.myNotes.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginUser{

    private int id;

    private String username;

    private String password;

    private String nickName;

    private String roleName;

    private String telNo;

    private String status;

    private Date createTime;

    public void setRoleNameByRoleId(User user){
        if (user.getRole() == 1){
            this.setRoleName("系统管理员");
        }else if (user.getRole() == 2){
            this.setRoleName("普通用户");
        }else if (user.getRole() ==3){
            this.setRoleName("游客");
        }
    }

    public void setStatusByStatusId(User user){
        if (user.getStatus().equals("N")){
            this.setStatus("正常使用");
        }else if (user.getStatus().equals("E")){
            this.setStatus("已注销");
        }
    }
}

package com.cecelia.myNotes.controller;

import ch.qos.logback.classic.jmx.MBeanUtil;
import com.cecelia.myNotes.pojo.User;
import com.cecelia.myNotes.pojo.vo.LoginUser;
import com.cecelia.myNotes.service.UserServiceImpl;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.GregorianCalendar;

@RestController
@CrossOrigin
@RequestMapping("/user")
@Log
public class UserController {

    @Resource
    private UserServiceImpl userService;

    @GetMapping("/getOne")
    public LoginUser getOne() throws InvocationTargetException, IllegalAccessException {

        log.info("java.version="+System.getProperty("java.version"));

        User user = userService.getById(1);
        LoginUser loginUser = new LoginUser();
        BeanUtils.copyProperties(loginUser,user);
        loginUser.setRoleNameByRoleId(user);
        loginUser.setStatusByStatusId(user);
        return loginUser;


    }
}

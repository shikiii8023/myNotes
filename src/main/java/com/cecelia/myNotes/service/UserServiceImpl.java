package com.cecelia.myNotes.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cecelia.myNotes.dao.UserMapper;
import com.cecelia.myNotes.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{
}

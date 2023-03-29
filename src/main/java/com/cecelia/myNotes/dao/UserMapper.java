package com.cecelia.myNotes.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cecelia.myNotes.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}

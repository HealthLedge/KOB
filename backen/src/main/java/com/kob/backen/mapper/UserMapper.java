package com.kob.backen.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kob.backen.pojo.User;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}

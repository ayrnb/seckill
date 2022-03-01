package com.gjw.seckill.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gjw.seckill.mapper.UserMapper;
import com.gjw.seckill.pojo.User;
import com.gjw.seckill.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author guojinwu
 * @since 2022-03-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

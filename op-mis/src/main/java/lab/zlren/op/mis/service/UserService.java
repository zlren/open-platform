package lab.zlren.op.mis.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import lab.zlren.op.mis.entity.User;
import lab.zlren.op.mis.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author zlren
 * @date 2017-12-05
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

}

package com.codehuan.service.Impl;

import com.codehuan.pojo.Question;
import com.codehuan.mapper.QuestionMapper;
import com.codehuan.service.QuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Zhang Huan
 * @since 2022-01-27
 */
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements QuestionService {

}

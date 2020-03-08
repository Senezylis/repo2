package com.lms.springboot.service.impl;

import com.lms.springboot.dao.ConfigDao;
import com.lms.springboot.entity.Config;
import com.lms.springboot.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("configService")
public class ConfigServiceImpl implements ConfigService {

    @Autowired
    private ConfigDao configDao;

    @Override
    public Config findById(Integer id) {
        return configDao.getOne(id);
    }
}

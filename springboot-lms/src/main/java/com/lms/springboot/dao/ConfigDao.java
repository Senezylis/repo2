package com.lms.springboot.dao;

import com.lms.springboot.entity.Config;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigDao extends JpaRepository<Config,Integer>{

}

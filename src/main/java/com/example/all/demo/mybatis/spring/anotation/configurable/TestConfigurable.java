package com.example.all.demo.mybatis.spring.anotation.configurable;

import com.example.all.demo.mybatis.spring.anotation.bean.EasyBean;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

@Configurable(preConstruction = true)
@Component
@Data
public class TestConfigurable {

    @Autowired
    private EasyBean easyBean;

}

package com.chaos.mybatis;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 使用java代码方式运行mybatis generator
 */
public class Startup {


    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(ChaosMybatisGeneratorApplication.class, args);

        //读取yml中配置来执行
        String configFilePath = applicationContext.getEnvironment().getProperty("mybatis.generator.configurationFile");
        String overwrite = applicationContext.getEnvironment().getProperty("mybatis.generator.overwrite");
        boolean overwriteFlag = Optional.ofNullable(overwrite).orElse("true").equals("true");

        List<String> warnings = new ArrayList<String>();
        File configFile = new File(configFilePath);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwriteFlag);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);

        for (String warning : warnings) {
            System.out.println(warning);
        }
    }
}

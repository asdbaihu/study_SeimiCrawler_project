package com.baifenjy.seimi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration(exclude={    
        JpaRepositoriesAutoConfiguration.class //��ֹspringboot�Զ����س־û�bean  
          })
@EnableJpaRepositories(basePackages={"cn.itcast.microservice.repository"})
@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages={"cn.itcast.microservice"})
public class SeimiApplication {
    private static final Logger log = LoggerFactory.getLogger(SeimiApplication.class);
    
    public static  void main(String[] args){
        SpringApplication.run(SeimiApplication.class,args);
    }
}

package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

import java.util.Properties;

/**
 * Created by rashmin.gadhvi on 6/1/2016.
 */
@Configuration
public class HibernateConfigFactory {

    private Properties props = new Properties();
    @Bean
    public LocalSessionFactoryBean getSessionFactory(){
        return null;
    }

    private DataSourceFactory getDS(){
        return null;
    }

}

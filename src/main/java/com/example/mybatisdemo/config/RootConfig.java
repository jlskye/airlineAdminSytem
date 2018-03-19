package com.example.mybatisdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@MapperScan("com.example.mybatisdemo.mapper")
@PropertySource("classpath:application.properties")
@Configuration
@ComponentScan(
		basePackages="com.example.mybatisdemo",
		excludeFilters=@ComponentScan.Filter(
				type=FilterType.ANNOTATION, 
				value=org.springframework.stereotype.Controller.class))
public class RootConfig {

	@Value("${jdbc.driver.class}")    
    private String driverClass;    

    @Value("${jdbc.url}")    
    private String url;    

    @Value("${jdbc.user}")    
    private String username;    

    @Value("${jdbc.password}")    
    private String password;    

    @Bean(name = "dataSource")    
    public DataSource dataSource() {    
    	DruidDataSource dataSource = new DruidDataSource();    
        dataSource.setDriverClassName(driverClass);    
        dataSource.setUrl(url);    
        dataSource.setUsername(username);    
        dataSource.setPassword(password);
        return dataSource;    
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
    	SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
    	sessionFactory.setDataSource(dataSource());
    	return sessionFactory.getObject();
    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
      return new DataSourceTransactionManager(dataSource());
    }
}

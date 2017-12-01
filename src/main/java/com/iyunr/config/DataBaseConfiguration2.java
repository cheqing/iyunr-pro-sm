package com.iyunr.config;

//import javax.sql.DataSource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import com.alibaba.druid.pool.DruidDataSource;

/**
 * 数据库连接池配置方法二
 * @author Administrator
 *
 */

//@Configuration
//@EnableTransactionManagement
//public class DataBaseConfiguration2{
//	
//	@Bean
//	@ConfigurationProperties(prefix = "spring.datasource")
//	public DataSource druidDataSource(){
//		return new DruidDataSource();
//	}
//	
//	/**
//	 * 提供sqlSession
//	 * @return
//	 * @throws Exception
//	 */
//	@Bean
//	public SqlSessionFactory sqlSessionFactoryBean() throws Exception{
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(druidDataSource());
//		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//		sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatisMapper/*.xml"));
//		return sqlSessionFactoryBean.getObject();
//	}
//	
//	@Bean
//	public DataSourceTransactionManager transactionManager(){
//		return new DataSourceTransactionManager(druidDataSource());
//	}
//	
//}

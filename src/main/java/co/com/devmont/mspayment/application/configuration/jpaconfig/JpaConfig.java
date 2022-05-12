package co.com.devmont.mspayment.application.configuration.jpaconfig;

import org.apache.commons.dbcp2.BasicDataSource;

//@Configuration
public class JpaConfig {

    //@Bean
    public BasicDataSource getDataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:testdb");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }

}
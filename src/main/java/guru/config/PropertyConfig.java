package guru.config;

import guru.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
//@PropertySources({@PropertySource("classpath:datasource.properties")
//        ,@PropertySource("classpath:jms.properties")})
public class PropertyConfig {
    @Value("${teo.username}")
    String user;

    @Value("${teo.password}")
    String password;

    @Value("${teo.dburl}")
    String url;

    @Value("${teo.jms.username}")
    String jmsUsername;

    @Value("${teo.jms.password}")
    String jmsPassword;

    @Value("${teo.jms.url}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        fakeDataSource.setUser(user);
        fakeDataSource.setJmsUser(jmsUsername);
        fakeDataSource.setJmsPassword(jmsPassword);
        fakeDataSource.setJmsUrl(jmsUrl);

        return fakeDataSource;
    }
}

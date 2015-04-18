package com.recursivechaos.boredgames.configuration;

import com.mongodb.Mongo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "db.mongo")
public class AppConfig {

    // MongoDB Credentials
    private String username;
    private String password;
    private String url;

    /*
    * Database Configuration
    */

    public
    @Bean
    MongoDbFactory mongoDbFactory() throws Exception {
        UserCredentials userCredentials = new UserCredentials(username, password);
        //noinspection deprecation TODO: Update deprecated Mongo()
        return new SimpleMongoDbFactory(new Mongo(url), "boredgamesdb", userCredentials);
    }

    public
    @Bean
    MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }

    /*
    * Getters and Setters
    * */

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

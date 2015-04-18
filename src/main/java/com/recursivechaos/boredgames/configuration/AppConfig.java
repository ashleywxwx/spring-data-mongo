package com.recursivechaos.boredgames.configuration;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.net.UnknownHostException;

@Configuration
public class AppConfig {

    public @Bean
    MongoDbFactory mongoDbFactory() throws UnknownHostException {
        UserCredentials userCredentials = new UserCredentials("testuser", "testpassword");
        //noinspection deprecation - TODO: Update deprecated Mongo()
        return new SimpleMongoDbFactory(new Mongo(), "boredgamesdb", userCredentials);
    }

    public @Bean MongoTemplate mongoTemplate() throws UnknownHostException {
        return new MongoTemplate(mongoDbFactory());
    }

}

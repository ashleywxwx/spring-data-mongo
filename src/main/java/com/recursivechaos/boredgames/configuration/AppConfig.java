package com.recursivechaos.boredgames.configuration;

import com.mongodb.Mongo;
import com.mongodb.WriteConcern;
import org.springframework.context.annotation.Bean;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.net.UnknownHostException;

public class AppConfig {

    public @Bean
    MongoDbFactory mongoDbFactory() throws Exception {
        UserCredentials userCredentials = new UserCredentials("testuser", "testpassword");
        SimpleMongoDbFactory boredgamesdb = new SimpleMongoDbFactory(new Mongo(), "boredgamesdb", userCredentials);
        return boredgamesdb;
    }

    public @Bean MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }

}

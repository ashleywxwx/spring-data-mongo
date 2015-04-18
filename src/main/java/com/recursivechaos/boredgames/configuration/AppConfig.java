package com.recursivechaos.boredgames.configuration;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
public class AppConfig {

    public @Bean
    MongoDbFactory mongoDbFactory() throws Exception {
        UserCredentials userCredentials = new UserCredentials("testuser", "testpassword");
        return new SimpleMongoDbFactory(new Mongo(), "boredgamesdb", userCredentials);
    }

    public @Bean MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }

}

package org.springsource.sawt.ioc.basicioc.qualifiers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springsource.sawt.ioc.basicioc.qualifiers.annotation.AndroidStore;
import org.springsource.sawt.ioc.basicioc.qualifiers.annotation.IOsStore;

@Configuration
public class Config {

    @Bean
    public Client client() {
        return new Client();
    }

    @Bean(name = "ios")
    @IOsStore
    public ItunesBookShop itunesBookShop() {
        return new ItunesBookShop();
    }

    @Bean(name = "android")
    @AndroidStore
    public AmazonBookShop amazonBookShop() {
        return new AmazonBookShop();
    }
}

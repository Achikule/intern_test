package com.example.intern_test.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {


    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository) {
        return args -> {
            Book harry_potter_1 = new Book("Philosopher's Stone", "J.K. Rowling", "01/09/1998",
                    "0590353403");
            Book harry_potter_2 = new Book("Chamber of Secrets", "J.K. Rowling", "01/09/2000",
                    "0439064872");

            repository.saveAll(List.of(harry_potter_1, harry_potter_2));
        };
    }
}

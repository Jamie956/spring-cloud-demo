package org.example.annotation_autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class X {
    @Bean
    public X x1() {
        //debug
        return new X();
    }

    @Bean
    public X x2() {
        return new X();
    }
}
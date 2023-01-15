package org.launchcode.demoauthentication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig  extends WebSecurityConfigurerAdapter{

    //@Bean
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().
//                 disable()
//                .authorizeRequests()
//                .antMatchers(HttpMethod.OPTIONS, "/**")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic();
//            //
        http.cors();

    }



//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        // ...
//        http.cors();
////        http.csrf().
//                 disable()
//                .authorizeRequests()
//                .antMatchers(HttpMethod.OPTIONS, "/**")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic();
//
//        return http.build();
//    }



}

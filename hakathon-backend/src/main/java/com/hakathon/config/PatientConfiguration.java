package com.hakathon.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class PatientConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain	(HttpSecurity http) throws Exception {

        http.authorizeRequests(
                        authorize->authorize
                                .requestMatchers(HttpMethod.OPTIONS,"/**").permitAll()
                                .requestMatchers("/*").permitAll()
                                .anyRequest().authenticated())


                .formLogin(login->login
                        .loginPage("/login")
                        .usernameParameter("customeremail")
                        .passwordParameter("customerpassword")
                        .loginProcessingUrl("/do-login")
                        .defaultSuccessUrl("/index",true)
                        .failureUrl("/login?error=true")
                        .permitAll())

                .logout(logout->logout
                        .logoutSuccessUrl("/login?logout")
                        .invalidateHttpSession(true)
                        .deleteCookies("JSESSIONID")
                        .permitAll())
                .rememberMe(remember->remember.key("aaa"));

        return http.build();
    }

}

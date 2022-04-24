package com.SchoolRecords.config;

import com.SchoolRecords.controllers.model.PageDefinition;
import com.SchoolRecords.data.enums.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import java.util.List;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter
{

    @Autowired
    @Qualifier(value = "customUserDetailsService")
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers(PageDefinition.filterPagesByRoles(List.of(Role.ADMIN)).stream().map(PageDefinition::getUrl).toArray(String[]::new))
                .hasAnyAuthority(Role.ADMIN.name())
                .antMatchers(PageDefinition.filterPagesByRoles(List.of(Role.INSTRUCTOR)).stream().map(PageDefinition::getUrl).toArray(String[]::new))
                .hasAnyAuthority(Role.INSTRUCTOR.name())
                .antMatchers(PageDefinition.filterPagesByRoles(List.of(Role.STUDENT)).stream().map(PageDefinition::getUrl).toArray(String[]::new))
                .hasAnyAuthority(Role.STUDENT.name())
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .defaultSuccessUrl("/")
                .failureUrl("/login?error=true")
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
    }

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }

}

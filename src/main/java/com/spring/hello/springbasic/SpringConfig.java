package com.spring.hello.springbasic;

import com.spring.hello.springbasic.repository.MemberRepository;
import com.spring.hello.springbasic.repository.MemoryMemberRepository;
import com.spring.hello.springbasic.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}

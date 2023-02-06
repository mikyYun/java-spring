package hello.hellospring.service;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig{


    /*
//  jdbc _ before jpa
    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    */

    /*
//  jpa _ before with spring
    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }
     */

    private final MemberRepository memberRepository;

//    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Bean
    public MemberService memberService() {
//        return new MemberService(memberRepository()); // before with Spring
        return new MemberService(memberRepository);
    }

    /*
//    This doesn't need when we use JPA with Spring
    @Bean
    public MemberRepository memberRepository() {
//        return new MemoryMemberRepository(); // java
//        return new JdbcMemberRepository(dataSource); //jdbc
//        return new JpaMemberRepository(em); // jpa
//
    }

     */
/*

    @Bean
    public TimeTraceAop timeTraceAop() {
        return new TimeTraceAop();
    }

 */
}
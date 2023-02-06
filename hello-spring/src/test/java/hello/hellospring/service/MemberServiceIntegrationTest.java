package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@Transactional // @Transactional helps db runs only for testing(create, update, delete) _ roll back after each @Test
class MemberServiceIntegrationTest {


    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

//    @BeforeEach
//    public void beforeEach() {
//        memberRepository = new MemoryMemberRepository();
//        memberService = new MemberService(memberRepository);
//    }

    /*
    Transactional do this
    @AfterEach
    public void afterEach() {
        memberRepository.clearStore();
    }
    */
    @Test
    // Commit // commit to db after test
    void join() {
//        given when then....
//        given
        Member member = new Member();
        member.setName("memberName");

//        when
        Long saveId = memberService.join(member);

//        then
        Member findMember = memberService.findOne(saveId).get();
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void existingMemberException() {
        Member member1 = new Member();
        member1.setName("mem1");

        Member member2 = new Member();
        member2.setName("mem1");

//        when
        memberService.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class, () -> memberService.join(member2));

        Assertions.assertThat(e.getMessage()).isEqualTo("Existing member");

        /*

        try {
            memberService.join(member2);
            fail();
        } catch( IllegalStateException e) {
            Assertions.assertThat(e.getMessage()).isEqualTo("Existing member");
//            Assertions.assertThat(e.getMessage()).isEqualTo("Existing member???"); // failed
        }

         */
    }

    @Test
    void findMembers() {
    }



    @Test
    void findOne() {
    }
}
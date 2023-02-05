package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// Controller -> Service -> Repository
@Controller
public class MemberController {

    /*
    3.
    //cons.. : setMethod has to be public

    private MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }
     */


  /*
  2.
    @Autowired private MemberService memberService;
  */

/*
1.

*/
private final MemberService memeberService;

    @Autowired
    public MemberController(MemberService memeberService) {
        this.memeberService = memeberService;
    }
}


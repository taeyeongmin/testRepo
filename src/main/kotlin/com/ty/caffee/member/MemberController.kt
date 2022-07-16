package com.ty.caffee.member

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/member")
class MemberController {

    @GetMapping("/login")
    fun getLogin():String{
        System.err.println("로그인 페이지 이동")
        return "layout/member/login"
    }

    @GetMapping("/loginPostNaver")
    fun loginPostNamver():String{

        return "/"
    }

}



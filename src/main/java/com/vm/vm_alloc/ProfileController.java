package com.vm.vm_alloc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class ProfileController {
    @RequestMapping("/")
    public String cv(){
        return "cv.html";
    }

}

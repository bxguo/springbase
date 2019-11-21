package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: bxguo
 * @time: 2019/11/21 16:00
 */
@Controller
public class IndexController {
    @PostMapping("/ming")
    public void ming(MultipartFile file){
        System.out.println("asda-----");
    }
}

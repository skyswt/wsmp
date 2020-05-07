package cn.jxufe.wsmp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/instance")
public class InstanceController {

    @RequestMapping(value = "instance_form", method = RequestMethod.GET)
    public String loadForm() {
        return "instance_form";
    }

}

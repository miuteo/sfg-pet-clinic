package guru.springframework.sfgpetclinic.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class IndexController {

    @RequestMapping({"","/","/index","index.html"})
    public String index(){
        log.debug("into index controller");
        return "index";
    }
}

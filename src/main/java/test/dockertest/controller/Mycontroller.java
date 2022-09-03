package test.dockertest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class Mycontroller {

    @GetMapping("/message")
    public String getMessage(){
        return  "Docker-Test application is Up and running";
    }

}

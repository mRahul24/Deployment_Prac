package co.pragra.learning.docker_prac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/Docker")
public class DockerHello {

    @GetMapping
    public String getName(){
        return "Welcome Rahul";
    }
}

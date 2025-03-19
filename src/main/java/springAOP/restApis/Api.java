package springAOP.restApis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springAOP.service.UserService;

@RestController
public class Api {

        @Autowired
        private UserService userService;

        @GetMapping("/")
        public String userLogin(){
            //call the method in MainService , which in true calls  the UserService
           userService.logIn();
           return "User login endPoint called sucessfully!";



        }
    }


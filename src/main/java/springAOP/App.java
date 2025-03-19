package springAOP;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(scanBasePackages =  "springAOP")
@EnableAspectJAutoProxy
public class App {
     public static void main(String[] args) {
          SpringApplication.run(App.class , args);

     }
}

package springAOP.logging;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logging {

    @Before("execution(public void springAOP.service.UserService.logIN())")
    public void loggingAdvice1(){
        System.out.println("Before advice for logIn is executed");
    }

    @After("execution(public void springAOP.service.UserService.logIN())")
    public void loggingAdvice(){
        System.out.println("Running After Advice for logIN");
    }

    @Around("execution(public void springAOP.service.UserService.logIn())")
        public void loggingAdvice3(){
            System.out.println("Before and After invoking method logIn");
    }

    @AfterThrowing("execution(public void springAOP.service.UserService.logOut())")
        public void loggingAdvice4(){
             System.out.println("Exception thrown in logout method");
    }

    @AfterReturning("execution(public void springAOP.service.UserService.logOut())")
      public void loggingAdvice5(){
        System.out.println("After Returning advice for logOut is run");
      }

    @Pointcut("execution(public * springAOP.service.UserService.*(..))")
     public void pointCut(){
    }

    @Pointcut("execution(public * springAOP.service.UserService.*(..))")
      public void pointCut1(){

    }

    @Before("pointCut() || pointCut1")
     public void loggingAdvice6(){
        System.out.println("Before advice using pointcut is executed");
    }

}


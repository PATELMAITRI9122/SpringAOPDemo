package demo;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    //point cut - what we have to run
    //Join Point-at what location we want to run
    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforeLogger(JoinPoint jp){
        //System.out.println(jp.getSignature());
       String arg =  jp.getArgs()[0].toString();
        System.out.println("Before Loggers with Argument " + arg);
    }

    @After("execution(* *.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After Logger");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()",returning = "retVal")
    public void afterReturnning(String retVal){

        try {
            System.out.println("After Returning: " + retVal);
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}

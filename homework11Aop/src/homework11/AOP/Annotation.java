package homework11.AOP;

import java.rmi.AccessException;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Annotation {



@Pointcut("execution(* ee.itcollege.*.*(..))") 

private void selectAll(){   
	} 

@Before("selectAll()")
public void beforeAdvice(){
	System.out.println("Before  executed");
}

@After("selectAll()")
public void afterAdvice(){
	System.out.println("After  executed.");
}

@AfterReturning(pointcut = "selectAll()", returning="retVal")
public void afterReturningAdvice(Object retVal) {
	System.out.println("Afterreturing executed");
	
}

@AfterThrowing(pointcut = "selectAll()", throwing ="ex")
public void afterThrowingAdvice(AccessException ex){
	System.out.println("Throwing  executed");
	System.out.println("Exception: " + ex.getMessage());
}




}

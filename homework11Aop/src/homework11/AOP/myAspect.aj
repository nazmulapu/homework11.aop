package homework11.AOP;

public aspect myAspect {
	
	pointcut fonction():
		call (void homework11.AOP.AOPdemo.methodeOne(*));
	
	after(): fonction(){
		System.out.println("asptect after ...");
	}

	before(): fonction(){
		System.out.println("....aspect before");
	}
}

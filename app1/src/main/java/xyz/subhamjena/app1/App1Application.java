package xyz.subhamjena.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(App1Application.class, args);

		demo1 dem1 = run.getBean(demo1.class);
		dem1.msg();
		dem1.call();
		

		demo2 dem2 = run.getBean(demo2.class);
		dem2.student("subhanm jena",123);
		int math = 25;
		System.out.println("Secured mark is :" + dem2.mark(math));



		demo3 dem3 = run.getBean(demo3.class);

		dem3.add(10,20);
		System.out.println("substration of two no is :" +  dem3.subtract(10,20));
	}

}

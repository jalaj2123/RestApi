package WebkorpsJpa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;




@SpringBootApplication
public class DemoWebkorpsApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoWebkorpsApplication.class, args);
		JpaIWebkorps j=context.getBean(JpaIWebkorps.class);
		User user=new User();
		user.setName("jalaj");
		j.save(user);
	}

}
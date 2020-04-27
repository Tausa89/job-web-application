import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jobwebapp.*"})
@EntityScan(basePackages = {"com.jobwebapp.*"})
@EnableJpaRepositories(basePackages = {"com.jobwebapp.*"})
public class Main {


    public static void main(String[] args) {

        SpringApplication.run(Main.class);

    }
}

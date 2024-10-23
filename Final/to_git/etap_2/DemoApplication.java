import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserService userService) {
        return args -> {
            // Пример: Получить баланс
            double balance = userService.getBalance(1L);
            System.out.println("Баланс пользователя 1: " + balance);
            
            // Пример: Пополнить баланс
            userService.putMoney(1L, 100);
            System.out.println("Баланс пользователя 1 после пополнения: " + userService.getBalance(1L));
            
            // Пример: Снятие денег
            if (userService.takeMoney(1L, 50)) {
                System.out.println("Снятие 50 окончено успешно");
            } else {
                System.out.println("Недостаточно средств");
            }
            System.out.println("Баланс пользователя 1 после снятия: " + userService.getBalance(1L));
        };
    }
}
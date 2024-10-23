
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OperationRepository operationRepository;

    // Остальной код...

    @Transactional
    public String takeMoney(Long userId, double amount) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            if (user.getBalance() >= amount) {
                user.setBalance(user.getBalance() - amount);
                userRepository.save(user);
                
                // Добавляем запись в таблицу операций
                Operation operation = new Operation();
                operation.setUserId(userId);
                operation.setOperationType(1); // Тип операции: 1 - снятие
                operation.setAmount(amount);
                operation.setDate(LocalDateTime.now().toString());
                operationRepository.save(operation);
                
                return "1"; // Успех
            } else {
                return "0"; // Недостаточно средств
            }
        }
        return "-1"; // Пользователь не найден
    }

    @Transactional
    public String putMoney(Long userId, double amount) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            user.setBalance(user.getBalance() + amount);
            userRepository.save(user);
            
            // Добавляем запись в таблицу операций
            Operation operation = new Operation();
            operation.setUserId(userId);
            operation.setOperationType(2); // Тип операции: 2 - пополнение
            operation.setAmount(amount);
            operation.setDate(LocalDateTime.now().toString());
            operationRepository.save(operation);
            
            return "1"; // Успех
        }
        return "0"; // Ошибка
    }

    public List<Operation> getOperationList(Long userId, String startDate, String endDate) {
        if (startDate != null && endDate != null) {
            return operationRepository.findByUserIdAndDateBetween(userId, startDate, endDate);
        } else {
            return operationRepository.findByUserId(userId);
        }
    }
}
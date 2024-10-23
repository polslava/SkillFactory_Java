
@Service
public class BankService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OperationRepository operationRepository;

    public double getBalance(Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        return user != null ? user.getBalance() : -1;
    }

    public String takeMoney(Long userId, double amount) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            if (user.getBalance() >= amount) {
                user.setBalance(user.getBalance() - amount);
                userRepository.save(user);
                return "1"; // Успех
            } else {
                return "0"; // Недостаточно средств
            }
        }
        return "-1"; // Пользователь не найден
    }

    public String putMoney(Long userId, double amount) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            user.setBalance(user.getBalance() + amount);
            userRepository.save(user);
            return "1"; // Успех
        }
        return "0"; // Ошибка
    }

    public List<Operation> getOperationList(Long userId, String startDate, String endDate) {
        return operationRepository.findByUserIdAndDateBetween(userId, startDate, endDate);
    }

    public String transferMoney(Long fromUserId, Long toUserId, double amount) {
        User fromUser = userRepository.findById(fromUserId).orElse(null);
        User toUser = userRepository.findById(toUserId).orElse(null);
        
        if (fromUser != null && toUser != null) {
            if (fromUser.getBalance() >= amount) {
                fromUser.setBalance(fromUser.getBalance() - amount);
                toUser.setBalance(toUser.getBalance() + amount);
                userRepository.save(fromUser);
                userRepository.save(toUser);
                return "1"; // Успех
            } else {
                return "0"; // Недостаточно средств
            }
        }
        return "0"; // Ошибка
    }
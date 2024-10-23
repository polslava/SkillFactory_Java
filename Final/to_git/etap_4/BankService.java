
@Service
public class BankService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OperationRepository operationRepository;

    @Transactional
    public String transferMoney(Long fromUserId, Long toUserId, double amount) {
        User fromUser = userRepository.findById(fromUserId).orElse(null);
        User toUser = userRepository.findById(toUserId).orElse(null);
        
        if (fromUser != null && toUser != null) {
            if (fromUser.getBalance() >= amount) {
                // Уменьшаем баланс отправителя
                fromUser.setBalance(fromUser.getBalance() - amount);
                userRepository.save(fromUser);
                
                // Увеличиваем баланс получателя
                toUser.setBalance(toUser.getBalance() + amount);
                userRepository.save(toUser);
                
                // Создаем операции для обоих пользователей
                Operation operationFrom = new Operation();
                operationFrom.setUserId(fromUserId);
                operationFrom.setTargetUserId(toUserId);
                operationFrom.setOperationType(3); // Тип операции: 3 - перевод
                operationFrom.setAmount(amount);
                operationFrom.setDate(LocalDateTime.now().toString());
                operationRepository.save(operationFrom);
                
                Operation operationTo = new Operation();
                operationTo.setUserId(toUserId);
                operationTo.setTargetUserId(fromUserId);
                operationTo.setOperationType(4); // Тип операции: 4 - получение
                operationTo.setAmount(amount);
                operationTo.setDate(LocalDateTime.now().toString());
                operationRepository.save(operationTo);
                
                return "1"; // Успех
            } else {
                return "0"; // Недостаточно средств
            }
        }
        return "-1"; // Один из пользователей не найден
    }
}
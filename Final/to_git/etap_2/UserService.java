
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public double getBalance(Long userId) {
        User user = userRepository.findById(userId).orElse(null);
        return user != null ? user.getBalance() : -1;
    }

    @Transactional
    public void putMoney(Long userId, double amount) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            user.setBalance(user.getBalance() + amount);
            userRepository.save(user);
        }
    }

    @Transactional
    public boolean takeMoney(Long userId, double amount) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null && user.getBalance() >= amount) {
            user.setBalance(user.getBalance() - amount);
            userRepository.save(user);
            return true;
        }
        return false; // Недостаточно средств
    }
}
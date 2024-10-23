import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/bank")
public class BankController {

    @Autowired
    private UserService userService;

    @GetMapping("/balance/{userId}")
    public ResponseEntity<Map<String, Object>> getBalance(@PathVariable Long userId) {
        Map<String, Object> response = new HashMap<>();
        double balance = userService.getBalance(userId);
        response.put("value", balance);
        response.put("error", balance == -1 ? "Пользователь не найден" : null);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/deposit")
    public ResponseEntity<Map<String, Object>> putMoney(@RequestBody Map<String, Object> request) {
        Long userId = Long.valueOf(request.get("userId").toString());
        double amount = Double.parseDouble(request.get("amount").toString());
        userService.putMoney(userId, amount);
        Map<String, Object> response = new HashMap<>();
        response.put("value", "1"); // Успех
        return ResponseEntity.ok(response);
    }

    @PostMapping("/withdraw")
    public ResponseEntity<Map<String, Object>> takeMoney(@RequestBody Map<String, Object> request) {
        Long userId = Long.valueOf(request.get("userId").toString());
        double amount = Double.parseDouble(request.get("amount").toString());
        boolean success = userService.takeMoney(userId, amount);
        Map<String, Object> response = new HashMap<>();
        response.put("value", success ? "1" : "0");
        response.put("error", success ? null : "Недостаточно средств");
        return ResponseEntity.ok(response);
    }
}

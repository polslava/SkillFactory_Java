
@RestController
@RequestMapping("/api/bank")
public class BankController {

    @Autowired
    private BankService bankService;

    @GetMapping("/balance/{userId}")
    public ResponseEntity<Map<String, Object>> getBalance(@PathVariable Long userId) {
        Map<String, Object> response = new HashMap<>();
        double balance = bankService.getBalance(userId);
        response.put("value", balance);
        response.put("error", balance == -1 ? "не найден пользователь" : null);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/withdraw")
    public ResponseEntity<Map<String, Object>> takeMoney(@RequestBody Map<String, Object> request) {
        Long userId = Long.valueOf(request.get("userId").toString());
        double amount = Double.parseDouble(request.get("amount").toString());
        String result = bankService.takeMoney(userId, amount);
        Map<String, Object> response = new HashMap<>();
        response.put("value", result);
        response.put("error", result.equals("0") ? "Недостаточно средств" : null);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/deposit")
    public ResponseEntity<Map<String, Object>> putMoney(@RequestBody Map<String, Object> request) {
        Long userId = Long.valueOf(request.get("userId").toString());
        double amount = Double.parseDouble(request.get("amount").toString());
        String result = bankService.putMoney(userId, amount);
        Map<String, Object> response = new HashMap<>();
        response.put("value", result);
        response.put("error", result.equals("0") ? "Ошибка" : null);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/operations/{userId}")
    public ResponseEntity<List<Operation>> getOperationList(@PathVariable Long userId,
                                                             @RequestParam(required = false) String startDate,
                                                             @RequestParam(required = false) String endDate) {
        List<Operation> operations = bankService.getOperationList(userId, startDate, endDate);
        return ResponseEntity.ok(operations);
    }

    @PostMapping("/transfer")
    public ResponseEntity<Map<String, Object>> transferMoney(@RequestBody Map<String, Object> request) {
        Long fromUserId = Long.valueOf(request.get("fromUserId").toString());
        Long toUserId = Long.valueOf(request.get("toUserId").toString());
        double amount = Double.parseDouble(request.get("amount").toString());
        String result = bankService.transferMoney(fromUserId, toUserId, amount);
        Map<String, Object> response = new HashMap<>();
        response.put("value", result);
        response.put("error", result.equals("0") ? "Ошибка" : null);
        return ResponseEntity.ok(response);
    }
}
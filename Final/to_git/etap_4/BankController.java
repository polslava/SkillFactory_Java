
@PostMapping("/transfer")
public ResponseEntity<String> transferMoney(
        @RequestParam Long fromUserId,
        @RequestParam Long toUserId,
        @RequestParam double amount) {
    
    String result = bankService.transferMoney(fromUserId, toUserId, amount);
    return ResponseEntity.ok(result);
}
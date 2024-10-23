
@GetMapping("/operations/{userId}")
public ResponseEntity<List<Operation>> getOperationList(
        @PathVariable Long userId,
        @RequestParam(required = false) String startDate,
        @RequestParam(required = false) String endDate) {
    
    List<Operation> operations = bankService.getOperationList(userId, startDate, endDate);
    return ResponseEntity.ok(operations);
}
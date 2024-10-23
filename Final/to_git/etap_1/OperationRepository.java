public interface OperationRepository extends JpaRepository<Operation, Long> {
    List<Operation> findByUserIdAndDateBetween(Long userId, String startDate, String endDate);
}

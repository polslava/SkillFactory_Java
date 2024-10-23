
public interface OperationRepository extends JpaRepository<Operation, Long> {
    List<Operation> findByUserId(Long userId);
    List<Operation> findByUserIdAndDateBetween(Long userId, String startDate, String endDate);
}

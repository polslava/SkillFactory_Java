@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private String date;
    private String operationType;
    private double amount;

    // getters and setters
}

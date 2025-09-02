@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private User assignedTo;

    @ManyToOne
    private Project project;

    // getters & setters
}

enum Status {
    TODO, IN_PROGRESS, DONE;
}

package mrs.domain.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "PasswordResetToken")
public class PasswordResetToken {

    private static final int EXPIRATION = 60 * 24;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String token;

    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "user__id")
    private User user;

    private Date expiryDate;
}
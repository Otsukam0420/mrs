package mrs.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "usr")
public class User {
	
	@Id
	private String userId;
	private String password;
	private String firstName;
	private String lastName;
	@Enumerated(EnumType.STRING)
	private RoleName roleName;
    private String email;	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public RoleName getRoleName() {
		return roleName;
	}

	public void setRoleName(RoleName roleName) {
		this.roleName = roleName;
	}
	
    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

}
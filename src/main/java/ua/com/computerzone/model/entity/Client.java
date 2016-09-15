package ua.com.computerzone.model.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import ua.com.computerzone.model.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by vastl271nko on 08.09.16.
 */
@Entity
@Table(name = "clients")
public class Client extends Model {

    @Size(min = 3, max = 100)
    @Column(name = "first_name", nullable=false)
    private String firstName;

    @Size(min = 3, max = 100)
    @Column(name = "last_name", nullable=false)
    private String lastName;

    @Email
    @NotEmpty
    @Column(name = "email", unique = true)
    private String email;

    @Size(min = 5, max = 25)
    @NotNull
    @Column(name = "sso_id", unique=true, nullable=false)
    private String ssoId;

    @NotNull
    @Size(min = 5, max = 50)
    @Column(name = "password", nullable=false)
    private String password;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "source_id", referencedColumnName = "id")
    private Source source;

    @OneToMany(mappedBy = "client")
    private Set<Order> orders = new HashSet<Order>();

    public Client() {

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsoId() {
        return ssoId;
    }

    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}

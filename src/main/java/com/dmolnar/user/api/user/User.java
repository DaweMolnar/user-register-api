package com.dmolnar.user.api.user;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data //is it even working???
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence")
    public Long id;

    @NotNull
    public String userName;
    public String address;

    @NotNull
    public String password;

    @CreationTimestamp
    public Date createdAt;
}
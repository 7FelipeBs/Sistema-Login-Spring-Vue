package com.felipebs.horizon.user;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "permission")
public class Permission implements GrantedAuthority, Serializable {
	private static final long serialVersionUID = 20210730L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "description")
	private String description;

	@Override
	public int hashCode() {
		return Objects.hash(description, id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Permission)) {
			return false;
		}
		Permission other = (Permission) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id);
	}
	
	@Override
	public String getAuthority() {
		return this.description;
	}
}

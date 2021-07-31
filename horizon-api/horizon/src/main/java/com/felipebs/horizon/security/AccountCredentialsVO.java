package com.felipebs.horizon.security;

import java.io.Serializable;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccountCredentialsVO implements Serializable {
	private static final long serialVersionUID = 20210730L;
	
	private String username;
	private String password;
	
	@Override
	public int hashCode() {
		return Objects.hash(password, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AccountCredentialsVO)) {
			return false;
		}
		AccountCredentialsVO other = (AccountCredentialsVO) obj;
		return Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}	
}

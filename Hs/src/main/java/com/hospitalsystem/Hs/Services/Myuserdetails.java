package com.hospitalsystem.Hs.Services;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.hospitalsystem.Hs.entities.User;

public class Myuserdetails implements UserDetails {

	private String username;
	private String password;
	private Boolean active;

	public Myuserdetails(User user) {
		super();
		this.username = user.getPassword();
		this.password = user.getPassword();
		this.active = user.isEnabled();
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
	}

	@Override
	public String getPassword() {

		return password;
	}

	@Override
	public String getUsername() {

		return username;
	}

	@Override
	public boolean isAccountNonExpired() {

		return true;
	}

	@Override
	public boolean isAccountNonLocked() {

		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override
	public boolean isEnabled() {

		return active;
	}

}

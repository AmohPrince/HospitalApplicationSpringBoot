package com.hospitalsystem.Hs.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hospitalsystem.Hs.entities.User;
import com.hospitalsystem.Hs.sequel.Userrepository;

@Service
public class Myuserdetailsservice implements UserDetailsService {

	@Autowired
	Userrepository userrepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userrepository.findByUserName(username);
		user.orElseThrow(() -> new UsernameNotFoundException("Not Found"));
		return user.map(Myuserdetails::new).get();
	}

}

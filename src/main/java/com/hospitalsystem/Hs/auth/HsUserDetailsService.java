package com.hospitalsystem.Hs.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class HsUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;
    public  HsUserDetailsService(UserRepository userRepository){
        super();
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = this.userRepository.findByUsername(username);
        if(null == user) {
            throw new UsernameNotFoundException("Cannot find your user" + username);
        }

        return new HsUserPrincipal(user);
    }
}

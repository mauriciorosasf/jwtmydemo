package com.test.jwt.jwtdemo.security;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.test.jwt.jwtdemo.entity.User;
import com.test.jwt.jwtdemo.repository.UserRepository;

import java.util.Set;
import java.util.stream.Collectors;

@Service

public class MyUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public MyUserDetailsService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
    public UserDetails loadUserByUsername(String userN) throws UsernameNotFoundException {

        User user = userRepository.findByUser(userN)
                .orElseThrow(() -> new UsernameNotFoundException("not exists "+userN));

        Set<GrantedAuthority> authorities = user.getRoles().stream()
                .map((role) -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toSet());

        return new org.springframework.security.core.userdetails.User(
        		userN,
                user.getPassword(),
                authorities
        );
    }
}

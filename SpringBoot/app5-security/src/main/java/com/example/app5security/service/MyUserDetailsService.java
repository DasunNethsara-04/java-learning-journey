package com.example.app5security.service;

import com.example.app5security.model.User;
import com.example.app5security.model.UserPrincipal;
import com.example.app5security.repository.UserRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public MyUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(@NonNull String username) {
        User user = userRepository.findByUsername(username);

        if(user == null) {
            System.out.println("User not found!");
            throw new UsernameNotFoundException("user not found!");
        }

        return new UserPrincipal(user);
    }
}

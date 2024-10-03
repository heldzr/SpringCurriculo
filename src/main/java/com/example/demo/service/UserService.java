package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository pessoaRepository;

    public List<User> listarUsers() {
        return pessoaRepository.findAll();
    }

    public Optional<User> buscarPorId(Long id) {
        return pessoaRepository.findById(id);
    }

    public User salvarUser(User user) {
        return pessoaRepository.save(user);
    }

    public void deletarUser(Long id) {
        pessoaRepository.deleteById(id);
    }
}

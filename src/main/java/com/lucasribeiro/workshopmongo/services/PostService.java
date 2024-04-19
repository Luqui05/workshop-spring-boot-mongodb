package com.lucasribeiro.workshopmongo.services;

import com.lucasribeiro.workshopmongo.domain.Post;
import com.lucasribeiro.workshopmongo.repository.PostRepository;
import com.lucasribeiro.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
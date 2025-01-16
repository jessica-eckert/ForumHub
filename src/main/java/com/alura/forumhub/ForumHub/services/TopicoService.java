package com.alura.forumhub.ForumHub.services;

import com.alura.forumhub.ForumHub.models.Topico;
import com.alura.forumhub.ForumHub.repositories.TopicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TopicoService {
    private final TopicoRepository repository;

    public TopicoService(TopicoRepository repository) {
        this.repository = repository;
    }

    public Topico criarTopico(Topico topico) {
        return repository.save(topico);
    }

    public List<Topico> listarTopicos() {
        return repository.findAll();
    }

    public Topico buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Tópico não encontrado"));
    }

    public Topico atualizarTopico(Long id, Topico novosDados) {
        Topico topico = buscarPorId(id);
        topico.setTitulo(novosDados.getTitulo());
        topico.setMensagem(novosDados.getMensagem());
        return repository.save(topico);
    }

    public void deletarTopico(Long id) {
        repository.deleteById(id);
    }
}

package com.alura.forumhub.ForumHub.controllers;

import com.alura.forumhub.ForumHub.models.Topico;
import com.alura.forumhub.ForumHub.services.TopicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.alura.forumhub.ForumHub.dto.TopicoRequestDTO;
import com.alura.forumhub.ForumHub.dto.TopicoResponseDTO;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/topicos")
public class TopicoController {

    private final TopicoService service;

    public TopicoController(TopicoService service) {
        this.service = service;
    }

    @PostMapping
    public TopicoResponseDTO criar(@RequestBody TopicoRequestDTO dto) {
        Topico topico = new Topico(dto.getTitulo(), dto.getMensagem());
        Topico criado = service.criarTopico(topico);
        return new TopicoResponseDTO(criado.getId(), criado.getTitulo(), criado.getMensagem());
    }

    @GetMapping
    public List<TopicoResponseDTO> listar() {
        return service.listarTopicos().stream()
                .map(t -> new TopicoResponseDTO(t.getId(), t.getTitulo(), t.getMensagem()))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public TopicoResponseDTO buscarPorId(@PathVariable Long id) {
        Topico topico = service.buscarPorId(id);
        return new TopicoResponseDTO(topico.getId(), topico.getTitulo(), topico.getMensagem());
    }

    @PutMapping("/{id}")
    public TopicoResponseDTO atualizar(@PathVariable Long id, @RequestBody TopicoRequestDTO dto) {
        Topico atualizado = service.atualizarTopico(id, new Topico(dto.getTitulo(), dto.getMensagem()));
        return new TopicoResponseDTO(atualizado.getId(), atualizado.getTitulo(), atualizado.getMensagem());
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletarTopico(id);
    }
}


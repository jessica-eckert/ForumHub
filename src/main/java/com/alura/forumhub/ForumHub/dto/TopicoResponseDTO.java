package com.alura.forumhub.ForumHub.dto;


public class TopicoResponseDTO {
    private Long id;
    private String titulo;
    private String mensagem;

    public TopicoResponseDTO() {}

    public TopicoResponseDTO(Long id, String titulo, String mensagem) {
        this.id = id;
        this.titulo = titulo;
        this.mensagem = mensagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}


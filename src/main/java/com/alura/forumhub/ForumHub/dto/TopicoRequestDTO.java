package com.alura.forumhub.ForumHub.dto;


public class TopicoRequestDTO {
    private String titulo;
    private String mensagem;

    public TopicoRequestDTO() {}

    public TopicoRequestDTO(String titulo, String mensagem) {
        this.titulo = titulo;
        this.mensagem = mensagem;
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


package br.com.victor.forum.controller.form;

import br.com.victor.forum.modelo.Topico;
import br.com.victor.forum.repository.TopicoRepository;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;

public class AtualizacaoTopicoForm {
    @NotNull
    @NotEmpty
    private String titulo;
    @NotEmpty
    @NotNull
    private String mensagem;

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

    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico = topicoRepository.getReferenceById(id);
        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);

        return topico;
    }
}

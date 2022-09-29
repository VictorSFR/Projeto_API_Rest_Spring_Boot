package br.com.victor.forum.controller.form;

import br.com.victor.forum.modelo.Curso;
import br.com.victor.forum.modelo.Topico;
import br.com.victor.forum.repository.CursoRepository;
import br.com.victor.forum.repository.TopicoRepository;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotEmpty;

public class TopicoForm {
    @NotNull
    @NotEmpty
    private String titulo;
    @NotEmpty
    @NotNull
    private String mensagem;
    @NotEmpty
    @NotNull
    private String nomeCurso;

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

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Topico converter(CursoRepository repository) {
        Curso curso = repository.findByNome(nomeCurso);
        return new Topico(titulo,mensagem,curso);
    }
}

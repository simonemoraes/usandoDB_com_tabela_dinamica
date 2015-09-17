
package simone.controller;

import java.util.List;
import simone.model.Aluno;
import simone.service.AlunoService;

public class AlunoController {
    
    private AlunoService service;

    public AlunoController( ) {
        this.service = new AlunoService();
    }
    
    public int adicionarNovoAluno ( Aluno aluno ) {
        return service.salvarAluno( aluno );
    }
    
    public int alterarAluno ( Aluno aluno ) {
        return service.atualizaAluno( aluno );
    }
    
    public int excluirAluno ( int id ) {
        return service.deletar( id );
    }
    
    public List<Aluno> listarTodosOsAlunos() {
        return service.selecionaTodosAlunos();
    }
}

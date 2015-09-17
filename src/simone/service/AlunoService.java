package simone.service;

import java.util.List;
import simone.dao.AlunoDao;
import simone.dao.IAlunoDao;
import simone.model.Aluno;

public class AlunoService {

    private IAlunoDao dao;

    /* A class AlunoServece intermedia a interface grafica da class dao que faz a conexao com BD
     É class facade que é feita toda a regra de negocio se necessario  */
    public AlunoService() {
        this.dao = new AlunoDao();
    }

    public List<Aluno> selecionaTodosAlunos() {
        return dao.findAll();
    }

    public int salvarAluno(Aluno aluno) {
        return dao.saveRecord(aluno);
    }

    //Class que faz atualização do registro no banco
    public int atualizaAluno(Aluno aluno) {
        return dao.updateRecord(aluno);
    }

    public int deletar(int idAluno) {
        return dao.removeRecord( idAluno );
    }
}

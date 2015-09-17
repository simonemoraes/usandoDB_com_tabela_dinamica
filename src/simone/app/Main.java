
package simone.app;

import simone.controller.AlunoController;
import simone.dao.AlunoDao;
import simone.dao.DBConnection;
import simone.model.Aluno;

public class Main {

    public static void main(String[] args) {
        
        DBConnection.createTable();
        AlunoController alunoCont = new AlunoController();
        Aluno aluno = new Aluno();
        //alunoCont.listarTodosOsAlunos();
        //alunoCont.adicionarNovoAluno(aluno);
        //alunoCont.alterarAluno(aluno);
        //alunoCont.excluirAluno(13);
    }
    
}

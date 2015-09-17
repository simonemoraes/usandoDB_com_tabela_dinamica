
package simone.dao;

import java.util.List;
import simone.model.Aluno;

public interface IAlunoDao {
    List<Aluno> findAll ();
    int updateRecord( Aluno aluno );
    int removeRecord( int id_aluno );
    int saveRecord(Aluno consumo );
}

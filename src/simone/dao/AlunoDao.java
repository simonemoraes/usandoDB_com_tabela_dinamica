package simone.dao;

import java.util.ArrayList;
import java.util.List;
import simone.model.Aluno;
import java.sql.*;

public class AlunoDao implements IAlunoDao {

    private static final String SQL_INSERT
            = "insert into aluno( NOME, SOBRENOME, CODCIDADE ) VALUES (?,?,?);";
    private static final String SQL_UPDATE
            = "update aluno set NOME = ?, SOBRENOME = ?, CODCIDADE = ? where ID = ?;";
    private static final String SQL_REMOVE
            = "delete from aluno where ID = ?;";
    private static final String SQL_FIND_ALL
            = "select * from aluno;";

    @Override
    public List<Aluno> findAll() {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Aluno> alunos = new ArrayList<Aluno>();

        try {
            pstm = conn.prepareStatement(SQL_FIND_ALL);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setIdAluno(rs.getInt("ID"));
                aluno.setNome(rs.getString("NOME"));
                aluno.setSobreNome(rs.getString("SOBRENOME"));
                aluno.setCidade(rs.getInt("CODCIDADE"));

                alunos.add(aluno);
            }

        } catch (SQLException ex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            } finally {
                DBConnection.close(conn, pstm, rs);
            }
            ex.printStackTrace();
        }

        return alunos;
    }

    @Override
    public int updateRecord(Aluno aluno) {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;

        int result = 0;

        try {

            pstm = conn.prepareStatement(SQL_UPDATE);
            
             pstm.setString( 1, aluno.getNome() );
             pstm.setString( 2, aluno.getSobreNome() );
             pstm.setInt( 3, aluno.getCidade() );
             pstm.setInt( 4, aluno.getIdAluno() );
            
            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            } finally {
                DBConnection.close(conn, pstm, null);
            }
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public int removeRecord(int id_aluno) {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;

        int result = 0;

        try {

            pstm = conn.prepareStatement(SQL_REMOVE);
            pstm.setInt(1, id_aluno);

            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            } finally {
                DBConnection.close(conn, pstm, null);
            }
            ex.printStackTrace();
        }
         return result;
    }

    @Override
    public int saveRecord(Aluno aluno) {
        Connection conn = DBConnection.getConnection();
        PreparedStatement pstm = null;

        int result = 0;

        try {
            pstm = conn.prepareStatement(SQL_INSERT);
            
             pstm.setString( 1, aluno.getNome() );
             pstm.setString( 2, aluno.getSobreNome() );
             pstm.setInt( 3, aluno.getCidade() );
             

            result = pstm.executeUpdate();

        } catch (SQLException ex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e1) {
                e1.printStackTrace();
            } finally {
                DBConnection.close(conn, pstm, null);
            }
            ex.printStackTrace();
        }
        
        return result;
    }

}

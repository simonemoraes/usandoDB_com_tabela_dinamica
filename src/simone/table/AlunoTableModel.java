
package simone.table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import simone.model.Aluno;

public class AlunoTableModel extends AbstractTableModel {
    
    /* Criando as colunas da tabela */ 
    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_SOBRENOME = 2;
    private static final int COL_CIDADE = 3;
    
    private List<Aluno> valores;

    public AlunoTableModel(List<Aluno> valores) {
        this.valores = valores;
    }

    @Override
    public int getRowCount() {
        /* Metodo que retorna a quantidade de linhas que a tabela irá possuir */
        return valores.size();
    }

    @Override
    public int getColumnCount() {
        /* Metodo que retorna a quantidade de colunas que a tabela irá possuir */
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        /* Metodo retorna o valor da linha que está sendo acessada 
           - rowIndex = indice da linha.
           - columnIndex = indice da coluna.*/
        Aluno aluno = valores.get( rowIndex );
        
        //Teste para saber se a coluna possui o mesmo valor que foi setado
        if ( columnIndex == COL_ID ) {
            return aluno.getIdAluno();
        } else if ( columnIndex == COL_NOME ) {
            return aluno.getNome();
        } else if ( columnIndex == COL_SOBRENOME ) {
            return aluno.getSobreNome();
        } else if ( columnIndex == COL_CIDADE ) {
            return aluno.getCidade();
        }
        
        return null;
    }
    
    @Override
    public String getColumnName ( int column ) {
        /* Metodo que nomeia as colunas */
        
        String coluna = "";
        
        switch ( column ) {
            case COL_ID:
                coluna = "Código";
                break;
            case COL_NOME:
                coluna = "Nome";
                break;
            case COL_SOBRENOME:
                coluna = "Sobrenome";
                break;
                
            case COL_CIDADE:
                coluna = "Cidade";
                break;
                
            default:
                throw new IllegalArgumentException( "Coluna inválida!" );
        }
        return coluna;      
    }
    
    @Override
    public Class<?> getColumnClass ( int columnIndex ) {
        /* Metodo qpara saber qual o tipo de dado da coluna */
        
        if ( columnIndex == COL_ID ) {
            return int.class; 
        } else if ( columnIndex == COL_NOME ) {
            return String.class;
        } else if ( columnIndex == COL_SOBRENOME ) {
            return String.class;
        } else if ( columnIndex == COL_CIDADE ) {
            return int.class;
        }
        
        return null;
    }
    
    
    
    public Aluno getLinhaUtilizada ( int row ) {
        /* Metodo que retorna o valor da linha utilizada */      
        return valores.get(row);
    }
    
}

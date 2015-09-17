
package simone.forms;

import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import net.miginfocom.swing.MigLayout;
import simone.controller.AlunoController;
import simone.model.Aluno;
import simone.table.AlunoCellRenderer;
import simone.table.AlunoTableModel;

public class RegistroAluno extends javax.swing.JFrame {
    
    private List<Aluno> alunoLista;
    private int idAluno;

    public RegistroAluno() {
        initComponents();
        enableFields( false );
        refreshTable();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP_Cadastro = new javax.swing.JPanel();
        jl_Nome = new javax.swing.JLabel();
        jl_SobreNome = new javax.swing.JLabel();
        jl_Cidade = new javax.swing.JLabel();
        jtf_Nome = new javax.swing.JTextField();
        jtf_sobreNome = new javax.swing.JTextField();
        jtf_Cidade = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jP_Botoes = new javax.swing.JPanel();
        jb_Novo = new javax.swing.JButton();
        jb_Cancelar = new javax.swing.JButton();
        jb_Salvar = new javax.swing.JButton();
        jb_Alterar = new javax.swing.JButton();
        jb_Excluir = new javax.swing.JButton();
        jP_Table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Alunos");

        jP_Cadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cadastro de Alunos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        jl_Nome.setText("Nome:");

        jl_SobreNome.setText("Sobrenome:");

        jl_Cidade.setText("Cidade:");

        jP_Botoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jb_Novo.setIcon(new javax.swing.ImageIcon("C:\\Todos_os_projetos\\linguagemProgramacao\\Dispositivos_Moveis\\UsandoBD_ComTabela\\src\\simonoeImagens\\add.png")); // NOI18N
        jb_Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_NovoActionPerformed(evt);
            }
        });

        jb_Cancelar.setIcon(new javax.swing.ImageIcon("C:\\Todos_os_projetos\\linguagemProgramacao\\Dispositivos_Moveis\\UsandoBD_ComTabela\\src\\simonoeImagens\\cancel.png")); // NOI18N
        jb_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CancelarActionPerformed(evt);
            }
        });

        jb_Salvar.setIcon(new javax.swing.ImageIcon("C:\\Todos_os_projetos\\linguagemProgramacao\\Dispositivos_Moveis\\UsandoBD_ComTabela\\src\\simonoeImagens\\save.png")); // NOI18N
        jb_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_SalvarActionPerformed(evt);
            }
        });

        jb_Alterar.setIcon(new javax.swing.ImageIcon("C:\\Todos_os_projetos\\linguagemProgramacao\\Dispositivos_Moveis\\UsandoBD_ComTabela\\src\\simonoeImagens\\edit.png")); // NOI18N
        jb_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_AlterarActionPerformed(evt);
            }
        });

        jb_Excluir.setIcon(new javax.swing.ImageIcon("C:\\Todos_os_projetos\\linguagemProgramacao\\Dispositivos_Moveis\\UsandoBD_ComTabela\\src\\simonoeImagens\\trash.png")); // NOI18N
        jb_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_BotoesLayout = new javax.swing.GroupLayout(jP_Botoes);
        jP_Botoes.setLayout(jP_BotoesLayout);
        jP_BotoesLayout.setHorizontalGroup(
            jP_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BotoesLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jb_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jb_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jb_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jP_BotoesLayout.setVerticalGroup(
            jP_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_BotoesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jP_BotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Novo)
                    .addComponent(jb_Cancelar)
                    .addComponent(jb_Salvar)
                    .addComponent(jb_Alterar)
                    .addComponent(jb_Excluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jP_CadastroLayout = new javax.swing.GroupLayout(jP_Cadastro);
        jP_Cadastro.setLayout(jP_CadastroLayout);
        jP_CadastroLayout.setHorizontalGroup(
            jP_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jP_CadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jP_Botoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jP_CadastroLayout.createSequentialGroup()
                        .addGroup(jP_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_Nome)
                            .addComponent(jl_SobreNome)
                            .addComponent(jl_Cidade))
                        .addGap(31, 31, 31)
                        .addGroup(jP_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_CadastroLayout.createSequentialGroup()
                                .addComponent(jtf_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jtf_Nome)
                            .addComponent(jtf_sobreNome))))
                .addContainerGap())
        );
        jP_CadastroLayout.setVerticalGroup(
            jP_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_CadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Nome)
                    .addComponent(jtf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jP_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_SobreNome)
                    .addComponent(jtf_sobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jP_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Cidade)
                    .addComponent(jtf_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jP_Botoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jP_Table.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Lista de Alunos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jP_TableLayout = new javax.swing.GroupLayout(jP_Table);
        jP_Table.setLayout(jP_TableLayout);
        jP_TableLayout.setHorizontalGroup(
            jP_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_TableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jP_TableLayout.setVerticalGroup(
            jP_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_TableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jP_Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jP_Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jP_Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_NovoActionPerformed
        novoRegistro();
    }//GEN-LAST:event_jb_NovoActionPerformed

    private void jb_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CancelarActionPerformed
        cancelarRegistro();
    }//GEN-LAST:event_jb_CancelarActionPerformed

    private void jb_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SalvarActionPerformed
        salvarRegistro();
    }//GEN-LAST:event_jb_SalvarActionPerformed

    private void jb_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_AlterarActionPerformed
        alterarRegistro();
    }//GEN-LAST:event_jb_AlterarActionPerformed

    private void jb_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ExcluirActionPerformed
        excluirRegistro();
    }//GEN-LAST:event_jb_ExcluirActionPerformed

    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jP_Botoes;
    private javax.swing.JPanel jP_Cadastro;
    private javax.swing.JPanel jP_Table;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_Alterar;
    private javax.swing.JButton jb_Cancelar;
    private javax.swing.JButton jb_Excluir;
    private javax.swing.JButton jb_Novo;
    private javax.swing.JButton jb_Salvar;
    private javax.swing.JLabel jl_Cidade;
    private javax.swing.JLabel jl_Nome;
    private javax.swing.JLabel jl_SobreNome;
    private javax.swing.JTextField jtf_Cidade;
    private javax.swing.JTextField jtf_Nome;
    private javax.swing.JTextField jtf_sobreNome;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void novoRegistro() {
        enableFields( true );
    }

    private void cancelarRegistro() {
        jtf_Nome.setText("");
        jtf_sobreNome.setText("");
        jtf_Cidade.setText("");
        enableFields(false);
    }

    private void salvarRegistro() {
       //Instanciando um objeto do tipo ConsumoMes.
        Aluno aluno = new Aluno();
        // Criando uma variável do tipo int que receberá o resultado retornado do banco de dados.
        int result = 0;

        /* Teste para saber se o campo está ou não preenchido. 
         O método length permite descobrir o número de caráteres contidos numa String.*/
        if (jtf_Nome.getText().length() > 0 && jtf_sobreNome.getText().length() > 0 && jtf_Cidade.getText().length() > 0 ) {
            // Todos os campos devem ser preenchidos.
            aluno.setNome( jtf_Nome.getText() );
            aluno.setSobreNome( jtf_sobreNome.getText());
            aluno.setCidade( Integer.parseInt(jtf_Cidade.getText() ) );
        } else {
            /* Caso contrario uma mensagem é disparada informando a obrigatoriedade de preenchimento total dos campos.
             Retornando para o campo de preenchimento.*/
            JOptionPane.showMessageDialog(this, "Todos os registros são obrigatórios.");
            return;
        }

        /* Teste para verificar se existe id preenchido.*/
        if ( idAluno == 0 ) {
            /* Se não a variavel result receberá a instancia da class ConsumoMesController acessando o 
             o metodo da class que adicionará um novo registro.*/
            result = new AlunoController().adicionarNovoAluno( aluno );

        } else {
            /* Caso contrário será setado o id recuperado e result receberá a 
             * instancia da class ConsumoMesController acessando o metodo da class que
             * alterará registro.*/
            aluno.setIdAluno( idAluno );
            result = new AlunoController().alterarAluno( aluno );
            idAluno = 0; // Após a alteração a variável idCoonsumo é zerada.
        }

        /* Teste para saber qual operação foi feita no banco de dados.*/
        if (result == 1) {
            // Se result receber 1, sera disparada uma mensagem informando que um novo registro foi inserido.
            JOptionPane.showMessageDialog(this, "Valor inserido com sucesso!.");
            enableFields(false); // O metodo é chamado para desabilitar os campos.
            cancelarRegistro(); // O metodo é chamado para limpar os campos.
            refreshTable(); // O metodo é chamdo para fazer um refresh na tabela e atualizar as informações nela contidas.
        } else {
            // Caso contrario uma mensagem é disparada informando que nao houve insersao na tabela.
            JOptionPane.showMessageDialog(this, "Tente novamente!");
        } 
    }

    private void alterarRegistro() {
        //Captura a linha selecionada.
        int indiceDaLinha = table.getSelectedRow();

        // Teste para verificar se houve seleção de linha na tabela.
        if (indiceDaLinha == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um registro a ser alterado.");
            return;
        }

        //Recupera o objeto que será alterado.
        Aluno aluno = new AlunoTableModel(alunoLista).getLinhaUtilizada(indiceDaLinha);

        //Recupera o id da linha que foi selecionada na tabela.
        idAluno = aluno.getIdAluno();

        jtf_Nome.setText(aluno.getNome());
        jtf_sobreNome.setText( (aluno.getSobreNome() ) );
        jtf_Cidade.setText( String.valueOf( aluno.getCidade() ) );

        enableFields(true);
    }

    private void excluirRegistro() {
        /* Captura linha selecionada.*/
        int rowIndex = table.getSelectedRow();
        
        /* Teste feito para saber se houve linha selecionada.
           a seleção de linha indica a sua posição.
           portanto se for -1 é porque nenhuma linha foi selecionada e
           se for 0 ou mais é porque uma posição foi selecionada.*/
        if ( rowIndex == -1 ) {
           JOptionPane.showMessageDialog(this, "Selecione o livro a ser removido");
           return;
        }
        /* Criando um objeto do tipo ConsumoMes que receberá a instancia da class ConsumoMesTableModel
           onde será possivel acessar o Metodo "getLinhaUtilizada" que retorna o valor da linha utilizada*/
        Aluno aluno = new AlunoTableModel( alunoLista ).getLinhaUtilizada( rowIndex );
        
        /* Será aberta uma janela de dialogo para confirmação ou não da operação de exclusão.*/
        int confirm = JOptionPane.showConfirmDialog( this, "Confirmar exclusão?", "Excluir Livro", JOptionPane.YES_NO_OPTION );
        
        /* Teste para saber se a resposta foi sim ou não.
         * Se houver retorno '0', não foi confirmada a exclusão do registro
           Se houver retorno '1', houve uma confirmação e ocorre o retorno para a janela principal.*/ 
        if ( confirm != 0 ) {
            return;
        }
        
        /* Cria-se uma variável inteira que receberá o retorno da execução no Banco de dados.*/
        int result = new AlunoController().excluirAluno( aluno.getIdAluno() );
        
        /* Teste para saber o tipo de resultado retornado.*/
        if ( result == 1 ) {
            // Se o retorno for '1' é dispara uma mensagem que o registro foi removido.
           JOptionPane.showMessageDialog(this, "Valor removido com sucesso!");
            refreshTable(); 
        } else {
            // Se o retorno for '0' não houve exclusão no banco.
            JOptionPane.showMessageDialog(this, "Tente novamente!");
        }
    }
    
    private void redefinindoLayout() {
        jP_Cadastro = new JPanel(new MigLayout());
        jP_Botoes = new JPanel(new MigLayout());
        jP_Table = new JPanel(new MigLayout());

    }

    /* Metodo que habilita/desabilita campos de acordo com o que for passado por parametro
     na chamada do método (true ou false) */
    private void enableFields(boolean b) {
        jtf_Nome.setEditable(b);
        jtf_sobreNome.setEditable(b);
        jtf_Cidade.setEditable(b);
    }

    /* Metodo que faz um refresh na tabela retornando a lista atualizada.*/
    private void refreshTable() {

        alunoLista = new AlunoController().listarTodosOsAlunos();
        if (alunoLista != null) {
            table.setModel(new AlunoTableModel(alunoLista)); // Subscreve a edição padrão da tabela.
            table.setDefaultRenderer( Object.class, new AlunoCellRenderer() );
            
            table.setShowGrid(true); // Exibe as linhas internas da tabela.
            table.setBorder(new LineBorder(Color.black)); // Exibe as linhas de limite da tabela com a cor de preferencia
            table.setGridColor(Color.black); // Altera a cor das linhas internas da tabela.
        }
    }
}

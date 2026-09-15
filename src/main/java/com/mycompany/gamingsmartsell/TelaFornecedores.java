package com.mycompany.gamingsmartsell;

public class TelaFornecedores extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaFornecedores.class.getName());

    private void carregarFornecedores() {

    javax.swing.table.DefaultTableModel modelo =
            (javax.swing.table.DefaultTableModel) tblFornecedores.getModel();

    modelo.setRowCount(0);

    FornecedorDAO dao = new FornecedorDAO();

    try {

        java.util.List<Fornecedores> lista = dao.listarAtivos();

        for (Fornecedores fornecedor : lista) {

            modelo.addRow(new Object[]{
                fornecedor.getIdFornecedor(),
                fornecedor.getNome(),
                fornecedor.getCategoria()
            });
        }

    } catch (java.sql.SQLException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível carregar os fornecedores.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}
    
      public TelaFornecedores() {
        initComponents();
        
        Usuario usuario = Sessao.getUsuarioLogado();

        if (usuario != null) {
            lblUsuarioLogado.setText("Usuário: " + usuario.getNome() + " | Cargo: " + usuario.getCargo());
        }
        
        if (usuario != null) {

        String cargo = usuario.getCargo();

        if (cargo.equalsIgnoreCase("Vendedor")) {

            btnCadastrar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnExcluir.setEnabled(false);
    }
}
        
        tblFornecedores.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        pnlFundo.setPreferredSize(new java.awt.Dimension(800, 830));

        setSize(800, 830);
        setLocationRelativeTo(null);
        
        carregarFornecedores();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblGestaoFornecedores = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        pnlTabelaProdutos = new javax.swing.JScrollPane();
        tblFornecedores = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFundo.setBackground(new java.awt.Color(11, 15, 12));

        lblTítulo.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(57, 255, 136));
        lblTítulo.setText("GAMING SMART SELL");

        lblUsuarioLogado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuarioLogado.setForeground(new java.awt.Color(245, 247, 245));
        lblUsuarioLogado.setText("Usuário: Admin | Cargo: Administrador");

        btnSair.setBackground(new java.awt.Color(34, 197, 94));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(11, 15, 12));
        btnSair.setText("SAIR");
        btnSair.addActionListener(this::btnSairActionPerformed);

        lblGestaoFornecedores.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblGestaoFornecedores.setForeground(new java.awt.Color(245, 247, 245));
        lblGestaoFornecedores.setText("GESTÃO DE FORNECEDORES");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(245, 247, 245));
        lblNome.setText("Nome:");

        txtCategoria.setBackground(new java.awt.Color(21, 26, 22));
        txtCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(245, 247, 245));

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(245, 247, 245));
        lblCategoria.setText("Categoria:");

        txtNome.setBackground(new java.awt.Color(21, 26, 22));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(245, 247, 245));

        btnCadastrar.setBackground(new java.awt.Color(34, 197, 94));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(11, 15, 12));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(this::btnCadastrarActionPerformed);

        btnEditar.setBackground(new java.awt.Color(34, 197, 94));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(11, 15, 12));
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        btnExcluir.setBackground(new java.awt.Color(34, 197, 94));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(11, 15, 12));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        lblPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPesquisar.setForeground(new java.awt.Color(245, 247, 245));
        lblPesquisar.setText("Pesquisar fornecedor:");

        txtPesquisar.setBackground(new java.awt.Color(21, 26, 22));
        txtPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPesquisar.setForeground(new java.awt.Color(245, 247, 245));

        btnVoltar.setBackground(new java.awt.Color(34, 197, 94));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(11, 15, 12));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(this::btnVoltarActionPerformed);

        tblFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CATEGORIA"
            }
        ));
        tblFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFornecedoresMouseClicked(evt);
            }
        });
        pnlTabelaProdutos.setViewportView(tblFornecedores);

        btnBuscar.setBackground(new java.awt.Color(34, 197, 94));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(11, 15, 12));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNome)
                                .addComponent(lblCategoria)
                                .addComponent(txtCategoria)
                                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFundoLayout.createSequentialGroup()
                                        .addGap(537, 537, 537)
                                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pnlTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(pnlFundoLayout.createSequentialGroup()
                                            .addGap(300, 300, 300)
                                            .addComponent(lblUsuarioLogado)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSair))
                                        .addGroup(pnlFundoLayout.createSequentialGroup()
                                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(136, 136, 136)
                                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlFundoLayout.createSequentialGroup()
                                            .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(pnlFundoLayout.createSequentialGroup()
                                                    .addComponent(lblPesquisar)
                                                    .addGap(0, 386, Short.MAX_VALUE))
                                                .addComponent(txtPesquisar))
                                            .addGap(18, 18, 18)
                                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(31, 31, 31))))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblTítulo)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblGestaoFornecedores)
                .addGap(250, 250, 250))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTítulo)
                    .addComponent(lblUsuarioLogado)
                    .addComponent(btnSair))
                .addGap(18, 18, 18)
                .addComponent(lblGestaoFornecedores)
                .addGap(18, 18, 18)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCategoria)
                .addGap(14, 14, 14)
                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenu menu = new TelaMenu();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        Usuario usuarioLogado = Sessao.getUsuarioLogado();

        if (usuarioLogado == null ||
            usuarioLogado.getCargo().equalsIgnoreCase("Vendedor")) {

        javax.swing.JOptionPane.showMessageDialog(this, "Você não possui permissão para cadastrar fornecedores!", "Acesso negado", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
        
        String nome = txtNome.getText().trim();
        String categoria = txtCategoria.getText().trim();

        if (nome.isEmpty() || categoria.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
      }

         if (!nome.matches(".*[A-Za-zÀ-ÿ].*")) {

        javax.swing.JOptionPane.showMessageDialog(this, "O nome do fornecedor deve conter pelo menos uma letra!", "Nome inválido", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

        if (!categoria.matches(".*[A-Za-zÀ-ÿ].*")) {

        javax.swing.JOptionPane.showMessageDialog(this, "A categoria deve conter pelo menos uma letra!", "Categoria inválida", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
        
        Fornecedores fornecedor = new Fornecedores();

        fornecedor.setNome(nome);
        fornecedor.setCategoria(categoria);
        fornecedor.setAtivo(true);

        FornecedorDAO dao = new FornecedorDAO();

        try {

            dao.cadastrar(fornecedor);

            javax.swing.JOptionPane.showMessageDialog(this, "Fornecedor cadastrado com sucesso!");

            txtNome.setText("");
            txtCategoria.setText("");

            carregarFornecedores();

        } catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível cadastrar o fornecedor.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tblFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFornecedoresMouseClicked
        int linha = tblFornecedores.getSelectedRow();

        if (linha == -1) {
            return;
        }

        int id = Integer.parseInt(
                tblFornecedores.getValueAt(linha, 0).toString()
        );

        FornecedorDAO dao = new FornecedorDAO();

        try {

            Fornecedores fornecedor = dao.buscarPorId(id);

            if (fornecedor != null) {
                txtNome.setText(fornecedor.getNome());
                txtCategoria.setText(fornecedor.getCategoria());
            }

        } catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível carregar os dados do fornecedor.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tblFornecedoresMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        Usuario usuarioLogado = Sessao.getUsuarioLogado();

        if (usuarioLogado == null ||
            usuarioLogado.getCargo().equalsIgnoreCase("Vendedor")) {

        javax.swing.JOptionPane.showMessageDialog(this, "Você não possui permissão para editar fornecedores!", "Acesso negado", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
        
        int[] linhasSelecionadas = tblFornecedores.getSelectedRows();

        if (linhasSelecionadas.length == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um fornecedor na tabela para editar!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
      } 

        if (linhasSelecionadas.length > 1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione apenas um fornecedor para editar!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
      }

        int linha = linhasSelecionadas[0];

        String nome = txtNome.getText().trim();
        String categoria = txtCategoria.getText().trim();

        if (nome.isEmpty() || categoria.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
      }

        if (!nome.matches(".*[A-Za-zÀ-ÿ].*")) {

        javax.swing.JOptionPane.showMessageDialog(this, "O nome do fornecedor deve conter pelo menos uma letra!", "Nome inválido", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (!categoria.matches(".*[A-Za-zÀ-ÿ].*")) {

        javax.swing.JOptionPane.showMessageDialog(this, "A categoria deve conter pelo menos uma letra!", "Categoria inválida", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
        
        int id = Integer.parseInt(
            tblFornecedores.getValueAt(linha, 0).toString()
    );

        FornecedorDAO dao = new FornecedorDAO();

        try {

            Fornecedores fornecedor = dao.buscarPorId(id);

            if (fornecedor == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Fornecedor não encontrado no banco.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            fornecedor.setNome(nome);
            fornecedor.setCategoria(categoria);

            dao.atualizar(fornecedor);

            javax.swing.JOptionPane.showMessageDialog(this, "Fornecedor atualizado com sucesso!");

            txtNome.setText("");
            txtCategoria.setText("");
            tblFornecedores.clearSelection();

            carregarFornecedores();

        } catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível atualizar o fornecedor.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        Usuario usuarioLogado = Sessao.getUsuarioLogado();

        if (usuarioLogado == null ||
                usuarioLogado.getCargo().equalsIgnoreCase("Vendedor")) {

            javax.swing.JOptionPane.showMessageDialog(this, "Você não possui permissão para excluir fornecedores!", "Acesso negado", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int[] linhasSelecionadas = tblFornecedores.getSelectedRows();

        if (linhasSelecionadas.length == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um fornecedor na tabela para excluir!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
      }

        if (linhasSelecionadas.length > 1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione apenas um fornecedor para excluir!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
      }

        int linha = linhasSelecionadas[0];

        int resposta = javax.swing.JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este fornecedor?", "Confirmar exclusão", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);

        if (resposta == javax.swing.JOptionPane.YES_OPTION) {

        int id = Integer.parseInt(
                tblFornecedores.getValueAt(linha, 0).toString()
        );

        FornecedorDAO dao = new FornecedorDAO();

        try {

            dao.desativar(id);

            javax.swing.JOptionPane.showMessageDialog(this, "Fornecedor excluído com sucesso!");

            txtNome.setText("");
            txtCategoria.setText("");
            tblFornecedores.clearSelection();

            carregarFornecedores();

        } catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível excluir o fornecedor.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
      }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String termo = txtPesquisar.getText().trim();

        if (termo.isEmpty()) {
            carregarFornecedores();
        return;
      }

        FornecedorDAO dao = new FornecedorDAO();

        try {

        java.util.List<Fornecedores> lista = dao.buscar(termo);

        javax.swing.table.DefaultTableModel modelo =
                (javax.swing.table.DefaultTableModel) tblFornecedores.getModel();

        modelo.setRowCount(0);

        for (Fornecedores fornecedor : lista) {

            modelo.addRow(new Object[]{
                fornecedor.getIdFornecedor(),
                fornecedor.getNome(),
                fornecedor.getCategoria()
            });
        }

        if (lista.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Fornecedor não encontrado!", "Resultado da busca", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }

    } catch (java.sql.SQLException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível buscar o fornecedor.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Sessao.encerrar();
        
        TelaLogin login = new TelaLogin();
        login.setLocationRelativeTo(null);
        login.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblGestaoFornecedores;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JScrollPane pnlTabelaProdutos;
    private javax.swing.JTable tblFornecedores;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}

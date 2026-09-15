package com.mycompany.gamingsmartsell;

import java.util.List;

public class TelaProdutos extends javax.swing.JFrame {
    
    private void carregarProdutos() {

    javax.swing.table.DefaultTableModel modelo =
            (javax.swing.table.DefaultTableModel) tblProdutos.getModel();

    modelo.setRowCount(0);

    ProdutoDAO produtoDAO = new ProdutoDAO();
    FornecedorDAO fornecedorDAO = new FornecedorDAO();

    try {

        java.util.List<Produtos> lista = produtoDAO.listarAtivos();

        for (Produtos produto : lista) {

            Fornecedores fornecedor =
                    fornecedorDAO.buscarPorId(produto.getIdFornecedor());

            String nomeFornecedor = "";

            if (fornecedor != null) {
                nomeFornecedor = fornecedor.getNome();
            }

            modelo.addRow(new Object[]{
                produto.getIdProduto(),
                produto.getNome(),
                produto.getCategoria(),
                produto.getQuantidade(),
                nomeFornecedor
            });
        }

    } catch (java.sql.SQLException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível carregar os produtos.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaProdutos.class.getName());

    private java.util.List<Fornecedores> fornecedoresCombo = new java.util.ArrayList<>();
    
    private void carregarFornecedoresCombo() {

    cbFornecedor.removeAllItems();
    cbFornecedor.addItem("Selecione um fornecedor");

    FornecedorDAO dao = new FornecedorDAO();

    try {

        fornecedoresCombo = dao.listarAtivos();

        for (Fornecedores fornecedor : fornecedoresCombo) {
            cbFornecedor.addItem(fornecedor.getNome());
        }

    } catch (java.sql.SQLException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível carregar os fornecedores.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}
    
      public TelaProdutos() {
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
        
        tblProdutos.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        pnlFundo.setPreferredSize(new java.awt.Dimension(800, 985));

        setSize(800, 985);
        setLocationRelativeTo(null);
        
        carregarFornecedoresCombo();
        carregarProdutos();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblGestaoProdutos = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        lblFornecedor = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        cbFornecedor = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        pnlTabelaProdutos = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
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

        lblGestaoProdutos.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblGestaoProdutos.setForeground(new java.awt.Color(245, 247, 245));
        lblGestaoProdutos.setText("GESTÃO DE PRODUTOS");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(245, 247, 245));
        lblNome.setText("Nome:");

        txtCategoria.setBackground(new java.awt.Color(21, 26, 22));
        txtCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(245, 247, 245));

        lblCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(245, 247, 245));
        lblCategoria.setText("Categoria:");

        lblFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFornecedor.setForeground(new java.awt.Color(245, 247, 245));
        lblFornecedor.setText("Fornecedor:");

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(245, 247, 245));
        lblQuantidade.setText("Quantidade:");

        txtNome.setBackground(new java.awt.Color(21, 26, 22));
        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(245, 247, 245));

        txtQuantidade.setBackground(new java.awt.Color(21, 26, 22));
        txtQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQuantidade.setForeground(new java.awt.Color(245, 247, 245));

        cbFornecedor.setBackground(new java.awt.Color(21, 26, 22));
        cbFornecedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbFornecedor.setForeground(new java.awt.Color(245, 247, 245));
        cbFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um fornecedor", "Tech Distribuidora", "Game Supply", "Mega Hardware" }));

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
        lblPesquisar.setText("Pesquisar produto:");

        txtPesquisar.setBackground(new java.awt.Color(21, 26, 22));
        txtPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPesquisar.setForeground(new java.awt.Color(245, 247, 245));

        btnVoltar.setBackground(new java.awt.Color(34, 197, 94));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(11, 15, 12));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(this::btnVoltarActionPerformed);

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CATEGORIA", "QUANTIDADE", "FORNECEDOR"
            }
        ));
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        pnlTabelaProdutos.setViewportView(tblProdutos);

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
                        .addGap(277, 277, 277)
                        .addComponent(lblGestaoProdutos))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addComponent(lblPesquisar)
                                .addGap(205, 205, 205))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlFundoLayout.createSequentialGroup()
                                    .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNome)
                                        .addComponent(lblCategoria)
                                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblFornecedor)
                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblQuantidade)
                                        .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlFundoLayout.createSequentialGroup()
                                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(169, 169, 169)
                                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(pnlTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFundoLayout.createSequentialGroup()
                                                .addGap(537, 537, 537)
                                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(47, 47, 47))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFundoLayout.createSequentialGroup()
                                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFundoLayout.createSequentialGroup()
                                    .addComponent(lblTítulo)
                                    .addGap(28, 28, 28)
                                    .addComponent(lblUsuarioLogado)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSair))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTítulo)
                    .addComponent(lblUsuarioLogado)
                    .addComponent(btnSair))
                .addGap(18, 18, 18)
                .addComponent(lblGestaoProdutos)
                .addGap(18, 18, 18)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCategoria)
                .addGap(14, 14, 14)
                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQuantidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         String termo = txtPesquisar.getText().trim();

        if (termo.isEmpty()) {
            carregarProdutos();
            
        return;        }

        ProdutoDAO produtoDAO = new ProdutoDAO();
        FornecedorDAO fornecedorDAO = new FornecedorDAO();

        try {

            java.util.List<Produtos> lista = produtoDAO.buscarPorNome(termo);

            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblProdutos.getModel();

            modelo.setRowCount(0);

            for (Produtos produto : lista) {

                Fornecedores fornecedor = fornecedorDAO.buscarPorId(produto.getIdFornecedor());

                String nomeFornecedor = "";

                if (fornecedor != null) {
                    nomeFornecedor = fornecedor.getNome();
                }

                modelo.addRow(new Object[]{
                    produto.getIdProduto(),
                    produto.getNome(),
                    produto.getCategoria(),
                    produto.getQuantidade(),
                    nomeFornecedor
                });
            }

            if (lista.isEmpty()) {

                javax.swing.JOptionPane.showMessageDialog(this, "Produto não encontrado!", "Resultado da busca", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível buscar o produto.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        int linha = tblProdutos.getSelectedRow();

        if (linha == -1) {
            return;
        }

        int id = Integer.parseInt(
                tblProdutos.getValueAt(linha, 0).toString()
        );

        ProdutoDAO dao = new ProdutoDAO();

        try {

            Produtos produto = dao.buscarPorId(id);

            if (produto != null) {

                txtNome.setText(produto.getNome());
                txtCategoria.setText(produto.getCategoria());
                txtQuantidade.setText(
                String.valueOf(produto.getQuantidade())
                );

                cbFornecedor.setSelectedIndex(0);

                for (int i = 0; i < fornecedoresCombo.size(); i++) {

                    if (fornecedoresCombo.get(i).getIdFornecedor()
                            == produto.getIdFornecedor()) {

                        cbFornecedor.setSelectedIndex(i + 1);
                        break;
                    }
                }
            }

        } catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "ENão foi possível carregar os dados do produto.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tblProdutosMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenu menu = new TelaMenu();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        Usuario usuarioLogado = Sessao.getUsuarioLogado();

        if (usuarioLogado == null ||
            usuarioLogado.getCargo().equalsIgnoreCase("Vendedor")) {

            javax.swing.JOptionPane.showMessageDialog(this, "Você não possui permissão para excluir produtos!", "Acesso negado", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int[] linhasSelecionadas = tblProdutos.getSelectedRows();

        if (linhasSelecionadas.length == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um produto na tabela para excluir!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (linhasSelecionadas.length > 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione apenas um produto para excluir!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int linha = linhasSelecionadas[0];

        int resposta = javax.swing.JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este produto?", "Confirmar exclusão", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);

        if (resposta == javax.swing.JOptionPane.YES_OPTION) {

            int idProduto = Integer.parseInt(
                tblProdutos.getValueAt(linha, 0).toString()
        );

        ProdutoDAO dao = new ProdutoDAO();

        try {

            dao.desativar(idProduto);

            javax.swing.JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!");

            txtNome.setText("");
            txtCategoria.setText("");
            txtQuantidade.setText("");
            cbFornecedor.setSelectedIndex(0);
            tblProdutos.clearSelection();

            carregarProdutos();

       } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível excluir o produto.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
      }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    
    Usuario usuarioLogado = Sessao.getUsuarioLogado();

    if (usuarioLogado == null ||
        usuarioLogado.getCargo().equalsIgnoreCase("Vendedor")) {

        javax.swing.JOptionPane.showMessageDialog(this, "Você não possui permissão para editar produtos!", "Acesso negado", javax.swing.JOptionPane.WARNING_MESSAGE);
         return;
    }
    
    int[] linhasSelecionadas = tblProdutos.getSelectedRows();

    if (linhasSelecionadas.length == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um produto na tabela para editar!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (linhasSelecionadas.length > 1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione apenas um produto para editar!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    String nome = txtNome.getText().trim();
    String categoria = txtCategoria.getText().trim();
    String quantidadeTexto = txtQuantidade.getText().trim();

    if (nome.isEmpty() || categoria.isEmpty() || quantidadeTexto.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (!nome.matches(".*[A-Za-zÀ-ÿ].*")) {
    javax.swing.JOptionPane.showMessageDialog(this, "O nome do produto deve conter pelo menos uma letra!", "Nome inválido", javax.swing.JOptionPane.WARNING_MESSAGE);
    return;
}

    if (!categoria.matches(".*[A-Za-zÀ-ÿ].*")) {
        javax.swing.JOptionPane.showMessageDialog(this, "A categoria deve conter pelo menos uma letra!", "Categoria inválida", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (cbFornecedor.getSelectedIndex() == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um fornecedor!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {

        int quantidade = Integer.parseInt(quantidadeTexto);

        if (quantidade < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "A quantidade não pode ser negativa!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int linha = linhasSelecionadas[0];

        int idProduto = Integer.parseInt(
                tblProdutos.getValueAt(linha, 0).toString()
        );

        int indiceFornecedor =
                cbFornecedor.getSelectedIndex() - 1;

        Fornecedores fornecedorSelecionado =
                fornecedoresCombo.get(indiceFornecedor);

        ProdutoDAO dao = new ProdutoDAO();

        Produtos produto = dao.buscarPorId(idProduto);

        if (produto == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Produto não encontrado no banco.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        produto.setNome(nome);
        produto.setCategoria(categoria);
        produto.setQuantidade(quantidade);
        produto.setIdFornecedor(
                fornecedorSelecionado.getIdFornecedor()
        );

        dao.atualizar(produto);

        javax.swing.JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!");

        txtNome.setText("");
        txtCategoria.setText("");
        txtQuantidade.setText("");
        cbFornecedor.setSelectedIndex(0);
        tblProdutos.clearSelection();

        carregarProdutos();

    } catch (NumberFormatException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "A quantidade deve ser um número inteiro!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);

    } catch (java.sql.SQLException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível atualizar o produto.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        Usuario usuarioLogado = Sessao.getUsuarioLogado();

        if (usuarioLogado == null ||
            usuarioLogado.getCargo().equalsIgnoreCase("Vendedor")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Você não possui permissão para cadastrar produtos!", "Acesso negado", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
    }
        
        String nome = txtNome.getText().trim();
        String categoria = txtCategoria.getText().trim();
        String quantidadeTexto = txtQuantidade.getText().trim();

        if (nome.isEmpty() || categoria.isEmpty() || quantidadeTexto.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!nome.matches(".*[A-Za-zÀ-ÿ].*")) {
        javax.swing.JOptionPane.showMessageDialog(this, "O nome do produto deve conter pelo menos uma letra!", "Nome inválido", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

        if (!categoria.matches(".*[A-Za-zÀ-ÿ].*")) {
            javax.swing.JOptionPane.showMessageDialog(this, "A categoria deve conter pelo menos uma letra!", "Categoria inválida", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (cbFornecedor.getSelectedIndex() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um fornecedor!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {

            int quantidade = Integer.parseInt(quantidadeTexto);

            if (quantidade < 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "A quantidade não pode ser negativa!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            int indiceFornecedor = cbFornecedor.getSelectedIndex() - 1;

            Fornecedores fornecedorSelecionado =
                    fornecedoresCombo.get(indiceFornecedor);

            Produtos produto = new Produtos();

            produto.setNome(nome);
            produto.setCategoria(categoria);
            produto.setQuantidade(quantidade);
            produto.setIdFornecedor(
                    fornecedorSelecionado.getIdFornecedor()
            );
            produto.setAtivo(true);

            ProdutoDAO dao = new ProdutoDAO();

            dao.cadastrar(produto);

            javax.swing.JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");

            txtNome.setText("");
            txtCategoria.setText("");
            txtQuantidade.setText("");
            cbFornecedor.setSelectedIndex(0);

            carregarProdutos();

        } catch (NumberFormatException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "A quantidade deve ser um número inteiro!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);

        } catch (java.sql.SQLException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível cadastrar o produto.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
    private javax.swing.JComboBox<String> cbFornecedor;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblFornecedor;
    private javax.swing.JLabel lblGestaoProdutos;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JScrollPane pnlTabelaProdutos;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables

}

package com.mycompany.gamingsmartsell;

public class TelaEstoque extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaEstoque.class.getName());
    
    private java.util.List<Produtos> produtosCombo = new java.util.ArrayList<>();
    
    private void carregarProdutosCombo() {

        cbProduto.removeAllItems();
        cbProduto.addItem("Selecione um produto");

        ProdutoDAO dao = new ProdutoDAO();

    try {

        produtosCombo = dao.listarAtivos();

        for (Produtos produto : produtosCombo) {
            cbProduto.addItem(produto.getNome());
        }

    } catch (java.sql.SQLException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível carregar os produtos.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}

    private void carregarEstoque() {

        javax.swing.table.DefaultTableModel modelo =
        (javax.swing.table.DefaultTableModel) tblEstoque.getModel();

        modelo.setRowCount(0);

        EstoqueDAO estoqueDAO = new EstoqueDAO();
        ProdutoDAO produtoDAO = new ProdutoDAO();

    try {

        java.util.List<Estoque> estoques = estoqueDAO.listarEstoqueAtivo();

        for (Estoque estoque : estoques) {

            Produtos produto =
                    produtoDAO.buscarPorId(estoque.getIdProduto());

            String nomeProduto = "";

            if (produto != null) {
                nomeProduto = produto.getNome();
            }

            modelo.addRow(new Object[]{
                estoque.getIdEstoque(),
                nomeProduto,
                estoque.getQuantidadeEstoque()
            });
        }

    } catch (java.sql.SQLException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível carregar o estoque.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}
    
      public TelaEstoque() {
        initComponents();
        
        Usuario usuario = Sessao.getUsuarioLogado();

        if (usuario != null) {
            lblUsuarioLogado.setText("Usuário: " + usuario.getNome() + " | Cargo: " + usuario.getCargo());
        }
        
        if (usuario != null) {

        String cargo = usuario.getCargo();

        if (cargo.equalsIgnoreCase("Vendedor")) {

            btnAjustarEstoque.setEnabled(false);
            btnAjustarQuantidade.setEnabled(false);
    }
}
        
        tblEstoque.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        pnlFundo.setPreferredSize(new java.awt.Dimension(800, 827));

        setSize(800, 827);
        setLocationRelativeTo(null);
        
        carregarProdutosCombo();
        carregarEstoque();
        
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblGestaoEstoque = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        txtQuantidadeEstoque = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        cbProduto = new javax.swing.JComboBox<>();
        btnAjustarEstoque = new javax.swing.JButton();
        btnAjustarQuantidade = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        pnlTabelaProdutos = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();
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

        lblGestaoEstoque.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblGestaoEstoque.setForeground(new java.awt.Color(245, 247, 245));
        lblGestaoEstoque.setText("GESTÃO DE ESTOQUE");

        lblProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProduto.setForeground(new java.awt.Color(245, 247, 245));
        lblProduto.setText("Selecionar produto:");

        txtQuantidadeEstoque.setBackground(new java.awt.Color(21, 26, 22));
        txtQuantidadeEstoque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQuantidadeEstoque.setForeground(new java.awt.Color(245, 247, 245));

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(245, 247, 245));
        lblQuantidade.setText("Quantidade em estoque:");

        cbProduto.setBackground(new java.awt.Color(21, 26, 22));
        cbProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbProduto.setForeground(new java.awt.Color(245, 247, 245));
        cbProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um produto", "Mouse Gamer", "Teclado Mecânico", "Headset Gamer", "Monitor Gamer" }));

        btnAjustarEstoque.setBackground(new java.awt.Color(34, 197, 94));
        btnAjustarEstoque.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAjustarEstoque.setForeground(new java.awt.Color(11, 15, 12));
        btnAjustarEstoque.setText("AJUSTAR ESTOQUE");
        btnAjustarEstoque.addActionListener(this::btnAjustarEstoqueActionPerformed);

        btnAjustarQuantidade.setBackground(new java.awt.Color(34, 197, 94));
        btnAjustarQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAjustarQuantidade.setForeground(new java.awt.Color(11, 15, 12));
        btnAjustarQuantidade.setText("AJUSTAR QUANTIDADE");
        btnAjustarQuantidade.addActionListener(this::btnAjustarQuantidadeActionPerformed);

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

        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUTO", "QUANTIDADE EM ESTOQUE"
            }
        ));
        tblEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstoqueMouseClicked(evt);
            }
        });
        pnlTabelaProdutos.setViewportView(tblEstoque);

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
                        .addGap(283, 283, 283)
                        .addComponent(lblGestaoEstoque))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblQuantidade, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtQuantidadeEstoque, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbProduto, javax.swing.GroupLayout.Alignment.LEADING, 0, 519, Short.MAX_VALUE))
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addComponent(lblTítulo)
                                .addGap(30, 30, 30)
                                .addComponent(lblUsuarioLogado)
                                .addGap(18, 18, 18)
                                .addComponent(btnSair))
                            .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlFundoLayout.createSequentialGroup()
                                    .addComponent(btnAjustarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAjustarQuantidade))
                                .addGroup(pnlFundoLayout.createSequentialGroup()
                                    .addComponent(lblPesquisar)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pnlTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(68, Short.MAX_VALUE))
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
                .addComponent(lblGestaoEstoque)
                .addGap(18, 18, 18)
                .addComponent(lblProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQuantidade)
                .addGap(14, 14, 14)
                .addComponent(txtQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjustarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAjustarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisar))
                .addGap(18, 18, 18)
                .addComponent(pnlTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String pesquisa = txtPesquisar.getText().trim();

        if (pesquisa.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Digite o nome do produto que deseja buscar!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        EstoqueDAO estoqueDAO = new EstoqueDAO();
        ProdutoDAO produtoDAO = new ProdutoDAO();

        try {

            java.util.List<Estoque> lista = estoqueDAO.buscarPorNomeProduto(pesquisa);

            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblEstoque.getModel();

            modelo.setRowCount(0);

            for (Estoque estoque : lista) {

                Produtos produto = produtoDAO.buscarPorId(estoque.getIdProduto());

                String nomeProduto = "";

                if (produto != null) {
                    nomeProduto = produto.getNome();
                }

                modelo.addRow(new Object[]{
                    estoque.getIdEstoque(),
                    nomeProduto,
                    estoque.getQuantidadeEstoque()});
            }

            if (lista.isEmpty()) {

                javax.swing.JOptionPane.showMessageDialog(this, "Produto não encontrado no estoque!", "Resultado da busca", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível buscar o produto no estoque.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstoqueMouseClicked
        int linha = tblEstoque.getSelectedRow();

        if (linha == -1) {
        return;
    }

        int idEstoque = Integer.parseInt(tblEstoque.getValueAt(linha, 0).toString());

        EstoqueDAO dao = new EstoqueDAO();

        try {

        Estoque estoque = dao.buscarPorId(idEstoque);

        if (estoque != null) {

            txtQuantidadeEstoque.setText(String.valueOf(estoque.getQuantidadeEstoque()));

            cbProduto.setSelectedIndex(0);

            for (int i = 0; i < produtosCombo.size(); i++) {

                if (produtosCombo.get(i).getIdProduto()
                        == estoque.getIdProduto()) {

                    cbProduto.setSelectedIndex(i + 1);
                    break;
                }
            }
        }

        } catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível carregar os dados do estoque.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_tblEstoqueMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenu menu = new TelaMenu();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAjustarQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjustarQuantidadeActionPerformed
        
        Usuario usuarioLogado = Sessao.getUsuarioLogado();

        if (usuarioLogado == null ||
                usuarioLogado.getCargo().equalsIgnoreCase("Vendedor")) {

            javax.swing.JOptionPane.showMessageDialog(this, "Você não possui permissão para ajustar a quantidade do estoque!", "Acesso negado", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int[] linhasSelecionadas = tblEstoque.getSelectedRows();

        if (linhasSelecionadas.length == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um produto na tabela para ajustar a quantidade!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (linhasSelecionadas.length > 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione apenas um produto para ajustar a quantidade!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String quantidadeTexto = txtQuantidadeEstoque.getText().trim();

        if (quantidadeTexto.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Informe a nova quantidade em estoque!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {

            int quantidade = Integer.parseInt(quantidadeTexto);

            if (quantidade < 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "A quantidade não pode ser negativa!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            int linha = linhasSelecionadas[0];

            int idEstoque = Integer.parseInt(
                    tblEstoque.getValueAt(linha, 0).toString()
            );

            EstoqueDAO dao = new EstoqueDAO();

            Estoque estoque = dao.buscarPorId(idEstoque);

            if (estoque == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Registro de estoque não encontrado no banco.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            estoque.setQuantidadeEstoque(quantidade);

            dao.atualizar(estoque);

            javax.swing.JOptionPane.showMessageDialog(this, "Quantidade atualizada com sucesso!");

            cbProduto.setSelectedIndex(0);
            txtQuantidadeEstoque.setText("");
            tblEstoque.clearSelection();

            carregarEstoque();

        } catch (NumberFormatException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "A quantidade deve ser um número inteiro!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);

        } catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível atualizar a quantidade do estoque.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAjustarQuantidadeActionPerformed

    private void btnAjustarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjustarEstoqueActionPerformed
        
        Usuario usuarioLogado = Sessao.getUsuarioLogado();

        if (usuarioLogado == null ||
                usuarioLogado.getCargo().equalsIgnoreCase("Vendedor")) {

            javax.swing.JOptionPane.showMessageDialog(this, "Você não possui permissão para ajustar o estoque!", "Acesso negado", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (cbProduto.getSelectedIndex() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um produto!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
    }

        String quantidadeTexto = txtQuantidadeEstoque.getText().trim();

        if (quantidadeTexto.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Informe a quantidade em estoque!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
    }

    try {

        int quantidade = Integer.parseInt(quantidadeTexto);

        if (quantidade < 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "A quantidade não pode ser negativa!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int indiceProduto = cbProduto.getSelectedIndex() - 1;

        Produtos produtoSelecionado =
        produtosCombo.get(indiceProduto);

        EstoqueDAO dao = new EstoqueDAO();

        Estoque estoqueExistente =
        dao.buscarPorProduto(produtoSelecionado.getIdProduto());

        if (estoqueExistente != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Este produto já está cadastrado no estoque!\n" + "Use AJUSTAR QUANTIDADE para alterá-lo.", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        Estoque estoque = new Estoque();

        estoque.setIdProduto(produtoSelecionado.getIdProduto());
        estoque.setQuantidadeEstoque(quantidade);

        dao.cadastrar(estoque);

        javax.swing.JOptionPane.showMessageDialog(this, "Estoque registrado com sucesso!");

        cbProduto.setSelectedIndex(0);
        txtQuantidadeEstoque.setText("");

        carregarEstoque();

    } catch (NumberFormatException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "A quantidade deve ser um número inteiro!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);

    } catch (java.sql.SQLException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível registrar o estoque.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_btnAjustarEstoqueActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Sessao.encerrar();
        
        TelaLogin login = new TelaLogin();
        login.setLocationRelativeTo(null);
        login.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjustarEstoque;
    private javax.swing.JButton btnAjustarQuantidade;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbProduto;
    private javax.swing.JLabel lblGestaoEstoque;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JScrollPane pnlTabelaProdutos;
    private javax.swing.JTable tblEstoque;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtQuantidadeEstoque;
    // End of variables declaration//GEN-END:variables
}

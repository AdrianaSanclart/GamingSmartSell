package com.mycompany.gamingsmartsell;

public class TelaVendas extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaVendas.class.getName());
    
    private java.util.List<Produtos> produtosCombo = new java.util.ArrayList<>();

      public TelaVendas() {
        initComponents();
        
        Usuario usuario = Sessao.getUsuarioLogado();

        if (usuario != null) {
            lblUsuarioLogado.setText("Usuário: " + usuario.getNome() + " | Cargo: " + usuario.getCargo());
        }
        
        if (usuario != null) {

        String cargo = usuario.getCargo();

        if (cargo.equalsIgnoreCase("Vendedor")) {

            btnEstornar.setEnabled(false);
    }
}
        
        tblVendas.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        pnlFundo.setPreferredSize(new java.awt.Dimension(785, 990));

        setSize(785, 990);
        setLocationRelativeTo(null);
        
        carregarProdutosCombo();
        carregarVendas();
        
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblGestaoVendas = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        cbProduto = new javax.swing.JComboBox<>();
        btnRegistrarVenda = new javax.swing.JButton();
        btnEstornar = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        pnlTabelaProdutos = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        lblFormaPagamento = new javax.swing.JLabel();
        cbPagamento = new javax.swing.JComboBox<>();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnCancelarVenda = new javax.swing.JButton();
        lblTotalVendas = new javax.swing.JLabel();

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

        lblGestaoVendas.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblGestaoVendas.setForeground(new java.awt.Color(245, 247, 245));
        lblGestaoVendas.setText("GESTÃO DE VENDAS");

        lblProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProduto.setForeground(new java.awt.Color(245, 247, 245));
        lblProduto.setText("Selecionar produto:");

        txtQuantidade.setBackground(new java.awt.Color(21, 26, 22));
        txtQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtQuantidade.setForeground(new java.awt.Color(245, 247, 245));

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(245, 247, 245));
        lblQuantidade.setText("Quantidade:");

        cbProduto.setBackground(new java.awt.Color(21, 26, 22));
        cbProduto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbProduto.setForeground(new java.awt.Color(245, 247, 245));
        cbProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um produto", "Mouse Gamer", "Teclado Mecânico", "Headset Gamer", "Monitor Gamer" }));

        btnRegistrarVenda.setBackground(new java.awt.Color(34, 197, 94));
        btnRegistrarVenda.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnRegistrarVenda.setForeground(new java.awt.Color(11, 15, 12));
        btnRegistrarVenda.setText("REGISTRAR VENDA");
        btnRegistrarVenda.addActionListener(this::btnRegistrarVendaActionPerformed);

        btnEstornar.setBackground(new java.awt.Color(34, 197, 94));
        btnEstornar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEstornar.setForeground(new java.awt.Color(11, 15, 12));
        btnEstornar.setText("ESTORNAR");
        btnEstornar.addActionListener(this::btnEstornarActionPerformed);

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

        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATA", "PRODUTO", "QNTD.", "PAGAMENTO", "VALOR", "VENDEDOR"
            }
        ));
        tblVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVendasMouseClicked(evt);
            }
        });
        pnlTabelaProdutos.setViewportView(tblVendas);

        btnBuscar.setBackground(new java.awt.Color(34, 197, 94));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(11, 15, 12));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        lblFormaPagamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFormaPagamento.setForeground(new java.awt.Color(245, 247, 245));
        lblFormaPagamento.setText("Forma de pagamento:");

        cbPagamento.setBackground(new java.awt.Color(21, 26, 22));
        cbPagamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbPagamento.setForeground(new java.awt.Color(245, 247, 245));
        cbPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a forma de pagamento", "Dinheiro", "Cartão de Débito", "Cartão de Crédito", "PIX" }));

        lblValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValor.setForeground(new java.awt.Color(245, 247, 245));
        lblValor.setText("Valor:");

        txtValor.setBackground(new java.awt.Color(21, 26, 22));
        txtValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtValor.setForeground(new java.awt.Color(245, 247, 245));

        btnCancelarVenda.setBackground(new java.awt.Color(34, 197, 94));
        btnCancelarVenda.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCancelarVenda.setForeground(new java.awt.Color(11, 15, 12));
        btnCancelarVenda.setText("CANCELAR VENDA");
        btnCancelarVenda.addActionListener(this::btnCancelarVendaActionPerformed);

        lblTotalVendas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTotalVendas.setForeground(new java.awt.Color(245, 247, 245));
        lblTotalVendas.setText("Total de vendas: R$ 0,00");

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValor)
                            .addComponent(lblFormaPagamento)
                            .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbPagamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblProduto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblQuantidade, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addComponent(lblTítulo)
                                .addGap(18, 18, 18)
                                .addComponent(lblUsuarioLogado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSair))
                            .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlFundoLayout.createSequentialGroup()
                                    .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundoLayout.createSequentialGroup()
                                            .addComponent(lblPesquisar)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(31, 31, 31))
                                        .addGroup(pnlFundoLayout.createSequentialGroup()
                                            .addComponent(btnRegistrarVenda)
                                            .addGap(125, 125, 125)
                                            .addComponent(btnCancelarVenda)
                                            .addGap(131, 131, 131)))
                                    .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnEstornar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                                .addGroup(pnlFundoLayout.createSequentialGroup()
                                    .addComponent(lblTotalVendas)
                                    .addGap(543, 543, 543))
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pnlTabelaProdutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(lblGestaoVendas)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTítulo)
                    .addComponent(lblUsuarioLogado)
                    .addComponent(btnSair))
                .addGap(18, 18, 18)
                .addComponent(lblGestaoVendas)
                .addGap(18, 18, 18)
                .addComponent(lblProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQuantidade)
                .addGap(14, 14, 14)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFormaPagamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstornar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisar)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotalVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
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
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 963, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVendaActionPerformed
        limparCamposVenda();
        tblVendas.clearSelection();

        javax.swing.JOptionPane.showMessageDialog(this, "Operação cancelada!");
    }//GEN-LAST:event_btnCancelarVendaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String pesquisa = txtPesquisar.getText().trim();

        if (pesquisa.isEmpty()) {
            carregarVendas();
            return;
        }

        VendaDAO vendaDAO = new VendaDAO();
        ProdutoDAO produtoDAO = new ProdutoDAO();
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        try {

            java.util.List<Vendas> vendas = vendaDAO.buscarPorProduto(pesquisa);

            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblVendas.getModel();

            modelo.setRowCount(0);

            for (Vendas venda : vendas) {

                Produtos produto = produtoDAO.buscarPorId(venda.getIdProduto());

                Usuario usuario = usuarioDAO.buscarPorId(venda.getIdUsuario());

                String nomeProduto = "";
                String nomeUsuario = "";

                if (produto != null) {
                    nomeProduto = produto.getNome();
                }

                if (usuario != null) {
                    nomeUsuario = usuario.getNome();
                }

                modelo.addRow(new Object[]{
                    venda.getIdVenda(),
                    venda.getDataVenda(),
                    nomeProduto,
                    venda.getQuantidade(),
                    venda.getPagamento(),
                    String.format("R$ %.2f", venda.getValorTotal()),
                    nomeUsuario
                });
            }

            atualizarTotalVendas();
            
            if (vendas.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Nenhuma venda encontrada para esse produto.", "Resultado da busca", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível realizar a busca das vendas.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendasMouseClicked
        int linha = tblVendas.getSelectedRow();

        if (linha != -1) {

            cbProduto.setSelectedItem(
                tblVendas.getValueAt(linha, 2).toString()
            );

            txtQuantidade.setText(
                tblVendas.getValueAt(linha, 3).toString()
            );

            cbPagamento.setSelectedItem(
                tblVendas.getValueAt(linha, 4).toString()
            );
        }
    }//GEN-LAST:event_tblVendasMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenu menu = new TelaMenu();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnEstornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstornarActionPerformed
        
        Usuario usuarioLogado = Sessao.getUsuarioLogado();

        if (usuarioLogado == null ||
                usuarioLogado.getCargo().equalsIgnoreCase("Vendedor")) {

            javax.swing.JOptionPane.showMessageDialog(this, "Você não possui permissão para estornar vendas!", "Acesso negado", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int[] linhasSelecionadas = tblVendas.getSelectedRows();

        if (linhasSelecionadas.length == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione uma venda para estornar!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (linhasSelecionadas.length > 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione apenas uma venda para estornar!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int linha = linhasSelecionadas[0];

        int idVenda = Integer.parseInt(
                tblVendas.getValueAt(linha, 0).toString()
        );

        int resposta = javax.swing.JOptionPane.showConfirmDialog(this, "Deseja realmente estornar esta venda?", "Confirmar estorno", javax.swing.JOptionPane.YES_NO_OPTION);

        if (resposta != javax.swing.JOptionPane.YES_OPTION) {
            return;
        }

        VendaDAO dao = new VendaDAO();

        try {

            dao.estornar(idVenda);

            javax.swing.JOptionPane.showMessageDialog(this, "Venda estornada com sucesso!");

            limparCamposVenda();
            carregarVendas();

        } catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível estornar a venda.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEstornarActionPerformed

    private void btnRegistrarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVendaActionPerformed
        if (cbProduto.getSelectedIndex() == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um produto!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

        String quantidadeTexto = txtQuantidade.getText().trim();
        String valorTexto = txtValor.getText().trim();

        if (quantidadeTexto.isEmpty() || valorTexto.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Preencha a quantidade e o valor!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (cbPagamento.getSelectedIndex() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione a forma de pagamento!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {

            int quantidade = Integer.parseInt(quantidadeTexto);

            if (quantidade <= 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "A quantidade deve ser maior que zero!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            valorTexto = valorTexto.replace(",", ".");

            double valorUnitario = Double.parseDouble(valorTexto);

            if (valorUnitario <= 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "O valor deve ser maior que zero!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            Usuario usuario = Sessao.getUsuarioLogado();

            if (usuario == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Nenhum usuário está logado.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            int indiceProduto = cbProduto.getSelectedIndex() - 1;

            Produtos produto = produtosCombo.get(indiceProduto);

            double valorTotal = quantidade * valorUnitario;

            Vendas venda = new Vendas();

            venda.setQuantidade(quantidade);
            venda.setPagamento(cbPagamento.getSelectedItem().toString());
            venda.setValorUnitario(valorUnitario);
            venda.setValorTotal(valorTotal);
            venda.setDataVenda(java.time.LocalDateTime.now());
            venda.setIdProduto(produto.getIdProduto());
            venda.setIdUsuario(usuario.getIdUsuario());

            VendaDAO dao = new VendaDAO();

            dao.cadastrar(venda);

            javax.swing.JOptionPane.showMessageDialog(this, "Venda registrada com sucesso!");

            limparCamposVenda();

            carregarVendas();

        } catch (NumberFormatException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Quantidade e valor devem conter números válidos!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);

        } catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível registrar a venda.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarVendaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Sessao.encerrar();
        
        TelaLogin login = new TelaLogin();
        login.setLocationRelativeTo(null);
        login.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
    
    private void carregarVendas() {

    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblVendas.getModel();
    
    modelo.setRowCount(0);

    VendaDAO vendaDAO = new VendaDAO();
    ProdutoDAO produtoDAO = new ProdutoDAO();
    UsuarioDAO usuarioDAO = new UsuarioDAO();

    double totalVendas = 0;
    
    try {

        java.util.List<Vendas> lista = vendaDAO.listarTodas();

        java.time.format.DateTimeFormatter formato =
                java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        for (Vendas venda : lista) {

            Produtos produto = produtoDAO.buscarPorId(venda.getIdProduto());

            Usuario usuario = usuarioDAO.buscarPorId(venda.getIdUsuario());

            String nomeProduto = "";
            String nomeVendedor = "";

            if (produto != null) {
                nomeProduto = produto.getNome();
            }

            if (usuario != null) {
                nomeVendedor = usuario.getNome();
            }

            modelo.addRow(new Object[]{
                venda.getIdVenda(),
                venda.getDataVenda().format(formato),
                nomeProduto,
                venda.getQuantidade(),
                venda.getPagamento(),
                String.format("R$ %.2f", venda.getValorTotal()),
                nomeVendedor
            });

            totalVendas += venda.getValorTotal();
        }
    
        lblTotalVendas.setText(String.format("Total de vendas: R$ %.2f", totalVendas));

    } catch (java.sql.SQLException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível carregar as vendas.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void limparCamposVenda() {

        cbProduto.setSelectedIndex(0);
        txtQuantidade.setText("");
        cbPagamento.setSelectedIndex(0);
        txtValor.setText("");
        tblVendas.clearSelection();
    }
    
    private void atualizarTotalVendas() {

        double total = 0;

        for (int i = 0; i < tblVendas.getRowCount(); i++) {

        String valorTexto =
                tblVendas.getValueAt(i, 5).toString();

        valorTexto = valorTexto
                .replace("R$", "")
                .replace(",", ".")
                .trim();

        try {
            total += Double.parseDouble(valorTexto);
        } catch (NumberFormatException e) {
       }
     }

        lblTotalVendas.setText(String.format("Total de vendas: R$ %.2f", total));
  }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelarVenda;
    private javax.swing.JButton btnEstornar;
    private javax.swing.JButton btnRegistrarVenda;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbPagamento;
    private javax.swing.JComboBox<String> cbProduto;
    private javax.swing.JLabel lblFormaPagamento;
    private javax.swing.JLabel lblGestaoVendas;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTotalVendas;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JScrollPane pnlTabelaProdutos;
    private javax.swing.JTable tblVendas;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}

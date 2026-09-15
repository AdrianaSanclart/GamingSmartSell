package com.mycompany.gamingsmartsell;

public class TelaRelatorios extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaRelatorios.class.getName());

      public TelaRelatorios() {
        initComponents();

        Usuario usuario = Sessao.getUsuarioLogado();

        if (usuario == null ||
                usuario.getCargo().equalsIgnoreCase("Vendedor")) {

            javax.swing.JOptionPane.showMessageDialog(this, "Você não possui permissão para acessar os relatórios!", "Acesso negado", javax.swing.JOptionPane.WARNING_MESSAGE);

            btnGerarRelatorio.setEnabled(false);
            btnExportarCsv.setEnabled(false);
            btnExportarExcel.setEnabled(false);

        } else {

            lblUsuarioLogado.setText("Usuário: " + usuario.getNome() + " | Cargo: " + usuario.getCargo());

            lblGeradoPor.setText("Gerado por: " + usuario.getNome());
        }

        tblRelatorios.setSelectionMode(
                javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION
        );

        pnlFundo.setPreferredSize(
                new java.awt.Dimension(800, 916)
        );

        setSize(800, 916);
        setLocationRelativeTo(null);
}
      
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblRelatorios = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        txtDataInicial = new javax.swing.JTextField();
        lblGeradoPor = new javax.swing.JLabel();
        btnGerarRelatorio = new javax.swing.JButton();
        btnLimparFiltros = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        pnlTabelaProdutos = new javax.swing.JScrollPane();
        tblRelatorios = new javax.swing.JTable();
        lblDataInicial = new javax.swing.JLabel();
        txtDataFinal = new javax.swing.JTextField();
        cbTipoRelatorio = new javax.swing.JComboBox<>();
        lblDataFinal1 = new javax.swing.JLabel();
        btnExportarCsv = new javax.swing.JButton();
        btnExportarExcel = new javax.swing.JButton();

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

        lblRelatorios.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblRelatorios.setForeground(new java.awt.Color(245, 247, 245));
        lblRelatorios.setText("RELATÓRIOS");

        lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(245, 247, 245));
        lblTipo.setText("Tipo de Relatório:");

        txtDataInicial.setBackground(new java.awt.Color(21, 26, 22));
        txtDataInicial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDataInicial.setForeground(new java.awt.Color(245, 247, 245));

        lblGeradoPor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGeradoPor.setForeground(new java.awt.Color(245, 247, 245));
        lblGeradoPor.setText("Gerado por: Admin");

        btnGerarRelatorio.setBackground(new java.awt.Color(34, 197, 94));
        btnGerarRelatorio.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnGerarRelatorio.setForeground(new java.awt.Color(11, 15, 12));
        btnGerarRelatorio.setText("GERAR RELATÓRIO");
        btnGerarRelatorio.addActionListener(this::btnGerarRelatorioActionPerformed);

        btnLimparFiltros.setBackground(new java.awt.Color(34, 197, 94));
        btnLimparFiltros.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLimparFiltros.setForeground(new java.awt.Color(11, 15, 12));
        btnLimparFiltros.setText("LIMPAR FILTROS");
        btnLimparFiltros.addActionListener(this::btnLimparFiltrosActionPerformed);

        btnVoltar.setBackground(new java.awt.Color(34, 197, 94));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(11, 15, 12));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(this::btnVoltarActionPerformed);

        tblRelatorios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATA", "DESCRIÇÃO", "QUANTIDADE", "VALOR", "USUÁRIO"
            }
        ));
        tblRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRelatoriosMouseClicked(evt);
            }
        });
        pnlTabelaProdutos.setViewportView(tblRelatorios);

        lblDataInicial.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataInicial.setForeground(new java.awt.Color(245, 247, 245));
        lblDataInicial.setText("Data Inicial:");

        txtDataFinal.setBackground(new java.awt.Color(21, 26, 22));
        txtDataFinal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDataFinal.setForeground(new java.awt.Color(245, 247, 245));

        cbTipoRelatorio.setBackground(new java.awt.Color(21, 26, 22));
        cbTipoRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbTipoRelatorio.setForeground(new java.awt.Color(245, 247, 245));
        cbTipoRelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um relatório", "Vendas", "Estoque", "Produtos", "Usuários" }));

        lblDataFinal1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDataFinal1.setForeground(new java.awt.Color(245, 247, 245));
        lblDataFinal1.setText("Data Final:");

        btnExportarCsv.setBackground(new java.awt.Color(34, 197, 94));
        btnExportarCsv.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnExportarCsv.setForeground(new java.awt.Color(11, 15, 12));
        btnExportarCsv.setText("EXPORTAR CSV");
        btnExportarCsv.addActionListener(this::btnExportarCsvActionPerformed);

        btnExportarExcel.setBackground(new java.awt.Color(34, 197, 94));
        btnExportarExcel.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnExportarExcel.setForeground(new java.awt.Color(11, 15, 12));
        btnExportarExcel.setText("EXPORTAR EXCEL");
        btnExportarExcel.addActionListener(this::btnExportarExcelActionPerformed);

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(lblRelatorios))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addComponent(lblTítulo)
                                .addGap(18, 18, 18)
                                .addComponent(lblUsuarioLogado)
                                .addGap(32, 32, 32)
                                .addComponent(btnSair))
                            .addComponent(lblGeradoPor)
                            .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(pnlFundoLayout.createSequentialGroup()
                                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                                .addComponent(btnGerarRelatorio)
                                                .addGap(373, 373, 373))
                                            .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblDataInicial)
                                                .addComponent(cbTipoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(lblTipo, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDataInicial, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDataFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(lblDataFinal1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLimparFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFundoLayout.createSequentialGroup()
                                        .addComponent(btnExportarCsv, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnExportarExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pnlTabelaProdutos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTítulo)
                    .addComponent(lblUsuarioLogado)
                    .addComponent(btnSair))
                .addGap(18, 18, 18)
                .addComponent(lblRelatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTipo)
                .addGap(12, 12, 12)
                .addComponent(cbTipoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDataInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDataFinal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerarRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblGeradoPor)
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExportarCsv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExportarExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
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
            .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenu menu = new TelaMenu();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
        if (cbTipoRelatorio.getSelectedIndex() == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Selecione um tipo de relatório!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
      }

        String dataInicialTexto = txtDataInicial.getText().trim();
        String dataFinalTexto = txtDataFinal.getText().trim();

        if (dataInicialTexto.isEmpty() || dataFinalTexto.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Preencha a data inicial e a data final!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
      }

        try {

        java.time.format.DateTimeFormatter formato =
                java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");

        java.time.LocalDate dataInicial =
                java.time.LocalDate.parse(dataInicialTexto, formato);

        java.time.LocalDate dataFinal =
                java.time.LocalDate.parse(dataFinalTexto, formato);

        if (dataInicial.isAfter(dataFinal)) {
            javax.swing.JOptionPane.showMessageDialog(this, "A data inicial não pode ser maior que a data final!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String tipo = cbTipoRelatorio.getSelectedItem().toString();

        javax.swing.table.DefaultTableModel modelo =
                (javax.swing.table.DefaultTableModel) tblRelatorios.getModel();

        modelo.setRowCount(0);

        switch (tipo) {

            case "Vendas":
                VendaDAO vendaDAO = new VendaDAO();
                ProdutoDAO produtoDAO = new ProdutoDAO();
                UsuarioDAO usuarioDAO = new UsuarioDAO();

                java.util.List<Vendas> vendas = vendaDAO.listarPorPeriodo(dataInicial, dataFinal);

                java.time.format.DateTimeFormatter formatoDataHora = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

                for (Vendas venda : vendas) {

                    Produtos produto = produtoDAO.buscarPorId(venda.getIdProduto());

                    Usuario usuarioVenda = usuarioDAO.buscarPorId(venda.getIdUsuario());

                    String nomeProduto = "";

                    if (produto != null) {
                        nomeProduto = produto.getNome();
                    }

                    String nomeUsuario = "";

                    if (usuarioVenda != null) {
                        nomeUsuario = usuarioVenda.getNome();
                    }

                    modelo.addRow(new Object[]{
                        venda.getDataVenda().format(formatoDataHora),
                        "Venda - " + nomeProduto,
                        venda.getQuantidade(),
                        String.format("R$ %.2f", venda.getValorTotal()),
                        nomeUsuario});
                }

                if (vendas.isEmpty()) {

                    javax.swing.JOptionPane.showMessageDialog(this, "Nenhuma venda encontrada no período informado.", "Relatório de Vendas", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }

                break;

            case "Estoque":
                EstoqueDAO estoqueDAO = new EstoqueDAO();
                ProdutoDAO produtoDAOEstoque = new ProdutoDAO();

                java.util.List<Estoque> estoques = estoqueDAO.listarEstoqueAtivo();

                Usuario usuarioLogadoEstoque = Sessao.getUsuarioLogado();

                String nomeUsuarioEstoque = "";

                if (usuarioLogadoEstoque != null) {
                    nomeUsuarioEstoque = usuarioLogadoEstoque.getNome();
                }

                for (Estoque estoque : estoques) {

                    Produtos produtoEstoque = produtoDAOEstoque.buscarPorId(estoque.getIdProduto());

                    String nomeProdutoEstoque = "";

                    if (produtoEstoque != null) {
                        nomeProdutoEstoque = produtoEstoque.getNome();
                    }

                    modelo.addRow(new Object[]{
                        java.time.LocalDate.now().format(formato),
                        nomeProdutoEstoque,
                        estoque.getQuantidadeEstoque(),
                        "-",
                        nomeUsuarioEstoque
                    });
                }

                if (estoques.isEmpty()) {

                    javax.swing.JOptionPane.showMessageDialog(this, "Nenhum produto encontrado no estoque.", "Relatório de Estoque", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }

                break;

            case "Produtos":
                ProdutoDAO produtoDAORelatorio = new ProdutoDAO();

                java.util.List<Produtos> produtos = produtoDAORelatorio.listarTodosAtivos();

                Usuario usuarioLogadoProdutos = Sessao.getUsuarioLogado();

                String nomeUsuarioProdutos = "";

                if (usuarioLogadoProdutos != null) {
                    nomeUsuarioProdutos = usuarioLogadoProdutos.getNome();
                }

                for (Produtos produto : produtos) {

                    modelo.addRow(new Object[]{
                        java.time.LocalDate.now().format(formato),
                        produto.getNome(),
                        produto.getQuantidade(),
                        "-",
                        nomeUsuarioProdutos
                    });
                }

                if (produtos.isEmpty()) {

                    javax.swing.JOptionPane.showMessageDialog(this, "Nenhum produto ativo encontrado.", "Relatório de Produtos", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }

                break;

            case "Usuários":
                UsuarioDAO usuarioDAORelatorio = new UsuarioDAO();

                java.util.List<Usuario> usuarios = usuarioDAORelatorio.listarTodosAtivos();

                Usuario usuarioLogadoUsuarios = Sessao.getUsuarioLogado();

                String nomeUsuarioGerador = "";

                if (usuarioLogadoUsuarios != null) {
                    nomeUsuarioGerador = usuarioLogadoUsuarios.getNome();
                }

                for (Usuario usuarioRelatorio : usuarios) {

                    modelo.addRow(new Object[]{
                        java.time.LocalDate.now().format(formato),
                        "Usuário - " + usuarioRelatorio.getNome()
                        + " | Cargo: " + usuarioRelatorio.getCargo(),
                        1,
                        "-",
                        nomeUsuarioGerador
                    });
                }

                if (usuarios.isEmpty()) {

                    javax.swing.JOptionPane.showMessageDialog(this, "Nenhum usuário ativo encontrado.", "Relatório de Usuários", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                }

                break;
        }

        Usuario usuarioLogado = Sessao.getUsuarioLogado();

        if (usuarioLogado == null) {

            javax.swing.JOptionPane.showMessageDialog(this, "Nenhum usuário está logado.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);

            return;
        }

        lblGeradoPor.setText("Gerado por: " + usuarioLogado.getNome());

        Relatorios relatorio = new Relatorios();

        relatorio.setNomeRelatorio("Relatório de " + tipo);

        relatorio.setDataGeracao(java.time.LocalDateTime.now());

        relatorio.setIdUsuario(usuarioLogado.getIdUsuario());

        RelatorioDAO relatorioDAO = new RelatorioDAO();

        relatorioDAO.cadastrar(relatorio);

        javax.swing.JOptionPane.showMessageDialog(this, "Relatório gerado com sucesso!" );

      } catch (java.time.format.DateTimeParseException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "Digite as datas no formato dd/MM/aaaa.", "Data inválida", javax.swing.JOptionPane.ERROR_MESSAGE);
      }
        catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível gerar o relatório.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed
}
    
    private void tblRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRelatoriosMouseClicked
        // Nenhuma ação necessária ao clicar na tabela.
    }//GEN-LAST:event_tblRelatoriosMouseClicked

    private void btnLimparFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparFiltrosActionPerformed
        cbTipoRelatorio.setSelectedIndex(0);
        txtDataInicial.setText("");
        txtDataFinal.setText("");

        javax.swing.table.DefaultTableModel modelo =
                (javax.swing.table.DefaultTableModel) tblRelatorios.getModel();

        modelo.setRowCount(0);

        tblRelatorios.clearSelection();

        javax.swing.JOptionPane.showMessageDialog(this, "Filtros limpos!");
    }//GEN-LAST:event_btnLimparFiltrosActionPerformed

    private void btnExportarCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarCsvActionPerformed
        if (tblRelatorios.getRowCount() == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Gere um relatório antes de exportar!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
      }

        javax.swing.JFileChooser seletor = new javax.swing.JFileChooser();

        seletor.setDialogTitle("Salvar relatório CSV");
        seletor.setSelectedFile(new java.io.File("relatorio.csv"));

        int resultado = seletor.showSaveDialog(this);

        if (resultado == javax.swing.JFileChooser.APPROVE_OPTION) {

        java.io.File arquivo = seletor.getSelectedFile();

        try (java.io.PrintWriter escritor =
                new java.io.PrintWriter(
                        new java.io.OutputStreamWriter(
                                new java.io.FileOutputStream(arquivo),
                                java.nio.charset.StandardCharsets.UTF_8
                        )
                )) {

            for (int coluna = 0;
                    coluna < tblRelatorios.getColumnCount();
                    coluna++) {

                escritor.print(
                        tblRelatorios.getColumnName(coluna)
                );

                if (coluna < tblRelatorios.getColumnCount() - 1) {
                    escritor.print(";");
                }
            }

            escritor.println();

            for (int linha = 0;
                    linha < tblRelatorios.getRowCount();
                    linha++) {

                for (int coluna = 0;
                        coluna < tblRelatorios.getColumnCount();
                        coluna++) {

                    escritor.print(
                            tblRelatorios.getValueAt(linha, coluna)
                    );

                    if (coluna < tblRelatorios.getColumnCount() - 1) {
                        escritor.print(";");
                    }
                }

                escritor.println();
            }

            javax.swing.JOptionPane.showMessageDialog(this, "Relatório CSV exportado com sucesso!");

        } catch (java.io.IOException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao exportar o relatório.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
      }
    }//GEN-LAST:event_btnExportarCsvActionPerformed

    private void btnExportarExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarExcelActionPerformed
        if (tblRelatorios.getRowCount() == 0) {
        javax.swing.JOptionPane.showMessageDialog(this, "Gere um relatório antes de exportar!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
      }

        javax.swing.JFileChooser seletor = new javax.swing.JFileChooser();
        seletor.setDialogTitle("Salvar relatório Excel");
        seletor.setSelectedFile(new java.io.File("relatorio.xlsx"));

        int resultado = seletor.showSaveDialog(this);

        if (resultado == javax.swing.JFileChooser.APPROVE_OPTION) {

        java.io.File arquivo = seletor.getSelectedFile();

        if (!arquivo.getName().toLowerCase().endsWith(".xlsx")) {
            arquivo = new java.io.File(
                    arquivo.getAbsolutePath() + ".xlsx"
            );
        }

        try (
            org.apache.poi.xssf.usermodel.XSSFWorkbook workbook =
                    new org.apache.poi.xssf.usermodel.XSSFWorkbook();

            java.io.FileOutputStream saida =
                    new java.io.FileOutputStream(arquivo)
        ) {

            org.apache.poi.ss.usermodel.Sheet planilha =
                    workbook.createSheet("Relatório");

            org.apache.poi.ss.usermodel.Row cabecalho =
                    planilha.createRow(0);

            for (int coluna = 0;
                    coluna < tblRelatorios.getColumnCount();
                    coluna++) {

                org.apache.poi.ss.usermodel.Cell celula =
                        cabecalho.createCell(coluna);

                celula.setCellValue(
                        tblRelatorios.getColumnName(coluna)
                );
            }

            for (int linha = 0;
                    linha < tblRelatorios.getRowCount();
                    linha++) {

                org.apache.poi.ss.usermodel.Row linhaExcel =
                        planilha.createRow(linha + 1);

                for (int coluna = 0;
                        coluna < tblRelatorios.getColumnCount();
                        coluna++) {

                    org.apache.poi.ss.usermodel.Cell celula =
                            linhaExcel.createCell(coluna);

                    Object valor =
                            tblRelatorios.getValueAt(linha, coluna);

                    celula.setCellValue(
                            valor != null ? valor.toString() : ""
                    );
                }
            }

            for (int coluna = 0;
                    coluna < tblRelatorios.getColumnCount();
                    coluna++) {

                planilha.autoSizeColumn(coluna);
            }

            workbook.write(saida);

            javax.swing.JOptionPane.showMessageDialog(this, "Relatório Excel exportado com sucesso!");

        } catch (java.io.IOException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao exportar o relatório.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
      }
    }//GEN-LAST:event_btnExportarExcelActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Sessao.encerrar();
        
        TelaLogin login = new TelaLogin();
        login.setLocationRelativeTo(null);
        login.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportarCsv;
    private javax.swing.JButton btnExportarExcel;
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JButton btnLimparFiltros;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbTipoRelatorio;
    private javax.swing.JLabel lblDataFinal1;
    private javax.swing.JLabel lblDataInicial;
    private javax.swing.JLabel lblGeradoPor;
    private javax.swing.JLabel lblRelatorios;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JScrollPane pnlTabelaProdutos;
    private javax.swing.JTable tblRelatorios;
    private javax.swing.JTextField txtDataFinal;
    private javax.swing.JTextField txtDataInicial;
    // End of variables declaration//GEN-END:variables
}

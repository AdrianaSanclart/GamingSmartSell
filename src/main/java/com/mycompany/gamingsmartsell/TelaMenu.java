package com.mycompany.gamingsmartsell;

public class TelaMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaMenu.class.getName());

    public TelaMenu() {
        initComponents();
        
        Usuario usuario = Sessao.getUsuarioLogado();

        if (usuario != null) {
        lblUsuarioLogado.setText("Usuário: " + usuario.getNome() + " | Cargo: " + usuario.getCargo());
      }
        
        if (usuario != null) {

        String cargo = usuario.getCargo();

        if (!cargo.equalsIgnoreCase("Administrador")) {
            btnUsuarios.setEnabled(false);
        }
        
        if (cargo.equalsIgnoreCase("Vendedor")) {
            btnRelatorios.setEnabled(false);
        }
      }  
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblMenuPrincipal = new javax.swing.JLabel();
        btnUsuarios = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnVendas = new javax.swing.JButton();
        btnProdutos = new javax.swing.JButton();
        btnFornecedores = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFundo.setBackground(new java.awt.Color(11, 15, 12));

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(57, 255, 136));
        lblTitulo.setText("GAMING SMART SELL");

        lblUsuarioLogado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsuarioLogado.setForeground(new java.awt.Color(245, 247, 245));
        lblUsuarioLogado.setText("Usuário: Admin | Cargo: Administrador");

        btnSair.setBackground(new java.awt.Color(34, 197, 94));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(11, 15, 12));
        btnSair.setText("SAIR");
        btnSair.addActionListener(this::btnSairActionPerformed);

        lblMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblMenuPrincipal.setForeground(new java.awt.Color(245, 247, 245));
        lblMenuPrincipal.setText("MENU PRINCIPAL");

        btnUsuarios.setBackground(new java.awt.Color(21, 26, 22));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(57, 255, 136));
        btnUsuarios.setText("USUÁRIOS");
        btnUsuarios.addActionListener(this::btnUsuariosActionPerformed);

        btnEstoque.setBackground(new java.awt.Color(21, 26, 22));
        btnEstoque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEstoque.setForeground(new java.awt.Color(57, 255, 136));
        btnEstoque.setText("ESTOQUE");
        btnEstoque.addActionListener(this::btnEstoqueActionPerformed);

        btnVendas.setBackground(new java.awt.Color(21, 26, 22));
        btnVendas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVendas.setForeground(new java.awt.Color(57, 255, 136));
        btnVendas.setText("VENDAS");
        btnVendas.addActionListener(this::btnVendasActionPerformed);

        btnProdutos.setBackground(new java.awt.Color(21, 26, 22));
        btnProdutos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnProdutos.setForeground(new java.awt.Color(57, 255, 136));
        btnProdutos.setText("PRODUTOS");
        btnProdutos.addActionListener(this::btnProdutosActionPerformed);

        btnFornecedores.setBackground(new java.awt.Color(21, 26, 22));
        btnFornecedores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFornecedores.setForeground(new java.awt.Color(57, 255, 136));
        btnFornecedores.setText("FORNECEDORES");
        btnFornecedores.addActionListener(this::btnFornecedoresActionPerformed);

        btnRelatorios.setBackground(new java.awt.Color(21, 26, 22));
        btnRelatorios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRelatorios.setForeground(new java.awt.Color(57, 255, 136));
        btnRelatorios.setText("RELATÓRIOS");
        btnRelatorios.addActionListener(this::btnRelatoriosActionPerformed);

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMenuPrincipal)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(btnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                .addGap(79, 79, 79)
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(btnEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(33, 33, 33)
                        .addComponent(lblUsuarioLogado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btnSair)
                        .addGap(33, 33, 33))))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblUsuarioLogado)
                    .addComponent(btnSair))
                .addGap(18, 18, 18)
                .addComponent(lblMenuPrincipal)
                .addGap(39, 39, 39)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        TelaProdutos produtos = new TelaProdutos();
        produtos.setLocationRelativeTo(null);
        produtos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        TelaEstoque estoque = new TelaEstoque();
        estoque.setLocationRelativeTo(null);
        estoque.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        TelaVendas vendas = new TelaVendas();
        vendas.setLocationRelativeTo(null);
        vendas.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedoresActionPerformed
        TelaFornecedores fornecedores = new TelaFornecedores();
        fornecedores.setLocationRelativeTo(null);
        fornecedores.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnFornecedoresActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        TelaUsuarios usuarios = new TelaUsuarios();
        usuarios.setLocationRelativeTo(null);
        usuarios.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        TelaRelatorios relatorios = new TelaRelatorios();
        relatorios.setLocationRelativeTo(null);
        relatorios.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Sessao.encerrar();
        
        TelaLogin login = new TelaLogin();
        login.setLocationRelativeTo(null);
        login.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnFornecedores;
    private javax.swing.JButton btnProdutos;
    private javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVendas;
    private javax.swing.JLabel lblMenuPrincipal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JPanel pnlFundo;
    // End of variables declaration//GEN-END:variables
}

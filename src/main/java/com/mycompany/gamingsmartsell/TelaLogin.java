package com.mycompany.gamingsmartsell;

public class TelaLogin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaLogin.class.getName());

      public TelaLogin() {
        initComponents();
        
        getRootPane().setDefaultButton(btnEntrar);
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        pnlFundo2 = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        chkLembrar = new javax.swing.JCheckBox();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gaming Smart Sell - Login");

        pnlFundo.setBackground(new java.awt.Color(11, 15, 12));

        lblTítulo.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(57, 255, 136));
        lblTítulo.setText("GAMING SMART SELL");

        pnlFundo2.setBackground(new java.awt.Color(21, 26, 22));

        lblLogin.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(57, 255, 136));
        lblLogin.setText("LOGIN");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(245, 247, 245));
        lblEmail.setText("E-mail");

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(245, 247, 245));
        lblSenha.setText("Senha");

        chkLembrar.setBackground(new java.awt.Color(21, 26, 22));
        chkLembrar.setForeground(new java.awt.Color(245, 247, 245));
        chkLembrar.setText("Lembre-se de mim");

        btnEntrar.setBackground(new java.awt.Color(34, 197, 94));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(11, 15, 12));
        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(this::btnEntrarActionPerformed);

        javax.swing.GroupLayout pnlFundo2Layout = new javax.swing.GroupLayout(pnlFundo2);
        pnlFundo2.setLayout(pnlFundo2Layout);
        pnlFundo2Layout.setHorizontalGroup(
            pnlFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFundo2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(pnlFundo2Layout.createSequentialGroup()
                .addGroup(pnlFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundo2Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(lblLogin))
                    .addGroup(pnlFundo2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(pnlFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkLembrar)
                            .addGroup(pnlFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblSenha)
                                .addComponent(lblEmail)
                                .addComponent(txtUsuario)
                                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnlFundo2Layout.setVerticalGroup(
            pnlFundo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundo2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblLogin)
                .addGap(35, 35, 35)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chkLembrar)
                .addGap(37, 37, 37)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(pnlFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(lblTítulo)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTítulo)
                .addGap(93, 93, 93)
                .addComponent(pnlFundo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String email = txtUsuario.getText().trim();
        String senha = new String(txtSenha.getPassword());

        if (email.isEmpty() || senha.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Preencha o e-mail e a senha!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

         UsuarioDAO dao = new UsuarioDAO();

    try {

        Usuario usuario = dao.autenticar(email, senha);

        if (usuario != null) {

            Sessao.setUsuarioLogado(usuario);
            
            TelaMenu menu = new TelaMenu();
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);

            this.dispose();

        } else {

            javax.swing.JOptionPane.showMessageDialog(this, "E-mail e/ou senha incorretos!", "Erro de Login", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

    } catch (java.sql.SQLException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível acessar o banco de dados. Verifique a conexão e tente novamente.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_btnEntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JCheckBox chkLembrar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JPanel pnlFundo2;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

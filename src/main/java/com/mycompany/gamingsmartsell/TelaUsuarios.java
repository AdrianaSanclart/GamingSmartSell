package com.mycompany.gamingsmartsell;

public class TelaUsuarios extends javax.swing.JFrame {
      
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaUsuarios.class.getName());

    private void carregarUsuarios() {

    javax.swing.table.DefaultTableModel modelo =
            (javax.swing.table.DefaultTableModel) tblUsuarios.getModel();

    modelo.setRowCount(0);

    UsuarioDAO dao = new UsuarioDAO();

    try {

        java.util.List<Usuario> lista = dao.listarAtivos();

        for (Usuario usuario : lista) {

            modelo.addRow(new Object[]{
                usuario.getIdUsuario(),
                usuario.getNome(),
                usuario.getCpf(),
                usuario.getCargo()
            });
        }

    } catch (java.sql.SQLException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível carregar os usuários.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}
    
      public TelaUsuarios() {
        initComponents();
        
        Usuario usuario = Sessao.getUsuarioLogado();

        if (usuario != null) {
            lblUsuarioLogado.setText("Usuário: " + usuario.getNome() + " | Cargo: " + usuario.getCargo());
        }
        if (usuario != null
        && !usuario.getCargo().equalsIgnoreCase("Administrador")) {

        btnCadastrar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnDesativar.setEnabled(false);
}
        tblUsuarios.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        pnlFundo.setPreferredSize(new java.awt.Dimension(814, 1010));

        setSize(814, 1010);
        setLocationRelativeTo(null);
        
        carregarUsuarios();
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFundo = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        lblUsuarioLogado = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblGestaoUsuarios = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDesativar = new javax.swing.JButton();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        pnlTabelaProdutos = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        lblEmail1 = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        lblCargo1 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        cbCargo = new javax.swing.JComboBox<>();

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

        lblGestaoUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblGestaoUsuarios.setForeground(new java.awt.Color(245, 247, 245));
        lblGestaoUsuarios.setText("GESTÃO DE USUÁRIOS");

        lblNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(245, 247, 245));
        lblNome.setText("Nome:");

        txtEmail.setBackground(new java.awt.Color(21, 26, 22));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(245, 247, 245));

        lblCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(245, 247, 245));
        lblCPF.setText("CPF:");

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

        btnDesativar.setBackground(new java.awt.Color(34, 197, 94));
        btnDesativar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnDesativar.setForeground(new java.awt.Color(11, 15, 12));
        btnDesativar.setText("DESATIVAR");
        btnDesativar.addActionListener(this::btnDesativarActionPerformed);

        lblPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPesquisar.setForeground(new java.awt.Color(245, 247, 245));
        lblPesquisar.setText("Pesquisar usuário:");

        txtPesquisar.setBackground(new java.awt.Color(21, 26, 22));
        txtPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPesquisar.setForeground(new java.awt.Color(245, 247, 245));

        btnVoltar.setBackground(new java.awt.Color(34, 197, 94));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(11, 15, 12));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(this::btnVoltarActionPerformed);

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "Cargo"
            }
        ));
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        pnlTabelaProdutos.setViewportView(tblUsuarios);

        btnBuscar.setBackground(new java.awt.Color(34, 197, 94));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(11, 15, 12));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        lblEmail1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail1.setForeground(new java.awt.Color(245, 247, 245));
        lblEmail1.setText("E-mail:");

        lblCargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(245, 247, 245));
        lblCargo.setText("Cargo:");

        txtCPF.setBackground(new java.awt.Color(21, 26, 22));
        txtCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCPF.setForeground(new java.awt.Color(245, 247, 245));

        lblCargo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCargo1.setForeground(new java.awt.Color(245, 247, 245));
        lblCargo1.setText("Senha:");

        txtSenha.setBackground(new java.awt.Color(21, 26, 22));
        txtSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(245, 247, 245));

        cbCargo.setBackground(new java.awt.Color(21, 26, 22));
        cbCargo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCargo.setForeground(new java.awt.Color(245, 247, 245));
        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um cargo", "Administrador", "Gerente", "Vendedor" }));

        javax.swing.GroupLayout pnlFundoLayout = new javax.swing.GroupLayout(pnlFundo);
        pnlFundo.setLayout(pnlFundoLayout);
        pnlFundoLayout.setHorizontalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(lblGestaoUsuarios))
                    .addGroup(pnlFundoLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFundoLayout.createSequentialGroup()
                                        .addComponent(txtPesquisar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlFundoLayout.createSequentialGroup()
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(136, 136, 136)
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDesativar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47))
                            .addGroup(pnlFundoLayout.createSequentialGroup()
                                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFundoLayout.createSequentialGroup()
                                        .addGap(537, 537, 537)
                                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblEmail1)
                                    .addComponent(lblCargo)
                                    .addComponent(lblCargo1)
                                    .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNome, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pnlTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPesquisar)
                                    .addGroup(pnlFundoLayout.createSequentialGroup()
                                        .addComponent(lblTítulo)
                                        .addGap(30, 30, 30)
                                        .addComponent(lblUsuarioLogado)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSair)))
                                .addGap(0, 37, Short.MAX_VALUE)))))
                .addGap(49, 49, 49))
        );
        pnlFundoLayout.setVerticalGroup(
            pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFundoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTítulo)
                    .addComponent(lblUsuarioLogado)
                    .addComponent(btnSair))
                .addGap(35, 35, 35)
                .addComponent(lblGestaoUsuarios)
                .addGap(18, 18, 18)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblEmail1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCargo)
                .addGap(18, 18, 18)
                .addComponent(cbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblCargo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesativar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlTabelaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(pnlFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenu menu = new TelaMenu();
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
       
        Usuario usuarioLogado = Sessao.getUsuarioLogado();

        if (usuarioLogado == null ||
            !usuarioLogado.getCargo().equalsIgnoreCase("Administrador")) {

        javax.swing.JOptionPane.showMessageDialog(this, "Apenas administradores podem cadastrar usuários!", "Acesso negado", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
        
        String nome = txtNome.getText().trim();
        String email = txtEmail.getText().trim();
        String cpf = txtCPF.getText().trim();
        String senha = txtSenha.getText().trim();

        if (nome.isEmpty() || email.isEmpty() || cpf.isEmpty() || senha.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!nome.matches("[A-Za-zÀ-ÿ ]+")) {
            javax.swing.JOptionPane.showMessageDialog(this, "O nome deve conter apenas letras!", "Nome inválido", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Digite um e-mail válido!", "E-mail inválido", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!cpf.matches("\\d{11}")) {
            javax.swing.JOptionPane.showMessageDialog(this, "O CPF deve conter exatamente 11 números!", "CPF inválido", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (cbCargo.getSelectedIndex() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um cargo!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String cargo = cbCargo.getSelectedItem().toString();

        Usuario usuario = new Usuario();

        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setCpf(cpf);
        usuario.setCargo(cargo);
        usuario.setSenha(senha);
        usuario.setAtivo(true);

        UsuarioDAO dao = new UsuarioDAO();

        try {

            dao.cadastrar(usuario);

            javax.swing.JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");

            txtNome.setText("");
            txtEmail.setText("");
            txtCPF.setText("");
            txtSenha.setText("");
            cbCargo.setSelectedIndex(0);

            carregarUsuarios();

        } catch (java.sql.SQLException e) {

            String mensagemErro = e.getMessage();

            if (mensagemErro != null && mensagemErro.contains("usuario.cpf")) {

                javax.swing.JOptionPane.showMessageDialog(this, "Este CPF já está cadastrado!", "CPF já cadastrado", javax.swing.JOptionPane.WARNING_MESSAGE);

            } else if (mensagemErro != null && mensagemErro.contains("usuario.email")) {

                javax.swing.JOptionPane.showMessageDialog(this, "Este e-mail já está cadastrado!", "E-mail já cadastrado", javax.swing.JOptionPane.WARNING_MESSAGE);

            } else {

                javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível cadastrar o usuário.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        int linha = tblUsuarios.getSelectedRow();

        if (linha == -1) {
            return;
        }

        int id = Integer.parseInt(
                tblUsuarios.getValueAt(linha, 0).toString()
        );
        
        UsuarioDAO dao = new UsuarioDAO();

    try {

        Usuario usuario = dao.buscarPorId(id);

        if (usuario != null) {

            txtNome.setText(usuario.getNome());
            txtEmail.setText(usuario.getEmail());
            txtCPF.setText(usuario.getCpf());
            cbCargo.setSelectedItem(usuario.getCargo());

            txtSenha.setText("");
        }

    } catch (java.sql.SQLException e) {

        javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível carregar os dados do usuário.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        Usuario usuarioLogado = Sessao.getUsuarioLogado();

        if (usuarioLogado == null ||
        !usuarioLogado.getCargo().equalsIgnoreCase("Administrador")) {

            javax.swing.JOptionPane.showMessageDialog(this, "Apenas administradores podem editar usuários!", "Acesso negado", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
    }

        int[] linhasSelecionadas = tblUsuarios.getSelectedRows();

        if (linhasSelecionadas.length == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um usuário na tabela para editar!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (linhasSelecionadas.length > 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione apenas um usuário para editar!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int linha = linhasSelecionadas[0];

        String nome = txtNome.getText().trim();
        String email = txtEmail.getText().trim();
        String cpf = txtCPF.getText().trim();
        String novaSenha = txtSenha.getText().trim();

        if (nome.isEmpty() || email.isEmpty() || cpf.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Preencha o nome, o e-mail e o CPF!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!nome.matches("[A-Za-zÀ-ÿ ]+")) {
            javax.swing.JOptionPane.showMessageDialog(this, "O nome deve conter apenas letras!", "Nome inválido", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Digite um e-mail válido!", "E-mail inválido", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

        if (!cpf.matches("\\d{11}")) {
            javax.swing.JOptionPane.showMessageDialog(this, "O CPF deve conter exatamente 11 números!", "CPF inválido", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }
        
        if (cbCargo.getSelectedIndex() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um cargo!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = Integer.parseInt(
            tblUsuarios.getValueAt(linha, 0).toString()
        );

        String cargo = cbCargo.getSelectedItem().toString();

        UsuarioDAO dao = new UsuarioDAO();

        try {

            Usuario usuario = dao.buscarPorId(id);

            if (usuario == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Usuário não encontrado no banco.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }

            usuario.setNome(nome);
            usuario.setEmail(email);
            usuario.setCpf(cpf);
            usuario.setCargo(cargo);

            if (!novaSenha.isEmpty()) {
                usuario.setSenha(novaSenha);
            }

            dao.atualizar(usuario);

            javax.swing.JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso!");

            txtNome.setText("");
            txtEmail.setText("");
            txtCPF.setText("");
            txtSenha.setText("");
            cbCargo.setSelectedIndex(0);
            tblUsuarios.clearSelection();

            carregarUsuarios();

        } catch (java.sql.SQLException e) {

         String mensagemErro = e.getMessage();

         if (mensagemErro != null &&
                 mensagemErro.contains("usuario.cpf")) {

             javax.swing.JOptionPane.showMessageDialog(this, "Este CPF já está cadastrado!", "CPF já cadastrado", javax.swing.JOptionPane.WARNING_MESSAGE);

         } else if (mensagemErro != null &&
                 mensagemErro.contains("usuario.email")) {

             javax.swing.JOptionPane.showMessageDialog(this, "Este e-mail já está cadastrado!", "E-mail já cadastrado", javax.swing.JOptionPane.WARNING_MESSAGE);

         } else {

             javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível atualizar o usuário.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
         }
      }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesativarActionPerformed
        
        Usuario usuarioLogado = Sessao.getUsuarioLogado();

        if (usuarioLogado == null ||
            !usuarioLogado.getCargo().equalsIgnoreCase("Administrador")) {

            javax.swing.JOptionPane.showMessageDialog(this, "Apenas administradores podem desativar usuários!", "Acesso negado", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
    }
        
        int[] linhasSelecionadas = tblUsuarios.getSelectedRows();

        if (linhasSelecionadas.length == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um usuário na tabela para desativar!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (linhasSelecionadas.length > 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione apenas um usuário para desativar!", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int linha = linhasSelecionadas[0];

        int resposta = javax.swing.JOptionPane.showConfirmDialog(this, "Deseja realmente desativar este usuário?", "Confirmar desativação", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);

        if (resposta == javax.swing.JOptionPane.YES_OPTION) {

            int id = Integer.parseInt(
                    tblUsuarios.getValueAt(linha, 0).toString()
            );

            UsuarioDAO dao = new UsuarioDAO();

        try {

            dao.desativar(id);

            javax.swing.JOptionPane.showMessageDialog(this, "Usuário desativado com sucesso!");

            txtNome.setText("");
            txtEmail.setText("");
            txtCPF.setText("");
            txtSenha.setText("");
            cbCargo.setSelectedIndex(0);
            tblUsuarios.clearSelection();

            carregarUsuarios();

        } catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível desativar o usuário.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
      }
    }//GEN-LAST:event_btnDesativarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String termo = txtPesquisar.getText().trim();

        if (termo.isEmpty()) {
            carregarUsuarios();
            return;
        }

        UsuarioDAO dao = new UsuarioDAO();

        try {

            java.util.List<Usuario> usuarios = dao.buscar(termo);

            javax.swing.table.DefaultTableModel modelo =
                    (javax.swing.table.DefaultTableModel) tblUsuarios.getModel();

            modelo.setRowCount(0);

            for (Usuario usuario : usuarios) {

                modelo.addRow(new Object[]{
                    usuario.getIdUsuario(),
                    usuario.getNome(),
                    usuario.getCpf(),
                    usuario.getCargo()
                });
            }

            if (usuarios.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Nenhum usuário encontrado!", "Pesquisa", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (java.sql.SQLException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Não foi possível realizar a busca.", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JButton btnDesativar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCargo1;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblGestaoUsuarios;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUsuarioLogado;
    private javax.swing.JPanel pnlFundo;
    private javax.swing.JScrollPane pnlTabelaProdutos;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}

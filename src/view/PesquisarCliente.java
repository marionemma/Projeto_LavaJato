package view;

import dao.ClienteDAO;
import javax.swing.JTextField;
import table.PesquisarClienteTableModel;
//import view.VeiculoView;

public class PesquisarCliente extends javax.swing.JFrame {

    public PesquisarCliente() {
        initComponents();
        tbPesquisarCliente.setModel(new PesquisarClienteTableModel(new ClienteDAO().Listartodos()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfPesquisarCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPesquisarCliente = new javax.swing.JTable();
        btCancelarPesquisarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfPesquisarCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfIdPesquisar = new javax.swing.JTextField();
        btAdicionarPesquisarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel4.setText("Nome Cliente");

        tfPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarClienteActionPerformed(evt);
            }
        });
        tfPesquisarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisarClienteKeyPressed(evt);
            }
        });

        tbPesquisarCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbPesquisarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPesquisarClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPesquisarCliente);

        btCancelarPesquisarCliente.setText("Cancelar");
        btCancelarPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarPesquisarClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("CPF");

        tfPesquisarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarCpfActionPerformed(evt);
            }
        });

        jLabel2.setText("Id");

        tfIdPesquisar.setEditable(false);

        btAdicionarPesquisarCliente.setText("Adicionar");
        btAdicionarPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarPesquisarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(btCancelarPesquisarCliente)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPesquisarCpf)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfIdPesquisar)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btAdicionarPesquisarCliente)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfIdPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfPesquisarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelarPesquisarCliente)
                    .addComponent(btAdicionarPesquisarCliente))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarClienteActionPerformed

    private void tfPesquisarClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisarClienteKeyPressed
        String pesquisa = tfPesquisarCliente.getText();
        tbPesquisarCliente.setModel(new PesquisarClienteTableModel(new ClienteDAO().ListartodosDescricao(pesquisa)));
    }//GEN-LAST:event_tfPesquisarClienteKeyPressed

    private void tbPesquisarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPesquisarClienteMouseClicked
        // TODO add your handling code here:
        tfIdPesquisar.setText(tbPesquisarCliente.getValueAt(tbPesquisarCliente.getSelectedRow(), PesquisarClienteTableModel.COL_ID_CLIENTE).toString());
        tfPesquisarCliente.setText(tbPesquisarCliente.getValueAt(tbPesquisarCliente.getSelectedRow(), PesquisarClienteTableModel.COL_NOME_CLIENTE).toString());
        tfPesquisarCpf.setText(tbPesquisarCliente.getValueAt(tbPesquisarCliente.getSelectedRow(), PesquisarClienteTableModel.COL_CPF_CLIENTE).toString());
    }//GEN-LAST:event_tbPesquisarClienteMouseClicked

    private void btCancelarPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarPesquisarClienteActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btCancelarPesquisarClienteActionPerformed

    private void btAdicionarPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarPesquisarClienteActionPerformed
        // TODO add your handling code here:
        this.descricaoDaPrincipal.setText(this.tfIdPesquisar.getText());
        this.dispose();
    }//GEN-LAST:event_btAdicionarPesquisarClienteActionPerformed

    private void tfPesquisarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarCpfActionPerformed

    JTextField descricaoDaPrincipal;
    
    public PesquisarCliente (JTextField descricao) {
        initComponents();
        this.descricaoDaPrincipal = descricao;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarPesquisarCliente;
    private javax.swing.JButton btCancelarPesquisarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPesquisarCliente;
    private javax.swing.JTextField tfIdPesquisar;
    private javax.swing.JTextField tfPesquisarCliente;
    private javax.swing.JTextField tfPesquisarCpf;
    // End of variables declaration//GEN-END:variables
    
}
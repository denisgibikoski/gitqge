
package com.qgenergia.controleportaria.view;

import com.qgenergia.controleportaria.control.JPADao;
import com.qgenergia.controleportaria.control.JPAutil;
import com.qgenergia.controleportaria.model.Portaria;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import javax.swing.JOptionPane;


public class TelaCadastro extends javax.swing.JFrame {

    private Portaria p = new Portaria();

    private JPAutil dao = new JPADao();

    private String clicado;
    
   
   
    public TelaCadastro() {
        initComponents();
                
        
        
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBEntrada = new javax.swing.JButton();
        jBSaida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFVeiculo = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter fmtPlaca = new javax.swing.text.MaskFormatter("UUU-####");

            jTFPlaca = new javax.swing.JFormattedTextField(fmtPlaca);
        }catch(Exception e ){
            e.printStackTrace();
        }
        jTFPlaca = new javax.swing.JTextField();
        jTFEmpresa = new javax.swing.JTextField();
        jTFPessoa1 = new javax.swing.JTextField();
        jTFPessoa3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTFPessoa2 = new javax.swing.JTextField();
        jTFPessoa4 = new javax.swing.JTextField();
        jTFPessoa5 = new javax.swing.JTextField();
        jCBAutorizacao = new javax.swing.JComboBox<>();
        jTFKm1 = new javax.swing.JTextField();
        jFormattedTextFieldData = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter fmtdata = new javax.swing.text.MaskFormatter("##/##/#### ##:##");

            jFormattedTextFieldData = new javax.swing.JFormattedTextField(fmtdata);
        }catch(Exception e ){
            e.printStackTrace();
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBEntrada.setText("Entrada");
        jBEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntradaActionPerformed(evt);
            }
        });

        jBSaida.setText("Saida");
        jBSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Veiculo :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("PLaca :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Empresa :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Pessoa 2 :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Pessoa 1 :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Pessoa 3 :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Pessoa 4 :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Pessoa 5 :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Autorização :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setText("Data e Hora :");

        try{
            javax.swing.text.MaskFormatter fmtPlaca = new javax.swing.text.MaskFormatter("UUU-####");

            jTFPlaca = new javax.swing.JFormattedTextField(fmtPlaca);
        }catch(Exception e ){
            e.printStackTrace();
        }
        try{
            javax.swing.text.MaskFormatter fmtPlaca = new javax.swing.text.MaskFormatter("UUU-####");

            jTFPlaca = new javax.swing.JFormattedTextField(fmtPlaca);
        }catch(Exception e ){
            e.printStackTrace();
        }

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("KM :");

        jCBAutorizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIGILANTE", "ANDERSON JOSE VENDRUSCOLO", "CHARLES RAMOS FABIENSKI", "DENIS GIBIKOSKI", "HUMBERTO CESAR DE CAMPOS", "IDEMAR SPADA", "IZAEL DOMINGOS PICCINATTO", "LUCIANO FERREIRA LOPES", "MARCO ANTONIO GONZATTI", "VENERI ANTONIO PAVAN", " " }));

        try {
            jFormattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/#### ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                        .addComponent(jBSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFVeiculo)
                                    .addComponent(jTFPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFKm1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jFormattedTextFieldData))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFPessoa3)
                            .addComponent(jTFPessoa2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFPessoa4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFPessoa5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCBAutorizacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFEmpresa)
                            .addComponent(jTFPessoa1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFormattedTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jTFVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jTFKm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jTFPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFPessoa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFPessoa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFPessoa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFPessoa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFPessoa5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jCBAutorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEntrada)
                    .addComponent(jBSaida))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntradaActionPerformed

        clicado = "E";

       

        //dao.salvar(getElementosTela());
        JOptionPane.showMessageDialog(this, "Aguarde Enquanto esta sendo Gravado as Informações");

        limparCampos();
        this.dispose();

    }//GEN-LAST:event_jBEntradaActionPerformed

    private void jBSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaidaActionPerformed

        clicado = "S";

        

       // dao.salvar(getElementosTela());
        JOptionPane.showMessageDialog(this, "Aguarde Enquanto esta sendo Gravado as Informações");
        System.out.println(p.toString());

        limparCampos();
        this.dispose();
    }//GEN-LAST:event_jBSaidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEntrada;
    private javax.swing.JButton jBSaida;
    private javax.swing.JComboBox<String> jCBAutorizacao;
    private javax.swing.JFormattedTextField jFormattedTextFieldData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTFEmpresa;
    private javax.swing.JTextField jTFKm1;
    private javax.swing.JTextField jTFPessoa1;
    private javax.swing.JTextField jTFPessoa2;
    private javax.swing.JTextField jTFPessoa3;
    private javax.swing.JTextField jTFPessoa4;
    private javax.swing.JTextField jTFPessoa5;
    private javax.swing.JTextField jTFPlaca;
    private javax.swing.JTextField jTFVeiculo;
    // End of variables declaration//GEN-END:variables

    private Portaria getElementosTela() {
     
        
        p.setAutorizacao(jCBAutorizacao.getItemAt(jCBAutorizacao.getSelectedIndex()));
        p.setData(jFormattedTextFieldData.getText());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String s = formatter.format(Date.from(Instant.now()));
        p.setDatasystem(s);
        p.setEmpresa(jTFEmpresa.getText());
        if ("saveiro".equals(jTFVeiculo.getText())) {
            jTFKm1.setText(JOptionPane.showInputDialog(this, "Digite o Km da Saveiro"));
        }
        p.setKm(jTFKm1.getText());
        p.setPlaca(jTFPlaca.getText());

        if (clicado.contains("S")) {
            p.setStatus("S");
        } else if (clicado.contains("E")) {
            p.setStatus("E");
        }

        p.setVeiculo(jTFVeiculo.getText());
        p.setPessoa1(jTFPessoa1.getText());
        p.setPessoa2(jTFPessoa2.getText());
        p.setPessoa3(jTFPessoa3.getText());
        p.setPessoa4(jTFPessoa4.getText());
        p.setPessoa5(jTFPessoa5.getText());

        return p;

    }

    private void limparCampos() {

        jTFEmpresa.setText("");
        jFormattedTextFieldData.setText("");
        jTFPessoa1.setText("");
        jTFPessoa2.setText("");
        jTFPessoa3.setText("");
        jTFPessoa4.setText("");
        jTFPessoa5.setText("");
        jTFPlaca.setText("");
        jTFVeiculo.setText("");
        jCBAutorizacao.setSelectedIndex(9);

    }

}

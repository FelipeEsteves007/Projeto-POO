public class FormEmpresa extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormEmpresa.class.getName());

    public FormEmpresa() {
        initComponents();
        setLocationRelativeTo(null);
        preencherInfo();
    }
    
    public void preencherInfo() {
        Empresa e = new Empresa();
        e.setLocalizacao("Avaré");

        String texto = "Nome: " + e.getNome()
                     + "\nLocalização: " + e.getLocalizacao()
                     + "\n\nSobre a empresa:\n" + e.getDados();

        txareaInfo.setText(texto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        rtTitulo = new javax.swing.JLabel();
        rtDivid1 = new javax.swing.JLabel();
        txareaInfo = new java.awt.TextArea();
        btFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rtTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        rtTitulo.setText("Dados da Empresa");

        txareaInfo.setEditable(false);

        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rtDivid1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
                    .addComponent(txareaInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(btFechar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rtTitulo)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtDivid1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txareaInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btFechar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dispose();
    }                                        

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormEmpresa().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btFechar;
    private javax.swing.JLabel rtDivid1;
    private javax.swing.JLabel rtTitulo;
    private java.awt.TextArea txareaInfo;
    // End of variables declaration                   
}

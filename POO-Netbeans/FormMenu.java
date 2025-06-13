import javax.swing.JOptionPane;
public class FormMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormMenu.class.getName());

    public FormMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btProgramadores = new javax.swing.JButton();
        btDados = new javax.swing.JButton();
        btExibirCliPro = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        rtDivid = new javax.swing.JLabel();
        rtDivid1 = new javax.swing.JLabel();
        rtTitulo = new javax.swing.JLabel();
        btCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btProgramadores.setText("Exibir Dados da Empresa");
        btProgramadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProgramadoresActionPerformed(evt);
            }
        });

        btDados.setText("Exibir Programadores Dispiníveis");
        btDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDadosActionPerformed(evt);
            }
        });

        btExibirCliPro.setText("Exibir Clientes/Projetos");
        btExibirCliPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExibirCliProActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        rtTitulo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        rtTitulo.setText("Selecione uma das opções:");

        btCadastro.setText("Cadastro");
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btProgramadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExibirCliPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rtDivid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rtDivid1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(rtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(rtDivid1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btProgramadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExibirCliPro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtDivid)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                           
        abrirCadastro();
    }                                          

    private void btDadosActionPerformed(java.awt.event.ActionEvent evt) {                                        
        abrirProgramadores();
    }                                       

    private void btProgramadoresActionPerformed(java.awt.event.ActionEvent evt) {                                                
        abrirEmpresa();
    }                                               

    private void btExibirCliProActionPerformed(java.awt.event.ActionEvent evt) {                                               
        abrirClientesProjetos();
    }                                              

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {                                       
        sair();
    }                                      

    public void abrirCadastro() {
        new FormCliente().setVisible(true);
    }

    public void abrirProgramadores() {
        new FormProgDis().setVisible(true);
    }

    public void abrirEmpresa() {
        new FormEmpresa().setVisible(true);
    }

    public void abrirClientesProjetos() {
        new FormCliProj().setVisible(true);
    }

    public void sair() {
        int resp = javax.swing.JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            dispose();
        }
    }

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new FormMenu().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btDados;
    private javax.swing.JButton btExibirCliPro;
    private javax.swing.JButton btProgramadores;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel rtDivid;
    private javax.swing.JLabel rtDivid1;
    private javax.swing.JLabel rtTitulo;
    // End of variables declaration                   
}
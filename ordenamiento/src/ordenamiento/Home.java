/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Home extends javax.swing.JDialog {

    /**
     * Creates new form Home
     */
    ArrayList<Integer> lista = new ArrayList<>();
    public Home(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Ingrese el Elemento");

        jLabel2.setText("Metodos de Ordenamiento");

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Insercion", "Seleccion", "Mezcla", "Rapido", "Burbuja", "HeapSort" }));

        jLabel3.setText("Metodo de Ordenamiento");

        jButton2.setText("Ordenar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setText("Limpiar Pantalla");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Borrar Lista");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton3)
                        .addGap(31, 31, 31)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextArea1.append(jTextField1.getText()+"\n");
        lista.add(Integer.parseInt(jTextField1.getText()));
        jTextField1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("Arreglo ordenado:\n");
        if(jComboBox1.getSelectedIndex()==0){
            insercion();
        }
        if(jComboBox1.getSelectedIndex()==1){
            seleccion();
        }
        if(jComboBox1.getSelectedIndex()==2){
            mergesort(0, lista.size());
        }
        if(jComboBox1.getSelectedIndex()==3){
            rapido(0, lista.size()-1);
        }
        if(jComboBox1.getSelectedIndex()==4){
            burbuja();
        }
        if(jComboBox1.getSelectedIndex()==5){
            heapsort();
        }
        imprimir();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        lista.clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home dialog = new Home(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    public void insercion(){
    
    }
    public void seleccion(){

        int i, j, k, buffer, limite = lista.size()-1;
        for(i=0;i<limite;i++){
            k=i;
            for(j=i+1;j<=limite;j++){
                if(lista.get(j) < lista.get(k)){
                    k=j;
                }
                if(k!=i){
                    buffer = lista.get(k);
                    lista.set(k, lista.get(i));
                    lista.set(i,buffer);
                }
            }
        }

    }
    public void burbuja(){
        int i=0;
        int j=0;
        int temp;
        for (i = 0; i < lista.size(); i++) {
            for (j = 0; j < lista.size() - 1; j++) {
                if (lista.get(j) > lista.get(j+1)) {
                    temp = lista.get(i);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, temp);
                }
            }
        }
        
    }
    public void mergesort(int init, int n) {
        int n1;
        int n2;
        if (n > 1) {
            n1 = n / 2;
            n2 = n - n1;
            mergesort(init, n1);
            mergesort(init + n1, n2);
            merge(init, n1, n2);
        }
    }

    private void merge(int init, int n1, int n2) {
        int[] buffer = new int[n1 + n2];
        int temp = 0;
        int temp1 = 0;
        int temp2 = 0;
        int i;
        while ((temp1 < n1) && (temp2 < n2)) {
            if (lista.get(init + temp1) < lista.get(init + n1 + temp2)) {
                buffer[temp++] = lista.get(init + (temp1++));
            } else {
                buffer[temp++] = lista.get(init + n1 + (temp2++));
            }
        }
        while (temp1 < n1) {
            buffer[temp++] = lista.get(init + (temp1++));
        }
        while (temp2 < n2) {
            buffer[temp++] = lista.get(init + n1 + (temp2++));
        }
        for (i = 0; i < n1 + n2; i++) {
            lista.set(init+i,buffer[i]);
        }
    }
    public void rapido(int a, int b){
        int buf;
        int from=a;
        int to = b;
        int pivot = lista.get((from+to)/2);
        do{
            while(lista.get(from)< pivot){
                from++;                
            }
            while(lista.get(to)>pivot){
                to--;
            }
            if (from <= to) {
                buf = lista.get(from);
                lista.set(from, lista.get(to));
                lista.set(to,buf);
                from++;
                to--;
            }
        } while (from <= to);
        if (a < to) {
            rapido(a, to);
        }
        if (from < b) {
            rapido(from, b);
        }                
    }
    public void heapsort(){
        int k;
        int N = lista.size();
	for(k=N/2; k>=1; k--)
		downheap(N,k);
	while(N > 1)
	{
		downheap(--N,1);
	}

    }
    public void downheap(int N, int r){
        int j, v;
	v = lista.get(r);
	while (r <= N/2)
	{
		j = 2*r;
		if(j < N && lista.get(j) < lista.get(j+1));
			j++;
		if( v >= lista.get(j))
			break;
		lista.set(r, lista.get(j));
		r = j;
	}
	lista.set(r, v);
    }
    
    public void imprimir(){
        for(int i=0;i<lista.size();i++){
            jTextArea1.append(lista.get(i)+"\n");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
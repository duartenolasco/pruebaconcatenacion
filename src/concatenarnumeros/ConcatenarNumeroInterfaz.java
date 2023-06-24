
package concatenarnumeros;

public class ConcatenarNumeroInterfaz extends javax.swing.JFrame {
//esto es para heredar hija y control espacio es para rellenar hija
    hija ce = new hija("Lester", "123abc", "Azul");
   
    public ConcatenarNumeroInterfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        resultado = new javax.swing.JTextField();
        body = new javax.swing.JPanel();
        txt1 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();
        btnconcatenarnumero = new javax.swing.JButton();
        btntext = new javax.swing.JButton();
        btnsuma = new javax.swing.JButton();
        btnpotencia = new javax.swing.JButton();
        btnprimo = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setBackground(new java.awt.Color(0, 255, 204));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultado.setEditable(false);
        resultado.setBackground(new java.awt.Color(255, 255, 153));
        resultado.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        resultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        header.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 480, 100));

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 140));

        body.setBackground(new java.awt.Color(51, 51, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 70));

        txt3.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 140, 70));

        txt2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        body.add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 140, 70));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Concatenar Numeros");
        body.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 260, 30));

        limpiar.setBackground(new java.awt.Color(0, 255, 153));
        limpiar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 51, 51));
        limpiar.setText("ce");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        body.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        btnconcatenarnumero.setBackground(new java.awt.Color(0, 255, 0));
        btnconcatenarnumero.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnconcatenarnumero.setForeground(new java.awt.Color(255, 255, 255));
        btnconcatenarnumero.setText("concatenarN");
        btnconcatenarnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconcatenarnumeroActionPerformed(evt);
            }
        });
        body.add(btnconcatenarnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 180, 40));

        btntext.setBackground(new java.awt.Color(153, 255, 0));
        btntext.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btntext.setForeground(new java.awt.Color(255, 255, 255));
        btntext.setText("concatenarText");
        btntext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntextActionPerformed(evt);
            }
        });
        body.add(btntext, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, 40));

        btnsuma.setBackground(new java.awt.Color(102, 255, 0));
        btnsuma.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnsuma.setForeground(new java.awt.Color(255, 255, 255));
        btnsuma.setText("+");
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });
        body.add(btnsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        btnpotencia.setBackground(new java.awt.Color(51, 255, 0));
        btnpotencia.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnpotencia.setForeground(new java.awt.Color(255, 255, 255));
        btnpotencia.setText("potencia");
        btnpotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpotenciaActionPerformed(evt);
            }
        });
        body.add(btnpotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        btnprimo.setBackground(new java.awt.Color(102, 255, 0));
        btnprimo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnprimo.setForeground(new java.awt.Color(255, 255, 255));
        btnprimo.setText("primo");
        btnprimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprimoActionPerformed(evt);
            }
        });
        body.add(btnprimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        btnresta.setBackground(new java.awt.Color(51, 255, 0));
        btnresta.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnresta.setForeground(new java.awt.Color(255, 255, 255));
        btnresta.setText("-");
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });
        body.add(btnresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        bg.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 500, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        resultado.setText("");
        txt1.setText("");
        txt2.setText("");
        txt3.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void btnconcatenarnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconcatenarnumeroActionPerformed
        //para pasar el texto y solo permita numeros
        double num1=Double.parseDouble(txt1.getText());
        double num2=Double.parseDouble(txt2.getText());
        double num3=Double.parseDouble(txt3.getText());
        
        //aqui porque el cuadro de texto solo muestra textos debemos pasarlos a cadena de texto
        String concatenarNumero = String.valueOf(num1)+", "+String.valueOf(num2)+", "+String.valueOf(num3);
        
        //esto es para que muestre el resultado en el espacio indicado que le tenemos asignado
        resultado.setText(concatenarNumero);
        //resultado es el nombre de variable que le colocamos al cuadro de resultado del text field de la interfaz el setText es para mostrar
        //y en el parentesis el nombre de la variable que mostrara el resultado en este caso concatenar numero junta los numeros
    }//GEN-LAST:event_btnconcatenarnumeroActionPerformed

    private void btntextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntextActionPerformed
       //debe llamarse diferente que en la variable anterior en vez de num1 seria text1 para no haber confudsion de datos
        String text1=txt1.getText();
        String text2=txt2.getText();
        String text3=txt3.getText();
        
        String concatenartexto = text1+", "+text2+", "+text3;
        
        resultado.setText(concatenartexto);
    }//GEN-LAST:event_btntextActionPerformed

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        double n1=Double.parseDouble(txt1.getText());
        double n2=Double.parseDouble(txt2.getText());
        double n3=Double.parseDouble(txt3.getText());
        //forma de hacerlo sin herencia
       // double sumar=(n1+n2+n3);
       // resultado.setText(String.valueOf(sumar));  //hay que agreagar un string value of para mostar la funcion
       
    }//GEN-LAST:event_btnsumaActionPerformed

    private void btnpotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpotenciaActionPerformed
     double num1=Double.parseDouble(txt1.getText());
     double num2=Double.parseDouble(txt2.getText());
     
     double potencia=ce.calcularPotencia(num1, num2);
     
     resultado.setText(String.valueOf(potencia));
    }//GEN-LAST:event_btnpotenciaActionPerformed

    private void btnprimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprimoActionPerformed
       double num1=Double.parseDouble(txt1.getText());
       boolean primo=ce.esPrimo((int) num1);
       resultado.setText(String.valueOf(primo));
    }//GEN-LAST:event_btnprimoActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        double n1=Double.parseDouble(txt1.getText());
        double n2=Double.parseDouble(txt2.getText());
        double n3=Double.parseDouble(txt3.getText());
        
        double restar=ce.restar(n1, n2, n3);
        
        resultado.setText(String.valueOf(restar));
    }//GEN-LAST:event_btnrestaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel body;
    private javax.swing.JButton btnconcatenarnumero;
    private javax.swing.JButton btnpotencia;
    private javax.swing.JButton btnprimo;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.JButton btntext;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField resultado;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables

    private void txt1getText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String StringvalueOf(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

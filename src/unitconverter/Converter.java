/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitconverter;

import javax.swing.JOptionPane;

/**
 *
 * @author niran
 */
public class Converter extends javax.swing.JFrame {

    String convertingAmount, ConvertedAmount, fromCurrency, toCurrency, multiplyingAmount;
    double amount;

    public Converter() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Converter");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createTitledBorder("")));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Enter the Amount");

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Converted Amount");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Conversion");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("From");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Currency", "Rupees", "US Dollar", "Aus Dollar", "Euro", "Dinar", "Yen", "Yuan", "Cad Dollar", "Ngultrum" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("To");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Currency", "Rupees", "US Dollar", "Aus Dollar", "Euro", "Dinar", "Yen", "Yuan", "Cad Dollar", "Ngulturm" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("1");

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("=");

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Clear");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Convert");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, 0, 100, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String getConvertingAmount() {
        convertingAmount = jTextField1.getText();
        return convertingAmount;
    }

    public double getAmount() {
        amount = Double.parseDouble(getConvertingAmount());
        return amount;
    }

    public String getFromCurrency() {
        switch (jComboBox1.getSelectedIndex()) {
            case 0 ->
                fromCurrency = (String) jComboBox1.getSelectedItem();
            case 1 ->
                fromCurrency = (String) jComboBox1.getSelectedItem();
            case 2 ->
                fromCurrency = (String) jComboBox1.getSelectedItem();
            case 3 ->
                fromCurrency = (String) jComboBox1.getSelectedItem();
            case 4 ->
                fromCurrency = (String) jComboBox1.getSelectedItem();
            case 5 ->
                fromCurrency = (String) jComboBox1.getSelectedItem();
            case 6 ->
                fromCurrency = (String) jComboBox1.getSelectedItem();
            case 7 ->
                fromCurrency = (String) jComboBox1.getSelectedItem();
            case 8 ->
                fromCurrency = (String) jComboBox1.getSelectedItem();
            case 9 ->
                fromCurrency = (String) jComboBox1.getSelectedItem();
        }
        return fromCurrency;
    }

    public String getToCurrency() {
        switch (jComboBox2.getSelectedIndex()) {
            case 0 ->
                toCurrency = (String) jComboBox2.getSelectedItem();
            case 1 ->
                toCurrency = (String) jComboBox2.getSelectedItem();
            case 2 ->
                toCurrency = (String) jComboBox2.getSelectedItem();
            case 3 ->
                toCurrency = (String) jComboBox2.getSelectedItem();
            case 4 ->
                toCurrency = (String) jComboBox2.getSelectedItem();
            case 5 ->
                toCurrency = (String) jComboBox2.getSelectedItem();
            case 6 ->
                toCurrency = (String) jComboBox2.getSelectedItem();
            case 7 ->
                toCurrency = (String) jComboBox2.getSelectedItem();
            case 8 ->
                toCurrency = (String) jComboBox2.getSelectedItem();
            case 9 ->
                toCurrency = (String) jComboBox2.getSelectedItem();
        }
        return toCurrency;
    }

    public void rupees() {
        if (null != getToCurrency()) {
            switch (getToCurrency()) {
                case "Euro" -> {
                    multiplyingAmount = "0.0073529";
                    jLabel11.setText(multiplyingAmount);
                }
                case "US Dollar" -> {
                    multiplyingAmount = "0.0083333";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Aus Dollar" -> {
                    multiplyingAmount = "0.0112";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Ngulturm" -> {
                    multiplyingAmount = "0.625";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Pound" -> {
                    multiplyingAmount = "0.006060";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yuan" -> {
                    multiplyingAmount = "0.05423";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yen" -> {
                    multiplyingAmount = "0.9256";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Cad Dollar" -> {
                    multiplyingAmount = "0.01044";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Dinar" -> {
                    multiplyingAmount = "0.002526";
                    jLabel11.setText(multiplyingAmount);
                }
                default -> {
                }
            }
        }
    }

    public void euro() {
        if (null != getToCurrency()) {
            switch (getToCurrency()) {
                case "Rupees" -> {
                    multiplyingAmount = "136";
                    jLabel11.setText(multiplyingAmount);
                }
                case "US Dollar" -> {
                    multiplyingAmount = "1.18";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Aus Dollar" -> {
                    multiplyingAmount = "1.57";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Ngulturm" -> {
                    multiplyingAmount = "88.09";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Pound" -> {
                    multiplyingAmount = "0.86";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yuan" -> {
                    multiplyingAmount = "7.64";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yen" -> {
                    multiplyingAmount = "130.98";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Cad Dollar" -> {
                    multiplyingAmount = "1.47";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Dinar" -> {
                    multiplyingAmount = "0.36";
                    jLabel11.setText(multiplyingAmount);
                }
            }
        }
    }

    public void usd() {
        if (null != getToCurrency()) {
            switch (getToCurrency()) {
                case "Rupees" -> {
                    multiplyingAmount = "120";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Euro" -> {
                    multiplyingAmount = "0.85";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Aus Dollar" -> {
                    multiplyingAmount = "1.33";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Ngulturm" -> {
                    multiplyingAmount = "74.50";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Pound" -> {
                    multiplyingAmount = "0.72";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yuan" -> {
                    multiplyingAmount = "6.46";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yen" -> {
                    multiplyingAmount = "110.81";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Cad Dollar" -> {
                    multiplyingAmount = "1.24";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Dinar" -> {
                    multiplyingAmount = "0.30";
                    jLabel11.setText(multiplyingAmount);
                }
            }
        }
    }

    public void australianDollar() {
        if (null != getToCurrency()) {
            switch (getToCurrency()) {
                case "Rupees" -> {
                    multiplyingAmount = "90";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Euro" -> {
                    multiplyingAmount = "0.64";
                    jLabel11.setText(multiplyingAmount);
                }
                case "US Dollar" -> {
                    multiplyingAmount = "0.75";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Ngulturm" -> {
                    multiplyingAmount = "55.97";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Pound" -> {
                    multiplyingAmount = "0.54";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yuan" -> {
                    multiplyingAmount = "4.86";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yen" -> {
                    multiplyingAmount = "83.23";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Cad Dollar" -> {
                    multiplyingAmount = "0.93";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Dinar" -> {
                    multiplyingAmount = "0.23";
                    jLabel11.setText(multiplyingAmount);
                }
                default -> {
                }
            }
        }
    }

    public void ngultrum() {
        if (null != getToCurrency()) {
            switch (getToCurrency()) {
                case "Rupees" -> {
                    multiplyingAmount = "1.6";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Euro" -> {
                    multiplyingAmount = "0.011";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Aus Dollar" -> {
                    multiplyingAmount = "0.018";
                    jLabel11.setText(multiplyingAmount);
                }
                case "US Dollar" -> {
                    multiplyingAmount = "0.013";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Pound" -> {
                    multiplyingAmount = "0.0097";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yuan" -> {
                    multiplyingAmount = "0.087";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yen" -> {
                    multiplyingAmount = "1.49";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Cad Dollar" -> {
                    multiplyingAmount = "0.017";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Dinar" -> {
                    multiplyingAmount = "0.0040";
                    jLabel11.setText(multiplyingAmount);
                }
            }
        }
    }

    public void pound() {
        if (null != getToCurrency()) {
            switch (getToCurrency()) {
                case "Rupees" -> {
                    multiplyingAmount = "165";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Euro" -> {
                    multiplyingAmount = "1.17";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Aus Dollar" -> {
                    multiplyingAmount = "1.84";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Ngulturm" -> {
                    multiplyingAmount = "102.99";
                    jLabel11.setText(multiplyingAmount);
                }
                case "US Dollar" -> {
                    multiplyingAmount = "1.38";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yuan" -> {
                    multiplyingAmount = "8.94";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yen" -> {
                    multiplyingAmount = "153.13";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Cad Dollar" -> {
                    multiplyingAmount = "1.72";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Dinar" -> {
                    multiplyingAmount = "0.42";
                    jLabel11.setText(multiplyingAmount);
                }
                default -> {
                }
            }
        }
    }

    public void yuan() {
        if (null != getToCurrency()) {
            switch (getToCurrency()) {
                case "Rupees" -> {
                    multiplyingAmount = "18.44";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Euro" -> {
                    multiplyingAmount = "0.13";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Aus Dollar" -> {
                    multiplyingAmount = "0.21";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Ngulturm" -> {
                    multiplyingAmount = "11.53";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Pound" -> {
                    multiplyingAmount = "0.11";
                    jLabel11.setText(multiplyingAmount);
                }
                case "US Dollar" -> {
                    multiplyingAmount = "0.15";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yen" -> {
                    multiplyingAmount = "17.14";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Cad Dollar" -> {
                    multiplyingAmount = "0.19";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Dinar" -> {
                    multiplyingAmount = "0.047";
                    jLabel11.setText(multiplyingAmount);
                }
            }
        }
    }

    public void yen() {
        if (null != getToCurrency()) {
            switch (getToCurrency()) {
                case "Rupees" -> {
                    multiplyingAmount = "1.08";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Euro" -> {
                    multiplyingAmount = "0.0076";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Aus Dollar" -> {
                    multiplyingAmount = "0.012";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Ngulturm" -> {
                    multiplyingAmount = "0.67";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Pound" -> {
                    multiplyingAmount = "0.0065";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yuan" -> {
                    multiplyingAmount = "0.058";
                    jLabel11.setText(multiplyingAmount);
                }
                case "US Dollar" -> {
                    multiplyingAmount = "0.0090";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Cad Dollar" -> {
                    multiplyingAmount = "0.011";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Dinar" -> {
                    multiplyingAmount = "0.0027";
                    jLabel11.setText(multiplyingAmount);
                }
            }
        }
    }

    public void canadianDollar() {
        if (null != getToCurrency()) {
            switch (getToCurrency()) {
                case "Rupees" -> {
                    multiplyingAmount = "95.85";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Euro" -> {
                    multiplyingAmount = "0.68";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Aus Dollar" -> {
                    multiplyingAmount = "1.07";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Ngulturm" -> {
                    multiplyingAmount = "59.89";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Pound" -> {
                    multiplyingAmount = "0.58";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yuan" -> {
                    multiplyingAmount = "5.20";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yen" -> {
                    multiplyingAmount = "89.06";
                    jLabel11.setText(multiplyingAmount);
                }
                case "US Dollar" -> {
                    multiplyingAmount = "0.80";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Dinar" -> {
                    multiplyingAmount = "0.24";
                    jLabel11.setText(multiplyingAmount);
                }
            }
        }
    }

    public void dinar() {
        if (null != getToCurrency()) {
            switch (getToCurrency()) {
                case "Rupees" -> {
                    multiplyingAmount = "395.92";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Euro" -> {
                    multiplyingAmount = "2.81";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Aus Dollar" -> {
                    multiplyingAmount = "4.42";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Ngulturm" -> {
                    multiplyingAmount = "247.45";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Pound" -> {
                    multiplyingAmount = "2.40";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yuan" -> {
                    multiplyingAmount = "21.47";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Yen" -> {
                    multiplyingAmount = "";
                    jLabel11.setText(multiplyingAmount);
                }
                case "Cad Dollar" -> {
                    multiplyingAmount = "4.13";
                    jLabel11.setText(multiplyingAmount);
                }
                case "US Dollar" -> {
                    multiplyingAmount = "3.32";
                    jLabel11.setText(multiplyingAmount);
                }
                default -> {
                }
            }
        }
    }

    public void clear() {
        jTextField1.setText(null);
        jTextField2.setText(null);
        jLabel8.setText(null);
        jLabel11.setText(null);
        jLabel12.setText(null);
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
    }
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (!"Currency".equals(getFromCurrency())) {
            if (!getFromCurrency().equals(getToCurrency())) {
                jLabel8.setText(getFromCurrency());
                 if ("Rupees".equals(getFromCurrency())) {
                    rupees();
                } else if ("Euro".equals(getFromCurrency())) {
                    euro();
                } else if ("US Dollar".equals(getFromCurrency())) {
                    usd();
                } else if ("Dinar".equals(getFromCurrency())) {
                    dinar();
                } else if ("Cad Dollar".equals(getFromCurrency())) {
                    canadianDollar();
                } else if ("Aus Dollar".equals(getFromCurrency())) {
                    australianDollar();
                } else if ("Yuan".equals(getFromCurrency())) {
                    yuan();
                } else if ("Yen".equals(getFromCurrency())) {
                    yen();
                } else if ("Ngultrum".equals(getFromCurrency())) {
                    ngultrum();
                } else if (getFromCurrency() == "Pound") {
                    pound();
                }
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if (!"Currency".equals(getToCurrency())) {
            if (getToCurrency() == null ? getFromCurrency() != null : !getToCurrency().equals(getFromCurrency())) {
                jLabel12.setText(getToCurrency());
                if ("Rupees".equals(getFromCurrency())) {
                    rupees();
                } else if ("Euro".equals(getFromCurrency())) {
                    euro();
                } else if ("US Dollar".equals(getFromCurrency())) {
                    usd();
                } else if ("Dinar".equals(getFromCurrency())) {
                    dinar();
                } else if ("Cad Dollar".equals(getFromCurrency())) {
                    canadianDollar();
                } else if ("Aus Dollar".equals(getFromCurrency())) {
                    australianDollar();
                } else if ("Yuan".equals(getFromCurrency())) {
                    yuan();
                } else if ("Yen".equals(getFromCurrency())) {
                    yen();
                } else if ("Ngultrum".equals(getFromCurrency())) {
                    ngultrum();
                } else if (getFromCurrency() == "Pound") {
                    pound();
                }
            }
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        char c = evt.getKeyChar();
        if (Character.isDigit(c) || evt.getKeyCode() == 8 || evt.getKeyCode() == 46) {
            String a = jTextField1.getText();
            if (evt.getKeyCode() == 46) {
                if (!(a.contains("."))) {
                    String number = a + ".";
                    jTextField1.setText(number);
                    jTextField1.setEditable(false);
                } else {
                    jTextField1.setEditable(false);
                }
            } else if (Character.isDigit(c) || evt.getKeyCode() == 8) {
                jTextField1.setEditable(true);
            }
        } else {
            jTextField1.setEditable(false);
            JOptionPane.showMessageDialog(null, "invalid input");
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!getConvertingAmount().isEmpty()) {
            if ((!getToCurrency().equals("Currency")) || (!getFromCurrency().equals("Currency"))) {
                if (!getToCurrency().equals(getFromCurrency())) {
                    Double convertAmount = Double.parseDouble(multiplyingAmount);
                    double d = getAmount() * convertAmount;
                    String s = Double.toString(d);
                    jTextField2.setText(s);
                } else {
                    JOptionPane.showMessageDialog(null, "Choose Different Currencies");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Choose Different Currencies");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No Amout Provided");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Converter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

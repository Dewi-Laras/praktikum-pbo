/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jdbc.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class JFrameUtama extends javax.swing.JFrame {
    private Connection conn;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rs;
    
    private final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_mhs_service?useSSL=false&serverTimezone=UTC";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "";
    
    // List models for JList components
    private DefaultListModel<String> idListModel;
    private DefaultListModel<String> namaListModel;
    
    /**
     * Creates new form JFrameUtama
     */
    public JFrameUtama() {
        initComponents();
        initializeDatabase();
        initializeListModels();
        loadAllData();
    }
    
     /**
     * Initialize database connection and create table if not exists
     */
    private void initializeDatabase() {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            // Create table if not exists
            stmt = conn.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS mahasiswa (" +
                                   "id INT AUTO_INCREMENT PRIMARY KEY, " +
                                   "nama VARCHAR(100) NOT NULL)";
            stmt.executeUpdate(createTableSQL);
            
            JOptionPane.showMessageDialog(this, "Database connection established successfully!");
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "MySQL JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database connection error: " + e.getMessage());
        }
    }
    
    /**
     * Initialize list models for JList components
     */
    private void initializeListModels() {
        idListModel = new DefaultListModel<>();
        namaListModel = new DefaultListModel<>();
        
        jList2.setModel(idListModel);
        jList1.setModel(namaListModel);
        
        // Add list selection listeners
        jList1.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedIndex = jList1.getSelectedIndex();
                if (selectedIndex != -1) {
                    jList2.setSelectedIndex(selectedIndex);
                    // Populate text fields for editing
                    populateTextFieldsForEdit(selectedIndex);
                }
            }
        });
        
        jList2.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedIndex = jList2.getSelectedIndex();
                if (selectedIndex != -1) {
                    jList1.setSelectedIndex(selectedIndex);
                    populateTextFieldsForEdit(selectedIndex);
                }
            }
        });
    }
    
    /**
     * Populate text fields with selected data for editing
     */
    private void populateTextFieldsForEdit(int selectedIndex) {
        if (selectedIndex >= 0 && selectedIndex < idListModel.size()) {
            String id = idListModel.getElementAt(selectedIndex);
            String nama = namaListModel.getElementAt(selectedIndex);
            
            jTextField2.setText(id);
            jTextField4.setText(nama);
            jTextField3.setText(id);
            jTextField5.setText(nama);
        }
    }
    
    /**
     * Load all data from database
     */
    private void loadAllData() {
        try {
            idListModel.clear();
            namaListModel.clear();
            
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM mahasiswa ORDER BY id");
            
            while (rs.next()) {
                idListModel.addElement(String.valueOf(rs.getInt("id")));
                namaListModel.addElement(rs.getString("nama"));
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage());
        }
    }
    
    /**
     * Add new student to database
     */
    private void addStudent(String nama) {
        try {
            pstmt = conn.prepareStatement("INSERT INTO mahasiswa (nama) VALUES (?)");
            pstmt.setString(1, nama);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");
                loadAllData();
                jTextField1.setText("");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error adding data: " + e.getMessage());
        }
    }
    
    /**
     * Update student data
     */
    private void updateStudent(int id, String nama) {
        try {
            pstmt = conn.prepareStatement("UPDATE mahasiswa SET nama = ? WHERE id = ?");
            pstmt.setString(1, nama);
            pstmt.setInt(2, id);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate!");
                loadAllData();
                clearEditFields();
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan!");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating data: " + e.getMessage());
        }
    }
    
    /**
     * Delete student from database
     */
    private void deleteStudent(int id) {
        try {
            pstmt = conn.prepareStatement("DELETE FROM mahasiswa WHERE id = ?");
            pstmt.setInt(1, id);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
                loadAllData();
                clearEditFields();
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan!");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error deleting data: " + e.getMessage());
        }
    }

     /**
     * Reset auto increment index
     */
    private void resetAutoIncrement() {
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("ALTER TABLE mahasiswa AUTO_INCREMENT = 1");
            JOptionPane.showMessageDialog(this, "Indeks berhasil direset!");
            loadAllData();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error resetting index: " + e.getMessage());
        }
    }
    
     /**
     * Clear edit text fields
     */
    private void clearEditFields() {
        jTextField2.setText("");
        jTextField4.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
    }
    
    /**
     * Close database connection
     */
    private void closeConnection() {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.err.println("Error closing connection: " + e.getMessage());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jButtonAmbilSemuaData = new javax.swing.JButton();
        jButtonTambahkan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButtonEdit = new javax.swing.JButton();
        jButtonHapus = new javax.swing.JButton();
        jButtonResetIndeks = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jList1);

        jScrollPane2.setViewportView(jList2);

        jButtonAmbilSemuaData.setText("Ambil Semua Data ");
        jButtonAmbilSemuaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAmbilSemuaDataActionPerformed(evt);
            }
        });

        jButtonTambahkan.setText("Tambahkan");
        jButtonTambahkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahkanActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama :");

        jButtonEdit.setText("  Edit  ");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonHapus.setText("Hapus");
        jButtonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHapusActionPerformed(evt);
            }
        });

        jButtonResetIndeks.setText("Reset Indeks");
        jButtonResetIndeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetIndeksActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel3.setText("NAMA");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Kelola Data Mahasiswa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonResetIndeks, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAmbilSemuaData, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 75, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonHapus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonEdit))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonTambahkan, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAmbilSemuaData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(4, 4, 4)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTambahkan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonHapus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonResetIndeks))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAmbilSemuaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAmbilSemuaDataActionPerformed
        loadAllData();
        JOptionPane.showMessageDialog(this, "Data berhasil dimuat ulang!");
    }//GEN-LAST:event_jButtonAmbilSemuaDataActionPerformed

    private void jButtonTambahkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahkanActionPerformed
        String nama = jTextField1.getText().trim();
        
        if (nama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama tidak boleh kosong!");
            return;
        }
        
        addStudent(nama);
    }//GEN-LAST:event_jButtonTambahkanActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        String idText = jTextField2.getText().trim();
        String nama = jTextField4.getText().trim();
        
        if (idText.isEmpty() || nama.isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID dan Nama tidak boleh kosong!");
            return;
        }
        
        try {
            int id = Integer.parseInt(idText);
            updateStudent(id, nama);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID harus berupa angka!");
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHapusActionPerformed
        String idText = jTextField3.getText().trim();
        
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "ID tidak boleh kosong!");
            return;
        }
        
        try {
            int id = Integer.parseInt(idText);
            
            int confirm = JOptionPane.showConfirmDialog(this, 
                "Apakah Anda yakin ingin menghapus data dengan ID " + id + "?", 
                "Konfirmasi Hapus", 
                JOptionPane.YES_NO_OPTION);
                
            if (confirm == JOptionPane.YES_OPTION) {
                deleteStudent(id);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID harus berupa angka!");
        }
    }//GEN-LAST:event_jButtonHapusActionPerformed

    private void jButtonResetIndeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetIndeksActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, 
            "Apakah Anda yakin ingin mereset indeks? Ini akan mengatur ulang nomor ID.", 
            "Konfirmasi Reset Indeks", 
            JOptionPane.YES_NO_OPTION);
            
        if (confirm == JOptionPane.YES_OPTION) {
            resetAutoIncrement();
        }
    }//GEN-LAST:event_jButtonResetIndeksActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAmbilSemuaData;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonResetIndeks;
    private javax.swing.JButton jButtonTambahkan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}

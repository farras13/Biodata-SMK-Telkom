
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devvara Rishivian
 */
public class frmMain extends javax.swing.JFrame {
    String nol_jam = "";
    String nol_menit = "";
    String nol_detik = "";

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        selectData();
        setTanggal();
        setJam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblJam = new javax.swing.JLabel();
        lblTgl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        tfNis = new javax.swing.JTextField();
        tfTempat = new javax.swing.JTextField();
        tfKelas = new javax.swing.JTextField();
        rbPr = new javax.swing.JRadioButton();
        rbLk = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAlamat = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        btnPrint = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM BIODATA SISWA SMK TELKOM MALANG");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 560, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("The Real Informatic School");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 50, 280, 30);

        lblJam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblJam.setForeground(new java.awt.Color(0, 0, 102));
        lblJam.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblJam.setText("Jam");
        jPanel1.add(lblJam);
        lblJam.setBounds(900, 70, 100, 30);

        lblTgl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTgl.setForeground(new java.awt.Color(0, 0, 102));
        lblTgl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTgl.setText("Tanggal");
        jPanel1.add(lblTgl);
        lblTgl.setBounds(900, 50, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1010, 100);

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Alamat");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 480, 270, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("ISIAN DATA SISWA");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 10, 270, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("NIS");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 50, 270, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Nama");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 110, 270, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Tanggal Lahir");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 240, 270, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Kelas");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 360, 270, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Email");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 420, 270, 30);
        jPanel2.add(tfEmail);
        tfEmail.setBounds(10, 450, 280, 30);
        jPanel2.add(tfNis);
        tfNis.setBounds(10, 80, 280, 30);
        jPanel2.add(tfTempat);
        tfTempat.setBounds(10, 210, 280, 30);
        jPanel2.add(tfKelas);
        tfKelas.setBounds(10, 390, 280, 30);

        buttonGroup1.add(rbPr);
        rbPr.setText("Perempuan");
        jPanel2.add(rbPr);
        rbPr.setBounds(160, 330, 130, 23);

        buttonGroup1.add(rbLk);
        rbLk.setText("Laki - laki");
        jPanel2.add(rbLk);
        rbLk.setBounds(10, 330, 130, 23);

        taAlamat.setColumns(20);
        taAlamat.setRows(5);
        jScrollPane2.setViewportView(taAlamat);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 510, 280, 96);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Jenis Kelamin");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 300, 270, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("Tempat Lahir");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 180, 270, 30);
        jPanel2.add(tfNama);
        tfNama.setBounds(10, 140, 280, 30);
        jPanel2.add(jDateChooser1);
        jDateChooser1.setBounds(10, 270, 280, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 120, 300, 620);

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));
        jPanel3.setLayout(null);

        btnPrint.setFont(new java.awt.Font("Meiryo UI", 1, 12)); // NOI18N
        btnPrint.setText("PRINT");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel3.add(btnPrint);
        btnPrint.setBounds(580, 10, 90, 40);

        btnSave.setFont(new java.awt.Font("Meiryo UI", 1, 12)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave);
        btnSave.setBounds(20, 10, 90, 40);

        btnDelete.setFont(new java.awt.Font("Meiryo UI", 1, 12)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);
        btnDelete.setBounds(130, 10, 90, 40);

        btnClear.setFont(new java.awt.Font("Meiryo UI", 1, 12)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear);
        btnClear.setBounds(240, 10, 90, 40);

        btnRefresh.setFont(new java.awt.Font("Meiryo UI", 1, 12)); // NOI18N
        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel3.add(btnRefresh);
        btnRefresh.setBounds(350, 10, 100, 40);

        btnEdit.setFont(new java.awt.Font("Meiryo UI", 1, 12)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel3.add(btnEdit);
        btnEdit.setBounds(470, 10, 90, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(320, 120, 690, 60);

        jPanel4.setBackground(new java.awt.Color(102, 255, 255));
        jPanel4.setLayout(null);

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "JenisKelamin", "Kelas", "Email", "Alamat"
            }
        ));
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelData);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 670, 530);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(320, 190, 690, 550);

        jPanel5.setBackground(new java.awt.Color(51, 0, 255));
        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, -30, 1010, 780);

        setSize(new java.awt.Dimension(1027, 785));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggalan = dateFormat.format(jDateChooser1.getDate());
        String JK = "";
                if(rbLk.isSelected()){
                    JK = "L";
                }else{
                    JK = "P";
                }
                
        if ("".equals(tfNis.getText()) || "".equals(taAlamat.getText()) || JK.equals("") || "".equals(tfKelas.getText()) || "".equals(tfNama.getText()) || tfTempat.equals("") || jDateChooser1.equals("") || "".equals(tfEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data","ERROR", JOptionPane.WARNING_MESSAGE);
        }else{
            
        String SQL = "INSERT INTO t_siswa (NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat,TempatLahir,TanggalLahir) " + "VALUES('"+tfNis.getText()+"','"+tfNama.getText()+"','"+JK+"','"+tfKelas.getText()+"','"+tfEmail.getText()+"','"+taAlamat.getText()+"','"+tfTempat.getText()+"','"+jDateChooser1+"')";
        int status = KoneksiDB.execute(SQL);
        if (status == 1) {
        JOptionPane.showMessageDialog(this, "Data berhasil Di tambahkan", "Sukses",JOptionPane.INFORMATION_MESSAGE);
            selectData();
            setTanggal();
            setJam();
        }else{
                JOptionPane.showMessageDialog(this, "Data gagal Di tambahkan", "Gagal",JOptionPane.WARNING_MESSAGE);
             }
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int baris = tabelData.getSelectedRow();
        if (baris != 1) {
            String NIS = tabelData.getValueAt(baris,0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                
                    JOptionPane.showMessageDialog(this, "Data berhasil Di hapus", "Sukses",JOptionPane.INFORMATION_MESSAGE);
                   
                    
            }else{
                    JOptionPane.showMessageDialog(this, "Data gagal Di Hapus", "Gagal",JOptionPane.WARNING_MESSAGE);
                }
       }else{
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "ERROR",JOptionPane.WARNING_MESSAGE);
        }
        setTanggal();
        setJam();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tfTempat.setText("");
        tfNis.setText("");
        tfKelas.setText("");
        buttonGroup1.clearSelection();
        tfEmail.setText("");
        taAlamat.setText("");
        tfTempat.setText("");
        jDateChooser1.setDate(null);
        setTanggal();
            setJam();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        selectData();
        setTanggal();
            setJam();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Biodata SMK Telkom Malang");
        MessageFormat footer = new MessageFormat("Page {0,number,integeer}      ");
        try{
            tabelData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
            
        } catch (java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n", e.getMessage());
        }
        setTanggal();
            setJam();
    }//GEN-LAST:event_btnPrintActionPerformed

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        // TODO add your handling code here:
        int baris = tabelData.getSelectedRow();
        if(baris != -1){
            tfNis.setText(tabelData.getValueAt(baris, 0).toString());
            tfTempat.setText(tabelData.getValueAt(baris, 1).toString());
            if("Laki - laki".equals(tabelData.getValueAt(baris, 2).toString())){
                rbLk.setSelected(true);
            }else{
                rbPr.setSelected(true);
            }
            tfKelas.setText(tabelData.getValueAt(baris, 3).toString());
            tfEmail.setText(tabelData.getValueAt(baris, 4).toString());
            taAlamat.setText(tabelData.getValueAt(baris, 5).toString());
            
        }
    }//GEN-LAST:event_tabelDataMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(jDateChooser1.getDate());
        String JK;
        if ("".equals(tfNis.getText()) || "".equals(taAlamat.getText()) || "".equals(tfKelas.getText()) || "".equals(tfNama.getText()) || "".equals(tfEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data","ERROR", JOptionPane.WARNING_MESSAGE);
        }else{
            //String JK = "";
                if(rbLk.isSelected()){
                    JK = "L";
                }else{
                    JK = "P";
                }
                
                String SQL = "UPDATE t_siswa SET NIS='"+tfNis.getText()+"',"+ "NamaSiswa='"+tfNama.getText()+"',"+ "JenisKelamin='"+JK+"',"+ "Kelas='"+tfKelas.getText()+"',"+ "Email='"+tfEmail.getText()+"',"+ "Alamat='"+taAlamat.getText()+"',"+"TempatLahir='"+tfTempat.getText()+"',"+"TanggalLahir='"+tanggal+"' WHERE NIS='"+tfNis.getText()+"'" ;
                
                int status = KoneksiDB.execute(SQL);
                if (status == 1) {
                
                    JOptionPane.showMessageDialog(this, "Data berhasil Di tambahkan", "Sukses",JOptionPane.INFORMATION_MESSAGE);
                    selectData();
            }else{
                    JOptionPane.showMessageDialog(this, "Data gagal Di tambahkan", "Gagal",JOptionPane.WARNING_MESSAGE);
                }
        }
        setTanggal();
            setJam();
    }//GEN-LAST:event_btnEditActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblJam;
    private javax.swing.JLabel lblTgl;
    private javax.swing.JRadioButton rbLk;
    private javax.swing.JRadioButton rbPr;
    private javax.swing.JTextArea taAlamat;
    private javax.swing.JTable tabelData;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfKelas;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNis;
    private javax.swing.JTextField tfTempat;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try{
            while(rs.next()){
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString(2);
                String JenisKelamin = "";
                if("L".equals(rs.getString(3))){
                    JenisKelamin = "Laki-Laki";
                }else {
                    JenisKelamin = "Perempuan";
                }
                String Kelas = rs.getString(4);
                String Email = rs.getString(5);
                String Alamat = rs.getString(6);
                String data[] = {NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat};
                dtm.addRow(data);
            }
        } catch (SQLException ex){
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        tabelData.setModel(dtm);
    }
    
    public void setTanggal(){
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd/MM/yyyy");
        lblTgl.setText(kal.format(skrg));
    }
    
    public void setJam(){
        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                if (nilai_jam <= 9) {
                    nol_jam = "0";
                }
                if (nilai_menit <=9) {
                    nol_menit = "0";
                }
                if (nilai_detik <= 9) {
                    nol_detik = "0";
                }
                
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                lblJam.setText("Jam "+jam+ ":" + menit +":"+detik);
            }
        };
    new Timer(100, taskPerformer).start();
    
    }
}

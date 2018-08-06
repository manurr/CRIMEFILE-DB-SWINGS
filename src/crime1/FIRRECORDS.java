/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package crime1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Prabhu
 */
public class FIRRECORDS extends javax.swing.JFrame {

    /**
     * Creates new form FIRRECORDS
     */
    private static Connection con;
 private ResultSet r;
    public FIRRECORDS() throws ClassNotFoundException {
        initComponents();
        con=DB.getConn();
        FIR_TYPE.setEnabled(false);
			FIR_DESC.setEnabled(false);
                       
    }
public ResultSet getFirID(int FIR_ID) throws SQLException
{

try
{

	//step 3: create a stement reference using Connection interface createStatement() method
	PreparedStatement stmt=con.prepareStatement("select * from FIR where Fir_id=?");

	//procedure call

	//CallableStatement stmt=con.prepareCall("{call getAuthorById(?)}");

stmt.setInt(1,FIR_ID);
	r=stmt.executeQuery();



}
catch(SQLException exe1)
		{

			throw exe1;
	}

return r;
}
public ResultSet deleteFIR(int FIR_ID)throws SQLException
{
try
{
		//int rowAfftected=0;
		PreparedStatement stmt=con.prepareStatement("delete from  FIR where Fir_id=?");
		//try(CallableStatement stmt=con.prepareCall("{call deleteAuthors(?)}");)
		{

			stmt.setInt(1,FIR_ID);



			r=stmt.executeQuery();
		}
}
		catch(SQLException exe1)
				{

					throw exe1;
			}
return r;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FIR_ID = new javax.swing.JTextField();
        FIR_TYPE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        FIR_DESC = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setText("FIR_ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(410, 150, 300, 70);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setText("FIR_TYPE");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(400, 250, 240, 40);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setText("FIR_DESCRIPTION");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(390, 340, 210, 60);

        FIR_ID.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        FIR_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIR_IDActionPerformed(evt);
            }
        });
        jPanel1.add(FIR_ID);
        FIR_ID.setBounds(690, 170, 310, 50);

        FIR_TYPE.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        FIR_TYPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIR_TYPEActionPerformed(evt);
            }
        });
        jPanel1.add(FIR_TYPE);
        FIR_TYPE.setBounds(690, 250, 320, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crime1/images (8).jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 330, 220);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        jLabel8.setText("FIR FILES");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(590, 30, 480, 50);

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jButton2.setText("GET_INFO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(910, 460, 180, 50);

        jButton3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(670, 460, 180, 50);

        FIR_DESC.setColumns(20);
        FIR_DESC.setRows(5);
        jScrollPane1.setViewportView(FIR_DESC);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(690, 350, 320, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setText("-");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1330, 10, 40, 20);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("REMOVE\n DETIALS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 520, 260, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crime1/crime-virtual-set.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1320, 1010);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1010, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void FIR_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIR_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FIR_IDActionPerformed

    private void FIR_TYPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIR_TYPEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FIR_TYPEActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setState(JFrame.ICONIFIED);         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
		{
		java.sql.ResultSet r=getFirID(Integer.parseInt(FIR_ID.getText().toString().trim()));
                                                                                //returns the current  selected item

		if(r.next())
		{
			FIR_TYPE.setText(r.getString(2));
			FIR_DESC.setText(r.getString(3));
			//t4.setText(r.getString(4));

			//t1.setEnabled(false);
			FIR_TYPE.setEnabled(false);
			FIR_DESC.setEnabled(false);
                        
                       // t2.setText("");
					//t3.setText("");
		//t4.setText("");
		}
	}
	catch(java.sql.SQLException exe1)
				{

					JOptionPane.showMessageDialog(null,"Failed to Retrieve the Data......");

					exe1.printStackTrace();
		}// TODO add your handling code here:

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
CrimeReport h=new CrimeReport();
        h.setVisible(true);
        h.pack();
        h.setLocationRelativeTo(null);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
        java.sql.ResultSet r=deleteFIR(Integer.parseInt(FIR_ID.getText().toString().trim()));
        JOptionPane.showMessageDialog(null,"FIR Details deleted Successfully......");
        	
			//FIR_ID.setText("");
					FIR_TYPE.setText("");
		FIR_DESC.setText("");
                
        
        }
        catch(java.sql.SQLException exe1){
            JOptionPane.showMessageDialog(null,"FIR DETIALS failed to deleted......");
        }
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
            java.util.logging.Logger.getLogger(FIRRECORDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FIRRECORDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FIRRECORDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FIRRECORDS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FIRRECORDS().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FIRRECORDS.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea FIR_DESC;
    private javax.swing.JTextField FIR_ID;
    private javax.swing.JTextField FIR_TYPE;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
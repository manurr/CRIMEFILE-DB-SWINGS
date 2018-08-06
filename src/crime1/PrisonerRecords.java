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
public class PrisonerRecords extends javax.swing.JFrame {

    /**
     * Creates new form PrisonerRecords
     */
    private static Connection con;
 private ResultSet r;
    public PrisonerRecords() throws ClassNotFoundException {
        initComponents();
        con=DB.getConn();
    }
    public ResultSet getCrimeID(int prisoner_id ) throws SQLException
{

try
{

	//step 3: create a stement reference using Connection interface createStatement() method
	PreparedStatement stmt=con.prepareStatement("select * from prisoner where prisoner_id=?");

	//procedure call

	//CallableStatement stmt=con.prepareCall("{call getAuthorById(?)}");

stmt.setInt(1,prisoner_id);
	r=stmt.executeQuery();



}
catch(SQLException exe1)
		{

			throw exe1;
	}

return r;
}
 public ResultSet deletePrisoner(int prisoner_id)throws SQLException
{
try
{
		//int rowAfftected=0;
		PreparedStatement stmt=con.prepareStatement("delete from  prisoner where prisoner_id=?");
		//try(CallableStatement stmt=con.prepareCall("{call deleteAuthors(?)}");)
		{

			stmt.setInt(1,prisoner_id);



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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Prisoner_ID = new javax.swing.JTextField();
        Prisoner_crime_id = new javax.swing.JTextField();
        Prisoner_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Prisoner_address = new javax.swing.JTextArea();
        No_of_years = new javax.swing.JTextField();
        Cell_no = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Prisoner ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(330, 90, 210, 40);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Prisoner Crime ID");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(330, 150, 210, 40);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Prisoner Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 210, 180, 40);

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Cell No");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(340, 440, 140, 40);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Prisoner Address");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 280, 190, 30);

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("No.of.Years");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 380, 170, 30);

        Prisoner_ID.setBackground(new java.awt.Color(204, 204, 204));
        Prisoner_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prisoner_IDActionPerformed(evt);
            }
        });
        jPanel1.add(Prisoner_ID);
        Prisoner_ID.setBounds(640, 90, 210, 40);

        Prisoner_crime_id.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(Prisoner_crime_id);
        Prisoner_crime_id.setBounds(640, 150, 210, 40);

        Prisoner_name.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(Prisoner_name);
        Prisoner_name.setBounds(640, 210, 210, 40);

        Prisoner_address.setBackground(new java.awt.Color(204, 204, 204));
        Prisoner_address.setColumns(20);
        Prisoner_address.setRows(5);
        jScrollPane1.setViewportView(Prisoner_address);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(640, 280, 210, 70);

        No_of_years.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(No_of_years);
        No_of_years.setBounds(640, 380, 210, 30);

        Cell_no.setBackground(new java.awt.Color(204, 204, 204));
        Cell_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cell_noActionPerformed(evt);
            }
        });
        jPanel1.add(Cell_no);
        Cell_no.setBounds(650, 440, 200, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crime1/images (10).jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(930, 0, 300, 140);

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton1.setText("GET_INFO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(810, 520, 140, 30);

        jButton2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(650, 520, 110, 30);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Prisoners Records");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 10, 410, 50);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("-");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(1260, 10, 40, 20);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("REMOVE\n DETIALS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 590, 260, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crime1/crime-virtual-set.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1330, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1329, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Prisoner_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prisoner_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Prisoner_IDActionPerformed

    private void Cell_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cell_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cell_noActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try
		{
		java.sql.ResultSet r=getCrimeID(Integer.parseInt(Prisoner_ID.getText().toString().trim()));
                                                                                //returns the current  selected item

		if(r.next())
		{
			Prisoner_crime_id.setText(r.getString(2));
			Prisoner_name.setText(r.getString(3));
                        Prisoner_address.setText(r.getString(4));
                        No_of_years.setText(r.getString(5));
                        Cell_no.setText(r.getString(6));
                        
			//t4.setText(r.getString(4));

			//t1.setEnabled(false);
                        Prisoner_crime_id.setEnabled(false);
			Prisoner_name.setEnabled(false);
			Prisoner_address.setEnabled(false);
                        No_of_years.setEnabled(false);
                        Cell_no.setEnabled(false);
                        
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
CrimeReport h=new CrimeReport();
        h.setVisible(true);
        h.pack();
        h.setLocationRelativeTo(null);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 try{
        java.sql.ResultSet r=deletePrisoner(Integer.parseInt(Prisoner_ID.getText().toString().trim()));
        JOptionPane.showMessageDialog(null,"FIR Details deleted Successfully......");
        	
			//FIR_ID.setText("");
					Prisoner_crime_id.setText("");
		Prisoner_name.setText("");
                        Prisoner_address.setText("");
                        No_of_years.setText("");
                        Cell_no.setText("");
                
        
        }
        catch(java.sql.SQLException exe1){
            JOptionPane.showMessageDialog(null,"FIR DETIALS failed to deleted......");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PrisonerRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrisonerRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrisonerRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrisonerRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PrisonerRecords().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PrisonerRecords.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cell_no;
    private javax.swing.JTextField No_of_years;
    private javax.swing.JTextField Prisoner_ID;
    private javax.swing.JTextArea Prisoner_address;
    private javax.swing.JTextField Prisoner_crime_id;
    private javax.swing.JTextField Prisoner_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
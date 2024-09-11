// assignment1 - 6

package assignment1;
import java.sql.*;

public class navigation extends javax.swing.JFrame {

    Connection cn;
    Statement st;
    ResultSet rs;
    
    public navigation() {
        initComponents();
        connectDB();
    }
    
     public void connectDB()
    {
        try
        {
             Class.forName("com.mysql.jdbc.Driver");
             cn=DriverManager.getConnection("jdbc:mysql://localhost:3335/java","root","");
             st=cn.createStatement();
             System.out.println("Connected to database!");
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nmlbl = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        dslbl = new javax.swing.JLabel();
        sallbl = new javax.swing.JLabel();
        dplbl = new javax.swing.JLabel();
        idtf = new javax.swing.JTextField();
        saltf = new javax.swing.JTextField();
        dptf = new javax.swing.JTextField();
        dstf = new javax.swing.JTextField();
        nmtf = new javax.swing.JTextField();
        fbtn = new javax.swing.JButton();
        lbtn = new javax.swing.JButton();
        pbtn = new javax.swing.JButton();
        nbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nmlbl.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        nmlbl.setForeground(new java.awt.Color(0, 0, 102));
        nmlbl.setText("Emp_Name");

        idlbl.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        idlbl.setForeground(new java.awt.Color(0, 0, 102));
        idlbl.setText("Emp_Id");

        dslbl.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        dslbl.setForeground(new java.awt.Color(0, 0, 102));
        dslbl.setText("Designation");

        sallbl.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        sallbl.setForeground(new java.awt.Color(0, 0, 102));
        sallbl.setText("Salary");

        dplbl.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        dplbl.setForeground(new java.awt.Color(0, 0, 102));
        dplbl.setText("Department");

        idtf.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        idtf.setForeground(new java.awt.Color(0, 0, 102));

        saltf.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        saltf.setForeground(new java.awt.Color(0, 0, 102));

        dptf.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        dptf.setForeground(new java.awt.Color(0, 0, 102));

        dstf.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        dstf.setForeground(new java.awt.Color(0, 0, 102));

        nmtf.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        nmtf.setForeground(new java.awt.Color(0, 0, 102));

        fbtn.setBackground(new java.awt.Color(255, 204, 204));
        fbtn.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        fbtn.setForeground(new java.awt.Color(0, 0, 102));
        fbtn.setText("FIRST");
        fbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fbtnActionPerformed(evt);
            }
        });

        lbtn.setBackground(new java.awt.Color(255, 204, 204));
        lbtn.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        lbtn.setForeground(new java.awt.Color(0, 0, 102));
        lbtn.setText("LAST");
        lbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbtnActionPerformed(evt);
            }
        });

        pbtn.setBackground(new java.awt.Color(255, 204, 204));
        pbtn.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        pbtn.setForeground(new java.awt.Color(0, 0, 102));
        pbtn.setText("PREVIOUS");
        pbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pbtnActionPerformed(evt);
            }
        });

        nbtn.setBackground(new java.awt.Color(255, 204, 204));
        nbtn.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        nbtn.setForeground(new java.awt.Color(0, 0, 102));
        nbtn.setText("NEXT");
        nbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dplbl, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dptf, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nmlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nmtf, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dstf, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saltf, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(fbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idtf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nmlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nmtf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sallbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saltf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dstf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dplbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dptf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fbtnActionPerformed
        display("first");       
    }//GEN-LAST:event_fbtnActionPerformed

    private void pbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pbtnActionPerformed
        display("previous");
    }//GEN-LAST:event_pbtnActionPerformed

    private void nbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbtnActionPerformed
        display("next");
    }//GEN-LAST:event_nbtnActionPerformed

    private void lbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbtnActionPerformed
        display("last");
    }//GEN-LAST:event_lbtnActionPerformed

    private void display(String opr) 
    {
       try
       {
//           ResultSet rs;
           rs=st.executeQuery("select * from Emp");
           rs.next();
           if(opr.equals("first"))
           {
               rs.first();               
           }
           if(opr.equals("previous"))
           {
               rs.previous();
           }
           if(opr.equals("next"))      
           {
               rs.next();               
           }
           if(opr.equals("last"))
           {
               rs.last();               
           }
            idtf.setText(""+rs.getInt(1));
            nmtf.setText(rs.getString(2));
            saltf.setText(""+rs.getInt(3));
            dstf.setText(rs.getString(4));
            dptf.setText(rs.getString(5));
            
            System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+
                               rs.getInt(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
           
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
    }
   
    public static void main(String args[]) {
     
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new navigation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dplbl;
    private javax.swing.JTextField dptf;
    private javax.swing.JLabel dslbl;
    private javax.swing.JTextField dstf;
    private javax.swing.JButton fbtn;
    private javax.swing.JLabel idlbl;
    private javax.swing.JTextField idtf;
    private javax.swing.JButton lbtn;
    private javax.swing.JButton nbtn;
    private javax.swing.JLabel nmlbl;
    private javax.swing.JTextField nmtf;
    private javax.swing.JButton pbtn;
    private javax.swing.JLabel sallbl;
    private javax.swing.JTextField saltf;
    // End of variables declaration//GEN-END:variables
}

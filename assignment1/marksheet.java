// assignment1 - 5

package assignment1;
import java.sql.*;


public class marksheet extends javax.swing.JFrame 
{
    public marksheet() 
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ansta = new javax.swing.JTextArea();
        rnolbl = new javax.swing.JLabel();
        m3lbl = new javax.swing.JLabel();
        calbtn = new javax.swing.JButton();
        m2lbl = new javax.swing.JLabel();
        snmlbl = new javax.swing.JLabel();
        m1lbl = new javax.swing.JLabel();
        rnotf = new javax.swing.JTextField();
        snmtf = new javax.swing.JTextField();
        m1tf = new javax.swing.JTextField();
        m2tf = new javax.swing.JTextField();
        m3tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ansta.setColumns(20);
        ansta.setFont(new java.awt.Font("Microsoft YaHei", 0, 36)); // NOI18N
        ansta.setForeground(new java.awt.Color(0, 204, 255));
        ansta.setRows(5);
        jScrollPane1.setViewportView(ansta);

        rnolbl.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        rnolbl.setForeground(new java.awt.Color(102, 102, 102));
        rnolbl.setText("Roll no.:");

        m3lbl.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        m3lbl.setForeground(new java.awt.Color(102, 102, 102));
        m3lbl.setText("Mark3:");

        calbtn.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        calbtn.setForeground(new java.awt.Color(255, 102, 102));
        calbtn.setText("Calculate");
        calbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calbtnActionPerformed(evt);
            }
        });

        m2lbl.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        m2lbl.setForeground(new java.awt.Color(102, 102, 102));
        m2lbl.setText("Mark2:");

        snmlbl.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        snmlbl.setForeground(new java.awt.Color(102, 102, 102));
        snmlbl.setText("Student Name:");

        m1lbl.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        m1lbl.setForeground(new java.awt.Color(102, 102, 102));
        m1lbl.setText("Mark1:");

        rnotf.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        rnotf.setForeground(new java.awt.Color(153, 204, 255));
        rnotf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnotfActionPerformed(evt);
            }
        });

        snmtf.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        snmtf.setForeground(new java.awt.Color(153, 204, 255));

        m1tf.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        m1tf.setForeground(new java.awt.Color(153, 204, 255));

        m2tf.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        m2tf.setForeground(new java.awt.Color(153, 204, 255));

        m3tf.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        m3tf.setForeground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(m3lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rnolbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(m2lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(snmlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(m1lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rnotf, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(snmtf, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m1tf, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m2tf, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m3tf, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(calbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rnolbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rnotf))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(snmlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(snmtf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m1tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m2lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m3lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m3tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(calbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calbtnActionPerformed
        int rno,m1,m2,m3;
        String snm;                
                
        rno=Integer.parseInt(rnotf.getText());
        snm=snmtf.getText();
        m1=Integer.parseInt(m1tf.getText());
        m2=Integer.parseInt(m2tf.getText());
        m3=Integer.parseInt(m3tf.getText());
        
        if(m1>=33 && m2>=33 && m3>=33)
        {
            int total =m1+m2+m3;
            double per=(total*100)/300;
            String grade = null;
            if(per>70)
            {
                grade="A";                
            }
            else if(per<=70 && per>=60)
            {
                grade="B"; 
            }
            else if(per<=60 && per>=50)
            {
                grade="C"; 
            }
            else if(per<=50 && per>=40)
            {
                grade="D"; 
            }
            else if(per<=40 && per>=30)
            {
                grade="E"; 
            }
            String ans="Rollno:\t"+rno+"\nName:\t"+snm+"\nTotal:\t"+total+"\nCongratulations! you have got:"+
                       "\nPercentage:\t"+per+"\nGrade:\t"+grade+" Grade!";
            ansta.setText(ans);
//            System.out.println(ans);
            
            String insquery="insert into student values(?,?,?,?,?,?,?,?)";
            try(Connection cn=Assignment1.getConnection();PreparedStatement pst=cn.prepareStatement(insquery))
            {
                pst.setInt(1, rno);
                pst.setString(2, snm);
                pst.setInt(3, m1);
                pst.setInt(4, m2);
                pst.setInt(5, m3);
                pst.setInt(6, total);
                pst.setDouble(7, per);
                pst.setString(8, grade);
                
                int record=pst.executeUpdate();
                if(record>0)
                {
                    System.out.println("Record Inserted!");
                }
                else
                {
                    System.out.println("Failed to Insert!");
                }
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            
          
        }
        else
        {
            String ans="Better Luck Next Time!!";
            ansta.setText(ans);
        }   
    }//GEN-LAST:event_calbtnActionPerformed

    private void rnotfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnotfActionPerformed
       
    }//GEN-LAST:event_rnotfActionPerformed

    
    public static void main(String args[]) 
    {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new marksheet().setVisible(true);
                }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ansta;
    private javax.swing.JButton calbtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel m1lbl;
    private javax.swing.JTextField m1tf;
    private javax.swing.JLabel m2lbl;
    private javax.swing.JTextField m2tf;
    private javax.swing.JLabel m3lbl;
    private javax.swing.JTextField m3tf;
    private javax.swing.JLabel rnolbl;
    private javax.swing.JTextField rnotf;
    private javax.swing.JLabel snmlbl;
    private javax.swing.JTextField snmtf;
    // End of variables declaration//GEN-END:variables
}

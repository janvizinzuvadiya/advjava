package assignment2;

import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class texteditor extends javax.swing.JFrame {

    public texteditor() {
        initComponents();
    }
    
    String filename;
    Clipboard cl= getToolkit().getSystemClipboard();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        searchbtn = new javax.swing.JButton();
        searchfield = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        filemenu = new javax.swing.JMenu();
        newfile = new javax.swing.JMenuItem();
        openfile = new javax.swing.JMenuItem();
        savefile = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        editmenu = new javax.swing.JMenu();
        cuttext = new javax.swing.JMenuItem();
        copytext = new javax.swing.JMenuItem();
        pastetext = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        searchbtn.setText("Serach");

        filemenu.setText("File");

        newfile.setText("New");
        newfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newfileActionPerformed(evt);
            }
        });
        filemenu.add(newfile);

        openfile.setText("Open");
        openfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openfileActionPerformed(evt);
            }
        });
        filemenu.add(openfile);

        savefile.setText("Save");
        savefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savefileActionPerformed(evt);
            }
        });
        filemenu.add(savefile);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        filemenu.add(exit);

        jMenuBar1.add(filemenu);

        editmenu.setText("Edit");

        cuttext.setText("Cut");
        cuttext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuttextActionPerformed(evt);
            }
        });
        editmenu.add(cuttext);

        copytext.setText("Copy");
        copytext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copytextActionPerformed(evt);
            }
        });
        editmenu.add(copytext);

        pastetext.setText("Paste");
        pastetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastetextActionPerformed(evt);
            }
        });
        editmenu.add(pastetext);

        jMenuBar1.add(editmenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchfield)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newfileActionPerformed
        text.setText("");
        setTitle(filename);
    }//GEN-LAST:event_newfileActionPerformed

    private void openfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openfileActionPerformed
     
        FileDialog fd=new FileDialog(texteditor.this,"Open File",FileDialog.LOAD);
        fd.setVisible(true);
        
        if(fd.getFile() != null)
        {
            filename = fd.getDirectory() + fd.getFile();
            setTitle(filename);
        }
        
        try
        {
            BufferedReader r=new BufferedReader(new FileReader(filename));
            StringBuilder sb= new StringBuilder();
            String line=null;
            
            while((line= r.readLine())!= null)
            {
                sb.append(line + "\n");
                text.setText(sb.toString());
            }
            
            r.close();
        }
        catch(IOException e)
        {
            System.out.println("File not Found");
        }
        
        
    }//GEN-LAST:event_openfileActionPerformed

    private void savefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savefileActionPerformed
           FileDialog fd=new FileDialog(texteditor.this,"Save File",FileDialog.SAVE);
           fd.setVisible(true);
           
              if(fd.getFile() != null)
            {
                filename = fd.getDirectory() + fd.getFile();
                setTitle(filename);
            }
              
              try
              {
                  FileWriter w=new FileWriter(filename);
                  w.write(text.getText());
                  setTitle(filename);
                  
                  w.close();
              }
              catch(IOException e)
              {
                  System.out.println("File not found");
              }
        
    }//GEN-LAST:event_savefileActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
                System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void cuttextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuttextActionPerformed
            String s=text.getSelectedText();
            StringSelection cut= new StringSelection(s);
            
            cl.setContents (cut, cut);
            text.replaceRange("", text.getSelectionStart(), text.getSelectionEnd());
            
            
    }//GEN-LAST:event_cuttextActionPerformed

    private void copytextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copytextActionPerformed
                String s= text.getSelectedText();
                StringSelection copy= new StringSelection(s);
                
                cl.setContents(copy, copy);
    }//GEN-LAST:event_copytextActionPerformed

    private void pastetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastetextActionPerformed
        
        try
        {
            Transferable paste=cl.getContents(texteditor.this);
            String sel=(String) paste.getTransferData(DataFlavor.stringFlavor);
            text.replaceRange(sel, text.getSelectionStart(), text.getSelectionEnd());
        }
        catch(Exception e)
        {
            System.out.println("not working");
        }
    }//GEN-LAST:event_pastetextActionPerformed


    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(texteditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(texteditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(texteditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(texteditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new texteditor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copytext;
    private javax.swing.JMenuItem cuttext;
    private javax.swing.JMenu editmenu;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu filemenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem newfile;
    private javax.swing.JMenuItem openfile;
    private javax.swing.JMenuItem pastetext;
    private javax.swing.JMenuItem savefile;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField searchfield;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}

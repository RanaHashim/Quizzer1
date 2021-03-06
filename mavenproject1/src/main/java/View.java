/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//importing useful libraries
import java.io.*;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Hashim Ali Khan
 */
public class View extends javax.swing.JFrame {
    public static int score=0; //static int for calculating score
    public ArrayList<JRadioButton> scoring=new ArrayList<>(); //creating an array of radio buttons
    public ArrayList<Boolean> correctanswer=new ArrayList<>(); //creating an array of boolean variables
    public ArrayList<String> ty=new ArrayList<>(); //creating an array of strings
    public static int tquestion=0; //static int for retaining the value of variable
    /**
     * Creates new form View
     */
    public View() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Attempt = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Finish = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(2200, 2200));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 3200));

        Attempt.setText("Attempt Quiz");
        Attempt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttemptActionPerformed(evt);
            }
        });

        jLabel2.setText("Title:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Attempt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Attempt)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(3040, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        Finish.setText("Finish");
        Finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Finish)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Finish)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AttemptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttemptActionPerformed
        // TODO add your handling code here:
         ArrayList<data> e=new ArrayList(); //creating a list of array of objects of data class
         e=null; //initializing list to null
       try {
         FileInputStream fileIn = new FileInputStream("quizer.ser"); //serializing
         ObjectInputStream in = new ObjectInputStream(fileIn); //creating object of objectinput stream for reading data from file
         e= (ArrayList<data>)in.readObject(); //reading object
         in.close(); //closing inputstream object
         fileIn.close(); //closing file
      }catch(IOException j) { //exception
         j.printStackTrace();
         return;
      }catch(ClassNotFoundException c) { //exception of not finding class
         System.out.println("Quizer class not found");
         c.printStackTrace();
         return;
      }
       int x=0;
       for(int i=1;i<e.size();i++){ //loop to read objects
         tquestion++;
         ty.add(e.get(i).qtype);    //adding object data to array
         JLabel lab=new JLabel("Q."+e.get(i).qno);
         lab.setBounds(20, 63+e.get(i).qno*200, 30, 25); //setting position
         JLabel q=new JLabel(); //creating new label
         q.setText("q"+e.get(i).qno); //setting text of label
         q.setBounds(70, 65+e.get(i).qno*200, 600, 25);  //setting position
         jPanel1.add(lab); //adding label to panel for display
         jPanel1.add(q); //adding label to panel for display
        switch (e.get(i).qtype) { //sqitch statement
            case "MCQ":
                {
                    JRadioButton k =new JRadioButton(); //creating new radio button
                    JRadioButton l =new JRadioButton(); //creating new radio button
                    JRadioButton m =new JRadioButton(); //creating new radio button
                    JRadioButton n =new JRadioButton(); //creating new radio button
                    k.setName("btna"); //setting name
                    l.setName("btnb"); //setting name
                    m.setName("btnc"); //setting name
                    n.setName("btnd"); //setting name
                    k.setBounds(60,110+e.get(i).qno*200,20,17); //setting display position
                    l.setBounds(60,140+e.get(i).qno*200,20,17); //setting display position
                    m.setBounds(60,170+e.get(i).qno*200,20,17); //setting display position
                    n.setBounds(60,200+e.get(i).qno*200,20,17); //setting display position
                    ButtonGroup ans=new ButtonGroup();
                    ans.add(k); //adding elements to array
                    ans.add(l); 
                    ans.add(m);
                    ans.add(n);
                    scoring.add(k); //adding elements to array 
                    scoring.add(l);
                    scoring.add(m);
                    scoring.add(n);
                    jPanel1.add(k); //adding elements to panel for display
                    jPanel1.add(l);
                    jPanel1.add(m);
                    jPanel1.add(n);
                    JLabel opt1=new JLabel("A)");
                    JLabel opt2=new JLabel("B)");
                    JLabel opt3=new JLabel("C)");
                    JLabel opt4=new JLabel("D)");
                    opt1.setBounds(90,108+e.get(i).qno*200,20,20);
                    opt2.setBounds(90,140+e.get(i).qno*200,20,20);
                    opt3.setBounds(90,170+e.get(i).qno*200,20,20);
                    opt4.setBounds(90,200+e.get(i).qno*200,20,20);
                    jPanel1.add(opt1);
                    jPanel1.add(opt2);
                    jPanel1.add(opt3);
                    jPanel1.add(opt4);
                    JLabel A =new JLabel();
                    JLabel B =new JLabel();
                    JLabel C =new JLabel();
                    JLabel D =new JLabel();
                    A.setText("A"+e.get(i).qno);
                    B.setText("B"+e.get(i).qno);
                    C.setText("C"+e.get(i).qno);
                    D.setText("D"+e.get(i).qno);
                    A.setBounds(120, 108+e.get(i).qno*200, 200, 20);
                    B.setBounds(120, 140+e.get(i).qno*200, 200, 20);
                    C.setBounds(120, 170+e.get(i).qno*200, 200, 20);
                    D.setBounds(120, 200+e.get(i).qno*200, 200, 20);
                    jPanel1.add(A);
                    jPanel1.add(B);
                    jPanel1.add(C);
                    jPanel1.add(D);
                    correctanswer.add(e.get(i).r1);
                    correctanswer.add(e.get(i).r2);
                    correctanswer.add(e.get(i).r3);
                    correctanswer.add(e.get(i).r4);
                    
                    break;
                }
            case "True/False":
                {
                    JRadioButton A =new JRadioButton("True");
                    JRadioButton B =new JRadioButton("False");
                    A.setName("A"+e.get(i).qno);
                    B.setName("B"+e.get(i).qno);
                    ButtonGroup BG=new ButtonGroup();
                    BG.add(A);
                    BG.add(B);
                    A.setBounds(60, 110+e.get(i).qno*200, 100, 25);
                    B.setBounds(60, 140+e.get(i).qno*200, 100, 25);
                    scoring.add(A);
                    scoring.add(B);
                    jPanel1.add(A);
                    jPanel1.add(B);
                    correctanswer.add(e.get(i).r1.booleanValue());
                    correctanswer.add(e.get(i).r2.booleanValue());
                    break;
                }
            default:
                break;
        }
         revalidate();
         repaint();
       }       
    }//GEN-LAST:event_AttemptActionPerformed
//function for calculating score
    private void FinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishActionPerformed
        // TODO add your handling code here:
        int y=0;
        for(int i=0;i<ty.size()-1;i++){
           if(ty.get(i).equals("MCQ")){
               if(correctanswer.get(y*4) && scoring.get(y*4).isSelected()) {
               } else if(scoring.get((y*4)+1).isSelected() && correctanswer.get((y*4)+1)){
                   score++;
               }
               else if(scoring.get((y*4)+2).isSelected() && correctanswer.get((y*4)+2)){
                   score++;
               }
               else if(scoring.get((y*4)+3).isSelected() && correctanswer.get((y*4)+3)){
                   score++;
               }
               else {
                   
               }
               
            }
            else if(ty.get(i).equals("True/False")){
            if(scoring.get(y*4).isSelected() && correctanswer.get(y*4)){
                 score++;
                }
               else if(scoring.get((y*4)+1).isSelected() && correctanswer.get((y*4)+1)){
                 score++;
                }
            }
            y++;
    }//GEN-LAST:event_FinishActionPerformed
     System.out.println("Score: "+ score);
    }
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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Attempt;
    private javax.swing.JButton Finish;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

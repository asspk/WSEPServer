/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.UnknownHostException;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Adi Avrahami
 */
public class GUI_UI extends javax.swing.JFrame {
    
    private  String req;
    private int status=1;
    private int nextStatus=1;

    /**
     * Creates new form NewJFrame
     */
    public GUI_UI() {
        initComponents();
    }

    public void nextState(){
    	if (!forumBody.getText().contains("ERROR:")){
    		if(this.nextStatus==2)logO();loginInitSing();
    		if(this.nextStatus==1)logO();
    		if(this.nextStatus==3)views();
    		if(this.nextStatus==4)viewm();
    		if(this.nextStatus==5){logO(); loginInitSing();};

    		
    	}
    	
    }
    
    
    
    
    
    
//    
//    public void back(){
//        if (nextStatus==3){logO(); loginInitSing();}
//        if (nextStatus==4){views();}
//
//    }
//    
    public void loginInitSing(){
        this.status=2;
        initB.setVisible(false);
        initName.setVisible(false);
        initPass.setVisible(false);
        loginB.setVisible(false);
        logInName.setVisible(false);
        logInPass.setVisible(false);
        signUpB.setVisible(false);
        signUpUserName.setVisible(false);
        signUpName.setVisible(false);
        signUpPass.setVisible(false);
        signUpAge.setVisible(false);
        logOutB.setVisible(true);
        viewB.setVisible(true);
        viewSubB.setVisible(true);
        viewSubNum.setVisible(true);
        CreatSubB.setVisible(true);
        CreatSubDec.setVisible(true);
        CreatSubName.setVisible(true);
    }
    
    public void views(){
                this.status=3;

        viewSubB.setVisible(false);
        viewSubNum.setVisible(false);
        CreatSubB.setVisible(false);
        CreatSubDec.setVisible(false);
        CreatSubName.setVisible(false);
        viewMsgB.setVisible(true);
        viewMsgNum.setVisible(true);
        CreatMsgB.setVisible(true);
        CreatMsgTitle.setVisible(true);
        CreatMsgContent.setVisible(true);
        backB.setVisible(true);
    }
    
    public void viewm(){
                this.status=4;
                viewSubB.setVisible(false);
                viewSubNum.setVisible(false);
                CreatSubB.setVisible(false);
                CreatSubDec.setVisible(false);
                CreatSubName.setVisible(false);
        viewMsgB.setVisible(false);
        viewMsgNum.setVisible(false);
        CreatMsgB.setVisible(false);
        CreatMsgTitle.setVisible(false);
        CreatMsgContent.setVisible(false);
        CreateCommentB.setVisible(true);
        CreateCommentContent.setVisible(true);
    }
    
    public void logO(){
                this.status=1;

         initB.setVisible(true);
        initName.setVisible(true);
        initPass.setVisible(true);
        loginB.setVisible(true);
        logInName.setVisible(true);
        logInPass.setVisible(true);
        signUpB.setVisible(true);
        signUpUserName.setVisible(true);
        signUpName.setVisible(true);
        signUpPass.setVisible(true);
        signUpAge.setVisible(true);
        logOutB.setVisible(false);
        viewB.setVisible(false);
        viewSubB.setVisible(false);
        viewSubNum.setVisible(false);
        CreatSubB.setVisible(false);
        CreatSubDec.setVisible(false);
        CreatSubName.setVisible(false);
        viewMsgB.setVisible(false);
        viewMsgNum.setVisible(false);
        CreatMsgB.setVisible(false);
        CreatMsgTitle.setVisible(false);
        CreatMsgContent.setVisible(false);
        backB.setVisible(false);
        CreateCommentB.setVisible(false);
        CreateCommentContent.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        initPanel = new javax.swing.JLayeredPane();
        initB = new javax.swing.JButton();
        loginB = new javax.swing.JButton();
        logOutB = new javax.swing.JButton();
        logOutB.setVisible(false);
        signUpB = new javax.swing.JButton();
        CreatSubB = new javax.swing.JButton();
        CreatSubB.setVisible(false);
        CreatMsgB = new javax.swing.JButton();
        CreatMsgB.setVisible(false);
        CreateCommentB = new javax.swing.JButton();
        CreateCommentB.setVisible(false);
        viewB = new javax.swing.JButton();
        viewB.setVisible(false);
        viewSubB = new javax.swing.JButton();
        viewSubB.setVisible(false);
        viewMsgB = new javax.swing.JButton();
        viewMsgB.setVisible(false);
        backB = new javax.swing.JButton();
        backB.setVisible(false);
        logInName = new javax.swing.JTextField();
        CreatSubDec = new javax.swing.JTextField();
        CreatSubDec.setVisible(false);
        CreatSubName = new javax.swing.JTextField();
        CreatSubName.setVisible(false);
        signUpUserName = new javax.swing.JTextField();
        signUpName = new javax.swing.JTextField();
        signUpAge = new javax.swing.JTextField();
        initName = new javax.swing.JTextField();
        CreatMsgTitle = new javax.swing.JTextField();
        CreatMsgTitle.setVisible(false);
        jScrollPane1 = new javax.swing.JScrollPane();
        CreateCommentContent = new javax.swing.JTextArea();
        CreateCommentContent.setVisible(false);
        jScrollPane2 = new javax.swing.JScrollPane();
        CreatMsgContent = new javax.swing.JTextArea();
        CreatMsgContent.setVisible(false);
        viewSubNum = new javax.swing.JTextField();
        viewSubNum.setVisible(false);
        viewMsgNum = new javax.swing.JTextField();
        viewMsgNum.setVisible(false);
        logInPass = new javax.swing.JPasswordField();
        initPass = new javax.swing.JPasswordField();
        signUpPass = new javax.swing.JPasswordField();
        jScrollPane3 = new javax.swing.JScrollPane();
        forumBody = new javax.swing.JTextArea();
        forumLabel = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        initPanel.setBackground(new java.awt.Color(51, 255, 0));

        initB.setText("Init");
        initB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initBActionPerformed(evt);
            }
        });
        initB.setBounds(560, 430, 70, 30);
        initPanel.add(initB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        loginB.setText("LogiIn");
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBActionPerformed(evt);
            }
        });
        loginB.setBounds(560, 460, 70, 30);
        initPanel.add(loginB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        logOutB.setText("LogOut");
        logOutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBActionPerformed(evt);
            }
        });
        logOutB.setBounds(690, 0, 80, 40);
        initPanel.add(logOutB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        signUpB.setText("SingUp");
        signUpB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBActionPerformed(evt);
            }
        });
        signUpB.setBounds(560, 490, 70, 30);
        initPanel.add(signUpB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CreatSubB.setText("Creat Sub-Forum");
        CreatSubB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatSubBActionPerformed(evt);
            }
        });
        CreatSubB.setBounds(0, 420, 150, 30);
        initPanel.add(CreatSubB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CreatMsgB.setText("Create MSG");
        CreatMsgB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatMsgBActionPerformed(evt);
            }
        });
        CreatMsgB.setBounds(0, 420, 150, 30);
        initPanel.add(CreatMsgB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CreateCommentB.setText("Create Comment");
        CreateCommentB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateCommentBActionPerformed(evt);
            }
        });
        CreateCommentB.setBounds(0, 420, 150, 30);
        initPanel.add(CreateCommentB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        viewB.setText("View");
        viewB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBActionPerformed(evt);
            }
        });
        viewB.setBounds(850, 0, 80, 40);
        initPanel.add(viewB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        viewSubB.setText("View Sub-Forum");
        viewSubB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSubBActionPerformed(evt);
            }
        });
        viewSubB.setBounds(0, 390, 190, 30);
        initPanel.add(viewSubB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        viewMsgB.setText("View MSG");
        viewMsgB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMsgBActionPerformed(evt);
            }
        });
        viewMsgB.setBounds(0, 390, 190, 30);
        initPanel.add(viewMsgB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backB.setText("back");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });
        backB.setBounds(770, 0, 80, 40);
        initPanel.add(backB, javax.swing.JLayeredPane.DEFAULT_LAYER);

        logInName.setText("Name");
        logInName.setBounds(650, 460, 70, 30);
        initPanel.add(logInName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CreatSubDec.setText("Dec");
        CreatSubDec.setBounds(230, 420, 180, 30);
        initPanel.add(CreatSubDec, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CreatSubName.setText("Name");
        CreatSubName.setBounds(150, 420, 80, 30);
        initPanel.add(CreatSubName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        signUpUserName.setText("User-Name");
        signUpUserName.setBounds(650, 490, 70, 30);
        initPanel.add(signUpUserName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        signUpName.setText("Name");
        signUpName.setBounds(820, 490, 70, 30);
        initPanel.add(signUpName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        signUpAge.setText("Age");
        signUpAge.setBounds(890, 490, 60, 30);
        initPanel.add(signUpAge, javax.swing.JLayeredPane.DEFAULT_LAYER);

        initName.setText("Name");
        initName.setBounds(650, 430, 70, 30);
        initPanel.add(initName, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CreatMsgTitle.setText("Tittle");
        CreatMsgTitle.setBounds(150, 420, 80, 30);
        initPanel.add(CreatMsgTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CreateCommentContent.setColumns(20);
        CreateCommentContent.setRows(5);
        CreateCommentContent.setText("Content");
        jScrollPane1.setViewportView(CreateCommentContent);

        jScrollPane1.setBounds(230, 420, 290, 100);
        initPanel.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        CreatMsgContent.setColumns(20);
        CreatMsgContent.setRows(5);
        CreatMsgContent.setText("Content");
        jScrollPane2.setViewportView(CreatMsgContent);

        jScrollPane2.setBounds(230, 420, 290, 100);
        initPanel.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        viewSubNum.setText("Sub-Forum Number");
        viewSubNum.setBounds(190, 390, 150, 30);
        initPanel.add(viewSubNum, javax.swing.JLayeredPane.DEFAULT_LAYER);

        viewMsgNum.setText("MSG Number");
        viewMsgNum.setBounds(190, 390, 150, 30);
        initPanel.add(viewMsgNum, javax.swing.JLayeredPane.DEFAULT_LAYER);

        logInPass.setText("Password");
        logInPass.setBounds(740, 460, 80, 30);
        initPanel.add(logInPass, javax.swing.JLayeredPane.DEFAULT_LAYER);

        initPass.setText("Password");
        initPass.setBounds(740, 430, 80, 30);
        initPanel.add(initPass, javax.swing.JLayeredPane.DEFAULT_LAYER);

        signUpPass.setText("Password");
        signUpPass.setBounds(730, 490, 80, 30);
        initPanel.add(signUpPass, javax.swing.JLayeredPane.DEFAULT_LAYER);

        forumBody.setEditable(false);
        forumBody.setColumns(20);
        forumBody.setRows(5);
        jScrollPane3.setViewportView(forumBody);

        jScrollPane3.setBounds(0, 0, 680, 370);
        initPanel.add(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        forumLabel.setText("Forum");
        forumLabel.setBounds(530, 180, 230, 30);
        initPanel.add(forumLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(initPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(initPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void initBActionPerformed(java.awt.event.ActionEvent evt) {                                      
    	this.nextStatus=2;
    	req=Protocol.init_request(initName.getText(), initPass.getText());
        send_recieve();
    }                                     

    private void loginBActionPerformed(java.awt.event.ActionEvent evt) {                                       
    	this.nextStatus=2;
        req=Protocol.logIn_request(logInName.getText(), logInPass.getText());  
        send_recieve();  
    }                                   

    private void logOutBActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	this.nextStatus=1;
        req=Protocol.logOut_request();
        send_recieve();
    }                                       

    private void signUpBActionPerformed(java.awt.event.ActionEvent evt) {                                        
    	this.nextStatus=2;
        req=Protocol.signUp_request(signUpUserName.getText(), signUpPass.getText(), signUpName.getText(), signUpAge.getText());
        send_recieve();
    }                                       

    private void CreatSubBActionPerformed(java.awt.event.ActionEvent evt) {                                          
       req=Protocol.createSubForum_request(CreatSubName.getText(), CreatSubDec.getText());
       send_recieve();
    }                                         

    private void CreatMsgBActionPerformed(java.awt.event.ActionEvent evt) {                                          
               req=Protocol.createMsg_request(CreatMsgTitle.getText(), CreatMsgContent.getText());
               send_recieve();
    }                                         

    private void CreateCommentBActionPerformed(java.awt.event.ActionEvent evt) {                                               
               req=Protocol.createComment_request(CreateCommentContent.getText());
               send_recieve();
    }                                              

    private void viewBActionPerformed(java.awt.event.ActionEvent evt) {                                      
    	this.nextStatus=5;

        req=Protocol.view_request();
        send_recieve();
    }                                     

    private void viewSubBActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	this.nextStatus=3;
    	try{
    		Integer.parseInt(viewSubNum.getText());
    		req=Protocol.viewSubForum_request(viewSubNum.getText());
            send_recieve();
    	}
    	catch (Exception e)
    	{
    		forumBody.setText("Error: enter a valid sub forum number ");
    	}
    }                                        

    private void viewMsgBActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	this.nextStatus=4;
    	try{
    		Integer.parseInt(viewMsgNum.getText());
    		req=Protocol.viewMsg_request(viewMsgNum.getText());
            send_recieve();
    	}
    	catch (Exception e)
    	{
    		forumBody.setText("Error: enter a valid Message number ");
    	}
    }                                        

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {                                      
    	this.nextStatus=this.nextStatus-1;
    	nextState();        
    	req=Protocol.Back_requset();
        send_recieve();
                
    }                                     

    /**
     * @param args the command line arguments
     * @throws IOException 
     * @throws UnknownHostException 
     */
    public static void main(String args[]) throws UnknownHostException, IOException {
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
            java.util.logging.Logger.getLogger(GUI_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_UI().setVisible(true);

            }
        });
        
        System.out.println("benjooo");
        
		Com.Conncect();
		//System.out.println("AFTER CONNECT");
		String outcome=Com.recieveMessage();
		if(forumBody!=null)
			forumBody.setText(""+outcome);
	
		
        
    }
    
    public void send_recieve() 
    {
    	try {
			Com.sendMessage(req);
	    	forumBody.setText(""+Com.recieveMessage());
	    	nextState();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton CreatMsgB;
    private javax.swing.JTextArea CreatMsgContent;
    private javax.swing.JTextField CreatMsgTitle;
    private javax.swing.JButton CreatSubB;
    private javax.swing.JTextField CreatSubDec;
    private javax.swing.JTextField CreatSubName;
    private javax.swing.JButton CreateCommentB;
    private javax.swing.JTextArea CreateCommentContent;
    private javax.swing.JButton backB;
    private static javax.swing.JTextArea forumBody;
    private javax.swing.JLabel forumLabel;
    private javax.swing.JButton initB;
    private javax.swing.JTextField initName;
    private javax.swing.JLayeredPane initPanel;
    private javax.swing.JPasswordField initPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField logInName;
    private javax.swing.JPasswordField logInPass;
    private javax.swing.JButton logOutB;
    private javax.swing.JButton loginB;
    private javax.swing.JTextField signUpAge;
    private javax.swing.JButton signUpB;
    private javax.swing.JTextField signUpName;
    private javax.swing.JPasswordField signUpPass;
    private javax.swing.JTextField signUpUserName;
    private javax.swing.JButton viewB;
    private javax.swing.JButton viewMsgB;
    private javax.swing.JTextField viewMsgNum;
    private javax.swing.JButton viewSubB;
    private javax.swing.JTextField viewSubNum;
    // End of variables declaration                   
}

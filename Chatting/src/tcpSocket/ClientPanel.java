package tcpSocket;

import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientPanel extends javax.swing.JFrame implements FrameBehavior
{

	public String myNickname;
	private static InetAddress host;
	public Client client = null;  // Her bir istemci için konuştuğu
	// Taraf sunucu olduğu için 
	// istemcide tek bir client nesnesi tutulur.    

	/**
	 * Creates new form ClientPanel
	 */
	public ClientPanel()
	{
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jLabel1 = new javax.swing.JLabel();
      txtServerIp = new javax.swing.JTextField();
      btnJoin = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      txtMessages = new javax.swing.JTextArea();
      txtNickname = new javax.swing.JTextField();
      jLabel3 = new javax.swing.JLabel();
      txtPort = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      txtMessage = new javax.swing.JTextField();
      btnSend = new javax.swing.JButton();
      txtSendTo = new javax.swing.JTextField();
      jLabel4 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jLabel1.setText("Server Ip");

      txtServerIp.setText("127.0.0.1");

      btnJoin.setText("Connect");
      btnJoin.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            btnJoinActionPerformed(evt);
         }
      });

      txtMessages.setColumns(20);
      txtMessages.setRows(5);
      txtMessages.setText("\n-> Send to \"all\" to send to all users.");
      jScrollPane1.setViewportView(txtMessages);

      txtNickname.setName(""); // NOI18N
      txtNickname.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            txtNicknameActionPerformed(evt);
         }
      });

      jLabel3.setText("Client");

      txtPort.setText("5004");
      txtPort.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            txtPortActionPerformed(evt);
         }
      });

      jLabel2.setText("Port");

      jLabel5.setText("Message");

      txtMessage.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            txtMessageActionPerformed(evt);
         }
      });

      btnSend.setText("Send");
      btnSend.setName("btnSend"); // NOI18N
      btnSend.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            btnSendActionPerformed(evt);
         }
      });

      txtSendTo.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            txtSendToActionPerformed(evt);
         }
      });

      jLabel4.setText("Send to");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel1)
                     .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtSendTo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(txtServerIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNickname)))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(btnJoin)
                  .addContainerGap())
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(17, 17, 17))))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1)
               .addComponent(txtServerIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2)
               .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(txtNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnJoin))
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(txtSendTo)
               .addComponent(jLabel5)
               .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnSend))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void btnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinActionPerformed
		 try
		 {
			 if ("all".equals(txtNickname.getText()) || "".equals(txtNickname.getText()))
				 throw new Exception();

			 String[] nicknames = txtNickname.getText().split(" ");
			 myNickname = nicknames[0];
			 txtNickname.setText(nicknames[0]);
			 //printResult2("-> Spaces in nicknames are not allowed. Your nickname has "
			 //	 + "been cropped to \"" + myNickname + "\"");

			 host = InetAddress.getByName(txtServerIp.getText());
			 Socket socket = new Socket(host, Integer.parseInt(txtPort.getText())); // socket(connection)

			 client = new Client(socket, this);
			 client.myOutputMessages.add("Nickname " + myNickname);
			 printResult2("-> Connected");
			 btnJoin.setEnabled(false);
		 } catch (UnknownHostException ex) {
			 Logger.getLogger(ClientPanel.class.getName()).log(Level.SEVERE, null, ex);
		 } catch (IOException ex) {
			 Logger.getLogger(ClientPanel.class.getName()).log(Level.SEVERE, null, ex);
		 } catch (Exception ex) {
			 Logger.getLogger(ClientPanel.class.getName()).log(Level.SEVERE, "Invalid nickname", ex);
		 }
    }//GEN-LAST:event_btnJoinActionPerformed

    private void txtNicknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicknameActionPerformed

    }//GEN-LAST:event_txtNicknameActionPerformed

    private void txtMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMessageActionPerformed
		 btnSendActionPerformed(evt);
    }//GEN-LAST:event_txtMessageActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
		 client.myOutputMessages.add("Message " + txtSendTo.getText() + " " + txtMessage.getText());
		 printResult2("To " + txtSendTo.getText() + ": " + txtMessage.getText());
		 txtMessage.setText("");
    }//GEN-LAST:event_btnSendActionPerformed

   private void txtSendToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSendToActionPerformed
		// TODO add your handling code here:
   }//GEN-LAST:event_txtSendToActionPerformed

   private void txtPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPortActionPerformed
		// TODO add your handling code here:
   }//GEN-LAST:event_txtPortActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[])
	{
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try
		{
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
			{
				if ("Nimbus".equals(info.getName()))
				{
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		}
		catch (ClassNotFoundException ex)
		{
			java.util.logging.Logger.getLogger(ClientPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (InstantiationException ex)
		{
			java.util.logging.Logger.getLogger(ClientPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (IllegalAccessException ex)
		{
			java.util.logging.Logger.getLogger(ClientPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		catch (javax.swing.UnsupportedLookAndFeelException ex)
		{
			java.util.logging.Logger.getLogger(ClientPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ClientPanel().setVisible(true);
			}
		});
	}

	@Override
	public void makeAction(String msg, Client sender)
	{
		printResult(msg);
		repaint();
	}

	public void printResult(String msg)
	{
		String[] parts = msg.split(" ", 2);
		String clientName = parts[0];
		String message = parts[1];
		txtMessages.setText(txtMessages.getText() + "\n" + "From " + clientName + ": " + message);
	}

	public void printResult2(String msg)
	{
		txtMessages.setText(txtMessages.getText() + "\n" + msg);
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnJoin;
   private javax.swing.JButton btnSend;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTextField txtMessage;
   private javax.swing.JTextArea txtMessages;
   private javax.swing.JTextField txtNickname;
   private javax.swing.JTextField txtPort;
   private javax.swing.JTextField txtSendTo;
   private javax.swing.JTextField txtServerIp;
   // End of variables declaration//GEN-END:variables
}

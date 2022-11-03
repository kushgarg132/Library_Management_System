package library_management_system;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import javax.swing.table.DefaultTableModel;

public class ReturnBook extends javax.swing.JFrame {

    static Connection c;
    Statement statement;
    static String ISBN;
    static Student s;
    
    public ReturnBook() {
        initComponents();
        setTitle("Library Management System");
        setResizable(false);
        setLocationRelativeTo(null);
        
        jTextField1.setEditable(false);
        jLabel20.setText( new SimpleDateFormat("dd / MM / yyyy").format(new Date()) );
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");	   
            c = DriverManager.getConnection("jdbc:mysql://localhost/library_management", "root", mysql_setup.mysql_password);
            statement = c.createStatement();
        }
        catch(Exception e){e.printStackTrace();}
    }
    
    public ReturnBook(Student s){
        this();
        this.s=s;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Return Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("---");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Issue Date");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("---");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Author");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("---");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("---");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("ISBN ");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Price");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 180, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("RETURN BOOK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("Date");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 418, 46, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 418, 143, 21));

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Name", "Author", "Price", "Issue Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 31, -1, 131));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 21, 540, 510));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/general_background.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        if ( jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "The fields cannot be left blank.", "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
            try{
            
                String date = new SimpleDateFormat("yyMMdd").format(new Date());
                
                PreparedStatement ps = c.prepareStatement("Insert into Record values(?,?,?,?);");
                ps.setString(1, s.sid);
                ps.setString(2, ISBN);
                ps.setString(3, jLabel9.getText());
                ps.setString(4, date);
                
                ps.execute();
                
                ps=c.prepareStatement("Delete from Issue_book where ISBN=? and SID=? and IssueDate=?;");
                ps.setString(1, ISBN);
                ps.setString(2, s.sid);
                ps.setString(3, jLabel9.getText());
                ps.execute();
                
                ps = c.prepareStatement("update Books set Quantity = Quantity+1 where ISBN = ?; ");
                ps.setString(1, ISBN);
                ps.execute();
                
                JOptionPane.showMessageDialog(new JFrame(), "Book Returned Successfully.", "Message" , JOptionPane.INFORMATION_MESSAGE); 
            }
            catch(Exception e) { 
                e.printStackTrace();
                JOptionPane.showMessageDialog(new JFrame(), e.getMessage(), "Message" , JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        StudentHome home = new StudentHome(s);
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if ( jTextField1.getText().isEmpty() ){
            jLabel6.setText( "---" );
            jLabel7.setText( "---" );
            jLabel8.setText( "---" );
            jLabel9.setText( "---" );
            JOptionPane.showMessageDialog(new JFrame(), "The fields cannot be left blank.", "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            
            try{
                ResultSet rs;
                PreparedStatement ps = c.prepareStatement("select b.ISBN,b.title,b.Author,b.Price,ib.IssueDate from Issue_book ib,Books b where b.ISBN=ib.ISBN and b.ISBN = ?; ");
                ps.setString(1,jTextField1.getText());
                rs = ps.executeQuery();
                int flag=1;

                while(rs.next()){
                    ISBN = rs.getString("b.ISBN");
                    jLabel6.setText( rs.getString("b.Title") );
                    jLabel7.setText( rs.getString("b.Author") );
                    jLabel8.setText( rs.getString("b.Price") );
                    jLabel9.setText( rs.getString("ib.IssueDate") );
                    flag=0;
                }
                
                if(flag==1){
                    jLabel6.setText( "---" );
                    jLabel7.setText( "---" );
                    jLabel8.setText( "---" );
                    jLabel9.setText( "---" );
                    JOptionPane.showMessageDialog(new JFrame(), "Book Not Found in Database.", "Message" , JOptionPane.INFORMATION_MESSAGE);
                    jTextField1.setText("");
                }
           
            } catch(Exception e) {e.printStackTrace();}
           
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
        
        try{
            String query="Select ib.ISBN,b.Title,b.Author,b.Price,ib.IssueDate from Issue_Book ib,Books b where ib.sid='"+s.sid+"' and ib.ISBN=b.ISBN;";
            
            ResultSet rs = statement.executeQuery(query);
         
            while(rs.next()){
                String ISBN=rs.getString("ib.ISBN");
                String Name=rs.getString("b.Title");
                String Author=rs.getString("b.Author");
                String Price=rs.getString("b.Price");
                String Issue_date=rs.getString("ib.IssueDate");
                
                table.insertRow(table.getRowCount(), new Object[] {ISBN,Name,Author,Price,Issue_date});
            }
            
            rs.close();
        } catch(Exception e) {e.printStackTrace();}
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        String bid = (String) jTable1.getValueAt(jTable1.getSelectedRow() ,0);
        jTextField1.setText(bid);
        jButton1.doClick();
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MousePressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

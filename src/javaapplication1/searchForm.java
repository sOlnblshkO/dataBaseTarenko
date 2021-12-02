package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class searchForm extends javax.swing.JFrame {

    Connection con;
    Statement st;
    DefaultTableModel searchTM;
    
    ArrayList<classForAthlete> idOfAthlete;
    ArrayList<classForPar> idOfParent;
    ArrayList<classForCoach> idOfCoach;
    
    class classForPar {
        int id;
        String phone;

        public classForPar(int newId, String newPhone)
        {
            id = newId;
            phone = newPhone;
        }
        
        public int getId()
        {
            return id;
        }
        public String getPhone()
        {
            return phone;
        }
    }
    
    class classForCoach {
        int id;
        String phone, education;
        public classForCoach(int newId, String newPhone, String newEducation)
        {
            id = newId;
            phone = newPhone;
            education = newEducation;
        }
        public int getId()
        {
            return id;
        }
        public String getPhone()
        {
            return phone;
        }
        public String getEducation()
        {
            return education;
        }
    }
    
    class classForAthlete {
        int id, idOfPar, idOfSec;
        public classForAthlete(int newId, int idPar, int idSec) {
            id = newId;
            idOfPar = idPar;
            idOfSec = idSec;
        }
        public int getId()
        {
            return id;
        }
        public int getPar()
        {
            return idOfPar;
        }
        public int getSec()
        {
            return idOfSec;
        }
    }
    
    public searchForm() {
        initComponents();
        idOfAthlete = new ArrayList<classForAthlete>();
        idOfParent = new ArrayList<classForPar>();
        idOfCoach = new ArrayList<classForCoach>();
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://db.accdb");
            st = con.createStatement();
            searchTM = (DefaultTableModel) searchTable.getModel();
            System.out.println("connected");
        }
        catch (Exception e){
            System.out.println("not connected");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        searchTable = new javax.swing.JTable();
        searchButton = new javax.swing.JButton();
        surnameEditText = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();

        searchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Фамилия", "Имя", "Роль", "Доп. информация"
            }
        ));
        jScrollPane1.setViewportView(searchTable);

        searchButton.setText("Поиск");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        surnameEditText.setToolTipText("Введите фамилию");

        editButton.setText("Редактировать");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(surnameEditText, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(surnameEditText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String sur = surnameEditText.getText();
        ResultSet rs;
        searchTM.setRowCount(0);
        for (int i = 0; i < 3; i++)
        {
            switch (i)
            {
                case 0:
                {
                    try {
                        String athsur, athname, athrole = "Спортсмен", athinf;
                        rs = st.executeQuery("select * from athlete where sur = '" + sur + "'");
                        
                        idOfAthlete = new ArrayList<classForAthlete>();
                        
                        while (rs.next())
                        {
                            athinf = "Секция: ";
                            String idsec = rs.getString("idsection");
                            ResultSet sec = st.executeQuery("select name from section where id = '" + idsec + "'");
                            sec.next();
                            athinf += sec.getString("name");
                            
                            String idpar = rs.getString("idparent");
                            ResultSet par = st.executeQuery("select * from parent where id = '" + idpar + "'");
                            par.next();
                            athinf += ". Родители: " + par.getString("sur") + " " + par.getString("name") + " " + par.getString("phone");
                            
                            athsur = rs.getString("sur");
                            athname = rs.getString("name");
                            searchTM.addRow(new Object[]{athsur , athname, athrole, athinf});
                            
                            idOfAthlete.add(new classForAthlete(Integer.valueOf(rs.getString("id")), Integer.valueOf(rs.getString("idparent")), Integer.valueOf(rs.getString("idsection"))));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(searchForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;
                case 1:
                     try {
                        String parsur, parname, parrole = "Родитель", parinf;
                        rs = st.executeQuery("select * from parent where sur = '" + sur + "'");                       
                        
                        idOfParent = new ArrayList<classForPar>();

                        while (rs.next())
                        {
                            parinf = "Номер: " + rs.getString("phone");
                            
                            parsur = rs.getString("sur");
                            parname = rs.getString("name");
                            searchTM.addRow(new Object[]{parsur , parname, parrole, parinf});
                            
                            idOfParent.add(new classForPar(Integer.valueOf(rs.getString("id")), rs.getString("phone")));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(searchForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 2:
                    try {
                        String coachsur, coachname, coachrole = "Тренер", coachinf;
                        rs = st.executeQuery("select * from teacher where sur = '" + sur + "'");
                        
                        idOfCoach = new ArrayList<classForCoach>();
                        while (rs.next())
                        {
                            coachinf = "Номер: " + rs.getString("phone") + ". Образование: " + rs.getString("education");
                            
                            coachsur = rs.getString("sur");
                            coachname = rs.getString("name");
                            searchTM.addRow(new Object[]{coachsur , coachname, coachrole, coachinf});
                            
                            int cid = Integer.valueOf(rs.getString("id"));
                            String cph = rs.getString("phone");
                            String ced = rs.getString("education");
                            idOfCoach.add(new classForCoach(cid, cph, ced));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(searchForm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int selectedRow = searchTable.getSelectedRow();
        if (selectedRow > -1)
        {
            editForm edit = new editForm();
            String role = (String) searchTM.getValueAt(selectedRow, 2);
            switch (role)
            {
                case "Тренер":
                    try {
                        edit.idCoachLabel1.setText(String.valueOf(idOfCoach.get(selectedRow - idOfAthlete.size() - idOfParent.size()).getId()));
                        edit.surCoachEdit1.setText(searchTM.getValueAt(selectedRow, 0).toString());
                        edit.nameCoachEdit1.setText(searchTM.getValueAt(selectedRow, 1).toString());
                        edit.numCoachEdit1.setText(String.valueOf(idOfCoach.get(selectedRow - idOfAthlete.size() - idOfParent.size()).getPhone()));
                        edit.edCoachEdit1.setText(String.valueOf(idOfCoach.get(selectedRow - idOfAthlete.size() - idOfParent.size()).getEducation()));

                        edit.editCoachPanel.setVisible(true);
                        edit.setVisible(true);
                    } catch (Exception e) {
                        System.out.print(e);
                    }
                    break;
                case "Родитель":
                    try{
                        edit.idParLabel.setText(String.valueOf(idOfParent.get(selectedRow - idOfAthlete.size()).getId()));
                        edit.surParEdit.setText(searchTM.getValueAt(selectedRow, 0).toString());
                        edit.nameParEdit.setText(searchTM.getValueAt(selectedRow, 1).toString());
                        edit.numParEdit.setText(String.valueOf(idOfParent.get(selectedRow - idOfAthlete.size()).getPhone()));

                        edit.editParPanel.setVisible(true);
                        edit.setVisible(true);
                    } catch (Exception e){
                        System.out.print(e);
                    }
                    break;
                case "Спортсмен":
                    try {
                        ResultSet parents = st.executeQuery("select * from parent");
                        ResultSet section = st.executeQuery("select * from section");
                        
                        if (!edit.editAthPanel.isVisible())
                            edit.editAthPanel.setVisible(true);

                        edit.idAthleteLabel.setText("id = " + String.valueOf(idOfAthlete.get(selectedRow).getId()));
                        edit.jTextField1.setText(searchTM.getValueAt(selectedRow, 1).toString());
                        edit.jTextField2.setText(searchTM.getValueAt(selectedRow, 0).toString());
                        //настройка выбора родителей
                        edit.parentComboBox.removeAllItems();
                        edit.parentComboBox.addItem("Выберите");
                        while (parents.next()){
                            edit.parentComboBox.addItem(parents.getString("sur") + " " + parents.getString("name"));
                        }
                        ResultSet myParent = st.executeQuery("select * from parent where id = '" + String.valueOf(idOfAthlete.get(selectedRow).getPar()) + "'");
                        myParent.next();
                        edit.parentComboBox.setSelectedItem(myParent.getString("sur") + " " + myParent.getString("name"));
                        
                        //настройка выбора секций
                        edit.sectionComboBox.removeAllItems();
                        edit.sectionComboBox.addItem("Выберите");
                        while (section.next()){
                            edit.sectionComboBox.addItem(section.getString("name"));
                        }
                        ResultSet mySection = st.executeQuery("select name from section where id = '" + String.valueOf(idOfAthlete.get(selectedRow).getSec()) + "'");
                        mySection.next();
                        edit.sectionComboBox.setSelectedItem(mySection.getString("name"));

                        edit.editAthPanel.setVisible(true);
                        edit.setVisible(true);

                    } catch (Exception ex){
                        System.out.println(ex);
                    }
                    break;
            }
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Выберите поле");
        }
    }//GEN-LAST:event_editButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(searchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable searchTable;
    private javax.swing.JTextField surnameEditText;
    // End of variables declaration//GEN-END:variables
}

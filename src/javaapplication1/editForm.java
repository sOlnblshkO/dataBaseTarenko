package javaapplication1;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class editForm extends javax.swing.JFrame {

    Connection con;
    Statement st;
    
    public editForm() {
        initComponents();
        editAthPanel.setVisible(false);
        editParPanel.setVisible(false);
        editRoomPanel.setVisible(false);
        editCoachPanel.setVisible(false);
        editSectionPanel.setVisible(false);
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://db.accdb");
            st = con.createStatement();
        }
        catch (Exception e){
            System.out.println("not connected");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editAthPanel = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        birthdaySpinner = new javax.swing.JSpinner();
        parentComboBox = new javax.swing.JComboBox<>();
        sectionComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idAthleteLabel = new java.awt.Label();
        okButton = new javax.swing.JButton();
        cancelButton1 = new javax.swing.JButton();
        editParPanel = new javax.swing.JPanel();
        nameParEdit = new javax.swing.JTextField();
        surParEdit = new javax.swing.JTextField();
        numParEdit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idParLabel = new java.awt.Label();
        okParButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        editRoomPanel = new javax.swing.JPanel();
        nameRoomEdit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        idRoomLabel = new java.awt.Label();
        okRoomButton = new javax.swing.JButton();
        cancelButton2 = new javax.swing.JButton();
        editCoachPanel = new javax.swing.JPanel();
        nameCoachEdit1 = new javax.swing.JTextField();
        surCoachEdit1 = new javax.swing.JTextField();
        numCoachEdit1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        idCoachLabel1 = new java.awt.Label();
        okCouchButton = new javax.swing.JButton();
        cancelButton3 = new javax.swing.JButton();
        edCoachEdit1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        editSectionPanel = new javax.swing.JPanel();
        cancelSecButton = new javax.swing.JButton();
        nameSecEdit = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        coachComboBox = new javax.swing.JComboBox<>();
        roomComboBox = new javax.swing.JComboBox<>();
        dayTimeSecEdit = new javax.swing.JTextField();
        maxCountSecEdit = new javax.swing.JTextField();
        okSecButton = new javax.swing.JButton();
        idSecLabel = new java.awt.Label();

        setPreferredSize(new java.awt.Dimension(600, 300));
        setResizable(false);

        jTextField1.setText("jTextField1");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setText("jTextField2");
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        birthdaySpinner.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(978320820000L), new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));
        birthdaySpinner.setToolTipText("");
        birthdaySpinner.setEditor(new javax.swing.JSpinner.DateEditor(birthdaySpinner, "dd/MM/yyyy"));

        jLabel1.setText("Имя");

        jLabel2.setText("Фамилия");

        jLabel3.setText("День рождения");

        jLabel4.setText("Родитель");

        jLabel5.setText("Секция");

        idAthleteLabel.setText("label1");
        idAthleteLabel.setVisible(false);

        okButton.setText("Сохранить");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton1.setText("Отменить");
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editAthPanelLayout = new javax.swing.GroupLayout(editAthPanel);
        editAthPanel.setLayout(editAthPanelLayout);
        editAthPanelLayout.setHorizontalGroup(
            editAthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editAthPanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(editAthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editAthPanelLayout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(editAthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editAthPanelLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(idAthleteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editAthPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))))
                    .addGroup(editAthPanelLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(editAthPanelLayout.createSequentialGroup()
                        .addComponent(birthdaySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(editAthPanelLayout.createSequentialGroup()
                        .addComponent(parentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(editAthPanelLayout.createSequentialGroup()
                        .addComponent(sectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(45, 81, Short.MAX_VALUE))
            .addGroup(editAthPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(okButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton1)
                .addContainerGap())
        );
        editAthPanelLayout.setVerticalGroup(
            editAthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editAthPanelLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(idAthleteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(editAthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editAthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editAthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdaySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editAthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editAthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(66, 66, 66)
                .addGroup(editAthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton1))
                .addGap(56, 56, 56))
        );

        nameParEdit.setText("jTextField3");
        nameParEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        surParEdit.setText("jTextField4");
        surParEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        numParEdit.setText("jTextField5");
        numParEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numParEditKeyTyped(evt);
            }
        });

        jLabel6.setText("Фамилия");

        jLabel7.setText("Имя");

        jLabel8.setText("Номер");

        idParLabel.setText("label1");
        idParLabel.setVisible(false);

        okParButton.setText("Сохранить");
        okParButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okParButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Отменить");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editParPanelLayout = new javax.swing.GroupLayout(editParPanel);
        editParPanel.setLayout(editParPanelLayout);
        editParPanelLayout.setHorizontalGroup(
            editParPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editParPanelLayout.createSequentialGroup()
                .addGroup(editParPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editParPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(okParButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton))
                    .addGroup(editParPanelLayout.createSequentialGroup()
                        .addContainerGap(142, Short.MAX_VALUE)
                        .addGroup(editParPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idParLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editParPanelLayout.createSequentialGroup()
                                .addGroup(editParPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(surParEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numParEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameParEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)))
                        .addGap(18, 18, 18)
                        .addGroup(editParPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(0, 95, Short.MAX_VALUE)))
                .addContainerGap())
        );
        editParPanelLayout.setVerticalGroup(
            editParPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editParPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idParLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(editParPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(surParEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editParPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nameParEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editParPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(numParEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(editParPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okParButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        nameRoomEdit.setText("jTextField4");
        nameRoomEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel9.setText("Название комнаты");

        idRoomLabel.setText("label1");
        idRoomLabel.setVisible(false);

        okRoomButton.setText("Сохранить");
        okRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okRoomButtonActionPerformed(evt);
            }
        });

        cancelButton2.setText("Отменить");
        cancelButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editRoomPanelLayout = new javax.swing.GroupLayout(editRoomPanel);
        editRoomPanel.setLayout(editRoomPanelLayout);
        editRoomPanelLayout.setHorizontalGroup(
            editRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editRoomPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(editRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idRoomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(editRoomPanelLayout.createSequentialGroup()
                        .addComponent(nameRoomEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(353, 353, 353))
            .addGroup(editRoomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(okRoomButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton2)
                .addGap(68, 68, 68))
        );
        editRoomPanelLayout.setVerticalGroup(
            editRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editRoomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idRoomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(editRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nameRoomEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addGroup(editRoomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okRoomButton)
                    .addComponent(cancelButton2))
                .addContainerGap())
        );

        nameCoachEdit1.setText("jTextField3");
        nameCoachEdit1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        surCoachEdit1.setText("jTextField4");
        surCoachEdit1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        numCoachEdit1.setText("jTextField5");
        numCoachEdit1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numParEditKeyTyped(evt);
            }
        });

        jLabel13.setText("Фамилия");

        jLabel14.setText("Имя");

        jLabel15.setText("Номер");

        idCoachLabel1.setText("label1");
        idCoachLabel1.setVisible(false);

        okCouchButton.setText("Сохранить");
        okCouchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okCouchButtonActionPerformed(evt);
            }
        });

        cancelButton3.setText("Отменить");
        cancelButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        edCoachEdit1.setText("jTextField5");
        edCoachEdit1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel16.setText("Образование");

        javax.swing.GroupLayout editCoachPanelLayout = new javax.swing.GroupLayout(editCoachPanel);
        editCoachPanel.setLayout(editCoachPanelLayout);
        editCoachPanelLayout.setHorizontalGroup(
            editCoachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editCoachPanelLayout.createSequentialGroup()
                .addGroup(editCoachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editCoachPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(okCouchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton3))
                    .addGroup(editCoachPanelLayout.createSequentialGroup()
                        .addContainerGap(129, Short.MAX_VALUE)
                        .addGroup(editCoachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idCoachLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editCoachPanelLayout.createSequentialGroup()
                                .addGroup(editCoachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(surCoachEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numCoachEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameCoachEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edCoachEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)))
                        .addGap(18, 18, 18)
                        .addGroup(editCoachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(0, 160, Short.MAX_VALUE)))
                .addContainerGap())
        );
        editCoachPanelLayout.setVerticalGroup(
            editCoachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editCoachPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(idCoachLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(editCoachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(surCoachEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editCoachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(nameCoachEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editCoachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(numCoachEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editCoachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edCoachEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(editCoachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okCouchButton)
                    .addComponent(cancelButton3))
                .addContainerGap())
        );

        cancelSecButton.setText("Отменить");
        cancelSecButton.setToolTipText("");
        cancelSecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        nameSecEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel10.setText("Назавние");

        jLabel11.setText("Комната");

        jLabel12.setText("День и время");

        jLabel17.setText("Максимальное количество");

        jLabel18.setText("Тренер");

        dayTimeSecEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        maxCountSecEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numParEditKeyTyped(evt);
            }
        });

        okSecButton.setText("Сохранить");
        okSecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okSecButtonActionPerformed(evt);
            }
        });

        idSecLabel.setText("label1");
        idSecLabel.setVisible(false);

        javax.swing.GroupLayout editSectionPanelLayout = new javax.swing.GroupLayout(editSectionPanel);
        editSectionPanel.setLayout(editSectionPanelLayout);
        editSectionPanelLayout.setHorizontalGroup(
            editSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editSectionPanelLayout.createSequentialGroup()
                .addGroup(editSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(editSectionPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(okSecButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelSecButton))
                        .addGroup(editSectionPanelLayout.createSequentialGroup()
                            .addGap(69, 69, 69)
                            .addGroup(editSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dayTimeSecEdit)
                                .addComponent(maxCountSecEdit)
                                .addComponent(coachComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 264, Short.MAX_VALUE)
                                .addComponent(roomComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameSecEdit, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(editSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel18)
                                .addComponent(jLabel12)
                                .addComponent(jLabel17))))
                    .addGroup(editSectionPanelLayout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(idSecLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        editSectionPanelLayout.setVerticalGroup(
            editSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editSectionPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(idSecLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nameSecEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(coachComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(dayTimeSecEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(maxCountSecEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(editSectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okSecButton)
                    .addComponent(cancelSecButton))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editAthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editParPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editCoachPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editRoomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(editSectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editSectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editParPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editAthPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editRoomPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editCoachPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if (!(jTextField1.getText().equals("") || jTextField2.getText().equals("") || sectionComboBox.getSelectedIndex() == 0 || parentComboBox.getSelectedIndex() == 0)){
            try{    
                ResultSet idSec = st.executeQuery("SELECT id FROM section where name = '" + sectionComboBox.getSelectedItem().toString() + "'");
                idSec.next();
                String idSection = idSec.getString("ID");
                

                String surnameOfParent = parentComboBox.getSelectedItem().toString();
                int space = surnameOfParent.indexOf(" ");
                surnameOfParent = surnameOfParent.substring(0, space);
                ResultSet idParent = st.executeQuery("select id from parent where sur = '"+surnameOfParent+"'");
                idParent.next();
                
                
                String pattern = "dd/MM/yyyy";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                String date = simpleDateFormat.format(birthdaySpinner.getValue());
                
                String idAthlete = idAthleteLabel.getText();
                idAthlete = idAthlete.substring(5, idAthlete.length());
                
                String q = "update athlete set name = '" + jTextField1.getText() +"', sur = '"+jTextField2.getText()
                        +"', birthday = '" + date + "', idsection = '" + idSection + "', idparent = '" + idParent.getString("id")+"' " 
                                + "where id = '" + idAthlete + "'";
                System.out.println(q);

                st.executeUpdate(q);
                
                
                
                this.setVisible(false);
                
            }catch (Exception ex){
                Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Заполните все поля");
        }
    }//GEN-LAST:event_okButtonActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || Character.isAlphabetic(c) 
                || (c == KeyEvent.VK_DELETE)
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_PERIOD)
                || Character.isWhitespace(c))){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Можно вводить только латинские буквы, кириллицу и цифры");
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okParButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okParButtonActionPerformed
        if (!(surParEdit.getText().equals("") || nameParEdit.getText().equals("") || numParEdit.getText().equals(""))){
            try{    
                String idParent = idParLabel.getText();
                String q = "update parent set name = '" + nameParEdit.getText() +"', sur = '"
                        +surParEdit.getText() + "', phone = '" + numParEdit.getText() +"' " 
                                + "where id = '" + idParent + "'";
                System.out.println(q);

                st.executeUpdate(q);
                
                this.setVisible(false);
                
            }catch (Exception ex){
                Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Заполните все поля");
        }
    }//GEN-LAST:event_okParButtonActionPerformed

    private void numParEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numParEditKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)  
                || (c == KeyEvent.VK_DELETE)
                || (c == KeyEvent.VK_BACK_SPACE)
                || Character.isWhitespace(c))){
            evt.consume();
            JOptionPane.showMessageDialog(null, "Можно вводить только цифры");
        }
    }//GEN-LAST:event_numParEditKeyTyped

    private void okRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okRoomButtonActionPerformed
        if (!(nameRoomEdit.getText().equals(""))){
            try{    
                String idRoom = idRoomLabel.getText();
                String q = "update room set num = '" + nameRoomEdit.getText()
                                + "' where id = '" + idRoom + "'";
                System.out.println(q);

                st.executeUpdate(q);
                
                this.setVisible(false);
                
            }catch (Exception ex){
                Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Заполните поле");
        } 

    }//GEN-LAST:event_okRoomButtonActionPerformed

    private void okCouchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okCouchButtonActionPerformed
        if (!(surCoachEdit1.getText().equals("") || nameCoachEdit1.getText().equals("") || numCoachEdit1.getText().equals("") || edCoachEdit1.getText().equals(""))){
            try{    
                String idCoach = idCoachLabel1.getText();
                String q = "update teacher set name = '" + nameCoachEdit1.getText() +"', sur = '"
                        +surCoachEdit1.getText() + "', phone = '" + numCoachEdit1.getText() +"', education = '" + edCoachEdit1.getText() +"' " 
                                + "where id = '" + idCoach + "'";
                System.out.println(q);

                st.executeUpdate(q);
                
                this.setVisible(false);
                
            }catch (Exception ex){
                Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Заполните все поля");
        } 
    }//GEN-LAST:event_okCouchButtonActionPerformed

    private void okSecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okSecButtonActionPerformed
        if (!(nameSecEdit.getText().equals("") || roomComboBox.getSelectedIndex() == 0 || coachComboBox.getSelectedIndex() == 0 || dayTimeSecEdit.getText().equals("") || maxCountSecEdit.getText().equals(""))){
            try{    
                
                String selectedCoach = coachComboBox.getSelectedItem().toString();
                int s = selectedCoach.indexOf(" ");
                String coachName = selectedCoach.substring(s+1, selectedCoach.length());
                String coachSur = selectedCoach.substring(0, s);
                ResultSet idCoach = st.executeQuery("select id from teacher where sur = '" + coachSur + "' and name = '" + coachName + "'");
                idCoach.next();
                
                String selectedRoom = roomComboBox.getSelectedItem().toString();
                ResultSet idRoom = st.executeQuery("select id from room where num = '" + selectedRoom + "'");
                idRoom.next();
                
                String idSec = idSecLabel.getText();
                String q = "update section set name = '" + nameSecEdit.getText() +"', idRoom = '"
                        + idRoom.getString("id") + "', idteacher = '" + idCoach.getString("id") +"', dayTime = '" + dayTimeSecEdit.getText() +"', maxCount = '" + maxCountSecEdit.getText() +"' " 
                                + "where id = '" + idSec + "'";
                System.out.println(q);

                st.executeUpdate(q);
                
                this.setVisible(false);
                
            }catch (Exception ex){
                Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Заполните все поля");
        }
    }//GEN-LAST:event_okSecButtonActionPerformed

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
            java.util.logging.Logger.getLogger(editForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JSpinner birthdaySpinner;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelButton1;
    private javax.swing.JButton cancelButton2;
    private javax.swing.JButton cancelButton3;
    private javax.swing.JButton cancelSecButton;
    public javax.swing.JComboBox<String> coachComboBox;
    public javax.swing.JTextField dayTimeSecEdit;
    public javax.swing.JTextField edCoachEdit1;
    public javax.swing.JPanel editAthPanel;
    public javax.swing.JPanel editCoachPanel;
    public javax.swing.JPanel editParPanel;
    public javax.swing.JPanel editRoomPanel;
    public javax.swing.JPanel editSectionPanel;
    public java.awt.Label idAthleteLabel;
    public java.awt.Label idCoachLabel1;
    public java.awt.Label idParLabel;
    public java.awt.Label idRoomLabel;
    public java.awt.Label idSecLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField maxCountSecEdit;
    public javax.swing.JTextField nameCoachEdit1;
    public javax.swing.JTextField nameParEdit;
    public javax.swing.JTextField nameRoomEdit;
    public javax.swing.JTextField nameSecEdit;
    public javax.swing.JTextField numCoachEdit1;
    public javax.swing.JTextField numParEdit;
    private javax.swing.JButton okButton;
    private javax.swing.JButton okCouchButton;
    private javax.swing.JButton okParButton;
    private javax.swing.JButton okRoomButton;
    private javax.swing.JButton okSecButton;
    public javax.swing.JComboBox<String> parentComboBox;
    public javax.swing.JComboBox<String> roomComboBox;
    public javax.swing.JComboBox<String> sectionComboBox;
    public javax.swing.JTextField surCoachEdit1;
    public javax.swing.JTextField surParEdit;
    // End of variables declaration//GEN-END:variables
}

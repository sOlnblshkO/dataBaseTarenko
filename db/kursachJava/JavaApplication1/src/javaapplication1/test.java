package javaapplication1;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class test extends javax.swing.JFrame {

    Connection con;
    Statement st;
    DefaultTableModel mainTM;
    String pattern = "dd/MM/yyyy";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    javax.swing.JPanel lastPanel;
    int widthPanel = 550, heightPanel = 200;
    ArrayList<Integer> idOfParent, idOfAthlete, idOfRoom, idOfCoach, idOfSection;
    
    public test() {
        initComponents();
        lastPanel = athletePanel;
        athletePanel.setVisible(false);
        parentPanel.setVisible(false);
        coachPanel.setVisible(false);
        roomPanel.setVisible(false);
        sectionPanel.setVisible(false);
        mainTM = (DefaultTableModel) mainTable.getModel();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mainTable = new javax.swing.JTable();
        coachButton = new java.awt.Button();
        parentButton = new java.awt.Button();
        roomButton = new java.awt.Button();
        athleteButton = new java.awt.Button();
        sectionButton = new java.awt.Button();
        athletePanel = new javax.swing.JPanel();
        surAthEdit = new javax.swing.JTextField();
        nameAthEdit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        birthdaySpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        sectionComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        parentComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        addNewAthleteButton = new javax.swing.JButton();
        deleteAthleteButton = new javax.swing.JButton();
        editAthleteButton = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        surParEdit = new javax.swing.JTextField();
        nameParEdit = new javax.swing.JTextField();
        numParEdit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        editParButton = new javax.swing.JButton();
        addParButton = new javax.swing.JButton();
        deletParButton = new javax.swing.JButton();
        coachPanel = new javax.swing.JPanel();
        nameCoachEdit = new javax.swing.JTextField();
        surCoachEdit = new javax.swing.JTextField();
        numCoachEdit = new javax.swing.JTextField();
        edCoachEdit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        addCoachButton = new javax.swing.JButton();
        delCoachButton = new javax.swing.JButton();
        editCoachButton = new javax.swing.JButton();
        roomPanel = new javax.swing.JPanel();
        nameRoomEdit = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        addRoomButton = new javax.swing.JButton();
        delRoomButton = new javax.swing.JButton();
        editRoomButton = new javax.swing.JButton();
        sectionPanel = new javax.swing.JPanel();
        nameSecEdit = new javax.swing.JTextField();
        dayTimeSecEdit = new javax.swing.JTextField();
        maxCountSecEdit = new javax.swing.JTextField();
        roomSecComboBox = new javax.swing.JComboBox<>();
        coachSecComboBox = new javax.swing.JComboBox<>();
        addSecButton = new javax.swing.JButton();
        delSecButton = new javax.swing.JButton();
        editSecButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(762, 540));
        setResizable(false);

        mainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(mainTable);

        coachButton.setLabel("Тренера");
        coachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coachButtonActionPerformed(evt);
            }
        });

        parentButton.setLabel("Родители");
        parentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentButtonActionPerformed(evt);
            }
        });

        roomButton.setLabel("Комнаты");
        roomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomButtonActionPerformed(evt);
            }
        });

        athleteButton.setLabel("Спортсмены");
        athleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                athleteButtonActionPerformed(evt);
            }
        });

        sectionButton.setLabel("Секции");
        sectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionButtonActionPerformed(evt);
            }
        });

        athletePanel.setRequestFocusEnabled(false);

        surAthEdit.setToolTipText("Фамилия");
        surAthEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surAthEditKeyTyped(evt);
            }
        });

        nameAthEdit.setToolTipText("Имя");
        nameAthEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surAthEditKeyTyped(evt);
                nameAthEditKeyTyped(evt);
            }
        });

        jLabel1.setText("Фамилия");

        jLabel2.setText("Имя");

        birthdaySpinner.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1575335064906L), new java.util.Date(978311040000L), null, java.util.Calendar.DAY_OF_MONTH));
        birthdaySpinner.setDoubleBuffered(true);
        birthdaySpinner.setEditor(new javax.swing.JSpinner.DateEditor(birthdaySpinner, "dd/MM/yy"));

        jLabel3.setText("День рождения");

        jLabel4.setText("Секция");

        jLabel5.setText("Родитель");

        addNewAthleteButton.setText("Добавить нового спортсмена");
        addNewAthleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewAthleteButtonActionPerformed(evt);
            }
        });

        deleteAthleteButton.setText("Удалить спортсмена");
        deleteAthleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAthleteButtonActionPerformed(evt);
            }
        });

        editAthleteButton.setText("Редактировать");
        editAthleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAthleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout athletePanelLayout = new javax.swing.GroupLayout(athletePanel);
        athletePanel.setLayout(athletePanelLayout);
        athletePanelLayout.setHorizontalGroup(
            athletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(athletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(athletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(athletePanelLayout.createSequentialGroup()
                        .addComponent(deleteAthleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editAthleteButton))
                    .addGroup(athletePanelLayout.createSequentialGroup()
                        .addGroup(athletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(athletePanelLayout.createSequentialGroup()
                                .addComponent(sectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(athletePanelLayout.createSequentialGroup()
                                .addComponent(parentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addComponent(addNewAthleteButton)
                            .addGroup(athletePanelLayout.createSequentialGroup()
                                .addComponent(birthdaySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(athletePanelLayout.createSequentialGroup()
                                .addGroup(athletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(surAthEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                                    .addComponent(nameAthEdit))
                                .addGroup(athletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(athletePanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, athletePanelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel1)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        athletePanelLayout.setVerticalGroup(
            athletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(athletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(athletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surAthEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(athletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameAthEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(athletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdaySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(athletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(athletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addNewAthleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(athletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteAthleteButton)
                    .addComponent(editAthleteButton))
                .addContainerGap())
        );

        parentPanel.setPreferredSize(new java.awt.Dimension(550, 200));

        surParEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surAthEditKeyTyped(evt);
            }
        });

        nameParEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surAthEditKeyTyped(evt);
            }
        });

        numParEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numParEditKeyTyped(evt);
            }
        });

        jLabel6.setText("Фамилия");

        jLabel7.setText("Номер");

        jLabel8.setText("Имя");

        editParButton.setText("Редактировать");
        editParButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editParButtonActionPerformed(evt);
            }
        });

        addParButton.setText("Добавить нового родителя");
        addParButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addParButtonActionPerformed(evt);
            }
        });

        deletParButton.setText("Удалить родителя");
        deletParButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletParButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout parentPanelLayout = new javax.swing.GroupLayout(parentPanel);
        parentPanel.setLayout(parentPanelLayout);
        parentPanelLayout.setHorizontalGroup(
            parentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parentPanelLayout.createSequentialGroup()
                        .addComponent(deletParButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                        .addComponent(editParButton))
                    .addGroup(parentPanelLayout.createSequentialGroup()
                        .addComponent(addParButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(parentPanelLayout.createSequentialGroup()
                        .addComponent(numParEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parentPanelLayout.createSequentialGroup()
                        .addComponent(surParEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(parentPanelLayout.createSequentialGroup()
                        .addComponent(nameParEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );
        parentPanelLayout.setVerticalGroup(
            parentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surParEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameParEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numParEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addParButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(parentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editParButton)
                    .addComponent(deletParButton))
                .addContainerGap())
        );

        nameCoachEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameAthEditKeyTyped(evt);
                surAthEditKeyTyped(evt);
            }
        });

        surCoachEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surAthEditKeyTyped(evt);
            }
        });

        numCoachEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numParEditKeyTyped(evt);
            }
        });

        edCoachEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surAthEditKeyTyped(evt);
            }
        });

        jLabel9.setText("Фамилия");

        jLabel10.setText("Имя");

        jLabel11.setText("Номер");

        jLabel12.setText("Образование");

        addCoachButton.setText("Добавить нового тренера");
        addCoachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCoachButtonActionPerformed(evt);
            }
        });

        delCoachButton.setText("Удалить тренера");
        delCoachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delCoachButtonActionPerformed(evt);
            }
        });

        editCoachButton.setText("Редактировать");
        editCoachButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCoachButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout coachPanelLayout = new javax.swing.GroupLayout(coachPanel);
        coachPanel.setLayout(coachPanelLayout);
        coachPanelLayout.setHorizontalGroup(
            coachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coachPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(coachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(coachPanelLayout.createSequentialGroup()
                        .addComponent(delCoachButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editCoachButton))
                    .addGroup(coachPanelLayout.createSequentialGroup()
                        .addGroup(coachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(coachPanelLayout.createSequentialGroup()
                                .addComponent(numCoachEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(coachPanelLayout.createSequentialGroup()
                                .addComponent(edCoachEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addComponent(addCoachButton)
                            .addGroup(coachPanelLayout.createSequentialGroup()
                                .addGroup(coachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(nameCoachEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                                    .addComponent(surCoachEdit))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(coachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        coachPanelLayout.setVerticalGroup(
            coachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coachPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(coachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameCoachEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(coachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surCoachEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(coachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numCoachEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(coachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edCoachEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addCoachButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(coachPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delCoachButton)
                    .addComponent(editCoachButton))
                .addContainerGap())
        );

        nameRoomEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surAthEditKeyTyped(evt);
            }
        });

        jLabel13.setText("Номер комнаты");

        addRoomButton.setText("Добавить новую комнату");
        addRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomButtonActionPerformed(evt);
            }
        });

        delRoomButton.setText("Удалить комнату");
        delRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delRoomButtonActionPerformed(evt);
            }
        });

        editRoomButton.setText("Редактировать");
        editRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editRoomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roomPanelLayout = new javax.swing.GroupLayout(roomPanel);
        roomPanel.setLayout(roomPanelLayout);
        roomPanelLayout.setHorizontalGroup(
            roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roomPanelLayout.createSequentialGroup()
                        .addComponent(delRoomButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editRoomButton))
                    .addGroup(roomPanelLayout.createSequentialGroup()
                        .addGroup(roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roomPanelLayout.createSequentialGroup()
                                .addComponent(nameRoomEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addComponent(addRoomButton))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roomPanelLayout.setVerticalGroup(
            roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameRoomEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addRoomButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delRoomButton)
                    .addComponent(editRoomButton))
                .addContainerGap())
        );

        nameSecEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surAthEditKeyTyped(evt);
            }
        });

        dayTimeSecEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                surAthEditKeyTyped(evt);
            }
        });

        maxCountSecEdit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numParEditKeyTyped(evt);
            }
        });

        addSecButton.setText("Добавить секцию");
        addSecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSecButtonActionPerformed(evt);
            }
        });

        delSecButton.setText("Удалить секцию");
        delSecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delSecButtonActionPerformed(evt);
            }
        });

        editSecButton.setText("Редактировать");
        editSecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSecButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("Название");

        jLabel15.setText("Комната");

        jLabel16.setText("Тренер");

        jLabel17.setText("День и время");

        jLabel18.setText("Максимальное ко-во");

        javax.swing.GroupLayout sectionPanelLayout = new javax.swing.GroupLayout(sectionPanel);
        sectionPanel.setLayout(sectionPanelLayout);
        sectionPanelLayout.setHorizontalGroup(
            sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sectionPanelLayout.createSequentialGroup()
                        .addComponent(delSecButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editSecButton))
                    .addGroup(sectionPanelLayout.createSequentialGroup()
                        .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addSecButton)
                            .addComponent(nameSecEdit)
                            .addComponent(roomSecComboBox, 0, 440, Short.MAX_VALUE)
                            .addComponent(coachSecComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dayTimeSecEdit)
                            .addComponent(maxCountSecEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sectionPanelLayout.setVerticalGroup(
            sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameSecEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomSecComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coachSecComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayTimeSecEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxCountSecEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addSecButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(sectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delSecButton)
                    .addComponent(editSecButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coachButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(athleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(parentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(athletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coachPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                    .addComponent(athletePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coachPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roomPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(parentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(athleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coachButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addComponent(sectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void updateAthleteTable(java.awt.event.ActionEvent e){
        athleteButtonActionPerformed(e);
    }
    
    private void athleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_athleteButtonActionPerformed
        lastPanel.setVisible(false);
        lastPanel = athletePanel;
        athletePanel.setVisible(true);
        athletePanel.setSize(widthPanel, heightPanel);
        
        //работа с основной таблицей
        try {
            ResultSet rs = st.executeQuery("SELECT * FROM athlete");
            
            //очищащем таблицу
            mainTM.setColumnCount(0);
            mainTM.addColumn("Фамилия");
            mainTM.addColumn("Имя");
            mainTM.addColumn("День рождения");
            mainTM.addColumn("Секция");
            mainTM.addColumn("Родитель");
            mainTM.setRowCount(0);
            
            idOfAthlete = new ArrayList<Integer>();
            
            //заполняем таблицу
            while (rs.next()){
                String str = rs.getString("idsection");
                ResultSet sec = st.executeQuery("SELECT name FROM section WHERE id = '" + str + "'"); //sectionName
                sec.next();
                
                String idp = rs.getString("idparent");
                ResultSet parent = st.executeQuery("select name, sur from parent where id = '" + idp + "'");
                parent.next();
                
                mainTM.addRow(new Object[]{rs.getString("sur"),rs.getString("name"),rs.getString("birthday"), sec.getString("name"), parent.getString("sur") + " " + parent.getString("name")});
                idOfAthlete.add(Integer.valueOf(rs.getString("id")));
            }
        } catch (Exception ex) { //если ошибка
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        //работа с нижней панелькой
        try{
            //заполняем выбор родителей
            ResultSet parent = st.executeQuery("SELECT * FROM parent");
            parentComboBox.removeAllItems();
            parentComboBox.addItem("Выберите");
            while (parent.next()){
                parentComboBox.addItem(parent.getString("SUR") + " " + parent.getString("name"));
            }
            
            //заполняем выбор секции
            ResultSet section = st.executeQuery("SELECT * FROM section");
            sectionComboBox.removeAllItems();
            sectionComboBox.addItem("Выберите");
            while (section.next()){
                sectionComboBox.addItem(section.getString("name"));
            }
        } catch (Exception ex){
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_athleteButtonActionPerformed

    private void coachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coachButtonActionPerformed
        lastPanel.setVisible(false);
        lastPanel = coachPanel;
        coachPanel.setVisible(true);
        coachPanel.setSize(widthPanel, heightPanel);
        try {
            ResultSet rs = st.executeQuery("SELECT * FROM teacher");
            
            //очищащем таблицу
            mainTM.setColumnCount(0);
            mainTM.addColumn("Фамилия");
            mainTM.addColumn("Имя");
            mainTM.addColumn("Номер телефона");
            mainTM.addColumn("Образование");
            mainTM.setRowCount(0);
            
            idOfCoach = new ArrayList<Integer>();
            
            //заполняем таблицу
            while (rs.next()){
                mainTM.addRow(new Object[]{rs.getString("sur"),rs.getString("name"),rs.getString("phone"), rs.getString("education")});
                idOfCoach.add(Integer.valueOf(rs.getString("id")));
            }
        } catch (Exception ex) { //если ошибка
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_coachButtonActionPerformed

    private void sectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionButtonActionPerformed
        lastPanel.setVisible(false);
        lastPanel = sectionPanel;
        sectionPanel.setVisible(true);
        
        try {
            ResultSet rs = st.executeQuery("SELECT * FROM section");
            
            //очищащем таблицу
            mainTM.setColumnCount(0);
            mainTM.addColumn("название");
            mainTM.addColumn("комната");
            mainTM.addColumn("Тренер");
            mainTM.addColumn("День и время");
            mainTM.addColumn("Текущее количество");
            mainTM.addColumn("Максимальное количество");
            mainTM.setRowCount(0);
            
            idOfSection = new ArrayList<Integer>();
            
            //заполняем таблицу
            while (rs.next()){
                //название комнаты
                String str = rs.getString("idroom");
                ResultSet room = st.executeQuery("SELECT num FROM room WHERE id = '" + str + "'");
                room.next();
                
                //тренер
                String str1 = rs.getString("idteacher");
                ResultSet t = st.executeQuery("SELECT sur, name FROM teacher WHERE id = '" + str1 + "'");
                t.next();
                
                //текущее количество спортсменов на данной секции
                ResultSet count = st.executeQuery("SELECT COUNT(*) FROM athlete WHERE idsection = '" + rs.getString("id") +"'");
                count.next();
                
                //заполняем
                mainTM.addRow(new Object[]{
                    rs.getString("name"),
                    room.getString("num"),
                    t.getString("sur") + " " + t.getString("name"), 
                    rs.getString("dayTime"),
                    count.getString("C1"),
                    rs.getString("maxCount")});
                idOfSection.add(Integer.valueOf(rs.getString("id")));
                
                
            }
        } catch (Exception ex) { //если ошибка
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            //заполняем выбор комнат
            ResultSet room = st.executeQuery("SELECT * FROM room");
            roomSecComboBox.removeAllItems();
            roomSecComboBox.addItem("Выберите");
            while (room.next()){
                roomSecComboBox.addItem(room.getString("num"));
            }
            
            //заполняем выбор тренеров
            ResultSet teacher = st.executeQuery("SELECT * FROM teacher");
            coachSecComboBox.removeAllItems();
            coachSecComboBox.addItem("Выберите");
            while (teacher.next()){
                coachSecComboBox.addItem(teacher.getString("name") + " " + teacher.getString("sur"));
            }
        } catch (Exception ex){
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_sectionButtonActionPerformed

    private void parentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentButtonActionPerformed
        lastPanel.setVisible(false);
        lastPanel = parentPanel;
        parentPanel.setVisible(true);
        parentPanel.setSize(widthPanel, heightPanel);
        try {
            ResultSet rs = st.executeQuery("SELECT * FROM parent");
            
            //очищащем таблицу
            mainTM.setColumnCount(0);
            mainTM.addColumn("Фамилия");
            mainTM.addColumn("Имя");
            mainTM.addColumn("Номер телефона");
            mainTM.setRowCount(0);
            
            idOfParent = new ArrayList<Integer>();
            
            //заполняем таблицу
            while (rs.next()){
                mainTM.addRow(new Object[]{rs.getString("sur"),rs.getString("name"),rs.getString("phone")});
                idOfParent.add(Integer.valueOf(rs.getString("id")));
            }
        } catch (Exception ex) { //если ошибка
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_parentButtonActionPerformed

    private void roomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomButtonActionPerformed
        lastPanel.setVisible(false);
        lastPanel = roomPanel;
        roomPanel.setVisible(true);
        roomPanel.setSize(widthPanel, heightPanel);
        try {
            ResultSet rs = st.executeQuery("SELECT * FROM room");
            
            //очищащем таблицу
            mainTM.setColumnCount(0);
            mainTM.addColumn("Название комнаты");
            mainTM.setRowCount(0);
            
            idOfRoom = new ArrayList<Integer>();
            
            //заполняем таблицу
            while (rs.next()){
                mainTM.addRow(new Object[]{rs.getString("num")});
                idOfRoom.add(Integer.valueOf(rs.getString("id")));
            }
        } catch (Exception ex) { //если ошибка
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_roomButtonActionPerformed

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

    private void editAthleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAthleteButtonActionPerformed
        int a = mainTable.getSelectedRow();
        if (a > -1){
            try {
                ResultSet parents = st.executeQuery("select * from parent");
                ResultSet section = st.executeQuery("select * from section");
                String q = "SELECT id FROM athlete WHERE name='" + mainTM.getValueAt(a, 1).toString()+"' AND sur = '" + mainTM.getValueAt(a, 0) + "'";
                System.out.println(q);
                ResultSet childId = st.executeQuery(q);
                childId.next();

                editForm edit = new editForm();
                if (!edit.editAthPanel.isVisible())
                edit.editAthPanel.setVisible(true);

                edit.idAthleteLabel.setText("id = " + childId.getString("id"));
                edit.jTextField1.setText(mainTM.getValueAt(a, 1).toString());
                edit.jTextField2.setText(mainTM.getValueAt(a, 0).toString());

                /*
                String date = simpleDateFormat.format(mainTM.getValueAt(a, 2));
                edit.birthdaySpinner.setValue(date);
                */

                edit.parentComboBox.removeAllItems();
                edit.parentComboBox.addItem("Выберите");
                while (parents.next()){
                    edit.parentComboBox.addItem(parents.getString("sur") + " " + parents.getString("name"));
                }
                edit.parentComboBox.setSelectedItem(mainTM.getValueAt(a, 4));

                edit.sectionComboBox.removeAllItems();
                edit.sectionComboBox.addItem("Выберите");
                while (section.next()){
                    edit.sectionComboBox.addItem(section.getString("name"));
                }
                edit.sectionComboBox.setSelectedItem(mainTM.getValueAt(a, 3));

                edit.editAthPanel.setVisible(true);
                edit.setVisible(true);

            } catch (Exception ex){
                System.out.println(ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Выберите спортсмена");
        }
    }//GEN-LAST:event_editAthleteButtonActionPerformed

    private void deleteAthleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAthleteButtonActionPerformed
        int a = mainTable.getSelectedRow();
        if (a > -1){
            try {
                st.executeUpdate("delete from athlete where id = " + idOfAthlete.get(a));
                athleteButtonActionPerformed(evt);
            } catch (Exception ex){
                Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Выберите спорстмена");
        }
    }//GEN-LAST:event_deleteAthleteButtonActionPerformed

    private void addNewAthleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewAthleteButtonActionPerformed
        //если все поля заполнены
        if (!(surAthEdit.getText().equals("") || nameAthEdit.getText().equals("") || sectionComboBox.getSelectedIndex() == 0 || parentComboBox.getSelectedIndex() == 0)){
            String selectedSection = sectionComboBox.getSelectedItem().toString();

            try {
                ResultSet idSec = st.executeQuery("SELECT id FROM section where name = '" + selectedSection + "'");
                idSec.next();
                String idSection = idSec.getString("ID");

                ResultSet count = st.executeQuery("SELECT COUNT(*) FROM athlete WHERE idsection = '" + idSection +"'");
                count.next();
                ResultSet maxCount = st.executeQuery("SELECT * FROM section where id = '" + idSection + "'");
                maxCount.next();

                String selectedParent = parentComboBox.getSelectedItem().toString();
                int s = selectedParent.indexOf(" ");
                String parName = selectedParent.substring(s+1, selectedParent.length());
                String parSur = selectedParent.substring(0, s);
                
                String qq = "select id from parent where sur = '"+parSur+"' and name = '" + parName + "'";
                
                ResultSet idParent = st.executeQuery(qq);
                idParent.next();

                String s1 = count.getString("C1"), s2 = maxCount.getString("maxcount");

                String date = simpleDateFormat.format(birthdaySpinner.getValue());

                String values = "'"
                +surAthEdit.getText()+"','"
                +nameAthEdit.getText()+"','"
                +date+"','"
                +idSection+"','"
                +idParent.getString("id")+"'";

                System.out.println(values);

                if (!s1.equals(s2)){
                    st.executeUpdate("insert into athlete(sur,name,birthday,idsection,idparent) values ("+values+")");
                    athleteButtonActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(this, "В данной секции нет места");
                }
            }catch (Exception ex){
                Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Заполните все поля");
        }
    }//GEN-LAST:event_addNewAthleteButtonActionPerformed

    private void surAthEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_surAthEditKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || Character.isAlphabetic(c)
            || (c == KeyEvent.VK_DELETE)
            || (c == KeyEvent.VK_BACK_SPACE)
            || (c == KeyEvent.VK_PERIOD)
            || Character.isWhitespace(c))){
        evt.consume();
        JOptionPane.showMessageDialog(null, "Можно вводить только латинские буквы, кириллицу и цифры");
        }
    }//GEN-LAST:event_surAthEditKeyTyped

    private void nameAthEditKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameAthEditKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nameAthEditKeyTyped

    private void addParButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addParButtonActionPerformed
        if (!(nameParEdit.getText().equals("") || surParEdit.getText().equals("") || numParEdit.getText().equals(""))){
            try {
                String values = "'" + nameParEdit.getText() + "', '" + surParEdit.getText() + "', '" + numParEdit.getText()+"'";
                System.out.println(values);
                st.executeUpdate("insert into parent(name, sur, phone) values("+values+")");
                parentButtonActionPerformed(evt);
            } catch (Exception e){
                System.out.print(e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Заполните все поля");
        }
    }//GEN-LAST:event_addParButtonActionPerformed

    private void deletParButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletParButtonActionPerformed
        int a = mainTable.getSelectedRow();
        if (a > -1){
            try {
                st.executeUpdate("delete from parent where id = " + idOfParent.get(a));
                parentButtonActionPerformed(evt);
            } catch (Exception e){
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Выберите родителя");
        }
    }//GEN-LAST:event_deletParButtonActionPerformed

    private void editParButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editParButtonActionPerformed
        int a = mainTable.getSelectedRow();
        if (a > -1){
            try{
                
                editForm edit = new editForm();
                
                edit.idParLabel.setText(idOfParent.get(a).toString());
                edit.surParEdit.setText(mainTM.getValueAt(a, 0).toString());
                edit.nameParEdit.setText(mainTM.getValueAt(a, 1).toString());
                edit.numParEdit.setText(mainTM.getValueAt(a, 2).toString());
                
                edit.editParPanel.setVisible(true);
                edit.setVisible(true);
            } catch (Exception e){
                System.out.print(e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Выберите родителя");
        }
    }//GEN-LAST:event_editParButtonActionPerformed

    private void addCoachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCoachButtonActionPerformed
        if (!(nameCoachEdit.getText().equals("") || surCoachEdit.getText().equals("") || numCoachEdit.getText().equals(""))){
            try {
                String values = "'" + surCoachEdit.getText() + "', '" + nameCoachEdit.getText() + "', '" + numCoachEdit.getText()+"','"+edCoachEdit.getText()+"'";
                System.out.println(values);
                st.executeUpdate("insert into teacher(name, sur, phone, education) values("+values+")");
                coachButtonActionPerformed(evt);
            } catch (Exception e){
                System.out.print(e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Заполните все поля");
        }
    }//GEN-LAST:event_addCoachButtonActionPerformed

    private void delCoachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delCoachButtonActionPerformed
        int a = mainTable.getSelectedRow();
        if (a > -1){
            try {
                st.executeUpdate("delete from teacher where id = " + idOfCoach.get(a));
                coachButtonActionPerformed(evt);
            } catch (Exception e){
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Выберите тренера");
        }
    }//GEN-LAST:event_delCoachButtonActionPerformed

    private void editCoachButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCoachButtonActionPerformed
        int a = mainTable.getSelectedRow();
        if (a > -1){
            editForm edit = new editForm();
                
            edit.idCoachLabel1.setText(idOfCoach.get(a).toString());
            edit.surCoachEdit1.setText(mainTM.getValueAt(a, 0).toString());
            edit.nameCoachEdit1.setText(mainTM.getValueAt(a, 1).toString());
            edit.numCoachEdit1.setText(mainTM.getValueAt(a, 2).toString());
            edit.edCoachEdit1.setText(mainTM.getValueAt(a, 3).toString());
                
            edit.editCoachPanel.setVisible(true);
            edit.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Выберите трененера");
        }
    }//GEN-LAST:event_editCoachButtonActionPerformed

    private void addRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomButtonActionPerformed
        if (!(nameRoomEdit.getText().equals(""))){
            try {
                String values = "'" + nameRoomEdit.getText() +"'";
                System.out.println(values);
                st.executeUpdate("insert into room(num) values("+values+")");
                roomButtonActionPerformed(evt);
            } catch (Exception e){
                System.out.print(e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Заполните все поля");
        }
    }//GEN-LAST:event_addRoomButtonActionPerformed

    private void delRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delRoomButtonActionPerformed
        int a = mainTable.getSelectedRow();
        if (a > -1){
            try {
                st.executeUpdate("delete from room where id = " + idOfRoom.get(a));
                roomButtonActionPerformed(evt);
            } catch (Exception e){
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Выберите комнату");
        }
    }//GEN-LAST:event_delRoomButtonActionPerformed

    private void editRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editRoomButtonActionPerformed
        int a = mainTable.getSelectedRow();
        if (a > -1){
            editForm edit = new editForm();
            
            edit.idRoomLabel.setText(idOfRoom.get(a).toString());
            edit.nameRoomEdit.setText(mainTM.getValueAt(a, 0).toString());
            
            edit.editRoomPanel.setVisible(true);
            edit.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Выберите комнату");
        }
    }//GEN-LAST:event_editRoomButtonActionPerformed

    private void addSecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSecButtonActionPerformed
        if (!(nameSecEdit.getText().equals("") || dayTimeSecEdit.getText().equals("") || maxCountSecEdit.getText().equals("") || coachSecComboBox.getSelectedIndex() == 0 || roomSecComboBox.getSelectedIndex() == 0)){
            try {
                String selectedCoach = coachSecComboBox.getSelectedItem().toString();
                int s = selectedCoach.indexOf(" ");
                String coachSur = selectedCoach.substring(s+1, selectedCoach.length());
                String coachName = selectedCoach.substring(0, s);
                
                String selectedRoom = roomSecComboBox.getSelectedItem().toString();
                
                
                try {
                    ResultSet idCoach = st.executeQuery("select id from teacher where sur = '" + coachSur + "' and name = '" + coachName + "'");
                    idCoach.next();
                    
                    ResultSet idRoom = st.executeQuery("select id from room where num = '" + selectedRoom + "'");
                    idRoom.next();

                    String values = "'" + nameSecEdit.getText() +"', '" + dayTimeSecEdit.getText() + "', '" + maxCountSecEdit.getText() + "', '" + idCoach.getString("id") + "', '" + idRoom.getString("id") + "'";
                    System.out.println(values);
                    st.executeUpdate("insert into section(name, dayTime, maxCount, idteacher, idroom) values("+values+")");
                    sectionButtonActionPerformed(evt);
                } catch (Exception ex){
                    System.out.println(ex);
                }
            } catch (Exception e){
                System.out.print(e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Заполните все поля");
        }
    }//GEN-LAST:event_addSecButtonActionPerformed

    private void delSecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delSecButtonActionPerformed
        int a = mainTable.getSelectedRow();
        if (a > -1){
            try {
                st.executeUpdate("delete from section where id = " + idOfSection.get(a));
                sectionButtonActionPerformed(evt);
            } catch (Exception e){
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Выберите секцию");
        }
    }//GEN-LAST:event_delSecButtonActionPerformed

    private void editSecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSecButtonActionPerformed
        int a = mainTable.getSelectedRow();
        if (a > -1){
            try {
                editForm edit = new editForm();

                edit.idSecLabel.setText(idOfSection.get(a).toString());
                edit.nameSecEdit.setText(mainTM.getValueAt(a, 0).toString());
                edit.dayTimeSecEdit.setText(mainTM.getValueAt(a, 3).toString());
                edit.maxCountSecEdit.setText(mainTM.getValueAt(a, 5).toString());

                ResultSet room = st.executeQuery("select * from room");
                edit.roomComboBox.removeAllItems();
                edit.roomComboBox.addItem("Выберите");
                while(room.next()){
                    edit.roomComboBox.addItem(room.getString("num"));
                }
                edit.roomComboBox.setSelectedItem(mainTM.getValueAt(a, 1));
                
                ResultSet coach = st.executeQuery("select * from teacher");
                edit.coachComboBox.removeAllItems();
                edit.coachComboBox.addItem("Выберите");
                while(coach.next()){
                    edit.coachComboBox.addItem(coach.getString("sur") + " " + coach.getString("name"));
                }
                edit.coachComboBox.setSelectedItem(mainTM.getValueAt(a, 2));

                edit.editSectionPanel.setVisible(true);
                edit.setVisible(true);
            } catch (Exception e){
                System.out.println(e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Выберите секцию");
        }
        
    }//GEN-LAST:event_editSecButtonActionPerformed

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
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCoachButton;
    private javax.swing.JButton addNewAthleteButton;
    private javax.swing.JButton addParButton;
    private javax.swing.JButton addRoomButton;
    private javax.swing.JButton addSecButton;
    public java.awt.Button athleteButton;
    private javax.swing.JPanel athletePanel;
    private javax.swing.JSpinner birthdaySpinner;
    private java.awt.Button coachButton;
    private javax.swing.JPanel coachPanel;
    private javax.swing.JComboBox<String> coachSecComboBox;
    private javax.swing.JTextField dayTimeSecEdit;
    private javax.swing.JButton delCoachButton;
    private javax.swing.JButton delRoomButton;
    private javax.swing.JButton delSecButton;
    private javax.swing.JButton deletParButton;
    private javax.swing.JButton deleteAthleteButton;
    private javax.swing.JTextField edCoachEdit;
    private javax.swing.JButton editAthleteButton;
    private javax.swing.JButton editCoachButton;
    private javax.swing.JButton editParButton;
    private javax.swing.JButton editRoomButton;
    private javax.swing.JButton editSecButton;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable mainTable;
    private javax.swing.JTextField maxCountSecEdit;
    private javax.swing.JTextField nameAthEdit;
    private javax.swing.JTextField nameCoachEdit;
    private javax.swing.JTextField nameParEdit;
    private javax.swing.JTextField nameRoomEdit;
    private javax.swing.JTextField nameSecEdit;
    private javax.swing.JTextField numCoachEdit;
    private javax.swing.JTextField numParEdit;
    private java.awt.Button parentButton;
    private javax.swing.JComboBox<String> parentComboBox;
    private javax.swing.JPanel parentPanel;
    private java.awt.Button roomButton;
    private javax.swing.JPanel roomPanel;
    private javax.swing.JComboBox<String> roomSecComboBox;
    private java.awt.Button sectionButton;
    private javax.swing.JComboBox<String> sectionComboBox;
    private javax.swing.JPanel sectionPanel;
    private javax.swing.JTextField surAthEdit;
    private javax.swing.JTextField surCoachEdit;
    private javax.swing.JTextField surParEdit;
    // End of variables declaration//GEN-END:variables

}

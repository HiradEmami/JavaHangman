/*
 *(add-dm
   (wordHello isa words letter1 H  letter2 E letter3 L letter4 L letter5 O)
   (wordMeat isa words letter1 M  letter2 E letter3 A letter4 T)
...
   (letterA isa letters letterA a)
   (letterB isa letters letterB b)
   (letterC isa letters letterC c) open the template in the editor.
 */
package jie_chunk;

import java.awt.HeadlessException;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//for image
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class MainFrame extends javax.swing.JFrame {

    private String selected_word;
    private boolean [] guessed_positions;
    private ArrayList <String> guessed_letters;
    static ImageIcon GrayImage;
    static ImageIcon HeartImage;
    private int number_of_mistakes=0;
    private int number_of_letters=0;
    private int number_of_matches=0;
    private int number_of_loss=0;
    private int number_of_win=0;
    ob_letters g_letters;
    private ArrayList <ob_letters> missed_letters_list;
    private ArrayList <ob_letters> guessed_letters_list;
    private ArrayList <ob_letters> total_letters_list;
  private  String tableLetters []= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
       
    
 
 
    public MainFrame() {
        initComponents();
    }
  private void moreComponents() {
//    get images for initial screen prompts (Skd2_startPanel, loading label1).
// StartPanel is a panel on the Frame that has the loading label on it))
try {
  HeartImage= new ImageIcon(ImageIO.read(getClass().getResource("/heartpic2.png")));
  GrayImage= new ImageIcon(ImageIO.read(getClass().getResource("/heartpic.png")));
} catch (IOException ex) {
  Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
 }
}
  
private ArrayList<String> Letter_list = new ArrayList<String>();
private ArrayList<String> Word_list = new ArrayList<String>();
private ArrayList <String> converting_words = new ArrayList<String>();
    public void setup(){
        jtf_answer.setText("(add-dm\n");
      this.selected_word="";
     guessed_letters=new ArrayList<String>();
     total_letters_list =new ArrayList<>();
     guessed_letters_list =new ArrayList<>();
     missed_letters_list =new ArrayList<>();
     
     for (int i=0; i<=tableLetters.length-1;i++)
     {
         ob_letters temp =new ob_letters(tableLetters[i], 0);
         ob_letters temp1 =new ob_letters(tableLetters[i], 0);
         ob_letters temp2 =new ob_letters(tableLetters[i], 0);
         guessed_letters_list.add(temp);
         missed_letters_list.add(temp1);
         total_letters_list.add(temp2);
     }
     
     moreComponents();
     initilize_tables();
    
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        swift_code_panel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        records_panel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        avg_word = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        match_num = new javax.swing.JLabel();
        win_num = new javax.swing.JLabel();
        loss_num = new javax.swing.JLabel();
        Guessed_tabel = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        GUESSED_Tabel = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CURRECT_TABEL = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Missed_Table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        WORD_Tabel = new javax.swing.JTable();
        generate_panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtf_answer = new javax.swing.JTextArea();
        jtf_Letter = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        clear_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtf_word = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JTF_New_file = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        hangman_panel = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        TJF_Hangman_WORD = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        TJF_Letter = new javax.swing.JTextField();
        TJF_wrong_letter_used = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Heart1 = new javax.swing.JLabel();
        Heart2 = new javax.swing.JLabel();
        Heart3 = new javax.swing.JLabel();
        Heart4 = new javax.swing.JLabel();
        Heart5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(190, 184, 150));

        jPanel1.setLayout(new java.awt.CardLayout());

        swift_code_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Animation"));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 175, Short.MAX_VALUE)
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Write - Create File"));

        jLabel12.setText("File Name:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "to be continue"));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout swift_code_panelLayout = new javax.swing.GroupLayout(swift_code_panel);
        swift_code_panel.setLayout(swift_code_panelLayout);
        swift_code_panelLayout.setHorizontalGroup(
            swift_code_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(swift_code_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(swift_code_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(swift_code_panelLayout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        swift_code_panelLayout.setVerticalGroup(
            swift_code_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(swift_code_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(swift_code_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jPanel1.add(swift_code_panel, "card5");

        jLabel5.setText("Average Word Length:");

        jLabel6.setText("Total matches:");

        jLabel7.setText("Total wins:");

        jLabel8.setText("Total Loss:");

        GUESSED_Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Letter", "Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(GUESSED_Tabel);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );

        Guessed_tabel.addTab("Total Guessed Letters", jPanel6);

        CURRECT_TABEL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Letter", "Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(CURRECT_TABEL);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );

        Guessed_tabel.addTab("Currectly Guessed letters", jPanel3);

        Missed_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Letter", "Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Missed_Table);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );

        Guessed_tabel.addTab("Wrong letters", jPanel4);

        WORD_Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Words"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(WORD_Tabel);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );

        Guessed_tabel.addTab("failed words", jPanel5);

        javax.swing.GroupLayout records_panelLayout = new javax.swing.GroupLayout(records_panel);
        records_panel.setLayout(records_panelLayout);
        records_panelLayout.setHorizontalGroup(
            records_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(records_panelLayout.createSequentialGroup()
                .addGroup(records_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(records_panelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(records_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(records_panelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avg_word))
                            .addGroup(records_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(records_panelLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(loss_num))
                                .addGroup(records_panelLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(win_num))
                                .addGroup(records_panelLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(match_num)))))
                    .addGroup(records_panelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Guessed_tabel, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        records_panelLayout.setVerticalGroup(
            records_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(records_panelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(records_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(avg_word))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(records_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(match_num))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(records_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(win_num))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(records_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(loss_num))
                .addGap(115, 115, 115)
                .addComponent(Guessed_tabel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jPanel1.add(records_panel, "card4");

        generate_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray));

        jButton1.setText("Create Letter Chunk");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtf_answer.setColumns(20);
        jtf_answer.setRows(5);
        jScrollPane1.setViewportView(jtf_answer);

        jButton3.setText("Import letters and create letter chunks");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        clear_button.setText("Clear All");
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Created chunks:");

        jLabel2.setText("Write a letter:");

        jLabel3.setText("Write a Word:");

        jButton2.setText("Create Word Chunk");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Import Words and create Word chunks");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Select All");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Copy All");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Select your Word list file:");

        jButton15.setText("Select");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel10.setText("Select an Option:");

        jLabel11.setText("Enter new File name:");

        jButton16.setText("Save New File");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Only words with more than 2 letters", "Only words with more than 3 letters", "Only words with more than 4 letters", "Only words with more than 5 letters", "Only words with more than 6 letters", " " }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton15)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTF_New_file)
                            .addComponent(jComboBox1, 0, 240, Short.MAX_VALUE))
                        .addContainerGap(126, Short.MAX_VALUE))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jButton16)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(JTF_New_file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout generate_panelLayout = new javax.swing.GroupLayout(generate_panel);
        generate_panel.setLayout(generate_panelLayout);
        generate_panelLayout.setHorizontalGroup(
            generate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generate_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generate_panelLayout.createSequentialGroup()
                        .addGroup(generate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(generate_panelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtf_Letter, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(generate_panelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(generate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(generate_panelLayout.createSequentialGroup()
                                        .addComponent(jtf_word, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(generate_panelLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(generate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(generate_panelLayout.createSequentialGroup()
                                                .addComponent(jButton3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton5)))))))
                        .addGap(8, 8, 8))
                    .addGroup(generate_panelLayout.createSequentialGroup()
                        .addGroup(generate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(generate_panelLayout.createSequentialGroup()
                                .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 344, Short.MAX_VALUE)))
                .addContainerGap())
        );
        generate_panelLayout.setVerticalGroup(
            generate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generate_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(generate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_Letter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(generate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_word, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(generate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(generate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(generate_panel, "card2");

        hangman_panel.setBackground(new java.awt.Color(255, 255, 255));
        hangman_panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray));

        jButton8.setText("Start");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        TJF_Hangman_WORD.setEditable(false);
        TJF_Hangman_WORD.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TJF_Hangman_WORD.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton10.setText("Submit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        TJF_wrong_letter_used.setEditable(false);
        TJF_wrong_letter_used.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        TJF_wrong_letter_used.setText("MISSED LETTERS:");

        jButton11.setText("Show Answer");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Guess a Letter");

        javax.swing.GroupLayout hangman_panelLayout = new javax.swing.GroupLayout(hangman_panel);
        hangman_panel.setLayout(hangman_panelLayout);
        hangman_panelLayout.setHorizontalGroup(
            hangman_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hangman_panelLayout.createSequentialGroup()
                .addGroup(hangman_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hangman_panelLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addGroup(hangman_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(TJF_Letter)))
                    .addGroup(hangman_panelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(hangman_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hangman_panelLayout.createSequentialGroup()
                                .addComponent(Heart1)
                                .addGap(18, 18, 18)
                                .addComponent(Heart2)
                                .addGap(18, 18, 18)
                                .addComponent(Heart3)
                                .addGap(18, 18, 18)
                                .addComponent(Heart4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Heart5))
                            .addGroup(hangman_panelLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(jLabel4))))
                    .addGroup(hangman_panelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(hangman_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(hangman_panelLayout.createSequentialGroup()
                                .addComponent(TJF_Hangman_WORD)
                                .addGap(38, 38, 38))
                            .addGroup(hangman_panelLayout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TJF_wrong_letter_used, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hangman_panelLayout.setVerticalGroup(
            hangman_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hangman_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hangman_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TJF_Hangman_WORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TJF_wrong_letter_used, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addGroup(hangman_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Heart1)
                    .addComponent(Heart2)
                    .addComponent(Heart3)
                    .addComponent(Heart4)
                    .addComponent(Heart5))
                .addGap(60, 60, 60)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TJF_Letter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );

        jPanel1.add(hangman_panel, "card3");

        jPanel2.setBackground(new java.awt.Color(224, 214, 169));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.lightGray));

        jButton4.setText("Generate");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton9.setText("Hangman");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton12.setText("Records");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("SAVE");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("Swift");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        
        char [] test = jtf_Letter.getText().toCharArray();
        if(test.length>1)
        {
            jtf_Letter.setText("");
            JOptionPane.showMessageDialog(null, "You have not entered a letter!\nMake sure it is a single letter");
            
            
        }else{
            make_letterChunk();
            JOptionPane.showMessageDialog(null, "Chunk was created!");
            jtf_Letter.setText("");
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void readNote_Letter(){
          
        JFileChooser FileSelection = new JFileChooser();
        FileSelection.showOpenDialog(null);
        //getting the file and the path of it 
        File f= FileSelection.getSelectedFile();
        String path = f.getAbsolutePath(); 
        
        try {
            Scanner fileIn = new Scanner(f);
            while (fileIn.hasNext())
            { String next_letter = fileIn.nextLine();
                char [] testing_letter =next_letter.toCharArray();
                if(testing_letter.length>1)
                {
                 JOptionPane.showMessageDialog(null, "The file contains a word "+next_letter);
                 Letter_list =new ArrayList<String>();
                 break;
                }
                else{
                    Letter_list.add(next_letter.toUpperCase());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Reading the file was not successful due to:\n"+ e);
        }
    }
    
    private void readNote_Words(){
          
        JFileChooser FileSelection = new JFileChooser();
        FileSelection.showOpenDialog(null);
        //getting the file and the path of it 
        File f= FileSelection.getSelectedFile();
        String path = f.getAbsolutePath(); 
        
        try {
            Scanner fileIn = new Scanner(f);
            while (fileIn.hasNext())
            { String next_word = fileIn.nextLine();
                String [] testing_word = next_word.split("");
                if(testing_word.length<1)
                {
                 JOptionPane.showMessageDialog(null, "The file contains a letter "+next_word);
                 Word_list =new ArrayList<String>();
                 break;
                }
                else{
                    Word_list.add(next_word);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Reading the file was not successful due to:\n"+ e);
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    readNote_Letter();
    jtf_answer.setText("");
    for (int x=0; x<=Letter_list.size()-1;x++)
        {
                   jtf_answer.setText(jtf_answer.getText()+"\n" +
"   (LETTER"+Letter_list.get(x)+" ISA letter "+Letter_list.get(x)+ ")"); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
  
    int dialogButton = JOptionPane.YES_NO_OPTION;
     JOptionPane.showConfirmDialog (null, "Everything would be reset back to beginning! \n are you sure you want to clear everything?","Warning",dialogButton);

                if(dialogButton == JOptionPane.YES_OPTION){  Letter_list =new ArrayList<String>();
    Word_list =new ArrayList<String>();
    jtf_answer.setText("");
    jtf_Letter.setText("");
                    System.out.println("Number of words in the list: "+Word_list.size());
                System.out.println("Number of letters in the list: "+Letter_list.size());
                }
                
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        set_panel("generate");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     String input = jtf_word.getText();
     String []convert= input.split("");
  if(convert.length<=1){
      jtf_word.setText("");
      if(convert.length ==1)
      {JOptionPane.showMessageDialog(null, "Process failed!\nYou have entered a letter");
          
      }else{
          JOptionPane.showMessageDialog(null, "Process failed!\nYou have entered nothing");
      }
      
  }else{
         String word = convert[0].toUpperCase();
     for(int i=1; i<=convert.length-1;i++)
     {
         word=word+convert[i];
     }
        make_wordChunk(word);
        Word_list.add(word);
  }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       readNote_Words();
       jtf_answer.setText("");
      
       for(int i=0;i<=Word_list.size()-1;i++)
       {/*
           String test = Word_list.get(i);
           String [] convert=test.split("");
     String word = convert[0].toUpperCase();
     for(int w=1; w<=convert.length-1;w++)
     {
         word=word+convert[w];
     }*/
        make_wordChunk(Word_list.get(i));
           
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     //select all function
      jtf_answer.requestFocusInWindow();
      jtf_answer.selectAll();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         //select all function
      jtf_answer.requestFocusInWindow();
      jtf_answer.selectAll();
    //copy function    
StringSelection stringSelection = new StringSelection(jtf_answer.getText());
Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
clpbrd.setContents(stringSelection, null);
JOptionPane.showMessageDialog(null, "everything has been selected and copied in clipboard");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       hangman_Reset();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void hangman_Reset()
    {
        
        String word = "";
      
       int random = randInt(0, Word_list.size()-1);
           word=Word_list.get(random);
        
        int numberOfSpace= word.toCharArray().length;
      guessed_positions =new boolean[numberOfSpace];
      guessed_letters=new ArrayList<String>();
      TJF_wrong_letter_used.setText("MISSED LETTERS: ");
        System.out.println(numberOfSpace +" "+ word +" "+Word_list.size());
         
         TJF_Hangman_WORD.setText("");
         
         for(int i=0; i<=word.toCharArray().length-1; i++)
         {
             TJF_Hangman_WORD.setText(TJF_Hangman_WORD.getText()+" -");
             
         }
       selected_word=word;
       number_of_mistakes=0;
       Heart1.setIcon(HeartImage);
       Heart2.setIcon(HeartImage);
       Heart3.setIcon(HeartImage);
       Heart4.setIcon(HeartImage);
       Heart5.setIcon(HeartImage);
       
       number_of_letters=selected_word.toCharArray().length;
       number_of_matches++;
       
       System.out.println(selected_word);
        
    }
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        set_panel("hangman");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        
        String input =TJF_Letter.getText().toUpperCase();
        
            int ki =search_list(input);
           total_letters_list.get(ki).setNumber(total_letters_list.get(ki).getNumber()+1);
            refresh_table(0);
            
  System.out.println(input+"Z");
        for(int y=0;y<=guessed_letters.size()-1;y++)
   {
       if(TJF_Letter.getText().equalsIgnoreCase(guessed_letters.get(y)))
       {
           JOptionPane.showMessageDialog(null, "you already guessed this letter");
       break;
       }
   }
        System.out.println("accepted letter");
        
        
     boolean righ_letter=false;
     TJF_Hangman_WORD.setText("");
     String []characters=selected_word.split("");
     
        for (int i=0;i<=characters.length-1;i++)
      {  if(guessed_positions[i]){
          TJF_Hangman_WORD.setText(TJF_Hangman_WORD.getText()+" "+characters[i]);
      }  
      else{
            if(TJF_Letter.getText().equalsIgnoreCase(characters[i]))
          {
              TJF_Hangman_WORD.setText(TJF_Hangman_WORD.getText()+" "+characters[i]);
              guessed_positions[i]=true;
              righ_letter=true;
              number_of_letters--;
             guessed_letters_list.get(ki).setNumber(guessed_letters_list.get(ki).getNumber()+1);
            refresh_table(2);
              
              if(number_of_letters<=0)
              {
                  JOptionPane.showMessageDialog(null, "congratulations! \n you successfully guessed the word: "+selected_word
                          +"The game will reset now");
                  hangman_Reset();
                  number_of_win++;
                  break;
              }
          }
          else{
             TJF_Hangman_WORD.setText(TJF_Hangman_WORD.getText()+" -");
             
              } 

      }
      }
        
        
        try {
            
        } catch (Exception e) {
        }
        
        if(righ_letter==false)
          {
              TJF_wrong_letter_used.setText(TJF_wrong_letter_used.getText()+" "+TJF_Letter.getText().toUpperCase());
              guessed_letters.add(TJF_Letter.getText());
              number_of_mistakes++;
              updateheart();
              
            //  missed_letters_list.get(search_list(input.toUpperCase())).addNumber();
           
           missed_letters_list.get(ki).setNumber(missed_letters_list.get(ki).getNumber()+1);
            refresh_table(1);
           System.out.println(missed_letters_list.get(ki).getLetter()+" ss "+missed_letters_list.get(ki).getNumber()+" ss "+search_list(input.toUpperCase()));
             
              
          }else{
            guessed_letters.add(TJF_Letter.getText());
        }
          TJF_Letter.setText("");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            TJF_Hangman_WORD.setText(selected_word);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        set_panel("records");
        update_records();
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
     write_file();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        set_panel("swift");
    }//GEN-LAST:event_jButton14ActionPerformed

    
    
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        converting_words = new ArrayList<>();
        JFileChooser FileSelection = new JFileChooser();
        FileSelection.showOpenDialog(null);
        //getting the file and the path of it 
        File f= FileSelection.getSelectedFile();
        String path = f.getAbsolutePath(); 
        
        try {
            Scanner fileIn = new Scanner(f);
            while (fileIn.hasNext())
            { String next_word = fileIn.nextLine();
                String [] testing_word = next_word.split("");
                if(testing_word.length<1)
                {
                 JOptionPane.showMessageDialog(null, "The file contains a letter "+next_word);
                 converting_words =new ArrayList<String>();
                 break;
                }
                else{
                    converting_words.add(next_word);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Reading the file was not successful due to:\n"+ e);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
       if(JTF_New_file.getText().isEmpty())
       {
         JOptionPane.showMessageDialog(null, "Please enter desired file name!");
       }else{
           String selected= String.valueOf(jComboBox1.getSelectedItem());
           int dialogButton = JOptionPane.YES_NO_OPTION;
     JOptionPane.showConfirmDialog (null, "Are you sure you want to select "+selected+"?","Warning",dialogButton);

                if(dialogButton == JOptionPane.YES_OPTION){
                    
                    try {
                          JFileChooser FileSelection = new JFileChooser();
                          FileSelection.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                          FileSelection.showOpenDialog(null);
        //getting the file and the path of it 
                          File f= new File(FileSelection.getCurrentDirectory()+"\\"+JTF_New_file.getText()+".txt");
                        BufferedWriter out = new BufferedWriter(new FileWriter(f));
                        
                       int selected_length = jComboBox1.getSelectedIndex()+2;
                       for(int i=0;i<=converting_words.size()-1;i++)
                       {
                           char [] temp= converting_words.get(i).toCharArray();
                           int tempsize =temp.length;
                           if(tempsize>selected_length)
                           {
                               out.write(converting_words.get(i));
                               if(i != converting_words.size()-1)
                           {
                                out.newLine();
                           }
                           }else{}
                          
                       }
                       out.close();
                       JOptionPane.showMessageDialog(null,"Your file was created: \n"+f.getAbsolutePath()+" "+f.getName());
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                    
                }else{
                   //user selected no so dont do anything 
                }
       }
    }//GEN-LAST:event_jButton16ActionPerformed


  private int average_word_length()
  {
     int sum =0;
     for(int i=0;i<=Word_list.size()-1;i++)
     {
         sum=sum+Word_list.get(i).toCharArray().length;
     }
     
     return sum/Word_list.size();
  }
  
  private void update_records()
  {
      avg_word.setText(""+average_word_length());
      match_num.setText(""+(number_of_matches-1));
      win_num.setText(""+number_of_win);
      loss_num.setText(""+number_of_loss);
  }
  
  
  public void searchTableContents(String searchString) {  
  DefaultTableModel currtableModel = (DefaultTableModel) GUESSED_Tabel.getModel();    
 
  for(int i=0;i<=currtableModel.getRowCount()-1;i++)
  {
       for(int z=0;z<=currtableModel.getColumnCount()-1;z++)
  {
      if(currtableModel.getValueAt(i, z).equals("R"))
      {
          int current_number= Integer.parseInt((String) currtableModel.getValueAt(i, z));
          currtableModel.setValueAt(i, z, current_number++);
      }
  }
  }
}
  
  private void initilize_tables(){
      String numbers []= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
       
     DefaultTableModel table1 = (DefaultTableModel) GUESSED_Tabel.getModel(); 
     DefaultTableModel table2 = (DefaultTableModel) CURRECT_TABEL.getModel(); 
     DefaultTableModel table3 = (DefaultTableModel) Missed_Table.getModel(); 
     
      for(int i=0;i<=guessed_letters_list.size()-1;i++)
           {
                table1.addRow(new Object[]{guessed_letters_list.get(i).getLetter(),0});
                table2.addRow(new Object[]{guessed_letters_list.get(i).getLetter(),0});
                table3.addRow(new Object[]{guessed_letters_list.get(i).getLetter(),0});
           }
      
      
}
  
  private void refresh_table(int z)
  {
      switch (z)
      {
          case 0:
          { DefaultTableModel table1 = (DefaultTableModel) GUESSED_Tabel.getModel(); 
          int x= table1.getRowCount()-1;
           while(x>=0)
        {
            table1.removeRow(x);
            x--;
        }
                    for(int i=0;i<=total_letters_list.size()-1;i++)
           {
           
                table1.addRow(new Object[]{total_letters_list.get(i).getLetter(),total_letters_list.get(i).getNumber()});
                
           }
              break;
          }
          case 1:
          {DefaultTableModel table1 = (DefaultTableModel) Missed_Table.getModel();
         int x= table1.getRowCount()-1;
           while(x>=0)
        {
            table1.removeRow(x);
            x--;
        }
                    for(int i=0;i<=missed_letters_list.size()-1;i++)
           {  
           
                table1.addRow(new Object[]{missed_letters_list.get(i).getLetter(),missed_letters_list.get(i).getNumber()});
                
           }
              break;
          }
          case 2:
          {DefaultTableModel table1 = (DefaultTableModel) CURRECT_TABEL.getModel();
          
            int x= table1.getRowCount()-1;
           while(x>=0)
        {
            table1.removeRow(x);
            x--;
        }
                    for(int i=0;i<=guessed_letters_list.size()-1;i++)
           {  
           
                table1.addRow(new Object[]{guessed_letters_list.get(i).getLetter(),guessed_letters_list.get(i).getNumber()});
                
           }
              break;
          }
      }
  }
  
  private int search_list(String input)
  { int temp=0;
      for (int i=0;i<=guessed_letters_list.size()-1;i++)
      {  
          if(guessed_letters_list.get(i).getLetter().equals(input))
          {
              temp=i;
              System.out.println(""+temp);
              return temp;
              
          }
      }
    return temp;
  }
  
    private void updateheart()
    {
        switch (number_of_mistakes)
        {
            case 1:
            {
              Heart1.setIcon(GrayImage);
              break;
            }
            case 2:
            {
               Heart2.setIcon(GrayImage); 
               break;
            }
            case 3:
            {
                Heart3.setIcon(GrayImage);
                break;
            }
            case 4:
            {
                Heart4.setIcon(GrayImage);
                break;
            }
            case 5:
            {
                Heart5.setIcon(GrayImage);
                 JOptionPane.showMessageDialog(null, "YOU LOST!"+"\n the answer was: "+selected_word+
                         "\nThe game will restart now! Good luck");
                 DefaultTableModel table = (DefaultTableModel) WORD_Tabel.getModel();
                table.addRow(new Object[]{selected_word});
                 hangman_Reset();
                 number_of_loss++;
                 
                 
                break;
            }
            default:
            {
                
            }
        }
    }   public static int randInt(int min, int max) {

    Random rand = new Random();


    int randomNum = rand.nextInt((max - min) + 1) + min;

    return randomNum;
}
    public void set_panel(String panel_name)
    {
        switch (panel_name)
        {
            case "generate":
            {   hangman_panel.setVisible(false);
                swift_code_panel.setVisible(false); 
                records_panel.setVisible(false);
                generate_panel.setVisible(true);
                break;
            }
            case "hangman":
            {   generate_panel.setVisible(false);
                swift_code_panel.setVisible(false);
                records_panel.setVisible(false);
                hangman_panel.setVisible(true);
                break;
            }
            case "records":
            {   generate_panel.setVisible(false);
                swift_code_panel.setVisible(false);
                hangman_panel.setVisible(false);
                records_panel.setVisible(true);
                break;
            }
            case "swift":
            {   generate_panel.setVisible(false);
                hangman_panel.setVisible(false);
                records_panel.setVisible(false);
                swift_code_panel.setVisible(true);
                break;
            }
            default:{
                hangman_panel.setVisible(false);
                generate_panel.setVisible(true);
                break;
            }
        }
    }
    
    private void sort(){
DefaultTableModel table1 = (DefaultTableModel) GUESSED_Tabel.getModel();
JTable table = new JTable(table1);
TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
table.setRowSorter(sorter);

ArrayList<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
sortKeys.add(new RowSorter.SortKey(4, SortOrder.ASCENDING));
sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
sorter.setSortKeys(sortKeys);
    }
    
    private void  make_letterChunk(){
           try {
         
        jtf_answer.setText(jtf_answer.getText()+"\n" +
"   (letter"+jtf_Letter.getText().toUpperCase()+" ISA letter "+jtf_Letter.getText().toUpperCase()+ ")");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Couldn't make it");
        }
}
    
    
    private void  make_wordChunk(String input){
         //Word_list.add(input);
        try {
         String word = input;
         String Wlength="";
         String [] all_letters = word.split("");
         if(all_letters.length <=6){Wlength="short";}else{if(all_letters.length>=10){Wlength="extraLong";}else{Wlength="long";}}
         String swift_code ="\n (w"+word+" isa word value "+input;
         
         for(int i=0; i<=all_letters.length-1;i++)
         {
             swift_code=swift_code+" letter"+(i+1)+" L"+all_letters[i].toUpperCase() ;
         }
         swift_code=swift_code+" length "+ Wlength+")";
         
        jtf_answer.setText(jtf_answer.getText()+swift_code);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Couldn't make it");
        }
}
    
    public MainFrame(String[] letters, JButton jButton1, JScrollPane jScrollPane1, JTextArea jtf_answer, JTextField jtf_word) throws HeadlessException {
        
        this.jButton1 = jButton1;
        this.jScrollPane1 = jScrollPane1;
        this.jtf_answer = jtf_answer;
        this.jtf_Letter = jtf_word;
    }

    private void write_file()
    {
         try {
DefaultTableModel table1 = (DefaultTableModel) GUESSED_Tabel.getModel();
DefaultTableModel table2 = (DefaultTableModel) CURRECT_TABEL.getModel();
DefaultTableModel table3 = (DefaultTableModel) Missed_Table.getModel();
             
             JFileChooser FileSelection = new JFileChooser();
        FileSelection.showOpenDialog(null);
        //getting the file and the path of it 
        File f= FileSelection.getSelectedFile();
        String path = f.getAbsolutePath(); 
        BufferedWriter out = new BufferedWriter(new FileWriter(f));
          out.write("All guessed letters");
            out.newLine();    
        for (int i = 0; i <guessed_letters_list.size()-1; i++) {
                out.write(""+table1.getValueAt(i, 0)+" "+table1.getValueAt(i, 1));
                out.newLine();
            }
            out.newLine();
              out.write("currect Letters");
            out.newLine();
            for (int i = 0; i <guessed_letters_list.size()-1; i++) {
                out.write(" "+table2.getValueAt(i, 0)+" "+table2.getValueAt(i, 1));
                out.newLine();
            }
            out.newLine();
            out.write("Missed Letters");
            out.newLine();
              for (int i = 0; i <guessed_letters_list.size()-1; i++) {
                out.write(" "+table3.getValueAt(i, 0)+" "+table3.getValueAt(i, 1));
                out.newLine();
            }
            out.newLine();
            out.close();
        } catch (IOException e) {}
    }
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CURRECT_TABEL;
    private javax.swing.JTable GUESSED_Tabel;
    private javax.swing.JTabbedPane Guessed_tabel;
    private javax.swing.JLabel Heart1;
    private javax.swing.JLabel Heart2;
    private javax.swing.JLabel Heart3;
    private javax.swing.JLabel Heart4;
    private javax.swing.JLabel Heart5;
    private javax.swing.JTextField JTF_New_file;
    private javax.swing.JTable Missed_Table;
    private javax.swing.JTextField TJF_Hangman_WORD;
    private javax.swing.JTextField TJF_Letter;
    private javax.swing.JTextField TJF_wrong_letter_used;
    private javax.swing.JTable WORD_Tabel;
    private javax.swing.JLabel avg_word;
    private javax.swing.JButton clear_button;
    private javax.swing.JPanel generate_panel;
    private javax.swing.JPanel hangman_panel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jtf_Letter;
    private javax.swing.JTextArea jtf_answer;
    private javax.swing.JTextField jtf_word;
    private javax.swing.JLabel loss_num;
    private javax.swing.JLabel match_num;
    private javax.swing.JPanel records_panel;
    private javax.swing.JPanel swift_code_panel;
    private javax.swing.JLabel win_num;
    // End of variables declaration//GEN-END:variables
}

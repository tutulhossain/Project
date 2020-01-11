
package project.on.cv.generator;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import static com.sun.xml.internal.messaging.saaj.packaging.mime.util.ASCIIUtility.getBytes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.UUID;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.ws.BindingProvider;
import sun.security.action.OpenFileInputStreamAction;

public class Format2 extends javax.swing.JFrame {
String imagepath=null;
Connection connection=null;
ResultSet rs=null;
PreparedStatement pst=null;
 
    public Format2() {
        initComponents();
    }
public ImageIcon ResizeImage(String imagepath,byte []pic)
    {
        ImageIcon myimage=null;
        if(imagepath!=null)
        {
            myimage=new ImageIcon(imagepath);
        }
        else
        {
            myimage=new ImageIcon(pic);
        }
        java.awt.Image img=myimage.getImage();
        java.awt.Image img2=img.getScaledInstance(lbl_img.getWidth(),lbl_img.getHeight(),java.awt.Image.SCALE_SMOOTH);
        ImageIcon Image=new ImageIcon(img2);
        return Image;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jTextField40 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        lbl_img = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField30 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Format 2");
        setPreferredSize(new java.awt.Dimension(580, 1080));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(565, 1180));

        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 1200));
        jPanel2.setPreferredSize(new java.awt.Dimension(580, 1080));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 5, 477, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Personal Information");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 69, -1, -1));

        jLabel3.setText("First Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 93, -1, -1));

        jLabel4.setText("Surname");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 119, -1, -1));

        jLabel5.setText("Present Address");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 171, -1, -1));

        jLabel6.setText("Permanant Address");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 145, -1, -1));

        jLabel7.setText("Post Code");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 197, -1, -1));

        jLabel8.setText("Nationality");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 223, -1, -1));

        jLabel9.setText("Date of birth");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 249, -1, -1));

        jLabel10.setText("Contact");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 275, -1, -1));

        jLabel11.setText("Email");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 301, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Qualifications");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 378, -1, -1));

        jLabel13.setText("University");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 402, -1, -1));

        jLabel14.setText("College");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 428, -1, -1));

        jLabel15.setText("School");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 451, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Skills");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 487, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Employment History");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 378, -1, -1));

        jLabel18.setText("Company Name");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 399, -1, -1));

        jLabel20.setText("Address");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 428, -1, -1));

        jLabel21.setText("Role");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 509, -1, -1));

        jLabel22.setText("Title");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 484, -1, -1));

        jLabel23.setText("Country");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 453, -1, -1));

        jButton2.setText("Choose Image");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 205, -1, -1));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 90, 160, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 116, 160, -1));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 142, 159, -1));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 168, 158, -1));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 194, 158, -1));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 158, -1));
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 246, 158, -1));
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 272, 158, -1));
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 298, 158, -1));
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 508, 80, -1));
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 508, 88, -1));
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 534, 80, -1));
        jPanel2.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 534, 88, -1));
        jPanel2.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 508, 87, -1));
        jPanel2.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 534, 87, -1));
        jPanel2.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 399, 201, -1));
        jPanel2.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 425, 201, -1));
        jPanel2.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 451, 201, -1));
        jPanel2.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 399, 144, -1));
        jPanel2.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 425, 144, -1));
        jPanel2.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 477, 144, -1));
        jPanel2.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 503, 144, -1));
        jPanel2.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 451, 144, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Language");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 608, -1, -1));
        jPanel2.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 634, 104, -1));
        jPanel2.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 634, 104, -1));
        jPanel2.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 634, 104, -1));
        jPanel2.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 634, 104, -1));

        jLabel25.setText("User Name");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 34, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Objective");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 672, -1, -1));

        jTextField31.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 693, 510, 79));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("Reference");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 790, -1, -1));

        jLabel28.setText("Name");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 814, -1, -1));

        jLabel29.setText("Title");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 840, -1, -1));

        jLabel30.setText("Company");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 866, -1, -1));

        jLabel31.setText("Cell no");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 892, -1, -1));
        jPanel2.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 811, 129, -1));
        jPanel2.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 837, 129, -1));
        jPanel2.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 863, 130, -1));
        jPanel2.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 889, 131, -1));

        jLabel32.setText("Name");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 814, -1, -1));

        jLabel33.setText("Title");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 840, -1, -1));

        jLabel34.setText("Comapny");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 866, -1, -1));

        jLabel35.setText("Cell no");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 892, -1, -1));
        jPanel2.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 811, 122, -1));
        jPanel2.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 837, 122, -1));
        jPanel2.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 863, 121, -1));
        jPanel2.add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 889, 121, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Signature");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 927, -1, -1));
        jPanel2.add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 948, 128, -1));

        jLabel37.setText("Name");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 951, -1, -1));

        jLabel38.setText("Date");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 977, -1, -1));
        jPanel2.add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 974, 128, -1));

        lbl_img.setBackground(new java.awt.Color(0, 0, 0));
        lbl_img.setMaximumSize(new java.awt.Dimension(208, 212));
        lbl_img.setMinimumSize(new java.awt.Dimension(208, 212));
        lbl_img.setOpaque(true);
        lbl_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_imgMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 31, 164, 168));

        jLabel24.setText("Search");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 8, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 200, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 580, 1110));

        jScrollPane1.setViewportView(jPanel2);

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setName("Frame 1"); // NOI18N

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Save-icon.png"))); // NOI18N
        jMenuItem2.setText("Save");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-pdf-24.png"))); // NOI18N
        jMenuItem5.setText("PDF");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-print-26.png"))); // NOI18N
        jMenuItem4.setText("Print");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-secured-letter-26.png"))); // NOI18N
        jMenuItem11.setText("Send");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/delete_16x16.gif"))); // NOI18N
        jMenuItem10.setText("Exit");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-trash-16.png"))); // NOI18N
        jMenuItem7.setText("Delete");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/erase-128.png"))); // NOI18N
        jMenuItem8.setText("Clear");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update icon.png"))); // NOI18N
        jMenuItem9.setText("Update");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("View");

        jMenuItem1.setText("Preview");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenu4.setText("Formats");

        jMenuItem3.setText("Format 1");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem12.setText("Format 2");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem17.setText("Format 3");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuItem18.setText("Fprmat 4");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem18);

        jMenuItem19.setText("Format 5");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem19);

        jMenu5.add(jMenu4);

        jMenuBar1.add(jMenu5);

        jMenu9.setText("Profile");

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-chain-end-30 (1).png"))); // NOI18N
        jMenuItem13.setText("Logout");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem13);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Add Record",JOptionPane.YES_NO_OPTION);
        if(p==0){

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CV;integratedSecurity=true");

                String sql ="insert into frame1 (username,firstname,surname,permanantaddress,presentaddress,postcode,nationality,dateofbirth,contact,email,university,college,school,skills,skills1,skills2,skills3,skills4,skills5,language,language1,language2,language3,companyname,address,country,title,role,objective,name1,title1,company1,cellno1,name2,title2,company2,cellno2,sname,sdate,image)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                pst = connection.prepareStatement(sql);
                pst.setString(1,jTextField30.getText());
                pst.setString(2,jTextField3.getText());
                pst.setString(3,jTextField4.getText());
                pst.setString(4,jTextField5.getText());
                pst.setString(5,jTextField6.getText());
                pst.setString(6,jTextField7.getText());
                pst.setString(7,jTextField8.getText());
                pst.setString(8,jTextField9.getText());
                pst.setString(9,jTextField10.getText());
                pst.setString(10,jTextField11.getText());
                pst.setString(11,jTextField18.getText());
                pst.setString(12,jTextField19.getText());
                pst.setString(13,jTextField20.getText());
                pst.setString(14,jTextField12.getText());
                pst.setString(15,jTextField13.getText());
                pst.setString(16, jTextField14.getText());
                pst.setString(17,jTextField15.getText());
                pst.setString(18,jTextField16.getText());
                pst.setString(19,jTextField17.getText());
                pst.setString(20,jTextField22.getText());
                pst.setString(21,jTextField27.getText());
                pst.setString(22,jTextField28.getText());
                pst.setString(23,jTextField29.getText());
                pst.setString(24,jTextField21.getText());
                pst.setString(25,jTextField23.getText());
                pst.setString(26,jTextField26.getText());
                pst.setString(27,jTextField24.getText());
                pst.setString(28,jTextField25.getText());
                pst.setString(29,jTextField31.getText());
                pst.setString(30,jTextField32.getText());
                pst.setString(31,jTextField33.getText());
                pst.setString(32,jTextField34.getText());
                pst.setString(33,jTextField35.getText());
                pst.setString(34,jTextField36.getText());
                pst.setString(35,jTextField37.getText());
                pst.setString(36,jTextField38.getText());
                pst.setString(37,jTextField39.getText());
                pst.setString(38,jTextField40.getText());
                pst.setString(39,jTextField41.getText());
                pst.setBytes(40,person_image);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data is saved successfully");

            }
            catch (Exception e)

            {
                JOptionPane.showMessageDialog(null,e);
            }
            finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){

                }
            }
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JFileChooser dialog = new JFileChooser();
        dialog.setSelectedFile(new File(jTextField3.getText()+" "+jTextField4.getText()+"-CV"+".pdf"));
        int dialogResult = dialog.showSaveDialog(null);
        if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();

            try {
                Document myDocument = new Document();
                PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));

                myDocument.open();

                com.itextpdf.text.Image image;
                image = com.itextpdf.text.Image.getInstance(person_image);
                image.setAbsolutePosition(435f,668f);
                image.scaleAbsolute(120f,120f);

                PdfPTable table = new PdfPTable(2);
                PdfPTable table1 = new PdfPTable(2);
                PdfPTable table2 = new PdfPTable(2);
                myDocument.add(image);
                myDocument.add(new Paragraph(jTextField3.getText()+" "+jTextField4.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,32,Font.BOLD,BaseColor.DARK_GRAY )));
                myDocument.add(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.PLAIN,BaseColor.DARK_GRAY)));
                myDocument.add(new Paragraph("",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.PLAIN,BaseColor.DARK_GRAY)));               
                myDocument.add(new Paragraph("CONTACT & ADDRESS",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.DARK_GRAY )));
                myDocument.add(new Paragraph(jTextField11.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY  )));
                myDocument.add(new Paragraph(jTextField10.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN ,BaseColor.DARK_GRAY )));
                myDocument.add(new Paragraph(jTextField6.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY  )));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("OBJECTIVE",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.DARK_GRAY  )));
                myDocument.add(new Paragraph(jTextField31.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN ,BaseColor.DARK_GRAY )));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("SKILLS",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.DARK_GRAY  )));
                myDocument.add(new Paragraph("\n"));
                table.setHeaderRows(1);
                table.addCell(jTextField12.getText());
                table.addCell(jTextField13.getText());
                table.addCell(jTextField16.getText());
                table.addCell(jTextField14.getText());
                table.addCell(jTextField15.getText());
                table.addCell(jTextField17.getText());
                myDocument.add(table);
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("LANGUAGE",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.DARK_GRAY  )));
                myDocument.add(new Paragraph("\n"));
                table1.setHeaderRows(1);
                table1.addCell(jTextField22.getText());
                table1.addCell(jTextField27.getText());
                table1.addCell(jTextField28.getText());
                table1.addCell(jTextField29.getText());
                myDocument.add(table1);
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("QUALIFICATIONS",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.DARK_GRAY  )));
                myDocument.add(new Paragraph(jTextField18.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY  )));
                myDocument.add(new Paragraph(jTextField19.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY  )));
                myDocument.add(new Paragraph(jTextField20.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY  )));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("WORK EXPERIENCE",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.DARK_GRAY  )));
                myDocument.add(new Paragraph(jTextField21.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY)));
                myDocument.add(new Paragraph(jTextField23.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY)));
                myDocument.add(new Paragraph(jTextField26.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY)));
                myDocument.add(new Paragraph(jTextField24.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY)));
                myDocument.add(new Paragraph(jTextField25.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY)));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("PERSONAL DETAILS",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.DARK_GRAY  )));
                myDocument.add(new Paragraph(jTextField5.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY)));
                myDocument.add(new Paragraph(jTextField7.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY)));
                myDocument.add(new Paragraph(jTextField8.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY)));
                myDocument.add(new Paragraph(jTextField9.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY)));
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("REFERENCES",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.DARK_GRAY  )));
                myDocument.add(new Paragraph("\n"));
                table2.setHeaderRows(1);
                table2.addCell(jTextField32.getText());
                table2.addCell(jTextField36.getText());
                table2.addCell(jTextField33.getText());
                table2.addCell(jTextField37.getText());
                table2.addCell(jTextField34.getText());
                table2.addCell(jTextField38.getText());
                table2.addCell(jTextField35.getText());
                table2.addCell(jTextField39.getText());
                myDocument.add(table2);
                myDocument.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                myDocument.add(new Paragraph("SIGNATURE",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.DARK_GRAY  )));
                myDocument.add(new Paragraph(jTextField40.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY)));
                myDocument.add(new Paragraph(jTextField41.getText(),FontFactory.getFont(FontFactory.TIMES_BOLD,12,Font.PLAIN,BaseColor.DARK_GRAY)));
                myDocument.close();
                JOptionPane.showMessageDialog(null,"CV pdf was successfully Generated");

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){
                }
            }
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed

        int yesorno=JOptionPane.showConfirmDialog(null,"Do You Want To Exit?","Exit",JOptionPane.YES_NO_OPTION);
        if(yesorno==0)
        {
            System.exit(0);
        }
        else
        {

        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        String s28=jTextField30.getText();
        int yesorno=JOptionPane.showConfirmDialog(null,"Do You Want To Delete?","Delete",JOptionPane.YES_NO_OPTION);
        if(yesorno==0)
        {
            try{

                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CV;integratedSecurity=true");

                Statement statement = connection.createStatement();

                statement.execute("delete from frame1 where username='"+s28+"'");
                JOptionPane.showMessageDialog(null, "Delete Successfull!");
                jTextField3.setText("");
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jTextField18.setText("");
                jTextField19.setText("");
                jTextField20.setText("");
                jTextField12.setText("");
                jTextField13.setText("");
                jTextField14.setText("");
                jTextField15.setText("");
                jTextField16.setText("");
                jTextField17.setText("");
                jTextField22.setText("");
                jTextField27.setText("");
                jTextField28.setText("");
                jTextField29.setText("");
                jTextField21.setText("");
                jTextField23.setText("");
                jTextField26.setText("");
                jTextField24.setText("");
                jTextField25.setText("");
                jTextField30.setText("");
                jTextField31.setText("");
                jTextField32.setText("");
                jTextField33.setText("");
                jTextField34.setText("");
                jTextField35.setText("");
                jTextField36.setText("");
                jTextField37.setText("");
                jTextField38.setText("");
                jTextField39.setText("");
                jTextField40.setText("");
                jTextField41.setText("");
                lbl_img.setIcon(null);
                jTextField1.setText("");

            }  catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
        }
        else
        {

        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField22.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField21.setText("");
        jTextField23.setText("");
        jTextField26.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField30.setText("");
        jTextField31.setText("");
        jTextField32.setText("");
        jTextField33.setText("");
        jTextField34.setText("");
        jTextField35.setText("");
        jTextField36.setText("");
        jTextField37.setText("");
        jTextField38.setText("");
        jTextField39.setText("");
        jTextField40.setText("");
        jTextField41.setText("");
        lbl_img.setIcon(null);
        jTextField1.setText("");
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Add Record",JOptionPane.YES_NO_OPTION);
        if(p==0){

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CV;integratedSecurity=true");

                String sql ="update frame1 set firstname=?,surname=?,permanantaddress=?,presentaddress=?,postcode=?,nationality=?,dateofbirth=?,contact=?,email=?,university=?,college=?,school=?,skills=?,skills1=?,skills2=?,skills3=?,skills4=?,skills5=?,language=?,language1=?,language2=?,language3=?,companyname=?,address=?,country=?,title=?,role=?,objective=?,name1=?,title1=?,company1=?,cellno1=?,name2=?,title2=?,company2=?,cellno2=?,sname=?,sdate=?,image=? where username='"+jTextField30.getText()+"'";

                pst = connection.prepareStatement(sql);
                pst.setString(1,jTextField3.getText());
                pst.setString(2,jTextField4.getText());
                pst.setString(3,jTextField5.getText());
                pst.setString(4,jTextField6.getText());
                pst.setString(5,jTextField7.getText());
                pst.setString(6,jTextField8.getText());
                pst.setString(7,jTextField9.getText());
                pst.setString(8,jTextField10.getText());
                pst.setString(9,jTextField11.getText());
                pst.setString(10,jTextField18.getText());
                pst.setString(11,jTextField19.getText());
                pst.setString(12,jTextField20.getText());
                pst.setString(13,jTextField12.getText());
                pst.setString(14,jTextField13.getText());
                pst.setString(15, jTextField14.getText());
                pst.setString(16,jTextField15.getText());
                pst.setString(17,jTextField16.getText());
                pst.setString(18,jTextField17.getText());
                pst.setString(19,jTextField22.getText());
                pst.setString(20,jTextField27.getText());
                pst.setString(21,jTextField28.getText());
                pst.setString(22,jTextField29.getText());
                pst.setString(23,jTextField21.getText());
                pst.setString(24,jTextField23.getText());
                pst.setString(25,jTextField26.getText());
                pst.setString(26,jTextField24.getText());
                pst.setString(27,jTextField25.getText());
                pst.setString(28,jTextField31.getText());
                pst.setString(29,jTextField32.getText());
                pst.setString(30,jTextField33.getText());
                pst.setString(31,jTextField34.getText());
                pst.setString(32,jTextField35.getText());
                pst.setString(33,jTextField36.getText());
                pst.setString(34,jTextField37.getText());
                pst.setString(35,jTextField38.getText());
                pst.setString(36,jTextField39.getText());
                pst.setString(37,jTextField40.getText());
                pst.setString(38,jTextField41.getText());
                pst.setBytes(39,person_image);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data is saved successfully");

            }
            catch (Exception e)

            {
                JOptionPane.showMessageDialog(null,e);
            }
            finally {

                try{
                    //rs.close();
                    pst.close();

                }
                catch(Exception e){

                }
            }
        }
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String s1= jTextField3.getText();
        String s2=jTextField4.getText();
        String s3=jTextField5.getText();
        String s4= jTextField6.getText();
        String s5=jTextField7.getText();
        String s6=jTextField8.getText();
        String s7= jTextField9.getText();
        String s8=jTextField10.getText();
        String s9=jTextField11.getText();
        String s10= jTextField18.getText();
        String s11=jTextField19.getText();
        String s12=jTextField20.getText();
        String s13= jTextField12.getText();
        String s14=jTextField13.getText();
        String s15=jTextField14.getText();
        String s16= jTextField15.getText();
        String s17=jTextField16.getText();
        String s18=jTextField17.getText();
        String s19= jTextField22.getText();
        String s20=jTextField27.getText();
        String s21=jTextField28.getText();
        String s22= jTextField29.getText();
        String s23=jTextField21.getText();
        String s24=jTextField23.getText();
        String s25= jTextField26.getText();
        String s26=jTextField24.getText();
        String s27=jTextField25.getText();
        //String s28= jTextField30.getText();
        String s29=jTextField31.getText();
        String s30=jTextField32.getText();
        String s31=jTextField33.getText();
        String s32=jTextField34.getText();
        String s33= jTextField35.getText();
        String s34=jTextField36.getText();
        String s35=jTextField37.getText();
        String s36=jTextField38.getText();
        String s37=jTextField39.getText();
        String s38=jTextField40.getText();
        String s39=jTextField41.getText();
        ImageIcon s40=(ImageIcon) lbl_img.getIcon();
        if(jMenuItem1.isArmed())
        {
            Preview ob =new Preview(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24,s25,s26,s27,s29,s30,s31,s32,s33,s34,s35,s36,s37,s38,s39,s40);

            ob.setVisible(true);

            Format2.this.setVisible(false);

        }

        else

        {
            JOptionPane.showMessageDialog(null, "Something Wrong!");

        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new Main().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        new Format2().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        new Format3().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        new Format4().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        new Format5().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        new Login().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CV;integratedSecurity=true");
            String sql="select * from frame1 where username=?";
            PreparedStatement pst=connection.prepareStatement(sql);
            pst.setString(1,jTextField1.getText());
            ResultSet rs=pst.executeQuery();
            if(rs.next())
            {
                String setid=rs.getString("username");
                jTextField30.setText(setid);
                String setfname=rs.getString("firstname");
                jTextField3.setText(setfname);
                String setsname=rs.getString("surname");
                jTextField4.setText(setsname);
                String setaddress=rs.getString("permanantaddress");
                jTextField6.setText(setaddress);
                String setpaddress=rs.getString("presentaddress");
                jTextField5.setText(setpaddress);
                String setpost=rs.getString("postcode");
                jTextField7.setText(setpost);
                String setnat=rs.getString("nationality");
                jTextField8.setText(setnat);
                String setbirth=rs.getString("dateofbirth");
                jTextField9.setText(setbirth);
                String setcon=rs.getString("contact");
                jTextField10.setText(setcon);
                String setemail=rs.getString("email");
                jTextField11.setText(setemail);
                String setuni=rs.getString("university");
                jTextField18.setText(setuni);
                String setcol=rs.getString("college");
                jTextField19.setText(setcol);
                String setsc=rs.getString("school");
                jTextField20.setText(setsc);
                String setskil=rs.getString("skills");
                jTextField12.setText(setskil);
                String setskil1=rs.getString("skills1");
                jTextField13.setText(setskil1);
                String setskil2=rs.getString("skills2");
                jTextField14.setText(setskil2);
                String setskil3=rs.getString("skills3");
                jTextField15.setText(setskil3);
                String setskil4=rs.getString("skills4");
                jTextField16.setText(setskil4);
                String setskil5=rs.getString("skills5");
                jTextField17.setText(setskil5);
                String setlan=rs.getString("language");
                jTextField22.setText(setlan);
                String setlan1=rs.getString("language1");
                jTextField27.setText(setlan1);
                String setlan2=rs.getString("language2");
                jTextField28.setText(setlan2);
                String setlan3=rs.getString("language3");
                jTextField29.setText(setlan3);
                String setcom=rs.getString("companyname");
                jTextField21.setText(setcom);
                String setaddr=rs.getString("address");
                jTextField23.setText(setaddr);
                String setcoun=rs.getString("country");
                jTextField26.setText(setcoun);
                String settitl=rs.getString("title");
                jTextField24.setText(settitl);
                String setrol=rs.getString("role");
                jTextField25.setText(setrol);
                String setobj=rs.getString("objective");
                jTextField31.setText(setobj);
                String setnm=rs.getString("name1");
                jTextField32.setText(setnm);
                String setti1=rs.getString("title1");
                jTextField33.setText(setti1);
                String setcm=rs.getString("company1");
                jTextField34.setText(setcm);
                String setcel=rs.getString("cellno1");
                jTextField35.setText(setcel);
                String setnm2=rs.getString("name2");
                jTextField36.setText(setnm2);
                String settl=rs.getString("title2");
                jTextField37.setText(settl);
                String setcmp=rs.getString("company2");
                jTextField38.setText(setcmp);
                String setcell=rs.getString("cellno2");
                jTextField39.setText(setcell);
                String setsname1=rs.getString("sname");
                jTextField40.setText(setsname1);
                String setsdate=rs.getString("sdate");
                jTextField41.setText(setsdate);
                byte[] img = rs.getBytes("Image");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_SMOOTH));
                lbl_img.setIcon(imageIcon);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

        filename =f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img.getWidth(), lbl_img.getHeight(), Image.SCALE_SMOOTH));
        lbl_img.setIcon(imageIcon);
        try {

            File image = new File(filename);
            FileInputStream fis = new FileInputStream (image);
            ByteArrayOutputStream bos= new ByteArrayOutputStream();
            byte[] buf = new byte[1024];

            for(int readNum; (readNum=fis.read(buf))!=-1; ){

                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lbl_imgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_imgMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_imgMouseClicked
                                          

   
                                         

                             
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
            java.util.logging.Logger.getLogger(Format2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Format2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Format2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Format2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Format2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lbl_img;
    // End of variables declaration//GEN-END:variables
    String filename = null;
    byte[] person_image = null;
}

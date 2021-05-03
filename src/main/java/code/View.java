package code;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author seedi
 */
public class View extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
   
    public View() {
        initComponents();
    }

    private void gameScore(){
        lblPlayerX.setText(String.valueOf(xCount));
        lblPlayerO.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player(){
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
        }
        else{
            startGame = "X";
        }
    }
    
    private void winningGame(){
        String b1 = btnTic1.getText();
        String b2 = btnTic2.getText();
        String b3 = btnTic3.getText();
        String b4 = btnTic4.getText();
        String b5 = btnTic5.getText();
        String b6 = btnTic6.getText();
        String b7 = btnTic7.getText();
        String b8 = btnTic8.getText();
        String b9 = btnTic9.getText();
        
        // conditiond to X in line 
        if(b1 == ("X") && b2 == ("X") && b3 == ("X")){
            JOptionPane.showMessageDialog(this, "Jugador X ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic1.setBackground(Color.ORANGE);
            btnTic2.setBackground(Color.ORANGE);
            btnTic3.setBackground(Color.ORANGE);
            xCount++;
            gameScore();
            
            btnTic4.setEnabled(false);
            btnTic5.setEnabled(false);
            btnTic6.setEnabled(false);
            btnTic7.setEnabled(false);
            btnTic8.setEnabled(false);
            btnTic9.setEnabled(false);
        }
        
        if(b4 == ("X") && b5 == ("X") && b6 == ("X")){
            JOptionPane.showMessageDialog(this, "Jugador X ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic4.setBackground(Color.CYAN);
            btnTic5.setBackground(Color.CYAN);
            btnTic6.setBackground(Color.CYAN);
            xCount++;
            gameScore();
            
            btnTic1.setEnabled(false);
            btnTic2.setEnabled(false);
            btnTic3.setEnabled(false);
            btnTic7.setEnabled(false);
            btnTic8.setEnabled(false);
            btnTic9.setEnabled(false);
        }
        
        if(b7 == ("X") && b8 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this, "Jugador X ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic7.setBackground(Color.GREEN);
            btnTic8.setBackground(Color.GREEN);
            btnTic9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            
            btnTic1.setEnabled(false);
            btnTic2.setEnabled(false);
            btnTic3.setEnabled(false);
            btnTic4.setEnabled(false);
            btnTic5.setEnabled(false);
            btnTic6.setEnabled(false);
        }
        
        // conditions to O in line 
        if(b1 == ("O") && b2 == ("O") && b3 == ("O")){
            JOptionPane.showMessageDialog(this, "Jugador O ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic1.setBackground(Color.ORANGE);
            btnTic2.setBackground(Color.ORANGE);
            btnTic3.setBackground(Color.ORANGE);
            oCount++;
            gameScore();
            
            btnTic4.setEnabled(false);
            btnTic5.setEnabled(false);
            btnTic6.setEnabled(false);
            btnTic7.setEnabled(false);
            btnTic8.setEnabled(false);
            btnTic9.setEnabled(false);
        }
        
        if(b4 == ("O") && b5 == ("O") && b6 == ("O")){
            JOptionPane.showMessageDialog(this, "Jugador O ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic4.setBackground(Color.CYAN);
            btnTic5.setBackground(Color.CYAN);
            btnTic6.setBackground(Color.CYAN);
            oCount++;
            gameScore();
            
            btnTic1.setEnabled(false);
            btnTic2.setEnabled(false);
            btnTic3.setEnabled(false);
            btnTic7.setEnabled(false);
            btnTic8.setEnabled(false);
            btnTic9.setEnabled(false);
        }
        
        if(b7 == ("O") && b8 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this, "Jugador O ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic7.setBackground(Color.GREEN);
            btnTic8.setBackground(Color.GREEN);
            btnTic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            
            btnTic1.setEnabled(false);
            btnTic2.setEnabled(false);
            btnTic3.setEnabled(false);
            btnTic4.setEnabled(false);
            btnTic5.setEnabled(false);
            btnTic6.setEnabled(false);
        }
        
        //conditions mix
        if(b1 == ("X") && b4 == ("X") && b7 == ("X")){
            JOptionPane.showMessageDialog(this, "Jugador X ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic1.setBackground(Color.MAGENTA);
            btnTic4.setBackground(Color.MAGENTA);
            btnTic7.setBackground(Color.MAGENTA);
            xCount++;
            gameScore();
            
            btnTic2.setEnabled(false);
            btnTic3.setEnabled(false);
            btnTic5.setEnabled(false);
            btnTic6.setEnabled(false);
            btnTic8.setEnabled(false);
            btnTic9.setEnabled(false);
        }
        
        if(b2 == ("X") && b5 == ("X") && b8 == ("X")){
            JOptionPane.showMessageDialog(this, "Jugador X ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic2.setBackground(Color.PINK);
            btnTic5.setBackground(Color.PINK);
            btnTic8.setBackground(Color.PINK);
            xCount++;
            gameScore();
            
            btnTic1.setEnabled(false);
            btnTic3.setEnabled(false);
            btnTic4.setEnabled(false);
            btnTic6.setEnabled(false);
            btnTic7.setEnabled(false);
            btnTic9.setEnabled(false);
        }
        
        if(b3 == ("X") && b6 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this, "Jugador X ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic3.setBackground(Color.MAGENTA);
            btnTic6.setBackground(Color.MAGENTA);
            btnTic9.setBackground(Color.MAGENTA);
            xCount++;
            gameScore();
            
            btnTic1.setEnabled(false);
            btnTic2.setEnabled(false);
            btnTic4.setEnabled(false);
            btnTic5.setEnabled(false);
            btnTic7.setEnabled(false);
            btnTic8.setEnabled(false);
        }
        
        if(b1 == ("X") && b5 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this, "Jugador X ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic1.setBackground(Color.PINK);
            btnTic5.setBackground(Color.PINK);
            btnTic9.setBackground(Color.PINK);
            xCount++;
            gameScore();
            
            btnTic2.setEnabled(false);
            btnTic3.setEnabled(false);
            btnTic4.setEnabled(false);
            btnTic6.setEnabled(false);
            btnTic7.setEnabled(false);
            btnTic8.setEnabled(false);
        }
        
        if(b3 == ("X") && b5 == ("X") && b7 == ("X")){
            JOptionPane.showMessageDialog(this, "Jugador X ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic3.setBackground(Color.CYAN);
            btnTic5.setBackground(Color.CYAN);
            btnTic7.setBackground(Color.CYAN);
            xCount++;
            gameScore();
            
            btnTic1.setEnabled(false);
            btnTic2.setEnabled(false);
            btnTic4.setEnabled(false);
            btnTic6.setEnabled(false);
            btnTic8.setEnabled(false);
            btnTic9.setEnabled(false);
        }
        
        if(b1 == ("O") && b4 == ("O") && b7 == ("O")){
            JOptionPane.showMessageDialog(this, "Jugador O ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic1.setBackground(Color.MAGENTA);
            btnTic4.setBackground(Color.MAGENTA);
            btnTic7.setBackground(Color.MAGENTA);
            oCount++;
            gameScore();
            
            btnTic2.setEnabled(false);
            btnTic3.setEnabled(false);
            btnTic5.setEnabled(false);
            btnTic6.setEnabled(false);
            btnTic8.setEnabled(false);
            btnTic9.setEnabled(false);
        }
        
        if(b2 == ("O") && b5 == ("O") && b8 == ("O")){
            JOptionPane.showMessageDialog(this, "Jugador O ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic2.setBackground(Color.PINK);
            btnTic5.setBackground(Color.PINK);
            btnTic8.setBackground(Color.PINK);
            oCount++;
            gameScore();
            
            btnTic1.setEnabled(false);
            btnTic3.setEnabled(false);
            btnTic4.setEnabled(false);
            btnTic6.setEnabled(false);
            btnTic7.setEnabled(false);
            btnTic9.setEnabled(false);
        }
        
        if(b3 == ("O") && b6 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this, "Jugador O ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic3.setBackground(Color.MAGENTA);
            btnTic6.setBackground(Color.MAGENTA);
            btnTic9.setBackground(Color.MAGENTA);
            oCount++;
            gameScore();
            
            btnTic1.setEnabled(false);
            btnTic2.setEnabled(false);
            btnTic4.setEnabled(false);
            btnTic5.setEnabled(false);
            btnTic7.setEnabled(false);
            btnTic8.setEnabled(false);
        }
        
        if(b1 == ("O") && b5 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this, "Jugador O ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic1.setBackground(Color.PINK);
            btnTic5.setBackground(Color.PINK);
            btnTic9.setBackground(Color.PINK);
            oCount++;
            gameScore();
            
            btnTic2.setEnabled(false);
            btnTic3.setEnabled(false);
            btnTic4.setEnabled(false);
            btnTic6.setEnabled(false);
            btnTic7.setEnabled(false);
            btnTic8.setEnabled(false);
        }
        
        if(b3 == ("O") && b5 == ("O") && b7 == ("O")){
            JOptionPane.showMessageDialog(this, "Jugador O ha Ganado!", "Juego del Gato", JOptionPane.INFORMATION_MESSAGE);
            btnTic3.setBackground(Color.CYAN);
            btnTic5.setBackground(Color.CYAN);
            btnTic7.setBackground(Color.CYAN);
            oCount++;
            gameScore();
            
            btnTic1.setEnabled(false);
            btnTic2.setEnabled(false);
            btnTic4.setEnabled(false);
            btnTic6.setEnabled(false);
            btnTic8.setEnabled(false);
            btnTic9.setEnabled(false);
        }     
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private JFrame frame;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnTic3 = new javax.swing.JButton();
        btnTic1 = new javax.swing.JButton();
        btnTic2 = new javax.swing.JButton();
        btnTic4 = new javax.swing.JButton();
        btnTic5 = new javax.swing.JButton();
        btnTic6 = new javax.swing.JButton();
        btnTic7 = new javax.swing.JButton();
        btnTic8 = new javax.swing.JButton();
        btnTic9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPlayerX = new javax.swing.JLabel();
        lblPlayerO = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnJugarNuevo = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnAbout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego del Gato");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTic3.setFont(new java.awt.Font("Segoe UI Black", 1, 90)); // NOI18N
        btnTic3.setMaximumSize(new java.awt.Dimension(150, 125));
        btnTic3.setMinimumSize(new java.awt.Dimension(150, 125));
        btnTic3.setPreferredSize(new java.awt.Dimension(150, 110));
        btnTic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnTic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        btnTic1.setFont(new java.awt.Font("Segoe UI Black", 1, 90)); // NOI18N
        btnTic1.setMaximumSize(new java.awt.Dimension(150, 125));
        btnTic1.setMinimumSize(new java.awt.Dimension(150, 125));
        btnTic1.setPreferredSize(new java.awt.Dimension(150, 110));
        btnTic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnTic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnTic2.setFont(new java.awt.Font("Segoe UI Black", 1, 90)); // NOI18N
        btnTic2.setMaximumSize(new java.awt.Dimension(150, 125));
        btnTic2.setMinimumSize(new java.awt.Dimension(150, 125));
        btnTic2.setPreferredSize(new java.awt.Dimension(150, 110));
        btnTic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnTic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        btnTic4.setFont(new java.awt.Font("Segoe UI Black", 1, 90)); // NOI18N
        btnTic4.setMaximumSize(new java.awt.Dimension(150, 125));
        btnTic4.setMinimumSize(new java.awt.Dimension(150, 125));
        btnTic4.setPreferredSize(new java.awt.Dimension(150, 110));
        btnTic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic4ActionPerformed(evt);
            }
        });
        jPanel2.add(btnTic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        btnTic5.setFont(new java.awt.Font("Segoe UI Black", 1, 90)); // NOI18N
        btnTic5.setMaximumSize(new java.awt.Dimension(150, 125));
        btnTic5.setMinimumSize(new java.awt.Dimension(150, 125));
        btnTic5.setPreferredSize(new java.awt.Dimension(150, 110));
        btnTic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic5ActionPerformed(evt);
            }
        });
        jPanel2.add(btnTic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        btnTic6.setFont(new java.awt.Font("Segoe UI Black", 1, 90)); // NOI18N
        btnTic6.setMaximumSize(new java.awt.Dimension(150, 125));
        btnTic6.setMinimumSize(new java.awt.Dimension(150, 125));
        btnTic6.setPreferredSize(new java.awt.Dimension(150, 110));
        btnTic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic6ActionPerformed(evt);
            }
        });
        jPanel2.add(btnTic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        btnTic7.setFont(new java.awt.Font("Segoe UI Black", 1, 90)); // NOI18N
        btnTic7.setMaximumSize(new java.awt.Dimension(150, 125));
        btnTic7.setMinimumSize(new java.awt.Dimension(150, 125));
        btnTic7.setPreferredSize(new java.awt.Dimension(150, 110));
        btnTic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic7ActionPerformed(evt);
            }
        });
        jPanel2.add(btnTic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        btnTic8.setFont(new java.awt.Font("Segoe UI Black", 1, 90)); // NOI18N
        btnTic8.setMaximumSize(new java.awt.Dimension(150, 125));
        btnTic8.setMinimumSize(new java.awt.Dimension(150, 125));
        btnTic8.setPreferredSize(new java.awt.Dimension(150, 110));
        btnTic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic8ActionPerformed(evt);
            }
        });
        jPanel2.add(btnTic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        btnTic9.setFont(new java.awt.Font("Segoe UI Black", 1, 90)); // NOI18N
        btnTic9.setMaximumSize(new java.awt.Dimension(150, 125));
        btnTic9.setMinimumSize(new java.awt.Dimension(150, 125));
        btnTic9.setPreferredSize(new java.awt.Dimension(150, 110));
        btnTic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTic9ActionPerformed(evt);
            }
        });
        jPanel2.add(btnTic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 500, 400));

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("Jugador X:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setText("Jugador O:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lblPlayerX.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        lblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerX.setText("0");
        lblPlayerX.setOpaque(true);
        jPanel4.add(lblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 210, 50));

        lblPlayerO.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        lblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerO.setText("0");
        lblPlayerO.setOpaque(true);
        jPanel4.add(lblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 210, 50));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 180));

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJugarNuevo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnJugarNuevo.setText("Jugar de Nuevo");
        btnJugarNuevo.setMaximumSize(new java.awt.Dimension(150, 125));
        btnJugarNuevo.setMinimumSize(new java.awt.Dimension(150, 125));
        btnJugarNuevo.setPreferredSize(new java.awt.Dimension(460, 80));
        btnJugarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarNuevoActionPerformed(evt);
            }
        });
        jPanel5.add(btnJugarNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnReiniciar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.setMaximumSize(new java.awt.Dimension(150, 125));
        btnReiniciar.setMinimumSize(new java.awt.Dimension(150, 125));
        btnReiniciar.setPreferredSize(new java.awt.Dimension(150, 70));
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        jPanel5.add(btnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        btnSalir.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setMaximumSize(new java.awt.Dimension(150, 125));
        btnSalir.setMinimumSize(new java.awt.Dimension(150, 125));
        btnSalir.setPreferredSize(new java.awt.Dimension(150, 70));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel5.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 480, 180));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 500, 400));

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel4.setText("Juego del Gato");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, 60));

        btnAbout.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnAbout.setText("About");
        btnAbout.setMaximumSize(new java.awt.Dimension(150, 125));
        btnAbout.setMinimumSize(new java.awt.Dimension(150, 125));
        btnAbout.setPreferredSize(new java.awt.Dimension(150, 70));
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });
        jPanel6.add(btnAbout, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 1020, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
        About window = new About();
        window.setVisible(true);
        
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Salir");
        if(JOptionPane.showConfirmDialog(frame, "Confirmar", "Juego del Gato", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        // TODO add your handling code here:
        btnTic1.setEnabled(true);
        btnTic2.setEnabled(true);
        btnTic3.setEnabled(true);
        btnTic4.setEnabled(true);
        btnTic5.setEnabled(true);
        btnTic6.setEnabled(true);
        btnTic7.setEnabled(true);
        btnTic8.setEnabled(true);
        btnTic9.setEnabled(true);
        
        lblPlayerX.setText("0");
        lblPlayerO.setText("0");
        
        xCount = 0;
        oCount = 0;
        
        startGame = "X";
        
        btnTic1.setText("");
        btnTic2.setText("");
        btnTic3.setText("");
        btnTic4.setText("");
        btnTic5.setText("");
        btnTic6.setText("");
        btnTic7.setText("");
        btnTic8.setText("");
        btnTic9.setText("");
        
        btnTic1.setBackground(Color.LIGHT_GRAY);
        btnTic2.setBackground(Color.LIGHT_GRAY);
        btnTic3.setBackground(Color.LIGHT_GRAY);
        btnTic4.setBackground(Color.LIGHT_GRAY);
        btnTic5.setBackground(Color.LIGHT_GRAY);
        btnTic6.setBackground(Color.LIGHT_GRAY);
        btnTic7.setBackground(Color.LIGHT_GRAY);
        btnTic8.setBackground(Color.LIGHT_GRAY);
        btnTic9.setBackground(Color.LIGHT_GRAY);
        
          
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnJugarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarNuevoActionPerformed
        // TODO add your handling code here:
        btnTic1.setEnabled(true);
        btnTic2.setEnabled(true);
        btnTic3.setEnabled(true);
        btnTic4.setEnabled(true);
        btnTic5.setEnabled(true);
        btnTic6.setEnabled(true);
        btnTic7.setEnabled(true);
        btnTic8.setEnabled(true);
        btnTic9.setEnabled(true);
        
        lblPlayerX.setText(String.valueOf(xCount));
        lblPlayerO.setText(String.valueOf(oCount));
        
        startGame = "X";
        
        btnTic1.setText("");
        btnTic2.setText("");
        btnTic3.setText("");
        btnTic4.setText("");
        btnTic5.setText("");
        btnTic6.setText("");
        btnTic7.setText("");
        btnTic8.setText("");
        btnTic9.setText("");
        
        btnTic1.setBackground(Color.LIGHT_GRAY);
        btnTic2.setBackground(Color.LIGHT_GRAY);
        btnTic3.setBackground(Color.LIGHT_GRAY);
        btnTic4.setBackground(Color.LIGHT_GRAY);
        btnTic5.setBackground(Color.LIGHT_GRAY);
        btnTic6.setBackground(Color.LIGHT_GRAY);
        btnTic7.setBackground(Color.LIGHT_GRAY);
        btnTic8.setBackground(Color.LIGHT_GRAY);
        btnTic9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_btnJugarNuevoActionPerformed

    private void btnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic1ActionPerformed
        // TODO add your handling code here:
        btnTic1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic1ActionPerformed

    private void btnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic2ActionPerformed
        // TODO add your handling code here:
        btnTic2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic2ActionPerformed

    private void btnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic3ActionPerformed
        // TODO add your handling code here:
        btnTic3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic3ActionPerformed

    private void btnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic4ActionPerformed
        // TODO add your handling code here:
        btnTic4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic4ActionPerformed

    private void btnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic5ActionPerformed
        // TODO add your handling code here:
        btnTic5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic5ActionPerformed

    private void btnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic6ActionPerformed
        // TODO add your handling code here:
        btnTic6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic6ActionPerformed

    private void btnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic7ActionPerformed
        // TODO add your handling code here:
        btnTic7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic7ActionPerformed

    private void btnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic8ActionPerformed
        // TODO add your handling code here:
        btnTic8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic8ActionPerformed

    private void btnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTic9ActionPerformed
        // TODO add your handling code here:
        btnTic9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }
        else{
            checker = true;
        }
        
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_btnTic9ActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnJugarNuevo;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTic1;
    private javax.swing.JButton btnTic2;
    private javax.swing.JButton btnTic3;
    private javax.swing.JButton btnTic4;
    private javax.swing.JButton btnTic5;
    private javax.swing.JButton btnTic6;
    private javax.swing.JButton btnTic7;
    private javax.swing.JButton btnTic8;
    private javax.swing.JButton btnTic9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblPlayerO;
    private javax.swing.JLabel lblPlayerX;
    // End of variables declaration//GEN-END:variables
}

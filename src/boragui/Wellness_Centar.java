/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boragui;



/**
 *
 * @author Boranijas95
 */
public class Wellness_Centar extends javax.swing.JFrame {

    /**
     * Creates new form Wellness_Centar
     */
    public Wellness_Centar() {
        initComponents();
        PrijavaPanel.setVisible(false);
       
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pozadina = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        SviClanovi = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        Rezervisi = new javax.swing.JPanel();
        RezIme = new javax.swing.JLabel();
        RezPrezime = new javax.swing.JLabel();
        RezID = new javax.swing.JLabel();
        RezImeUNOS = new javax.swing.JTextField();
        RezPrezimeUNOS = new javax.swing.JTextField();
        RezIDUNOS = new javax.swing.JTextField();
        Termin = new javax.swing.JPanel();
        DanT = new javax.swing.JLabel();
        DanTermin = new javax.swing.JComboBox<>();
        MesecT = new javax.swing.JLabel();
        MesecTermin = new javax.swing.JComboBox<>();
        GodinaT = new javax.swing.JLabel();
        GodinaTermin = new javax.swing.JComboBox<>();
        Slika = new javax.swing.JLabel();
        RezervisaniTermini = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        PrijavaPanel = new javax.swing.JPanel();
        UserLabela = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        PassLabela = new javax.swing.JLabel();
        Sifra = new javax.swing.JPasswordField();
        Prijava = new javax.swing.JButton();
        Ponisti = new javax.swing.JButton();
        Navigacija = new javax.swing.JPanel();
        Naziv = new javax.swing.JPanel();
        Naziv1 = new javax.swing.JLabel();
        Naziv2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Akcije = new javax.swing.JPanel();
        RezTermini = new javax.swing.JLabel();
        RezervisiTermin = new javax.swing.JLabel();
        IzlistajClanove = new javax.swing.JLabel();
        Odjava = new javax.swing.JLabel();
        Heder = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pozadina.setBackground(new java.awt.Color(201, 214, 229));
        Pozadina.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(201, 214, 229));
        jPanel1.setLayout(new java.awt.CardLayout());

        SviClanovi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Ime", "Prezime", "Kontakt", "Članarina"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        SviClanovi.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 460, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boragui/16df4714_z.jpg"))); // NOI18N
        SviClanovi.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 367));

        jPanel1.add(SviClanovi, "card5");

        Rezervisi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RezIme.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RezIme.setForeground(new java.awt.Color(255, 255, 255));
        RezIme.setText("Ime:");
        Rezervisi.add(RezIme, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 41, -1));

        RezPrezime.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RezPrezime.setForeground(new java.awt.Color(255, 255, 255));
        RezPrezime.setText("Prezime:");
        Rezervisi.add(RezPrezime, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        RezID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RezID.setForeground(new java.awt.Color(255, 255, 255));
        RezID.setText("ID:");
        Rezervisi.add(RezID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        RezImeUNOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RezImeUNOSActionPerformed(evt);
            }
        });
        Rezervisi.add(RezImeUNOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 400, -1));

        RezPrezimeUNOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RezPrezimeUNOSActionPerformed(evt);
            }
        });
        Rezervisi.add(RezPrezimeUNOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 400, -1));
        Rezervisi.add(RezIDUNOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 400, -1));

        Termin.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)), "Termin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        Termin.setOpaque(false);

        DanT.setForeground(new java.awt.Color(255, 255, 255));
        DanT.setText("Dan:");

        DanTermin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        MesecT.setForeground(new java.awt.Color(255, 255, 255));
        MesecT.setText("Mesec:");

        MesecTermin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januar", "Februar", "Mart", "April", "Maj", "Jun", "Jul", "Avgust", "Septembar", "Oktobar", "Novembar", "Decembar", " " }));
        MesecTermin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesecTerminActionPerformed(evt);
            }
        });

        GodinaT.setForeground(new java.awt.Color(255, 255, 255));
        GodinaT.setText("Godina:");

        GodinaTermin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020" }));
        GodinaTermin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GodinaTerminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TerminLayout = new javax.swing.GroupLayout(Termin);
        Termin.setLayout(TerminLayout);
        TerminLayout.setHorizontalGroup(
            TerminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TerminLayout.createSequentialGroup()
                .addComponent(DanT)
                .addGap(18, 18, 18)
                .addComponent(DanTermin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MesecT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MesecTermin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GodinaT)
                .addGap(18, 18, 18)
                .addComponent(GodinaTermin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        TerminLayout.setVerticalGroup(
            TerminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TerminLayout.createSequentialGroup()
                .addGroup(TerminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TerminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DanT)
                        .addComponent(DanTermin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MesecT)
                    .addGroup(TerminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MesecTermin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GodinaT)
                        .addComponent(GodinaTermin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        Rezervisi.add(Termin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 400, 60));

        Slika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boragui/4610.jpg"))); // NOI18N
        Rezervisi.add(Slika, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 290));

        jPanel1.add(Rezervisi, "card4");

        RezervisaniTermini.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ime", "Prezime", "Termin", "Cena", "Vrsta usluge"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        RezervisaniTermini.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 89));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boragui/IMG_7070-er.jpg"))); // NOI18N
        RezervisaniTermini.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 290));

        jPanel1.add(RezervisaniTermini, "card3");

        PrijavaPanel.setOpaque(false);

        UserLabela.setText("Korisničko ime:");

        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        PassLabela.setText("Lozinka:");

        Prijava.setText("Prijavi se");

        Ponisti.setText("Poništi");
        Ponisti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PonistiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrijavaPanelLayout = new javax.swing.GroupLayout(PrijavaPanel);
        PrijavaPanel.setLayout(PrijavaPanelLayout);
        PrijavaPanelLayout.setHorizontalGroup(
            PrijavaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrijavaPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(PrijavaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserLabela)
                    .addComponent(PassLabela))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrijavaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrijavaPanelLayout.createSequentialGroup()
                        .addComponent(Sifra, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PrijavaPanelLayout.createSequentialGroup()
                        .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrijavaPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ponisti, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Prijava)
                .addGap(42, 42, 42))
        );
        PrijavaPanelLayout.setVerticalGroup(
            PrijavaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrijavaPanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(PrijavaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserLabela))
                .addGap(18, 18, 18)
                .addGroup(PrijavaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassLabela)
                    .addComponent(Sifra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PrijavaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ponisti)
                    .addComponent(Prijava))
                .addGap(237, 237, 237))
        );

        jPanel1.add(PrijavaPanel, "card2");

        Pozadina.add(jPanel1);
        jPanel1.setBounds(170, 80, 570, 290);

        Navigacija.setBackground(new java.awt.Color(13, 92, 188));

        Naziv.setBackground(new java.awt.Color(13, 92, 188));

        Naziv1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Naziv1.setForeground(new java.awt.Color(201, 214, 229));
        Naziv1.setText("MAGIC  ");

        Naziv2.setBackground(new java.awt.Color(201, 214, 229));
        Naziv2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Naziv2.setForeground(new java.awt.Color(201, 214, 229));
        Naziv2.setText("WELLNESS");

        javax.swing.GroupLayout NazivLayout = new javax.swing.GroupLayout(Naziv);
        Naziv.setLayout(NazivLayout);
        NazivLayout.setHorizontalGroup(
            NazivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NazivLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NazivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Naziv1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Naziv2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NazivLayout.setVerticalGroup(
            NazivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NazivLayout.createSequentialGroup()
                .addComponent(Naziv1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Naziv2)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        Akcije.setBackground(new java.awt.Color(13, 92, 188));

        RezTermini.setBackground(new java.awt.Color(201, 214, 229));
        RezTermini.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RezTermini.setForeground(new java.awt.Color(201, 214, 229));
        RezTermini.setText("Rezervisani termini");

        RezervisiTermin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RezervisiTermin.setForeground(new java.awt.Color(201, 214, 229));
        RezervisiTermin.setText("Rezerviši termin");

        IzlistajClanove.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IzlistajClanove.setForeground(new java.awt.Color(201, 214, 229));
        IzlistajClanove.setText("Svi članovi");

        Odjava.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Odjava.setForeground(new java.awt.Color(201, 214, 229));
        Odjava.setText("Odjavi se");

        javax.swing.GroupLayout AkcijeLayout = new javax.swing.GroupLayout(Akcije);
        Akcije.setLayout(AkcijeLayout);
        AkcijeLayout.setHorizontalGroup(
            AkcijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AkcijeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AkcijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RezTermini, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(RezervisiTermin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IzlistajClanove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Odjava, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        AkcijeLayout.setVerticalGroup(
            AkcijeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AkcijeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RezTermini, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RezervisiTermin, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IzlistajClanove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(Odjava)
                .addContainerGap())
        );

        javax.swing.GroupLayout NavigacijaLayout = new javax.swing.GroupLayout(Navigacija);
        Navigacija.setLayout(NavigacijaLayout);
        NavigacijaLayout.setHorizontalGroup(
            NavigacijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(NavigacijaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavigacijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Naziv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Akcije, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        NavigacijaLayout.setVerticalGroup(
            NavigacijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigacijaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Naziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Akcije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Pozadina.add(Navigacija);
        Navigacija.setBounds(0, -6, 170, 380);

        Heder.setBackground(new java.awt.Color(201, 214, 229));

        jLabel1.setBackground(new java.awt.Color(201, 214, 229));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 92, 188));
        jLabel1.setText("DOBRO DOŠLI");

        javax.swing.GroupLayout HederLayout = new javax.swing.GroupLayout(Heder);
        Heder.setLayout(HederLayout);
        HederLayout.setHorizontalGroup(
            HederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HederLayout.createSequentialGroup()
                .addGap(0, 90, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HederLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HederLayout.setVerticalGroup(
            HederLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HederLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        Pozadina.add(Heder);
        Heder.setBounds(0, 0, 820, 90);
        Pozadina.add(jLabel2);
        jLabel2.setBounds(170, 80, 570, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pozadina, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pozadina, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void PonistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PonistiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PonistiActionPerformed

    private void RezImeUNOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RezImeUNOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RezImeUNOSActionPerformed

    private void RezPrezimeUNOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RezPrezimeUNOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RezPrezimeUNOSActionPerformed

    private void MesecTerminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesecTerminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MesecTerminActionPerformed

    private void GodinaTerminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GodinaTerminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GodinaTerminActionPerformed

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
            java.util.logging.Logger.getLogger(Wellness_Centar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wellness_Centar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wellness_Centar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wellness_Centar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Wellness_Centar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Akcije;
    private javax.swing.JLabel DanT;
    private javax.swing.JComboBox<String> DanTermin;
    private javax.swing.JLabel GodinaT;
    private javax.swing.JComboBox<String> GodinaTermin;
    private javax.swing.JPanel Heder;
    private javax.swing.JLabel IzlistajClanove;
    private javax.swing.JLabel MesecT;
    private javax.swing.JComboBox<String> MesecTermin;
    private javax.swing.JPanel Navigacija;
    private javax.swing.JPanel Naziv;
    private javax.swing.JLabel Naziv1;
    private javax.swing.JLabel Naziv2;
    private javax.swing.JLabel Odjava;
    private javax.swing.JLabel PassLabela;
    private javax.swing.JButton Ponisti;
    private javax.swing.JPanel Pozadina;
    private javax.swing.JButton Prijava;
    private javax.swing.JPanel PrijavaPanel;
    private javax.swing.JLabel RezID;
    private javax.swing.JTextField RezIDUNOS;
    private javax.swing.JLabel RezIme;
    private javax.swing.JTextField RezImeUNOS;
    private javax.swing.JLabel RezPrezime;
    private javax.swing.JTextField RezPrezimeUNOS;
    private javax.swing.JLabel RezTermini;
    private javax.swing.JPanel RezervisaniTermini;
    private javax.swing.JPanel Rezervisi;
    private javax.swing.JLabel RezervisiTermin;
    private javax.swing.JPasswordField Sifra;
    private javax.swing.JLabel Slika;
    private javax.swing.JPanel SviClanovi;
    private javax.swing.JPanel Termin;
    private javax.swing.JLabel UserLabela;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}

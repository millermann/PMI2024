/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pmi2024;

/**
 *
 * @author Estudiante
 */
public class OrganizadorDeProyectos extends javax.swing.JFrame {

    /**
     * Creates new form OrganizadorDeProyectos
     */
    public OrganizadorDeProyectos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelContenedores = new javax.swing.JPanel();
        panelInicio = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        botonVerProyectos = new javax.swing.JButton();
        botonVerIngenieros = new javax.swing.JButton();
        botonVerMateriales = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelInformacionProyectos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonVolverAlMenu = new javax.swing.JButton();
        botonAgregarProyecto = new javax.swing.JButton();
        botonModificarProyecto = new javax.swing.JButton();
        botonEliminarProyecto = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        panelInformacionIngenieros = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        botonVolverAlMenu1 = new javax.swing.JButton();
        botonAgregarIngeniero = new javax.swing.JButton();
        botonModificarIngeniero = new javax.swing.JButton();
        botonEliminarIngeniero = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelInformacionRecursosTecnologicos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        botonVolverAlMenu2 = new javax.swing.JButton();
        botonAgregarRecursoTecnologico = new javax.swing.JButton();
        botonModificarRecursoTecnologico = new javax.swing.JButton();
        botonEliminarRecursoTecnologico = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        panelCargarProyecto = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        campoDescripcion = new javax.swing.JTextField();
        campoPresupuesto = new javax.swing.JTextField();
        campoDiaInicio = new javax.swing.JTextField();
        campoMesInicio = new javax.swing.JTextField();
        campoAnioInicio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        campoMesEntrega = new javax.swing.JTextField();
        campoAnioEntrega = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        campoDiaEntrega = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        campoTipoProyecto = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        campoTipo = new javax.swing.JTextField();
        botonVolver = new javax.swing.JToggleButton();
        botonGuardar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(167, 225, 255));

        jLabel1.setText("Proyectos Tecnologicos");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelContenedores.setToolTipText("");
        panelContenedores.setLayout(new java.awt.CardLayout());

        botonSalir.setText("Salir");
        botonSalir.setToolTipText("");

        botonVerProyectos.setText("Ver Proyectos");
        botonVerProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerProyectosActionPerformed(evt);
            }
        });

        botonVerIngenieros.setText("Ver Ingenieros");
        botonVerIngenieros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerIngenierosActionPerformed(evt);
            }
        });

        botonVerMateriales.setText("Ver Materiales");

        jLabel2.setText("Bienvenido al gestor de proyectos tecnologicos");

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicioLayout.createSequentialGroup()
                .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2))
                    .addGroup(panelInicioLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonVerIngenieros)
                            .addComponent(botonVerProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonVerMateriales, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(botonVerProyectos)
                .addGap(18, 18, 18)
                .addComponent(botonVerIngenieros)
                .addGap(18, 18, 18)
                .addComponent(botonVerMateriales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(24, 24, 24))
        );

        panelContenedores.add(panelInicio, "card2");

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

        botonVolverAlMenu.setText("Volver Al Menu");
        botonVolverAlMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAlMenuActionPerformed(evt);
            }
        });

        botonAgregarProyecto.setText("Agregar");
        botonAgregarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProyectoActionPerformed(evt);
            }
        });

        botonModificarProyecto.setText("Modificar");

        botonEliminarProyecto.setText("Eliminar");

        jLabel8.setText("Proyectos:");

        javax.swing.GroupLayout panelInformacionProyectosLayout = new javax.swing.GroupLayout(panelInformacionProyectos);
        panelInformacionProyectos.setLayout(panelInformacionProyectosLayout);
        panelInformacionProyectosLayout.setHorizontalGroup(
            panelInformacionProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionProyectosLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panelInformacionProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(panelInformacionProyectosLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(botonVolverAlMenu))
                    .addGroup(panelInformacionProyectosLayout.createSequentialGroup()
                        .addComponent(botonAgregarProyecto)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarProyecto)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarProyecto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panelInformacionProyectosLayout.setVerticalGroup(
            panelInformacionProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionProyectosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelInformacionProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarProyecto)
                    .addComponent(botonModificarProyecto)
                    .addComponent(botonEliminarProyecto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(botonVolverAlMenu)
                .addGap(18, 18, 18))
        );

        panelContenedores.add(panelInformacionProyectos, "card3");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        botonVolverAlMenu1.setText("Volver Al Menu");
        botonVolverAlMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAlMenu1ActionPerformed(evt);
            }
        });

        botonAgregarIngeniero.setText("Agregar");
        botonAgregarIngeniero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarIngenieroActionPerformed(evt);
            }
        });

        botonModificarIngeniero.setText("Modificar");

        botonEliminarIngeniero.setText("Eliminar");

        jLabel7.setText("jLabel7");

        jLabel9.setText("Ingenieros:");

        javax.swing.GroupLayout panelInformacionIngenierosLayout = new javax.swing.GroupLayout(panelInformacionIngenieros);
        panelInformacionIngenieros.setLayout(panelInformacionIngenierosLayout);
        panelInformacionIngenierosLayout.setHorizontalGroup(
            panelInformacionIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionIngenierosLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panelInformacionIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(panelInformacionIngenierosLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(botonVolverAlMenu1))
                    .addGroup(panelInformacionIngenierosLayout.createSequentialGroup()
                        .addComponent(botonAgregarIngeniero)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarIngeniero)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarIngeniero))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(panelInformacionIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelInformacionIngenierosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        panelInformacionIngenierosLayout.setVerticalGroup(
            panelInformacionIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionIngenierosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelInformacionIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarIngeniero)
                    .addComponent(botonModificarIngeniero)
                    .addComponent(botonEliminarIngeniero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(botonVolverAlMenu1)
                .addGap(18, 18, 18))
            .addGroup(panelInformacionIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelInformacionIngenierosLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        panelContenedores.add(panelInformacionIngenieros, "card3");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        botonVolverAlMenu2.setText("Volver Al Menu");
        botonVolverAlMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverAlMenu2ActionPerformed(evt);
            }
        });

        botonAgregarRecursoTecnologico.setText("Agregar");
        botonAgregarRecursoTecnologico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarRecursoTecnologicoActionPerformed(evt);
            }
        });

        botonModificarRecursoTecnologico.setText("Modificar");

        botonEliminarRecursoTecnologico.setText("Eliminar");

        jLabel6.setText("Recursos Tecnologicos:");

        javax.swing.GroupLayout panelInformacionRecursosTecnologicosLayout = new javax.swing.GroupLayout(panelInformacionRecursosTecnologicos);
        panelInformacionRecursosTecnologicos.setLayout(panelInformacionRecursosTecnologicosLayout);
        panelInformacionRecursosTecnologicosLayout.setHorizontalGroup(
            panelInformacionRecursosTecnologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionRecursosTecnologicosLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panelInformacionRecursosTecnologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(panelInformacionRecursosTecnologicosLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(botonVolverAlMenu2))
                    .addGroup(panelInformacionRecursosTecnologicosLayout.createSequentialGroup()
                        .addComponent(botonAgregarRecursoTecnologico)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarRecursoTecnologico)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminarRecursoTecnologico))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panelInformacionRecursosTecnologicosLayout.setVerticalGroup(
            panelInformacionRecursosTecnologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionRecursosTecnologicosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelInformacionRecursosTecnologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarRecursoTecnologico)
                    .addComponent(botonModificarRecursoTecnologico)
                    .addComponent(botonEliminarRecursoTecnologico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(botonVolverAlMenu2)
                .addGap(18, 18, 18))
        );

        panelContenedores.add(panelInformacionRecursosTecnologicos, "card3");

        jLabel3.setText("Nuevo Proyecto");

        jLabel4.setText("Titulo:");

        jLabel5.setText("Descripcion:");

        jLabel10.setText("Presupuesto:");

        jLabel11.setText("Fecha De Inicio:");

        jLabel12.setText("Fecha De Entrega:");

        campoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTituloActionPerformed(evt);
            }
        });

        jLabel13.setText("/");

        jLabel14.setText("/");

        jLabel15.setText("/");

        jLabel16.setText("/");

        jLabel17.setText("Tipo De Proyecto: ");

        campoTipoProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel18.setText("Tipo:");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");

        javax.swing.GroupLayout panelCargarProyectoLayout = new javax.swing.GroupLayout(panelCargarProyecto);
        panelCargarProyecto.setLayout(panelCargarProyectoLayout);
        panelCargarProyectoLayout.setHorizontalGroup(
            panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCargarProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCargarProyectoLayout.createSequentialGroup()
                        .addGroup(panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17))
                            .addComponent(jLabel18))
                        .addGap(53, 53, 53)
                        .addGroup(panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelCargarProyectoLayout.createSequentialGroup()
                                .addComponent(campoDiaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoMesEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoAnioEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(campoDescripcion)
                            .addComponent(campoTitulo)
                            .addComponent(campoPresupuesto)
                            .addGroup(panelCargarProyectoLayout.createSequentialGroup()
                                .addComponent(campoDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoAnioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addComponent(campoTipoProyecto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoTipo)))
                    .addGroup(panelCargarProyectoLayout.createSequentialGroup()
                        .addComponent(botonVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonGuardar)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panelCargarProyectoLayout.setVerticalGroup(
            panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCargarProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(campoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCargarProyectoLayout.createSequentialGroup()
                        .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoAnioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoDiaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoMesEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoAnioEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(campoTipoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(campoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonVolver))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        panelContenedores.add(panelCargarProyecto, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelContenedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelContenedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVerProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerProyectosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerProyectosActionPerformed

    private void botonVerIngenierosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerIngenierosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerIngenierosActionPerformed

    private void botonVolverAlMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAlMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverAlMenuActionPerformed

    private void botonAgregarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarProyectoActionPerformed

    private void botonAgregarRecursoTecnologicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarRecursoTecnologicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarRecursoTecnologicoActionPerformed

    private void botonVolverAlMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAlMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverAlMenu2ActionPerformed

    private void botonAgregarIngenieroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarIngenieroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarIngenieroActionPerformed

    private void botonVolverAlMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAlMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverAlMenu1ActionPerformed

    private void campoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTituloActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVolverActionPerformed

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
            java.util.logging.Logger.getLogger(OrganizadorDeProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrganizadorDeProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrganizadorDeProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrganizadorDeProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrganizadorDeProyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarIngeniero;
    private javax.swing.JButton botonAgregarProyecto;
    private javax.swing.JButton botonAgregarRecursoTecnologico;
    private javax.swing.JButton botonEliminarIngeniero;
    private javax.swing.JButton botonEliminarProyecto;
    private javax.swing.JButton botonEliminarRecursoTecnologico;
    private javax.swing.JToggleButton botonGuardar;
    private javax.swing.JButton botonModificarIngeniero;
    private javax.swing.JButton botonModificarProyecto;
    private javax.swing.JButton botonModificarRecursoTecnologico;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVerIngenieros;
    private javax.swing.JButton botonVerMateriales;
    private javax.swing.JButton botonVerProyectos;
    private javax.swing.JToggleButton botonVolver;
    private javax.swing.JButton botonVolverAlMenu;
    private javax.swing.JButton botonVolverAlMenu1;
    private javax.swing.JButton botonVolverAlMenu2;
    private javax.swing.JTextField campoAnioEntrega;
    private javax.swing.JTextField campoAnioInicio;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoDiaEntrega;
    private javax.swing.JTextField campoDiaInicio;
    private javax.swing.JTextField campoMesEntrega;
    private javax.swing.JTextField campoMesInicio;
    private javax.swing.JTextField campoPresupuesto;
    private javax.swing.JTextField campoTipo;
    private javax.swing.JComboBox<String> campoTipoProyecto;
    private javax.swing.JTextField campoTitulo;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JPanel panelCargarProyecto;
    private javax.swing.JPanel panelContenedores;
    private javax.swing.JPanel panelInformacionIngenieros;
    private javax.swing.JPanel panelInformacionProyectos;
    private javax.swing.JPanel panelInformacionRecursosTecnologicos;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
package pmi2024;

import fecha.Fecha;
import ingenieros.Ingeniero;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import proyectos.DesarrolloDeHardware;
import proyectos.DesarrolloDeSoftware;
import proyectos.ProyectoTecnologico;
import recursosTecnologicos.RecursoTecnologico;

public class GUI extends javax.swing.JFrame {

    private DefaultTableModel modeloTablaProyectos;
    private DefaultTableModel modeloTablaIngenierosDisp;
    private DefaultTableModel modeloTablaIngenierosSeleccionados;
    private DefaultTableModel modeloTablaRecursosDisponibles;
    private DefaultTableModel modeloTablaRecursosSeleccionados;

    private static ArrayList<Ingeniero> arrayIngenieros;
    private static ArrayList<ProyectoTecnologico> arrayProyectos;
    private static ArrayList<RecursoTecnologico> arrayRecursos;

    private TableRowSorter<TableModel> ordenadorTablaPresupuesto;

    /**
     * Creates new form OrganizadorDeProyectos
     *
     * @param arrayIngenieros
     * @param arrayProyectos
     */
    public GUI(ArrayList<Ingeniero> arrayIngenieros, ArrayList<ProyectoTecnologico> arrayProyectos, ArrayList<RecursoTecnologico> arrayRecursos) {

        initComponents();
        this.arrayIngenieros = arrayIngenieros;
        this.arrayProyectos = arrayProyectos;
        this.arrayRecursos = arrayRecursos;

        //    tablas    //
        // Para el mostrar y ordenar todos los proyectos (subpanelProy)
        String[] columnasTablaProyectos = {"Nombre", "Tipo", "Descripcion", "Inicio", "Fin", "Presupuesto", "ID"};
        modeloTablaProyectos = new DefaultTableModel(columnasTablaProyectos, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaProyectos.setModel(modeloTablaProyectos);

        ordenadorTablaPresupuesto = new TableRowSorter<>(modeloTablaProyectos);
        ordenadorTablaPresupuesto.setComparator(5, Comparator.naturalOrder());
        tablaProyectos.setRowSorter(ordenadorTablaPresupuesto);

        // Para el mostrar y seleccionar ingenieros (subpanelProyCarga, subpanelMostrarProy, subpanelModProy)
        String[] columnasTablaIngenieros = {"Nombre", "Apellido", "Especialidad", "Contratacion", "Mail", "ID"};
        modeloTablaIngenierosDisp = new DefaultTableModel(columnasTablaIngenieros, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modeloTablaIngenierosSeleccionados = new DefaultTableModel(columnasTablaIngenieros, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tablaIngDisponiblesCargarProyecto.setModel(modeloTablaIngenierosDisp);
        tablaIngSeleccionadosCargarProyecto.setModel(modeloTablaIngenierosSeleccionados);
        tablaIngAsignadosMostrarProyecto.setModel(modeloTablaIngenierosSeleccionados);
        tablaIngDisponiblesModProyecto.setModel(modeloTablaIngenierosDisp);
        tablaIngAsignadosModProyecto.setModel(modeloTablaIngenierosSeleccionados);

        // Para el mostrar y seleccionar recursos (subpanelProyCarga, subpanelMostrarProy, subpanelModProy)
        String[] columnasTablaRecursos = {"Nombre", "Descripcion", "ID"};
        modeloTablaRecursosDisponibles = new DefaultTableModel(columnasTablaRecursos, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        modeloTablaRecursosSeleccionados = new DefaultTableModel(columnasTablaRecursos, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tablaRecDisponiblesCargarProyecto.setModel(modeloTablaRecursosDisponibles);
        tablaRecSeleccionadosCargarProyecto.setModel(modeloTablaRecursosSeleccionados);
        tablaRecAsignadosMostrarProyecto.setModel(modeloTablaRecursosSeleccionados);
        tablaRecDisponiblesModProyecto.setModel(modeloTablaRecursosDisponibles);
        tablaRecAsignadosModProyecto.setModel(modeloTablaRecursosSeleccionados);

        //    buttongroups    //
        buttonGroupTipoProyecto.add(radioHardware);
        buttonGroupTipoProyecto.add(radioSoftware);
        buttonGroupModWare.add(radioModHardware);
        buttonGroupModWare.add(radioModSoftware);

        setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png")); // totalmente innecesario pero mira que lindo queda!
        setTitle("Organizador de Proyectos");
        textTitulo.setText("MENU PRINCIPAL");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoProyecto = new javax.swing.ButtonGroup();
        buttonGroupModWare = new javax.swing.ButtonGroup();
        contenedorTitulo = new javax.swing.JPanel();
        textTitulo = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        botonProyectos = new javax.swing.JButton();
        botonIngenieros = new javax.swing.JButton();
        botonRecursos = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        panelProyectos = new javax.swing.JPanel();
        subpanelPrincipalProyectos = new javax.swing.JPanel();
        scrollTablaProyectos = new javax.swing.JScrollPane();
        tablaProyectos = new javax.swing.JTable();
        botonVolverAlMenu = new javax.swing.JButton();
        botonAgregarProyecto = new javax.swing.JButton();
        botonModificarProyecto = new javax.swing.JButton();
        botonEliminarProyecto = new javax.swing.JButton();
        textCantProyectos = new javax.swing.JLabel();
        textCantProyectosHardware = new javax.swing.JLabel();
        textCantProyectosSoftware = new javax.swing.JLabel();
        botonOrdenarPresupuesto = new javax.swing.JButton();
        textCantProyectos1 = new javax.swing.JLabel();
        subpanelMostrarProyecto = new javax.swing.JPanel();
        textPresup = new javax.swing.JLabel();
        textInicio = new javax.swing.JLabel();
        textFinalizacion = new javax.swing.JLabel();
        textMostrarFechaInicio = new javax.swing.JLabel();
        textMostrarFechaFin = new javax.swing.JLabel();
        tabMostrarIngYRecursos = new javax.swing.JTabbedPane();
        tabMostrarIngenieros = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        scrollIngMostrarAsignados = new javax.swing.JScrollPane();
        tablaIngAsignadosMostrarProyecto = new javax.swing.JTable();
        tabMostrarRecursos = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        scrollMostrarRecAsignados = new javax.swing.JScrollPane();
        tablaRecAsignadosMostrarProyecto = new javax.swing.JTable();
        botonVolverPanelPrincipalProyectos2 = new javax.swing.JButton();
        textMostrarTitulo = new javax.swing.JLabel();
        textMostrarDescripcion = new javax.swing.JLabel();
        textMostrarTipo = new javax.swing.JLabel();
        textMostrarHardSoft = new javax.swing.JLabel();
        textMostrarPresupuesto = new javax.swing.JLabel();
        textMostrarTitulo1 = new javax.swing.JLabel();
        textMostrarTitulo2 = new javax.swing.JLabel();
        textMostrarTitulo3 = new javax.swing.JLabel();
        textMostrarHardSoft1 = new javax.swing.JLabel();
        subpanelModProyecto = new javax.swing.JPanel();
        campoModProyectoTitulo = new javax.swing.JTextField();
        radioModHardware = new javax.swing.JRadioButton();
        radioModSoftware = new javax.swing.JRadioButton();
        campoModProyectoDescripcion = new javax.swing.JTextField();
        campoModProyectoTipo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        spinnerModProyectoPresupuesto = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        spinnerModFechaInicioDia = new javax.swing.JSpinner();
        spinnerModFechaInicioMes = new javax.swing.JSpinner();
        spinnerModFechaInicioAnio = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        spinnerModFechaFinDia = new javax.swing.JSpinner();
        spinnerModFechaFinMes = new javax.swing.JSpinner();
        spinnerModFechaFinAnio = new javax.swing.JSpinner();
        tabModIngYRecursos = new javax.swing.JTabbedPane();
        tabModIngenieros = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        scrollModIngDisponibles = new javax.swing.JScrollPane();
        tablaIngDisponiblesModProyecto = new javax.swing.JTable();
        botonModAgregarIng = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        scrollModIngAsignados = new javax.swing.JScrollPane();
        tablaIngAsignadosModProyecto = new javax.swing.JTable();
        botonModQuitarIng = new javax.swing.JButton();
        tabModRecursos = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        botonModAgregarRecurso = new javax.swing.JButton();
        botonModQuitarRecurso = new javax.swing.JButton();
        scrollModRecDisponibles = new javax.swing.JScrollPane();
        tablaRecDisponiblesModProyecto = new javax.swing.JTable();
        scrollModRecAsignados = new javax.swing.JScrollPane();
        tablaRecAsignadosModProyecto = new javax.swing.JTable();
        botonModProyecto = new javax.swing.JButton();
        botonVolverPanelPrincipalProyectos1 = new javax.swing.JButton();
        indiceArrayProyectos = new javax.swing.JLabel();
        subpanelCargarProyecto = new javax.swing.JPanel();
        campoProyectoTitulo = new javax.swing.JTextField();
        radioHardware = new javax.swing.JRadioButton();
        radioSoftware = new javax.swing.JRadioButton();
        campoProyectoDescripcion = new javax.swing.JTextField();
        campoProyectoTipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        spinnerProyectoPresupuesto = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        spinnerFechaInicioDia = new javax.swing.JSpinner();
        spinnerFechaInicioMes = new javax.swing.JSpinner();
        spinnerFechaInicioAnio = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        spinnerFechaFinDia = new javax.swing.JSpinner();
        spinnerFechaFinMes = new javax.swing.JSpinner();
        spinnerFechaFinAnio = new javax.swing.JSpinner();
        tabIngYRecursos = new javax.swing.JTabbedPane();
        tabIngenieros = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        scrollIngDisponibles = new javax.swing.JScrollPane();
        tablaIngDisponiblesCargarProyecto = new javax.swing.JTable();
        botonAgregarIng = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        scrollIngSeleccionados = new javax.swing.JScrollPane();
        tablaIngSeleccionadosCargarProyecto = new javax.swing.JTable();
        botonQuitarIng = new javax.swing.JButton();
        tabRecursos = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonAgregarRecurso = new javax.swing.JButton();
        botonQuitarRecurso = new javax.swing.JButton();
        scrollRecDisponibles = new javax.swing.JScrollPane();
        tablaRecDisponiblesCargarProyecto = new javax.swing.JTable();
        scrollRecSeleccionados = new javax.swing.JScrollPane();
        tablaRecSeleccionadosCargarProyecto = new javax.swing.JTable();
        botonCargarProyecto = new javax.swing.JButton();
        botonVolverPanelPrincipalProyectos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(241, 105, 73));

        contenedorTitulo.setBackground(new java.awt.Color(241, 105, 73));
        contenedorTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        textTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTitulo.setText("Titulo");

        javax.swing.GroupLayout contenedorTituloLayout = new javax.swing.GroupLayout(contenedorTitulo);
        contenedorTitulo.setLayout(contenedorTituloLayout);
        contenedorTituloLayout.setHorizontalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contenedorTituloLayout.setVerticalGroup(
            contenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        contenedor.setLayout(new java.awt.CardLayout());

        panelMenu.setBackground(new java.awt.Color(241, 105, 73));
        panelMenu.setBorder(new javax.swing.border.MatteBorder(null));

        botonProyectos.setText("Proyectos");
        botonProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handlerIrAlSubpanelPrincipalProyectos(evt);
            }
        });

        botonIngenieros.setText("Ingenieros");

        botonRecursos.setText("Recursos");

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonRecursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonProyectos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonIngenieros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonProyectos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonIngenieros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRecursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 484, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addContainerGap())
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );

        contenedor.add(panelMenu, "card2");

        panelProyectos.setLayout(new java.awt.CardLayout());

        subpanelPrincipalProyectos.setBackground(new java.awt.Color(250, 194, 151));

        tablaProyectos.setBackground(new java.awt.Color(200, 200, 200));
        tablaProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Tipo", "Inicio", "Fin", "Presupuesto", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProyectos.setToolTipText("Haga doble click sobre un proyecto para mostrar toda la información");
        tablaProyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProyectosMouseClicked(evt);
            }
        });
        scrollTablaProyectos.setViewportView(tablaProyectos);
        if (tablaProyectos.getColumnModel().getColumnCount() > 0) {
            tablaProyectos.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

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
        botonModificarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarProyectoActionPerformed(evt);
            }
        });

        botonEliminarProyecto.setText("Eliminar");
        botonEliminarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarProyectoActionPerformed(evt);
            }
        });

        textCantProyectos.setText("Cantidad de proyectos: NA");

        textCantProyectosHardware.setText("+Hardware: NA");

        textCantProyectosSoftware.setText("+Software: NA");

        botonOrdenarPresupuesto.setText("Ordenar");
        botonOrdenarPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrdenarPresupuestoActionPerformed(evt);
            }
        });

        textCantProyectos1.setText("Pulse para ordenar por presupuestos:");

        javax.swing.GroupLayout subpanelPrincipalProyectosLayout = new javax.swing.GroupLayout(subpanelPrincipalProyectos);
        subpanelPrincipalProyectos.setLayout(subpanelPrincipalProyectosLayout);
        subpanelPrincipalProyectosLayout.setHorizontalGroup(
            subpanelPrincipalProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subpanelPrincipalProyectosLayout.createSequentialGroup()
                .addContainerGap(730, Short.MAX_VALUE)
                .addComponent(textCantProyectos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonOrdenarPresupuesto)
                .addContainerGap())
            .addGroup(subpanelPrincipalProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(subpanelPrincipalProyectosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(subpanelPrincipalProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(subpanelPrincipalProyectosLayout.createSequentialGroup()
                            .addComponent(botonVolverAlMenu)
                            .addGap(588, 588, 588))
                        .addComponent(scrollTablaProyectos)
                        .addGroup(subpanelPrincipalProyectosLayout.createSequentialGroup()
                            .addComponent(botonAgregarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonModificarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonEliminarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(subpanelPrincipalProyectosLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(textCantProyectos)
                            .addGap(18, 18, 18)
                            .addComponent(textCantProyectosHardware)
                            .addGap(18, 18, 18)
                            .addComponent(textCantProyectosSoftware)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        subpanelPrincipalProyectosLayout.setVerticalGroup(
            subpanelPrincipalProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subpanelPrincipalProyectosLayout.createSequentialGroup()
                .addContainerGap(499, Short.MAX_VALUE)
                .addGroup(subpanelPrincipalProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonOrdenarPresupuesto)
                    .addComponent(textCantProyectos1))
                .addGap(84, 84, 84))
            .addGroup(subpanelPrincipalProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(subpanelPrincipalProyectosLayout.createSequentialGroup()
                    .addContainerGap(145, Short.MAX_VALUE)
                    .addComponent(scrollTablaProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(subpanelPrincipalProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textCantProyectos)
                        .addComponent(textCantProyectosHardware)
                        .addComponent(textCantProyectosSoftware))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(subpanelPrincipalProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(botonAgregarProyecto)
                        .addComponent(botonModificarProyecto)
                        .addComponent(botonEliminarProyecto))
                    .addGap(19, 19, 19)
                    .addComponent(botonVolverAlMenu)
                    .addContainerGap()))
        );

        panelProyectos.add(subpanelPrincipalProyectos, "card3");

        subpanelMostrarProyecto.setBackground(new java.awt.Color(250, 194, 151));

        textPresup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textPresup.setText("Presupuesto:");

        textInicio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textInicio.setText("Fecha de inicio:");

        textFinalizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textFinalizacion.setText("F. Finalización:");

        textMostrarFechaInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textMostrarFechaInicio.setText("12/12/2024");

        textMostrarFechaFin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textMostrarFechaFin.setText("12/12/2024");

        tabMostrarIngYRecursos.setBackground(new java.awt.Color(70, 130, 180));

        tabMostrarIngenieros.setBackground(new java.awt.Color(255, 239, 190));

        jLabel29.setText("Ingenieros Asignados:");

        tablaIngAsignadosMostrarProyecto.setAutoCreateRowSorter(true);
        tablaIngAsignadosMostrarProyecto.setBackground(new java.awt.Color(200, 200, 200));
        tablaIngAsignadosMostrarProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Especialidad", "Contratacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollIngMostrarAsignados.setViewportView(tablaIngAsignadosMostrarProyecto);

        javax.swing.GroupLayout tabMostrarIngenierosLayout = new javax.swing.GroupLayout(tabMostrarIngenieros);
        tabMostrarIngenieros.setLayout(tabMostrarIngenierosLayout);
        tabMostrarIngenierosLayout.setHorizontalGroup(
            tabMostrarIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMostrarIngenierosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabMostrarIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollIngMostrarAsignados)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabMostrarIngenierosLayout.setVerticalGroup(
            tabMostrarIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabMostrarIngenierosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollIngMostrarAsignados, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabMostrarIngYRecursos.addTab("Ingenieros", tabMostrarIngenieros);

        tabMostrarRecursos.setBackground(new java.awt.Color(255, 239, 190));

        jLabel39.setBackground(new java.awt.Color(255, 239, 190));
        jLabel39.setText("Recursos Asignados:");

        tablaRecAsignadosMostrarProyecto.setBackground(new java.awt.Color(200, 200, 200));
        tablaRecAsignadosMostrarProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollMostrarRecAsignados.setViewportView(tablaRecAsignadosMostrarProyecto);

        javax.swing.GroupLayout tabMostrarRecursosLayout = new javax.swing.GroupLayout(tabMostrarRecursos);
        tabMostrarRecursos.setLayout(tabMostrarRecursosLayout);
        tabMostrarRecursosLayout.setHorizontalGroup(
            tabMostrarRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMostrarRecursosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabMostrarRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollMostrarRecAsignados)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabMostrarRecursosLayout.setVerticalGroup(
            tabMostrarRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabMostrarRecursosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollMostrarRecAsignados, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabMostrarIngYRecursos.addTab("Recursos", tabMostrarRecursos);

        botonVolverPanelPrincipalProyectos2.setText("Volver");
        botonVolverPanelPrincipalProyectos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handlerIrAlSubpanelPrincipalProyectos(evt);
            }
        });

        textMostrarTitulo.setText("Título");

        textMostrarDescripcion.setText("Descripción");

        textMostrarTipo.setText("Tipo");

        textMostrarHardSoft.setText("Hard/Soft Ware");

        textMostrarPresupuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textMostrarPresupuesto.setText("MontoPresupuesto");

        textMostrarTitulo1.setText("Título:");

        textMostrarTitulo2.setText("Descripción:");

        textMostrarTitulo3.setText("Tipo:");

        textMostrarHardSoft1.setText("Desarrollo de");

        javax.swing.GroupLayout subpanelMostrarProyectoLayout = new javax.swing.GroupLayout(subpanelMostrarProyecto);
        subpanelMostrarProyecto.setLayout(subpanelMostrarProyectoLayout);
        subpanelMostrarProyectoLayout.setHorizontalGroup(
            subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subpanelMostrarProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tabMostrarIngYRecursos)
                    .addComponent(botonVolverPanelPrincipalProyectos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, subpanelMostrarProyectoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subpanelMostrarProyectoLayout.createSequentialGroup()
                                .addComponent(textMostrarTitulo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textMostrarTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(subpanelMostrarProyectoLayout.createSequentialGroup()
                                .addComponent(textMostrarTitulo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textMostrarTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(subpanelMostrarProyectoLayout.createSequentialGroup()
                                .addGroup(subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(subpanelMostrarProyectoLayout.createSequentialGroup()
                                        .addComponent(textMostrarTitulo2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textMostrarDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(subpanelMostrarProyectoLayout.createSequentialGroup()
                                        .addComponent(textMostrarHardSoft1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textMostrarHardSoft)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFinalizacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textPresup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textMostrarFechaInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textMostrarFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textMostrarPresupuesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        subpanelMostrarProyectoLayout.setVerticalGroup(
            subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subpanelMostrarProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subpanelMostrarProyectoLayout.createSequentialGroup()
                        .addGroup(subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textMostrarTitulo)
                            .addComponent(textMostrarTitulo1))
                        .addGroup(subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subpanelMostrarProyectoLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textMostrarFechaFin)
                                    .addComponent(textFinalizacion)))
                            .addGroup(subpanelMostrarProyectoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMostrarHardSoft1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textMostrarHardSoft, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMostrarDescripcion)
                                    .addComponent(textMostrarTitulo2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textMostrarTitulo3)
                                    .addComponent(textMostrarTipo)))))
                    .addGroup(subpanelMostrarProyectoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textPresup, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textMostrarPresupuesto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subpanelMostrarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textInicio)
                            .addComponent(textMostrarFechaInicio))))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tabMostrarIngYRecursos, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVolverPanelPrincipalProyectos2)
                .addGap(18, 18, 18))
        );

        panelProyectos.add(subpanelMostrarProyecto, "card2");

        subpanelModProyecto.setBackground(new java.awt.Color(250, 194, 151));

        campoModProyectoTitulo.setText("Título del Proyecto");
        campoModProyectoTitulo.setToolTipText("Título del Proyecto");
        campoModProyectoTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handlerSeleccionarCampoTexto(evt);
            }
        });

        radioModHardware.setText("Hardware");

        radioModSoftware.setText("Software");

        campoModProyectoDescripcion.setText("Descripcion...");
        campoModProyectoDescripcion.setToolTipText("Descripcion del Proyecto");
        campoModProyectoDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handlerSeleccionarCampoTexto(evt);
            }
        });

        campoModProyectoTipo.setText("Tipo");
        campoModProyectoTipo.setToolTipText("Tipo del proyecto");
        campoModProyectoTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handlerSeleccionarCampoTexto(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Presupuesto:");

        spinnerModProyectoPresupuesto.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Fecha de inicio:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText(" Finalización:");

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Dia");

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Mes");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Año");

        spinnerModFechaInicioDia.setModel(new javax.swing.SpinnerNumberModel(12, 1, 31, 1));

        spinnerModFechaInicioMes.setModel(new javax.swing.SpinnerNumberModel(12, 1, 12, 1));
        spinnerModFechaInicioMes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handlerSeleccionarCampoTexto(evt);
            }
        });

        spinnerModFechaInicioAnio.setModel(new javax.swing.SpinnerNumberModel(2024, 1, null, 1));
        spinnerModFechaInicioAnio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Dia");

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Mes");

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Año");

        spinnerModFechaFinDia.setModel(new javax.swing.SpinnerNumberModel(12, 1, 31, 1));

        spinnerModFechaFinMes.setModel(new javax.swing.SpinnerNumberModel(12, 1, 12, 1));

        spinnerModFechaFinAnio.setModel(new javax.swing.SpinnerNumberModel(2024, 1, null, 1));

        tabModIngYRecursos.setBackground(new java.awt.Color(70, 130, 180));

        tabModIngenieros.setBackground(new java.awt.Color(255, 239, 190));

        jLabel11.setText("Ingenieros Disponibles:");

        tablaIngDisponiblesModProyecto.setBackground(new java.awt.Color(200, 200, 200));
        tablaIngDisponiblesModProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Especialidad", "Contratacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollModIngDisponibles.setViewportView(tablaIngDisponiblesModProyecto);

        botonModAgregarIng.setText("Agregar");
        botonModAgregarIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModAgregarIngActionPerformed(evt);
            }
        });

        jLabel12.setText("Ingenieros Asignados:");

        tablaIngAsignadosModProyecto.setBackground(new java.awt.Color(200, 200, 200));
        tablaIngAsignadosModProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Especialidad", "Contratacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollModIngAsignados.setViewportView(tablaIngAsignadosModProyecto);

        botonModQuitarIng.setText("Quitar");
        botonModQuitarIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModQuitarIngActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabModIngenierosLayout = new javax.swing.GroupLayout(tabModIngenieros);
        tabModIngenieros.setLayout(tabModIngenierosLayout);
        tabModIngenierosLayout.setHorizontalGroup(
            tabModIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabModIngenierosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabModIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModAgregarIng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addComponent(scrollModIngDisponibles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabModIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModQuitarIng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollModIngAsignados, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabModIngenierosLayout.setVerticalGroup(
            tabModIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabModIngenierosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(tabModIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabModIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollModIngDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(scrollModIngAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabModIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModAgregarIng)
                    .addComponent(botonModQuitarIng))
                .addContainerGap())
        );

        tabModIngYRecursos.addTab("Ingenieros", tabModIngenieros);

        tabModRecursos.setBackground(new java.awt.Color(255, 239, 190));

        jLabel37.setText("Recursos Disponibles:");

        jLabel38.setText("Recursos Asignados:");

        botonModAgregarRecurso.setText("Agregar");
        botonModAgregarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModAgregarRecursoActionPerformed(evt);
            }
        });

        botonModQuitarRecurso.setText("Quitar");
        botonModQuitarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModQuitarRecursoActionPerformed(evt);
            }
        });

        tablaRecDisponiblesModProyecto.setBackground(new java.awt.Color(200, 200, 200));
        tablaRecDisponiblesModProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollModRecDisponibles.setViewportView(tablaRecDisponiblesModProyecto);

        tablaRecAsignadosModProyecto.setBackground(new java.awt.Color(200, 200, 200));
        tablaRecAsignadosModProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollModRecAsignados.setViewportView(tablaRecAsignadosModProyecto);

        javax.swing.GroupLayout tabModRecursosLayout = new javax.swing.GroupLayout(tabModRecursos);
        tabModRecursos.setLayout(tabModRecursosLayout);
        tabModRecursosLayout.setHorizontalGroup(
            tabModRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabModRecursosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabModRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModAgregarRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabModRecursosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollModRecDisponibles))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabModRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonModQuitarRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollModRecAsignados))
                .addContainerGap())
        );

        tabModRecursosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonModAgregarRecurso, botonModQuitarRecurso});

        tabModRecursosLayout.setVerticalGroup(
            tabModRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabModRecursosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(tabModRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabModRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollModRecDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(scrollModRecAsignados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabModRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModAgregarRecurso)
                    .addComponent(botonModQuitarRecurso))
                .addContainerGap())
        );

        tabModIngYRecursos.addTab("Recursos", tabModRecursos);

        botonModProyecto.setText("Modificar Proyecto");
        botonModProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModProyectoActionPerformed(evt);
            }
        });

        botonVolverPanelPrincipalProyectos1.setText("Volver");
        botonVolverPanelPrincipalProyectos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handlerIrAlSubpanelPrincipalProyectos(evt);
            }
        });

        indiceArrayProyectos.setFont(new java.awt.Font("Segoe UI", 0, 3)); // NOI18N
        indiceArrayProyectos.setText("Indice");
        indiceArrayProyectos.setEnabled(false);

        javax.swing.GroupLayout subpanelModProyectoLayout = new javax.swing.GroupLayout(subpanelModProyecto);
        subpanelModProyecto.setLayout(subpanelModProyectoLayout);
        subpanelModProyectoLayout.setHorizontalGroup(
            subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subpanelModProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tabModIngYRecursos)
                    .addComponent(botonModProyecto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonVolverPanelPrincipalProyectos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, subpanelModProyectoLayout.createSequentialGroup()
                        .addGroup(subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subpanelModProyectoLayout.createSequentialGroup()
                                .addComponent(campoModProyectoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioModHardware)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioModSoftware)
                                .addGap(10, 10, 10))
                            .addComponent(campoModProyectoDescripcion)
                            .addComponent(campoModProyectoTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subpanelModProyectoLayout.createSequentialGroup()
                                .addGroup(subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(subpanelModProyectoLayout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))
                                    .addGroup(subpanelModProyectoLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)))
                                .addGroup(subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spinnerModFechaFinDia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spinnerModFechaInicioDia, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subpanelModProyectoLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(indiceArrayProyectos)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(subpanelModProyectoLayout.createSequentialGroup()
                                .addGroup(subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spinnerModFechaFinMes, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(spinnerModFechaInicioMes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(subpanelModProyectoLayout.createSequentialGroup()
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spinnerModFechaInicioAnio))
                                    .addGroup(subpanelModProyectoLayout.createSequentialGroup()
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spinnerModFechaFinAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(spinnerModProyectoPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        subpanelModProyectoLayout.setVerticalGroup(
            subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subpanelModProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subpanelModProyectoLayout.createSequentialGroup()
                        .addGroup(subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoModProyectoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioModHardware)
                            .addComponent(radioModSoftware)
                            .addComponent(indiceArrayProyectos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoModProyectoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoModProyectoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subpanelModProyectoLayout.createSequentialGroup()
                        .addGroup(subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerModProyectoPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerModFechaInicioAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(spinnerModFechaInicioDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerModFechaInicioMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subpanelModProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerModFechaFinAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerModFechaFinDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerModFechaFinMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jLabel10)
                            .addComponent(jLabel34))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabModIngYRecursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonModProyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVolverPanelPrincipalProyectos1)
                .addGap(18, 18, 18))
        );

        panelProyectos.add(subpanelModProyecto, "card2");

        subpanelCargarProyecto.setBackground(new java.awt.Color(250, 194, 151));

        campoProyectoTitulo.setText("Título del Proyecto");
        campoProyectoTitulo.setToolTipText("Título del Proyecto");
        campoProyectoTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handlerSeleccionarCampoTexto(evt);
            }
        });

        radioHardware.setText("Hardware");
        radioHardware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHardwareActionPerformed(evt);
            }
        });

        radioSoftware.setText("Software");
        radioSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSoftwareActionPerformed(evt);
            }
        });

        campoProyectoDescripcion.setText("Descripción...");
        campoProyectoDescripcion.setToolTipText("Descripcion del Proyecto");
        campoProyectoDescripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoProyectoDescripcionMouseClicked(evt);
            }
        });

        campoProyectoTipo.setText("Tipo de Dispositivo");
        campoProyectoTipo.setToolTipText("Tipo del proyecto");
        campoProyectoTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                handlerSeleccionarCampoTexto(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Presupuesto:");

        spinnerProyectoPresupuesto.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 1.0f));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Fecha de inicio:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("F. Finalización:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Dia");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Mes");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Año");

        spinnerFechaInicioDia.setModel(new javax.swing.SpinnerNumberModel(12, 1, 31, 1));

        spinnerFechaInicioMes.setModel(new javax.swing.SpinnerNumberModel(12, 1, 12, 1));

        spinnerFechaInicioAnio.setModel(new javax.swing.SpinnerNumberModel(2024, 1, null, 1));
        spinnerFechaInicioAnio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Dia");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Mes");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Año");

        spinnerFechaFinDia.setModel(new javax.swing.SpinnerNumberModel(12, 1, 31, 1));

        spinnerFechaFinMes.setModel(new javax.swing.SpinnerNumberModel(12, 1, 12, 1));

        spinnerFechaFinAnio.setModel(new javax.swing.SpinnerNumberModel(2024, 1, null, 1));

        tabIngYRecursos.setBackground(new java.awt.Color(70, 130, 180));

        tabIngenieros.setBackground(new java.awt.Color(255, 239, 190));

        jLabel4.setText("Ingenieros Disponibles:");

        tablaIngDisponiblesCargarProyecto.setBackground(new java.awt.Color(200, 200, 200));
        tablaIngDisponiblesCargarProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Especialidad", "Contratacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollIngDisponibles.setViewportView(tablaIngDisponiblesCargarProyecto);

        botonAgregarIng.setText("Agregar");
        botonAgregarIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarIngActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingenieros Asignados:");

        tablaIngSeleccionadosCargarProyecto.setBackground(new java.awt.Color(200, 200, 200));
        tablaIngSeleccionadosCargarProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Especialidad", "Contratacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollIngSeleccionados.setViewportView(tablaIngSeleccionadosCargarProyecto);

        botonQuitarIng.setText("Quitar");
        botonQuitarIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarIngActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabIngenierosLayout = new javax.swing.GroupLayout(tabIngenieros);
        tabIngenieros.setLayout(tabIngenierosLayout);
        tabIngenierosLayout.setHorizontalGroup(
            tabIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabIngenierosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollIngDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addComponent(botonAgregarIng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollIngSeleccionados, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addComponent(botonQuitarIng, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabIngenierosLayout.setVerticalGroup(
            tabIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabIngenierosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(tabIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollIngDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(scrollIngSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabIngenierosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarIng)
                    .addComponent(botonQuitarIng))
                .addContainerGap())
        );

        tabIngYRecursos.addTab("Ingenieros", tabIngenieros);

        tabRecursos.setBackground(new java.awt.Color(255, 239, 190));

        jLabel6.setBackground(new java.awt.Color(255, 239, 190));
        jLabel6.setText("Recursos Disponibles:");

        jLabel7.setText("Recursos Asignados:");

        botonAgregarRecurso.setText("Agregar");
        botonAgregarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarRecursoActionPerformed(evt);
            }
        });

        botonQuitarRecurso.setText("Quitar");
        botonQuitarRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarRecursoActionPerformed(evt);
            }
        });

        tablaRecDisponiblesCargarProyecto.setBackground(new java.awt.Color(200, 200, 200));
        tablaRecDisponiblesCargarProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollRecDisponibles.setViewportView(tablaRecDisponiblesCargarProyecto);

        tablaRecSeleccionadosCargarProyecto.setBackground(new java.awt.Color(200, 200, 200));
        tablaRecSeleccionadosCargarProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollRecSeleccionados.setViewportView(tablaRecSeleccionadosCargarProyecto);

        javax.swing.GroupLayout tabRecursosLayout = new javax.swing.GroupLayout(tabRecursos);
        tabRecursos.setLayout(tabRecursosLayout);
        tabRecursosLayout.setHorizontalGroup(
            tabRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRecursosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollRecDisponibles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                    .addComponent(botonAgregarRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(scrollRecSeleccionados, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addComponent(botonQuitarRecurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabRecursosLayout.setVerticalGroup(
            tabRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabRecursosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(tabRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollRecDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(scrollRecSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabRecursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarRecurso)
                    .addComponent(botonQuitarRecurso))
                .addContainerGap())
        );

        tabIngYRecursos.addTab("Recursos", tabRecursos);

        botonCargarProyecto.setText("Cargar Proyecto");
        botonCargarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarProyectoActionPerformed(evt);
            }
        });

        botonVolverPanelPrincipalProyectos.setText("Volver");
        botonVolverPanelPrincipalProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handlerIrAlSubpanelPrincipalProyectos(evt);
            }
        });

        javax.swing.GroupLayout subpanelCargarProyectoLayout = new javax.swing.GroupLayout(subpanelCargarProyecto);
        subpanelCargarProyecto.setLayout(subpanelCargarProyectoLayout);
        subpanelCargarProyectoLayout.setHorizontalGroup(
            subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subpanelCargarProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tabIngYRecursos)
                    .addComponent(botonCargarProyecto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonVolverPanelPrincipalProyectos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, subpanelCargarProyectoLayout.createSequentialGroup()
                        .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subpanelCargarProyectoLayout.createSequentialGroup()
                                .addComponent(campoProyectoTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioHardware)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioSoftware)
                                .addGap(8, 8, 8))
                            .addComponent(campoProyectoDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                            .addComponent(campoProyectoTipo))
                        .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subpanelCargarProyectoLayout.createSequentialGroup()
                                .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(subpanelCargarProyectoLayout.createSequentialGroup()
                                        .addGap(222, 222, 222)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subpanelCargarProyectoLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)))
                                .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, subpanelCargarProyectoLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(spinnerFechaFinDia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(spinnerFechaInicioDia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subpanelCargarProyectoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subpanelCargarProyectoLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(145, 145, 145)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(subpanelCargarProyectoLayout.createSequentialGroup()
                                .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spinnerFechaFinMes, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(spinnerFechaInicioMes, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(subpanelCargarProyectoLayout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spinnerFechaInicioAnio))
                                    .addGroup(subpanelCargarProyectoLayout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spinnerFechaFinAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(spinnerProyectoPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );

        subpanelCargarProyectoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {spinnerFechaInicioDia, spinnerFechaInicioMes});

        subpanelCargarProyectoLayout.setVerticalGroup(
            subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subpanelCargarProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subpanelCargarProyectoLayout.createSequentialGroup()
                        .addComponent(campoProyectoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoProyectoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoProyectoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subpanelCargarProyectoLayout.createSequentialGroup()
                        .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radioHardware)
                                .addComponent(radioSoftware))
                            .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(spinnerProyectoPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerFechaInicioAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(spinnerFechaInicioDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerFechaInicioMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(subpanelCargarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerFechaFinAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerFechaFinDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerFechaFinMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabIngYRecursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCargarProyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonVolverPanelPrincipalProyectos)
                .addGap(18, 18, 18))
        );

        spinnerProyectoPresupuesto.getAccessibleContext().setAccessibleName("");
        spinnerProyectoPresupuesto.getAccessibleContext().setAccessibleDescription("Presupuesto del proyecto");

        panelProyectos.add(subpanelCargarProyecto, "card2");

        contenedor.add(panelProyectos, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverAlMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverAlMenuActionPerformed
        textTitulo.setText("MENU PRINCIPAL");
        contenedor.removeAll();
        contenedor.add(panelMenu);
        contenedor.repaint();
        contenedor.revalidate();

        botonVolverAlMenu.setVisible(false);
    }//GEN-LAST:event_botonVolverAlMenuActionPerformed

    private void botonAgregarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProyectoActionPerformed

        // elimina filas viejas
        modeloTablaIngenierosDisp.setRowCount(0);
        modeloTablaIngenierosSeleccionados.setRowCount(0);
        modeloTablaRecursosDisponibles.setRowCount(0);
        modeloTablaRecursosSeleccionados.setRowCount(0);

        // cargar los datos disponibles en las 2 tablas 
        for (int i = 0; i < arrayIngenieros.size(); i++) {
            if (arrayIngenieros.get(i).getDisponible()) {
                modeloTablaIngenierosDisp.addRow(
                        new Object[]{
                            arrayIngenieros.get(i).getNombre(),
                            arrayIngenieros.get(i).getApellido(),
                            arrayIngenieros.get(i).getEspecialidad(),
                            arrayIngenieros.get(i).getFechaContratacion(),
                            arrayIngenieros.get(i).getMail(),
                            arrayIngenieros.get(i).getIdIngeniero(),}
                );
            }
        }
        for (int i = 0; i < arrayRecursos.size(); i++) {
            modeloTablaRecursosDisponibles.addRow(
                    new Object[]{
                        arrayRecursos.get(i).getNombre(),
                        arrayRecursos.get(i).getDescripcion(),
                        arrayRecursos.get(i).getRecursoID()
                    }
            );
        }

        radioHardware.setSelected(true);

        textTitulo.setText("CARGA PROYECTOS");

        contenedor.removeAll();
        contenedor.add(panelProyectos.add(subpanelCargarProyecto));
        contenedor.repaint();
        contenedor.revalidate();

    }//GEN-LAST:event_botonAgregarProyectoActionPerformed

    private void botonModificarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarProyectoActionPerformed

        if (tablaProyectos.getSelectedRowCount() == 0 || tablaProyectos.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un único proyecto de la tabla.", "Error", 0);
        } else {

            int filaSeleccionada = tablaProyectos.getSelectedRow(), indice = 0;
            String id = (String) tablaProyectos.getValueAt(filaSeleccionada, 6);

            for (int i = 0; i < arrayProyectos.size(); i++) {
                if (arrayProyectos.get(i).getProyectoID().equals(id)) {
                    indice = i;
                    break;
                }
            }

            ProyectoTecnologico proyecto = arrayProyectos.get(indice);

            if (arrayProyectos.get(indice).getWare().equals("Hardware")) {
                radioModHardware.setSelected(true);

            } else {
                radioModSoftware.setSelected(true);
            }

            indiceArrayProyectos.setText(String.valueOf(indice));
            textTitulo.setText("MODIFICAR PROYECTO");
            campoModProyectoTitulo.setText(proyecto.getTitulo());
            campoModProyectoDescripcion.setText(proyecto.getDescripcion());
            campoModProyectoTipo.setText(proyecto.getTipo());
            campoModProyectoTipo.setText(proyecto.getTipo());
            spinnerModProyectoPresupuesto.setValue(proyecto.getPresupuesto());
            spinnerModFechaInicioDia.setValue(proyecto.getFechaInicio().getDia());
            spinnerModFechaInicioMes.setValue(proyecto.getFechaInicio().getMes());
            spinnerModFechaInicioAnio.setValue(proyecto.getFechaInicio().getAnio());

            modeloTablaIngenierosDisp.setRowCount(0);
            modeloTablaRecursosDisponibles.setRowCount(0);
            modeloTablaIngenierosSeleccionados.setRowCount(0);
            modeloTablaRecursosSeleccionados.setRowCount(0);

            // carga tabla de ing disp && no pertenecen al proy
            for (int i = 0; i < arrayIngenieros.size(); i++) {
                if (arrayIngenieros.get(i).getDisponible()) {
                    Ingeniero ingDisponible = arrayIngenieros.get(i);

                    Boolean dentroDelProyecto = false;
                    for (int j = 0; j < ingDisponible.getIdsProyectosAsociados().length; j++) {
                        if (ingDisponible.getIdsProyectosAsociados()[j].equals(proyecto.getProyectoID())) {
                            dentroDelProyecto = true;
                        }
                    }

                    if (dentroDelProyecto == false) {
                        modeloTablaIngenierosDisp.addRow(
                                new Object[]{
                                    arrayIngenieros.get(i).getNombre(),
                                    arrayIngenieros.get(i).getApellido(),
                                    arrayIngenieros.get(i).getEspecialidad(),
                                    arrayIngenieros.get(i).getFechaContratacion(),
                                    arrayIngenieros.get(i).getMail(),
                                    arrayIngenieros.get(i).getIdIngeniero(),}
                        );
                    }

                }
            }

            // carga tabla de recursos disp && no pertenecen al proy
            for (int i = 0; i < arrayRecursos.size(); i++) {
                RecursoTecnologico recursoDisponible = arrayRecursos.get(i);
                ArrayList<RecursoTecnologico> recsAsignados = proyecto.obtenerTodosLosRecursosTecnologicos();

                // si no hay recursos cargados no aparece nada -> controlar que siempre se carguen con recursos
                for (int j = 0; j < proyecto.obtenerCantidadRecursosTecnologicos(); j++) {

                    if (!recursoDisponible.getRecursoID().equals(recsAsignados.get(j).getRecursoID())) {
                        modeloTablaRecursosDisponibles.addRow(
                                new Object[]{
                                    arrayRecursos.get(i).getNombre(),
                                    arrayRecursos.get(i).getDescripcion(),
                                    arrayRecursos.get(i).getRecursoID()
                                }
                        );
                    }
                }

            }

            // cargar tablas de los asignados
            for (int i = 0; i < proyecto.obtenerCantidadIngenieros(); i++) {
                modeloTablaIngenierosSeleccionados.addRow(
                        new Object[]{
                            proyecto.obtenerTodosLosIngenieros().get(i).getNombre(),
                            proyecto.obtenerTodosLosIngenieros().get(i).getApellido(),
                            proyecto.obtenerTodosLosIngenieros().get(i).getEspecialidad(),
                            proyecto.obtenerTodosLosIngenieros().get(i).getFechaContratacion(),
                            proyecto.obtenerTodosLosIngenieros().get(i).getMail(),
                            proyecto.obtenerTodosLosIngenieros().get(i).getIdIngeniero(),}
                );
            }
            for (int i = 0; i < proyecto.obtenerCantidadRecursosTecnologicos(); i++) {
                modeloTablaRecursosSeleccionados.addRow(
                        new Object[]{
                            proyecto.obtenerTodosLosRecursosTecnologicos().get(i).getNombre(),
                            proyecto.obtenerTodosLosRecursosTecnologicos().get(i).getDescripcion(),
                            proyecto.obtenerTodosLosRecursosTecnologicos().get(i).getRecursoID()
                        }
                );
            }

            contenedor.removeAll();
            contenedor.add(panelProyectos.add(subpanelModProyecto));
            contenedor.repaint();
            contenedor.revalidate();

        }
    }//GEN-LAST:event_botonModificarProyectoActionPerformed

    private void radioSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSoftwareActionPerformed
        campoProyectoTipo.setText("Tipo de Aplicacion");
    }//GEN-LAST:event_radioSoftwareActionPerformed

    private void radioHardwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHardwareActionPerformed
        campoProyectoTipo.setText("Tipo de Dispositivo");
    }//GEN-LAST:event_radioHardwareActionPerformed

    private void campoProyectoDescripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoProyectoDescripcionMouseClicked
        campoProyectoDescripcion.selectAll();
    }//GEN-LAST:event_campoProyectoDescripcionMouseClicked

    private void botonAgregarIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarIngActionPerformed
        if (tablaIngDisponiblesCargarProyecto.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Para asociar a un ingeniero al proyecto, seleccionelo de la tabla a su izquierda.", "Error", 0);
        } else {
            permutarFilasEntreTablas(tablaIngDisponiblesCargarProyecto, modeloTablaIngenierosDisp, modeloTablaIngenierosSeleccionados);
        }
    }//GEN-LAST:event_botonAgregarIngActionPerformed

    private void botonQuitarIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarIngActionPerformed
        if (tablaIngSeleccionadosCargarProyecto.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Para eliminar un ingeniero del proyecto, seleccionelo de la tabla a su derecha.", "Error", 0);
        } else {
            permutarFilasEntreTablas(tablaIngSeleccionadosCargarProyecto, modeloTablaIngenierosSeleccionados, modeloTablaIngenierosDisp);
        }
    }//GEN-LAST:event_botonQuitarIngActionPerformed

    private void botonAgregarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarRecursoActionPerformed
        if (tablaRecDisponiblesCargarProyecto.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Para asociar un recurso al proyecto, seleccionelo de la tabla a su izquierda.", "Error", 0);
        } else {
            permutarFilasEntreTablas(tablaRecDisponiblesCargarProyecto, modeloTablaRecursosDisponibles, modeloTablaRecursosSeleccionados);
        }
    }//GEN-LAST:event_botonAgregarRecursoActionPerformed

    private void botonQuitarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarRecursoActionPerformed
        if (tablaRecSeleccionadosCargarProyecto.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Para eliminar un recurso del proyecto, seleccionelo de la tabla a su derecha.", "Error", 0);
        } else {
            permutarFilasEntreTablas(tablaRecSeleccionadosCargarProyecto, modeloTablaRecursosSeleccionados, modeloTablaRecursosDisponibles);
        }
    }//GEN-LAST:event_botonQuitarRecursoActionPerformed

    private void botonOrdenarPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrdenarPresupuestoActionPerformed
        ordenadorTablaPresupuesto.toggleSortOrder(5);
    }//GEN-LAST:event_botonOrdenarPresupuestoActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        try {
            guardarProyectosEnArchivo(arrayProyectos, "proyectos.data");
        } catch (IOException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonCargarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarProyectoActionPerformed
        String titulo, descripcion, tipo;
        float presupuesto;
        Fecha fechaInicio, fechaFin;
        ArrayList<Ingeniero> ingenieros = new ArrayList<>();
        ArrayList<RecursoTecnologico> recursosTecnologicos = new ArrayList<>();
        ProyectoTecnologico proyecto;

        titulo = campoProyectoTitulo.getText();
        descripcion = campoProyectoDescripcion.getText();
        tipo = campoProyectoTipo.getText();

        fechaInicio = new Fecha(
                (int) spinnerFechaInicioDia.getValue(),
                (int) spinnerFechaInicioMes.getValue(),
                (int) spinnerFechaInicioAnio.getValue()
        );
        fechaFin = new Fecha(
                (int) spinnerFechaFinDia.getValue(),
                (int) spinnerFechaFinMes.getValue(),
                (int) spinnerFechaFinAnio.getValue()
        );

        presupuesto = (float) spinnerProyectoPresupuesto.getValue();

        int filas = modeloTablaIngenierosSeleccionados.getRowCount();

        for (int i = 0; i < filas; i++) {

            String idIng = (String) tablaIngSeleccionadosCargarProyecto.getValueAt(i, 5);
            for (int j = 0; j < arrayIngenieros.size(); j++) {

                if (idIng.equals(arrayIngenieros.get(j).getIdIngeniero())) {
                    ingenieros.add(arrayIngenieros.get(j));
                    break;
                }

            }

        }

        filas = modeloTablaRecursosSeleccionados.getRowCount();

        for (int i = 0; i < filas; i++) {

            String idRec = (String) tablaRecSeleccionadosCargarProyecto.getValueAt(i, 2);

            for (int j = 0; j < arrayRecursos.size(); j++) {

                if (idRec.equals(arrayRecursos.get(j).getRecursoID())) {
                    recursosTecnologicos.add(arrayRecursos.get(j));
                    break;
                }

            }

        }

        if (radioHardware.isSelected()) {
            proyecto = new DesarrolloDeHardware(titulo, tipo, descripcion, presupuesto, fechaInicio, fechaFin);
        } else {
            proyecto = new DesarrolloDeSoftware(titulo, tipo, descripcion, presupuesto, fechaInicio, fechaFin);
        }

        // para todos los ing seleccionados: se asigna la id del proy en IDProy.Asoc. (Para evitar que un ing trabaje en +3 Proy)
        String id = proyecto.getProyectoID();
        for (int i = 0; i < ingenieros.size(); i++) {
            ingenieros.get(i).reemplazarIdProyectosAsociados(id, "No Asignado");
        }

        for (Ingeniero x : ingenieros) {
            proyecto.agregarIngeniero(x);
        }
        for (RecursoTecnologico x : recursosTecnologicos) {
            proyecto.agregarRecursoTecnologico(x);
        }

        arrayProyectos.add(proyecto);

        handlerIrAlSubpanelPrincipalProyectos(evt);
    }//GEN-LAST:event_botonCargarProyectoActionPerformed

    private void botonModAgregarIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModAgregarIngActionPerformed
        if (tablaIngDisponiblesModProyecto.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Para asociar a un ingeniero al proyecto, seleccionelo de la tabla a su izquierda.", "Error", 0);
        } else {
            permutarFilasEntreTablas(tablaIngDisponiblesModProyecto, modeloTablaIngenierosDisp, modeloTablaIngenierosSeleccionados);
        }
    }//GEN-LAST:event_botonModAgregarIngActionPerformed

    private void botonModQuitarIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModQuitarIngActionPerformed
        if (tablaIngAsignadosModProyecto.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Para eliminar un ingeniero del proyecto, seleccionelo de la tabla a su derecha.", "Error", 0);
        } else {
            permutarFilasEntreTablas(tablaIngAsignadosModProyecto, modeloTablaIngenierosSeleccionados, modeloTablaIngenierosDisp);
        }
    }//GEN-LAST:event_botonModQuitarIngActionPerformed

    private void botonModAgregarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModAgregarRecursoActionPerformed
        if (tablaRecDisponiblesModProyecto.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Para asociar un recurso al proyecto, seleccionelo de la tabla a su izquierda.", "Error", 0);
        } else {
            permutarFilasEntreTablas(tablaRecDisponiblesModProyecto, modeloTablaRecursosDisponibles, modeloTablaRecursosSeleccionados);
        }
    }//GEN-LAST:event_botonModAgregarRecursoActionPerformed

    private void botonModQuitarRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModQuitarRecursoActionPerformed
        if (tablaRecAsignadosModProyecto.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Para eliminar un recurso del proyecto, seleccionelo de la tabla a su derecha.", "Error", 0);
        } else {
            permutarFilasEntreTablas(tablaRecAsignadosModProyecto, modeloTablaRecursosSeleccionados, modeloTablaRecursosDisponibles);
        }
    }//GEN-LAST:event_botonModQuitarRecursoActionPerformed

    private void botonModProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModProyectoActionPerformed

        // Confirmar
        String[] opciones = {"Si", "No"};
        int confirmacion = JOptionPane.showOptionDialog(
                null,
                "Esta seguro de guardar los cambios?",
                "Confirmar Modificacion",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[1]
        );

        if (confirmacion == 0) {
            int indice = Integer.parseInt(indiceArrayProyectos.getText());

            String titulo, descripcion, tipo, ware;
            int dia, mes, anio;
            float presupuesto;

            titulo = campoModProyectoTitulo.getText();
            descripcion = campoModProyectoDescripcion.getText();
            tipo = campoModProyectoTipo.getText();

            dia = (int) spinnerModFechaInicioDia.getValue();
            mes = (int) spinnerModFechaInicioMes.getValue();
            anio = (int) spinnerModFechaInicioAnio.getValue();
            Fecha inicio = new Fecha(dia, mes, anio);

            dia = (int) spinnerModFechaFinDia.getValue();
            mes = (int) spinnerModFechaFinMes.getValue();
            anio = (int) spinnerModFechaFinAnio.getValue();
            Fecha fin = new Fecha(dia, mes, anio);

            presupuesto = (float) spinnerModProyectoPresupuesto.getValue();

            ProyectoTecnologico proyectoMod;
            if (radioModHardware.isSelected()) {
                proyectoMod = new DesarrolloDeHardware(titulo, tipo, descripcion, presupuesto, inicio, fin);
            } else {
                proyectoMod = new DesarrolloDeSoftware(titulo, tipo, descripcion, presupuesto, inicio, fin);
            }

            int filas = modeloTablaIngenierosSeleccionados.getRowCount();
            ArrayList<Ingeniero> ingenierosMod = new ArrayList<>();
            for (int i = 0; i < filas; i++) {

                String idIng = (String) tablaIngSeleccionadosCargarProyecto.getValueAt(i, 5);
                for (int j = 0; j < arrayIngenieros.size(); j++) {

                    if (idIng.equals(arrayIngenieros.get(j).getIdIngeniero())) {
                        ingenierosMod.add(arrayIngenieros.get(j));
                        break;
                    }

                }

            }

            filas = modeloTablaRecursosSeleccionados.getRowCount();
            ArrayList<RecursoTecnologico> recursosMod = new ArrayList<>();
            for (int i = 0; i < filas; i++) {

                String idRec = (String) tablaRecSeleccionadosCargarProyecto.getValueAt(i, 2);

                for (int j = 0; j < arrayRecursos.size(); j++) {

                    if (idRec.equals(arrayRecursos.get(j).getRecursoID())) {
                        recursosMod.add(arrayRecursos.get(j));
                        break;
                    }

                }

            }

            String id = proyectoMod.getProyectoID();
            for (int i = 0; i < ingenierosMod.size(); i++) {
                ingenierosMod.get(i).reemplazarIdProyectosAsociados(id, "No Asignado");
            }

            for (Ingeniero x : ingenierosMod) {
                proyectoMod.agregarIngeniero(x);
            }
            for (RecursoTecnologico x : recursosMod) {
                proyectoMod.agregarRecursoTecnologico(x);
            }

            arrayProyectos.set(indice, proyectoMod);

            System.out.print("listo: " + arrayProyectos.get(indice).toString());
            System.out.print("\npepe: " + arrayProyectos.get(indice).getWare());
            handlerIrAlSubpanelPrincipalProyectos(evt);

        }
    }//GEN-LAST:event_botonModProyectoActionPerformed

    private void handlerIrAlSubpanelPrincipalProyectos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_handlerIrAlSubpanelPrincipalProyectos
        botonVolverAlMenu.setVisible(true);

        modeloTablaProyectos.setRowCount(0);

        for (int i = 0; i < arrayProyectos.size(); i++) {

            modeloTablaProyectos.addRow(
                    new Object[]{
                        arrayProyectos.get(i).getTitulo(),
                        arrayProyectos.get(i).getTipo(),
                        arrayProyectos.get(i).getDescripcion(),
                        arrayProyectos.get(i).getFechaInicio(),
                        arrayProyectos.get(i).getFechaFin(),
                        arrayProyectos.get(i).getPresupuesto(),
                        arrayProyectos.get(i).getProyectoID()
                    }
            );

        }
        textTitulo.setText("PROYECTOS");
        textCantProyectos.setText("Cantidad de proyectos: " + modeloTablaProyectos.getRowCount());
        textCantProyectosHardware.setText("+Hardware: " + DesarrolloDeHardware.getCantidadProyHardware());
        textCantProyectosSoftware.setText("+Software: " + DesarrolloDeSoftware.getCantidadProySoftware());

        contenedor.removeAll();
        contenedor.add(panelProyectos.add(subpanelPrincipalProyectos));
        contenedor.repaint();
        contenedor.revalidate();
    }//GEN-LAST:event_handlerIrAlSubpanelPrincipalProyectos

    private void tablaProyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProyectosMouseClicked
        if (evt.getClickCount() >= 2) {

            int filaSeleccionada = tablaProyectos.convertRowIndexToModel(tablaProyectos.getSelectedRow());

            String idProyectoSeleccionado = (String) modeloTablaProyectos.getValueAt(filaSeleccionada, 6);
            ProyectoTecnologico ProyectoAMostrar;

            for (int i = 0; i < arrayProyectos.size(); i++) {
                if (idProyectoSeleccionado.equals(arrayProyectos.get(i).getProyectoID())) {
                    ProyectoAMostrar = arrayProyectos.get(i);

                    textMostrarTitulo.setText(ProyectoAMostrar.getTitulo());
                    textMostrarHardSoft.setText(ProyectoAMostrar.getWare());
                    textMostrarDescripcion.setText(ProyectoAMostrar.getDescripcion());
                    textMostrarTipo.setText(ProyectoAMostrar.getTipo());
                    textMostrarPresupuesto.setText(String.valueOf(ProyectoAMostrar.getPresupuesto()));
                    textMostrarFechaInicio.setText(ProyectoAMostrar.getFechaInicio().toString());
                    textMostrarFechaFin.setText(ProyectoAMostrar.getFechaFin().toString());

                    modeloTablaIngenierosSeleccionados.setRowCount(0);

                    for (int j = 0; j < ProyectoAMostrar.obtenerCantidadIngenieros(); j++) {
                        Ingeniero ing = ProyectoAMostrar.obtenerTodosLosIngenieros().get(j);
                        modeloTablaIngenierosSeleccionados.addRow(
                                new Object[]{
                                    ing.getNombre(),
                                    ing.getApellido(),
                                    ing.getEspecialidad(),
                                    ing.getFechaContratacion(),
                                    ing.getMail(),
                                    ing.getIdIngeniero()
                                }
                        );
                    }

                    modeloTablaRecursosSeleccionados.setRowCount(0);

                    for (int j = 0; j < ProyectoAMostrar.obtenerCantidadRecursosTecnologicos(); j++) {
                        RecursoTecnologico rec = ProyectoAMostrar.obtenerTodosLosRecursosTecnologicos().get(j);
                        modeloTablaRecursosSeleccionados.addRow(
                                new Object[]{
                                    rec.getNombre(),
                                    rec.getDescripcion(),
                                    rec.getDescripcion(),}
                        );
                    }

                    textTitulo.setText("VER PROYECTO");
                    contenedor.removeAll();
                    contenedor.add(subpanelMostrarProyecto);
                    contenedor.repaint();
                    contenedor.revalidate();

                    break;
                }
            }

        }
    }//GEN-LAST:event_tablaProyectosMouseClicked

    private void botonEliminarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarProyectoActionPerformed
        if (tablaProyectos.getSelectedRowCount() == 0 || tablaProyectos.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un único proyecto de la tabla.", "Error", 0);
        } else {

            String[] opciones = {"Si", "No"};
            int confirmacion = JOptionPane.showOptionDialog(
                    null,
                    "Esta seguro de eliminar el proyecto?",
                    "Confirmar Eliminación",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    opciones,
                    opciones[1]
            );

            int filaSeleccionada = tablaProyectos.getSelectedRow(), indice = 0;
            String id = (String) tablaProyectos.getValueAt(filaSeleccionada, 6);

            for (int i = 0; i < arrayProyectos.size(); i++) {
                if (arrayProyectos.get(i).getProyectoID().equals(id)) {
                    indice = i;
                    break;
                }
            }

            for (int i = 0; i < arrayProyectos.get(indice).obtenerCantidadIngenieros(); i++) {
                arrayProyectos.get(indice).obtenerTodosLosIngenieros().get(i).reemplazarIdProyectosAsociados("No Asignado", id);
            }

            if (arrayProyectos.get(indice).getWare().equals("Hardware")) {
                DesarrolloDeHardware.disminuirCantidadProyectosHardware();
            } else {
                DesarrolloDeSoftware.disminuirCantidadProyectosSoftware();
            }

            arrayProyectos.remove(indice);

            handlerIrAlSubpanelPrincipalProyectos(evt);

        }
    }//GEN-LAST:event_botonEliminarProyectoActionPerformed

    // solo para jTextField
    private void handlerSeleccionarCampoTexto(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_handlerSeleccionarCampoTexto
        ((javax.swing.JTextField) evt.getSource()).selectAll();
    }//GEN-LAST:event_handlerSeleccionarCampoTexto

    // permuta las filas seleccionadas de A a la tabla B (deben tener las mismas columnas)
    private void permutarFilasEntreTablas(javax.swing.JTable tablaA, DefaultTableModel modeloTablaA, DefaultTableModel modeloTablaB) {
        int[] indicesFilas = tablaA.getSelectedRows();
        int columnas = tablaA.getColumnCount();

        Object[] contenido = new Object[columnas];

        for (int i = 0; i < indicesFilas.length; i++) {

            for (int j = 0; j < columnas; j++) {
                contenido[j] = modeloTablaA.getValueAt(indicesFilas[i], j);
            }

            modeloTablaB.addRow(contenido);
        }

        modeloTablaA.removeRow(indicesFilas[0]);
        for (int i = 1; i < indicesFilas.length; i++) {
            modeloTablaA.removeRow(indicesFilas[i] - i);
        }

    }

    public static ArrayList<ProyectoTecnologico> cargarProyectosDesdeArchivo(String nombreArchivo) throws IOException {
        ArrayList<ProyectoTecnologico> proyectos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            ProyectoTecnologico proyecto = null;
            while ((linea = reader.readLine()) != null) {
                linea = linea.trim(); // Eliminar espacios en blanco
                if (linea.startsWith("proyecto de hardware")) {
                    proyecto = new DesarrolloDeHardware();
                } else if (linea.startsWith("proyecto de software")) {
                    proyecto = new DesarrolloDeSoftware();
                } else if (linea.startsWith("tipo: ")) {
                    if (proyecto instanceof DesarrolloDeHardware) {
                        ((DesarrolloDeHardware) proyecto).setTipoDispositivo(linea.substring(6).trim());
                    } else if (proyecto instanceof DesarrolloDeSoftware) {
                        ((DesarrolloDeSoftware) proyecto).setTipoAplicacion(linea.substring(6).trim());
                    }
                } else if (linea.startsWith("ID: ")) {
                    proyecto.setProyectoID(linea.substring(4).trim());
                } else if (linea.startsWith("titulo: ")) {
                    proyecto.setTitulo(linea.substring(8).trim());
                } else if (linea.startsWith("descripcion: ")) {
                    proyecto.setDescripcion(linea.substring(13).trim());
                } else if (linea.startsWith("presupuesto: ")) {
                    proyecto.setPresupuesto(Float.parseFloat(linea.substring(13).trim()));
                } else if (linea.startsWith("fecha de inicio: ")) {
                    String[] fecha = linea.substring(17).split("/");
                    proyecto.setFechaInicio(new Fecha(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2])));
                } else if (linea.startsWith("fecha de entrega: ")) {
                    String[] fecha = linea.substring(18).split("/");
                    proyecto.setFechaFin(new Fecha(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2])));
                } else if (linea.startsWith("ingenieros:")) {
                    while (!(linea = reader.readLine().trim()).startsWith("recursos tecnologicos:")) {
                        if (linea.startsWith("nombre: ")) {
                            // hay que leer el id del ingeniero, buscarlo del arrayingenieros, 
                            // agregarlo a este proy y llamar a la funcion reemplazarIdProyectosAsociados
                            // para no que no haya ing trabajando en +3 proy
                            /* 
                            Ingeniero ingeniero = new Ingeniero();
                            ingeniero.setNombre(linea.substring(9).trim());
                            ingeniero.setApellido(reader.readLine().substring(10).trim());
                            ingeniero.setMail(reader.readLine().substring(6).trim());
                            ingeniero.setEspecialidad(reader.readLine().substring(13).trim());
                            String[] fechaContratacion = reader.readLine().substring(21).split("/");
                            ingeniero.setFechaContratacion(new Fecha(Integer.parseInt(fechaContratacion[0]), Integer.parseInt(fechaContratacion[1]), Integer.parseInt(fechaContratacion[2])));
                            ingeniero.setIdsProyectosAsociados(reader.readLine().substring(19).split(", "));
                            proyecto.agregarIngeniero(ingeniero);
                            */
                        }
                    }
                } else if (linea.startsWith("recursos tecnologicos:")) {
                    // hay que leer el id del recurso, buscarlo del arrayrecursos
                    // y agregarlo a este proy
                    
                    /*
                    while (!(linea = reader.readLine().trim()).startsWith("//fin")) {
                        if (linea.startsWith("nombre: ")) {
                            RecursoTecnologico recurso = new RecursoTecnologico();
                            recurso.setNombre(linea.substring(9).trim());
                            recurso.setDescripcion(reader.readLine().substring(13).trim());
                            proyecto.agregarRecursoTecnologico(recurso);
                        }
                    }
                    proyectos.add(proyecto);
                    */
                }
            }
        }
        return proyectos;
    }

    public static ArrayList<RecursoTecnologico> cargarRecursosDesdeArchivo(String archivo) {
        ArrayList<RecursoTecnologico> arrayRecursos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String line;
            String nombre = null;
            String descripcion = null;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("nombre: ")) {
                    nombre = line.substring(8).trim();
                } else if (line.startsWith("descripcion: ")) {
                    descripcion = line.substring(13).trim();
                }

                // Si ambos nombre y descripcion están definidos, crea un nuevo RecursoTecnologico
                if (nombre != null && descripcion != null) {
                    arrayRecursos.add(new RecursoTecnologico(nombre, descripcion));
                    nombre = null; // Resetea nombre y descripcion para el siguiente recurso
                    descripcion = null;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayRecursos;
    }

    public static ArrayList<Ingeniero> cargarIngenierosDesdeArchivo(String archivo) {
        ArrayList<Ingeniero> ingenieros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty() || linea.startsWith("#")) {
                    continue; // Ignorar líneas vacías o comentarios
                }
                String[] datos = linea.split(","); // Asume que los datos están separados por comas
                if (datos.length == 5) {
                    String nombre = datos[0].trim();
                    String apellido = datos[1].trim();
                    String email = datos[2].trim();
                    String especialidad = datos[3].trim();
                    String fechaContratacionStr = datos[4].trim();

                    // Convierte el String de fecha a un objeto de tipo Fecha
                    Fecha fechaContratacion = Fecha.parseFecha(fechaContratacionStr); // tener este método en clase Fecha

                    // Crear el objeto Ingeniero y añadirlo a la lista
                    Ingeniero ingeniero = new Ingeniero(nombre, apellido, email, especialidad, fechaContratacion);
                    ingenieros.add(ingeniero);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ingenieros;
    }

    public void guardarProyectosEnArchivo(ArrayList<ProyectoTecnologico> proyectos, String nombreArchivo) throws IOException {
        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            for (ProyectoTecnologico proyecto : proyectos) {
                if (proyecto instanceof DesarrolloDeHardware) {
                    writer.write("proyecto de hardware\n");
                    writer.write("tipo: " + ((DesarrolloDeHardware) proyecto).getTipoDispositivo() + "\n");
                } else if (proyecto instanceof DesarrolloDeSoftware) {
                    writer.write("proyecto de software\n");
                    writer.write("tipo: " + ((DesarrolloDeSoftware) proyecto).getTipoAplicacion() + "\n");
                }
                writer.write("ID: " + proyecto.getProyectoID() + "\n");
                writer.write("titulo: " + proyecto.getTitulo() + "\n");
                writer.write("descripcion: " + proyecto.getDescripcion() + "\n");
                writer.write("presupuesto: " + proyecto.getPresupuesto() + "\n");
                writer.write("fecha de inicio: " + proyecto.getFechaInicio() + "\n");
                writer.write("fecha de entrega: " + proyecto.getFechaFin() + "\n");
                writer.write("ingenieros:\n");
                for (Ingeniero ingeniero : proyecto.obtenerTodosLosIngenieros()) {
                    writer.write("\tnombre: " + ingeniero.getNombre() + "\n");
                    writer.write("\tapellido: " + ingeniero.getApellido() + "\n");
                    writer.write("\tmail: " + ingeniero.getMail() + "\n");
                    writer.write("\tespecialidad: " + ingeniero.getEspecialidad() + "\n");
                    writer.write("\tfecha de contratacion: " + ingeniero.getFechaContratacion() + "\n");
                    writer.write("\tproyectos asignados: " + String.join(", ", ingeniero.getIdsProyectosAsociados()) + "\n");
                }
                writer.write("recursos tecnologicos:\n");
                for (RecursoTecnologico recurso : proyecto.obtenerTodosLosRecursosTecnologicos()) {
                    writer.write("\tnombre: " + recurso.getNombre() + "\n");
                    writer.write("\tdescripcion: " + recurso.getDescripcion() + "\n");
                }
                writer.write("//fin\n");
            }
            writer.close();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        arrayIngenieros = cargarIngenierosDesdeArchivo("datos/ingenieros.datos");
        arrayRecursos = cargarRecursosDesdeArchivo("datos/recursos.datos");
        //arrayProyectos = cargarProyectosDesdeArchivo("datos/proyectos.datos");
        
        arrayProyectos = new ArrayList<>();

        arrayProyectos.add(new DesarrolloDeSoftware("Instagram", "Red Social", "la de las fotos y las trolas", (float) 1000000, new Fecha(12, 12, 2009), new Fecha()));
        arrayProyectos.add(new DesarrolloDeHardware("Nokia 1100", "Telefono Celular", "Duro durito", (float) 1800200, new Fecha(12, 12, 2000), new Fecha(2, 12, 2005)));

        arrayProyectos.add(new DesarrolloDeSoftware("Facebook", "Red Social", "La vamos a re pegar negritooo", (float) 1000, new Fecha(12, 12, 2000), new Fecha()));

        //Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI(arrayIngenieros, arrayProyectos, arrayRecursos).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarIng;
    private javax.swing.JButton botonAgregarProyecto;
    private javax.swing.JButton botonAgregarRecurso;
    private javax.swing.JButton botonCargarProyecto;
    private javax.swing.JButton botonEliminarProyecto;
    private javax.swing.JButton botonIngenieros;
    private javax.swing.JButton botonModAgregarIng;
    private javax.swing.JButton botonModAgregarRecurso;
    private javax.swing.JButton botonModProyecto;
    private javax.swing.JButton botonModQuitarIng;
    private javax.swing.JButton botonModQuitarRecurso;
    private javax.swing.JButton botonModificarProyecto;
    private javax.swing.JButton botonOrdenarPresupuesto;
    private javax.swing.JButton botonProyectos;
    private javax.swing.JButton botonQuitarIng;
    private javax.swing.JButton botonQuitarRecurso;
    private javax.swing.JButton botonRecursos;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVolverAlMenu;
    private javax.swing.JButton botonVolverPanelPrincipalProyectos;
    private javax.swing.JButton botonVolverPanelPrincipalProyectos1;
    private javax.swing.JButton botonVolverPanelPrincipalProyectos2;
    private javax.swing.ButtonGroup buttonGroupModWare;
    private javax.swing.ButtonGroup buttonGroupTipoProyecto;
    private javax.swing.JTextField campoModProyectoDescripcion;
    private javax.swing.JTextField campoModProyectoTipo;
    private javax.swing.JTextField campoModProyectoTitulo;
    private javax.swing.JTextField campoProyectoDescripcion;
    private javax.swing.JTextField campoProyectoTipo;
    private javax.swing.JTextField campoProyectoTitulo;
    private javax.swing.JPanel contenedor;
    private javax.swing.JPanel contenedorTitulo;
    private javax.swing.JLabel indiceArrayProyectos;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelProyectos;
    private javax.swing.JRadioButton radioHardware;
    private javax.swing.JRadioButton radioModHardware;
    private javax.swing.JRadioButton radioModSoftware;
    private javax.swing.JRadioButton radioSoftware;
    private javax.swing.JScrollPane scrollIngDisponibles;
    private javax.swing.JScrollPane scrollIngMostrarAsignados;
    private javax.swing.JScrollPane scrollIngSeleccionados;
    private javax.swing.JScrollPane scrollModIngAsignados;
    private javax.swing.JScrollPane scrollModIngDisponibles;
    private javax.swing.JScrollPane scrollModRecAsignados;
    private javax.swing.JScrollPane scrollModRecDisponibles;
    private javax.swing.JScrollPane scrollMostrarRecAsignados;
    private javax.swing.JScrollPane scrollRecDisponibles;
    private javax.swing.JScrollPane scrollRecSeleccionados;
    private javax.swing.JScrollPane scrollTablaProyectos;
    private javax.swing.JSpinner spinnerFechaFinAnio;
    private javax.swing.JSpinner spinnerFechaFinDia;
    private javax.swing.JSpinner spinnerFechaFinMes;
    private javax.swing.JSpinner spinnerFechaInicioAnio;
    private javax.swing.JSpinner spinnerFechaInicioDia;
    private javax.swing.JSpinner spinnerFechaInicioMes;
    private javax.swing.JSpinner spinnerModFechaFinAnio;
    private javax.swing.JSpinner spinnerModFechaFinDia;
    private javax.swing.JSpinner spinnerModFechaFinMes;
    private javax.swing.JSpinner spinnerModFechaInicioAnio;
    private javax.swing.JSpinner spinnerModFechaInicioDia;
    private javax.swing.JSpinner spinnerModFechaInicioMes;
    private javax.swing.JSpinner spinnerModProyectoPresupuesto;
    private javax.swing.JSpinner spinnerProyectoPresupuesto;
    private javax.swing.JPanel subpanelCargarProyecto;
    private javax.swing.JPanel subpanelModProyecto;
    private javax.swing.JPanel subpanelMostrarProyecto;
    private javax.swing.JPanel subpanelPrincipalProyectos;
    private javax.swing.JTabbedPane tabIngYRecursos;
    private javax.swing.JPanel tabIngenieros;
    private javax.swing.JTabbedPane tabModIngYRecursos;
    private javax.swing.JPanel tabModIngenieros;
    private javax.swing.JPanel tabModRecursos;
    private javax.swing.JTabbedPane tabMostrarIngYRecursos;
    private javax.swing.JPanel tabMostrarIngenieros;
    private javax.swing.JPanel tabMostrarRecursos;
    private javax.swing.JPanel tabRecursos;
    private javax.swing.JTable tablaIngAsignadosModProyecto;
    private javax.swing.JTable tablaIngAsignadosMostrarProyecto;
    private javax.swing.JTable tablaIngDisponiblesCargarProyecto;
    private javax.swing.JTable tablaIngDisponiblesModProyecto;
    private javax.swing.JTable tablaIngSeleccionadosCargarProyecto;
    private javax.swing.JTable tablaProyectos;
    private javax.swing.JTable tablaRecAsignadosModProyecto;
    private javax.swing.JTable tablaRecAsignadosMostrarProyecto;
    private javax.swing.JTable tablaRecDisponiblesCargarProyecto;
    private javax.swing.JTable tablaRecDisponiblesModProyecto;
    private javax.swing.JTable tablaRecSeleccionadosCargarProyecto;
    private javax.swing.JLabel textCantProyectos;
    private javax.swing.JLabel textCantProyectos1;
    private javax.swing.JLabel textCantProyectosHardware;
    private javax.swing.JLabel textCantProyectosSoftware;
    private javax.swing.JLabel textFinalizacion;
    private javax.swing.JLabel textInicio;
    private javax.swing.JLabel textMostrarDescripcion;
    private javax.swing.JLabel textMostrarFechaFin;
    private javax.swing.JLabel textMostrarFechaInicio;
    private javax.swing.JLabel textMostrarHardSoft;
    private javax.swing.JLabel textMostrarHardSoft1;
    private javax.swing.JLabel textMostrarPresupuesto;
    private javax.swing.JLabel textMostrarTipo;
    private javax.swing.JLabel textMostrarTitulo;
    private javax.swing.JLabel textMostrarTitulo1;
    private javax.swing.JLabel textMostrarTitulo2;
    private javax.swing.JLabel textMostrarTitulo3;
    private javax.swing.JLabel textPresup;
    private javax.swing.JLabel textTitulo;
    // End of variables declaration//GEN-END:variables
}

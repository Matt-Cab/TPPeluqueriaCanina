package igu;

import javax.swing.JOptionPane;
import logica.Controladora;

/**
 *
 * @author Matias Cabrera
 */
public class IGUPeluqueriaCanina extends javax.swing.JFrame {
    Controladora control;

    public IGUPeluqueriaCanina(Controladora control) {
        initComponents();
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelContenedorTitulo = new javax.swing.JPanel();
        labelTituloPrincipal = new javax.swing.JLabel();
        jPanelContenedorInputs = new javax.swing.JPanel();
        jPanelContenedorNroCliente = new javax.swing.JPanel();
        labelNroCliente = new javax.swing.JLabel();
        txtNroCliente = new javax.swing.JTextField();
        jPanelContenedorNombrePerro = new javax.swing.JPanel();
        labelNombrePerro = new javax.swing.JLabel();
        txtNombrePerro = new javax.swing.JTextField();
        jPanelContenedorRaza = new javax.swing.JPanel();
        labelRaza = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        jPanelContenedorColor = new javax.swing.JPanel();
        labelColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jPanelContenedorEsAlergico = new javax.swing.JPanel();
        labelEsAlergico = new javax.swing.JLabel();
        cmbEsAlergico = new javax.swing.JComboBox<>();
        jPanelContenedorNecesitaAtencionEspecial = new javax.swing.JPanel();
        labelNecesitaAtencionEspecial = new javax.swing.JLabel();
        cmbNecesitaAtencionEspecial = new javax.swing.JComboBox<>();
        jPanelContenedorNombreDuenio = new javax.swing.JPanel();
        labelNombreDuenio = new javax.swing.JLabel();
        txtNombreDuenio = new javax.swing.JTextField();
        jPanelContenedorCelDuenio = new javax.swing.JPanel();
        labelCelDuenio = new javax.swing.JLabel();
        txtCelDuenio = new javax.swing.JTextField();
        jPanelContenedorObservaciones = new javax.swing.JPanel();
        labelObservaciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaObservaciones = new javax.swing.JTextArea();
        jPanelContenedorImagen = new javax.swing.JPanel();
        imgPerro = new javax.swing.JLabel();
        jPanelContenedorBtnsLimpiezaGuardado = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("../img/icon_dog.png")).getImage());

        labelTituloPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelTituloPrincipal.setText("Peluquería Canina");

        javax.swing.GroupLayout jPanelContenedorTituloLayout = new javax.swing.GroupLayout(jPanelContenedorTitulo);
        jPanelContenedorTitulo.setLayout(jPanelContenedorTituloLayout);
        jPanelContenedorTituloLayout.setHorizontalGroup(
            jPanelContenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelContenedorTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTituloPrincipal)
                .addGap(219, 219, 219))
        );
        jPanelContenedorTituloLayout.setVerticalGroup(
            jPanelContenedorTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTituloPrincipal)
                .addGap(22, 22, 22))
        );

        jPanelContenedorInputs.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelNroCliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNroCliente.setText("Cliente Nro:");

        javax.swing.GroupLayout jPanelContenedorNroClienteLayout = new javax.swing.GroupLayout(jPanelContenedorNroCliente);
        jPanelContenedorNroCliente.setLayout(jPanelContenedorNroClienteLayout);
        jPanelContenedorNroClienteLayout.setHorizontalGroup(
            jPanelContenedorNroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorNroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNroCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelContenedorNroClienteLayout.setVerticalGroup(
            jPanelContenedorNroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorNroClienteLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelContenedorNroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNroCliente)
                    .addComponent(txtNroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelNombrePerro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNombrePerro.setText("Nombre:");

        javax.swing.GroupLayout jPanelContenedorNombrePerroLayout = new javax.swing.GroupLayout(jPanelContenedorNombrePerro);
        jPanelContenedorNombrePerro.setLayout(jPanelContenedorNombrePerroLayout);
        jPanelContenedorNombrePerroLayout.setHorizontalGroup(
            jPanelContenedorNombrePerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorNombrePerroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNombrePerro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombrePerro, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelContenedorNombrePerroLayout.setVerticalGroup(
            jPanelContenedorNombrePerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorNombrePerroLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelContenedorNombrePerroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombrePerro)
                    .addComponent(txtNombrePerro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelRaza.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelRaza.setText("Raza:");

        javax.swing.GroupLayout jPanelContenedorRazaLayout = new javax.swing.GroupLayout(jPanelContenedorRaza);
        jPanelContenedorRaza.setLayout(jPanelContenedorRazaLayout);
        jPanelContenedorRazaLayout.setHorizontalGroup(
            jPanelContenedorRazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorRazaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRaza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelContenedorRazaLayout.setVerticalGroup(
            jPanelContenedorRazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorRazaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelContenedorRazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRaza)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelColor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelColor.setText("Color:");

        javax.swing.GroupLayout jPanelContenedorColorLayout = new javax.swing.GroupLayout(jPanelContenedorColor);
        jPanelContenedorColor.setLayout(jPanelContenedorColorLayout);
        jPanelContenedorColorLayout.setHorizontalGroup(
            jPanelContenedorColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorColorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelColor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelContenedorColorLayout.setVerticalGroup(
            jPanelContenedorColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorColorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelContenedorColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelEsAlergico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEsAlergico.setText("Alérgico:");

        cmbEsAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        javax.swing.GroupLayout jPanelContenedorEsAlergicoLayout = new javax.swing.GroupLayout(jPanelContenedorEsAlergico);
        jPanelContenedorEsAlergico.setLayout(jPanelContenedorEsAlergicoLayout);
        jPanelContenedorEsAlergicoLayout.setHorizontalGroup(
            jPanelContenedorEsAlergicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorEsAlergicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEsAlergico)
                .addGap(76, 76, 76)
                .addComponent(cmbEsAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelContenedorEsAlergicoLayout.setVerticalGroup(
            jPanelContenedorEsAlergicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorEsAlergicoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelContenedorEsAlergicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEsAlergico)
                    .addComponent(cmbEsAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        labelNecesitaAtencionEspecial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNecesitaAtencionEspecial.setText("Atención Especial:");

        cmbNecesitaAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        javax.swing.GroupLayout jPanelContenedorNecesitaAtencionEspecialLayout = new javax.swing.GroupLayout(jPanelContenedorNecesitaAtencionEspecial);
        jPanelContenedorNecesitaAtencionEspecial.setLayout(jPanelContenedorNecesitaAtencionEspecialLayout);
        jPanelContenedorNecesitaAtencionEspecialLayout.setHorizontalGroup(
            jPanelContenedorNecesitaAtencionEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorNecesitaAtencionEspecialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNecesitaAtencionEspecial)
                .addGap(18, 18, 18)
                .addComponent(cmbNecesitaAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelContenedorNecesitaAtencionEspecialLayout.setVerticalGroup(
            jPanelContenedorNecesitaAtencionEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorNecesitaAtencionEspecialLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelContenedorNecesitaAtencionEspecialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNecesitaAtencionEspecial)
                    .addComponent(cmbNecesitaAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        labelNombreDuenio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNombreDuenio.setText("Nombre Dueño:");

        javax.swing.GroupLayout jPanelContenedorNombreDuenioLayout = new javax.swing.GroupLayout(jPanelContenedorNombreDuenio);
        jPanelContenedorNombreDuenio.setLayout(jPanelContenedorNombreDuenioLayout);
        jPanelContenedorNombreDuenioLayout.setHorizontalGroup(
            jPanelContenedorNombreDuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorNombreDuenioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNombreDuenio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreDuenio))
        );
        jPanelContenedorNombreDuenioLayout.setVerticalGroup(
            jPanelContenedorNombreDuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorNombreDuenioLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelContenedorNombreDuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreDuenio)
                    .addComponent(txtNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelCelDuenio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelCelDuenio.setText("Cel. Dueño:");

        javax.swing.GroupLayout jPanelContenedorCelDuenioLayout = new javax.swing.GroupLayout(jPanelContenedorCelDuenio);
        jPanelContenedorCelDuenio.setLayout(jPanelContenedorCelDuenioLayout);
        jPanelContenedorCelDuenioLayout.setHorizontalGroup(
            jPanelContenedorCelDuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorCelDuenioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCelDuenio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelContenedorCelDuenioLayout.setVerticalGroup(
            jPanelContenedorCelDuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorCelDuenioLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelContenedorCelDuenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCelDuenio)
                    .addComponent(txtCelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        labelObservaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelObservaciones.setText("Observaciones:");

        txtAreaObservaciones.setColumns(20);
        txtAreaObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtAreaObservaciones);

        javax.swing.GroupLayout jPanelContenedorObservacionesLayout = new javax.swing.GroupLayout(jPanelContenedorObservaciones);
        jPanelContenedorObservaciones.setLayout(jPanelContenedorObservacionesLayout);
        jPanelContenedorObservacionesLayout.setHorizontalGroup(
            jPanelContenedorObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorObservacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelObservaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
        );
        jPanelContenedorObservacionesLayout.setVerticalGroup(
            jPanelContenedorObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorObservacionesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanelContenedorObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelObservaciones)))
        );

        javax.swing.GroupLayout jPanelContenedorInputsLayout = new javax.swing.GroupLayout(jPanelContenedorInputs);
        jPanelContenedorInputs.setLayout(jPanelContenedorInputsLayout);
        jPanelContenedorInputsLayout.setHorizontalGroup(
            jPanelContenedorInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorInputsLayout.createSequentialGroup()
                .addGroup(jPanelContenedorInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelContenedorNroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContenedorNombrePerro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContenedorRaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContenedorColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContenedorEsAlergico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContenedorNecesitaAtencionEspecial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContenedorNombreDuenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContenedorCelDuenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContenedorObservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelContenedorInputsLayout.setVerticalGroup(
            jPanelContenedorInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelContenedorNroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedorNombrePerro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedorRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedorColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedorEsAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedorNecesitaAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedorNombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedorCelDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContenedorObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelContenedorImagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        imgPerro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background_img.png"))); // NOI18N

        javax.swing.GroupLayout jPanelContenedorImagenLayout = new javax.swing.GroupLayout(jPanelContenedorImagen);
        jPanelContenedorImagen.setLayout(jPanelContenedorImagenLayout);
        jPanelContenedorImagenLayout.setHorizontalGroup(
            jPanelContenedorImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorImagenLayout.createSequentialGroup()
                .addComponent(imgPerro)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanelContenedorImagenLayout.setVerticalGroup(
            jPanelContenedorImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorImagenLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(imgPerro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelContenedorBtnsLimpiezaGuardado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelContenedorBtnsLimpiezaGuardadoLayout = new javax.swing.GroupLayout(jPanelContenedorBtnsLimpiezaGuardado);
        jPanelContenedorBtnsLimpiezaGuardado.setLayout(jPanelContenedorBtnsLimpiezaGuardadoLayout);
        jPanelContenedorBtnsLimpiezaGuardadoLayout.setHorizontalGroup(
            jPanelContenedorBtnsLimpiezaGuardadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorBtnsLimpiezaGuardadoLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(183, 183, 183))
        );
        jPanelContenedorBtnsLimpiezaGuardadoLayout.setVerticalGroup(
            jPanelContenedorBtnsLimpiezaGuardadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenedorBtnsLimpiezaGuardadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContenedorBtnsLimpiezaGuardadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelContenedorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelContenedorBtnsLimpiezaGuardado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanelContenedorInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelContenedorImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanelContenedorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelContenedorInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelContenedorImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelContenedorBtnsLimpiezaGuardado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // verifica que ningún campo esté vacío
    private boolean todosCamposComletados() {
        
        if (txtNroCliente.getText().isEmpty()) return false;
        if (txtNombrePerro.getText().isEmpty()) return false;
        if (txtRaza.getText().isEmpty()) return false;
        if (txtColor.getText().isEmpty()) return false;
        if (cmbEsAlergico.getSelectedIndex() == 0) return false;
        if (cmbNecesitaAtencionEspecial.getSelectedIndex() == 0) return false;
        if (txtNombreDuenio.getText().isEmpty()) return false;
        if (txtCelDuenio.getText().isEmpty()) return false;
        
        return !txtAreaObservaciones.getText().isEmpty();
        
    }
    
    private boolean camposCompletadosCorrectamente() {
        
        if (!todosCamposComletados()) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los datos pedidos", "Aviso: campos sin completar", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        int nroCliente = 0;
        
        try {
            nroCliente = Integer.parseInt(txtNroCliente.getText());
        }
        catch (NumberFormatException err) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nro válido para el cliente", "Aviso: valor ingresado no válido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (nroCliente < 1) {
            JOptionPane.showMessageDialog(null, "EL nro de cliente ingresado debe ser un valor positivo", "Aviso: nro de cliente no válido", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
        
        // busca en la base de datos si el registro con el nro de cliente ya existe
        if (control.buscarMascota(nroCliente) != null) {
            JOptionPane.showMessageDialog(null, "EL nro de cliente ingresado ya existe en la base de datos", "Aviso: nro de cliente ya utilizado", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    // Limpia todos los inputs de la igu
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        txtNroCliente.setText("");
        txtNombrePerro.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        cmbEsAlergico.setSelectedIndex(0);
        cmbNecesitaAtencionEspecial.setSelectedIndex(0);        
        txtNombreDuenio.setText("");
        txtCelDuenio.setText("");
        txtAreaObservaciones.setText("");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // guarda los datos ingresados en la base de datos
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (camposCompletadosCorrectamente()) {
            int nroCliente = Integer.parseInt(txtNroCliente.getText());
            String nombrePerro = txtNombrePerro.getText();
            String raza = txtRaza.getText();
            String color = txtColor.getText();
            boolean esAlergico = cmbEsAlergico.getSelectedItem().toString().equalsIgnoreCase("si");
            boolean necesitaAtencionEspecial = cmbNecesitaAtencionEspecial.getSelectedItem().toString().equalsIgnoreCase("si");       
            String nombreDuenio = txtNombreDuenio.getText();
            String celDuenio = txtCelDuenio.getText();
            String observaciones = txtAreaObservaciones.getText();
            
            try {
                control.crearMascota(nroCliente, nombrePerro, raza, color, esAlergico, necesitaAtencionEspecial, nombreDuenio, celDuenio, observaciones);
                JOptionPane.showMessageDialog(null, "Los datos fueron guardados correctamente.", "Éxito: Guardado de datos exitoso", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (Exception e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Ocurrió un error al intentar guardar la información en la Base de Datos.", "Error: error al intentar guardar datos", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbEsAlergico;
    private javax.swing.JComboBox<String> cmbNecesitaAtencionEspecial;
    private javax.swing.JLabel imgPerro;
    private javax.swing.JPanel jPanelContenedorBtnsLimpiezaGuardado;
    private javax.swing.JPanel jPanelContenedorCelDuenio;
    private javax.swing.JPanel jPanelContenedorColor;
    private javax.swing.JPanel jPanelContenedorEsAlergico;
    private javax.swing.JPanel jPanelContenedorImagen;
    private javax.swing.JPanel jPanelContenedorInputs;
    private javax.swing.JPanel jPanelContenedorNecesitaAtencionEspecial;
    private javax.swing.JPanel jPanelContenedorNombreDuenio;
    private javax.swing.JPanel jPanelContenedorNombrePerro;
    private javax.swing.JPanel jPanelContenedorNroCliente;
    private javax.swing.JPanel jPanelContenedorObservaciones;
    private javax.swing.JPanel jPanelContenedorRaza;
    private javax.swing.JPanel jPanelContenedorTitulo;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCelDuenio;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelEsAlergico;
    private javax.swing.JLabel labelNecesitaAtencionEspecial;
    private javax.swing.JLabel labelNombreDuenio;
    private javax.swing.JLabel labelNombrePerro;
    private javax.swing.JLabel labelNroCliente;
    private javax.swing.JLabel labelObservaciones;
    private javax.swing.JLabel labelRaza;
    private javax.swing.JLabel labelTituloPrincipal;
    private javax.swing.JTextArea txtAreaObservaciones;
    private javax.swing.JTextField txtCelDuenio;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombreDuenio;
    private javax.swing.JTextField txtNombrePerro;
    private javax.swing.JTextField txtNroCliente;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}

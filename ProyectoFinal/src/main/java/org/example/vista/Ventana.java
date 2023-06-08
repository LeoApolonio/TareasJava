package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame
{
    //Paneles
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;

    //Panel 1
    private JLabel lblId;
    private JLabel lblMarca;
    private JLabel lblModelo;
    private JLabel lblTipo;
    private JLabel lblCorrea;
    private JLabel lblUrlImg;
    private JButton btnAgregar;
    private JTextField txtId;
    private JTextField txtMarca;
    private JTextField txtModelo;
    private JTextField txtTipo;
    private JTextField txtCorrea;
    private JTextField txtUrlImg;

    //Panel 2
    private JTable tblReloj;
    private JScrollPane scrollPane;
    private JButton btnCargar;

    //Panel 3
    private JLabel lblImagenReloj;

    //Panel 4
    private JLabel lblNewId;
    private JLabel lblNewMarca;
    private JLabel lblNewModelo;
    private JLabel lblNewTipo;
    private JLabel lblNewCorrea;
    private JLabel lblNewUrlImg;
    private JButton btnNewAgregar;
    private JTextField txtNewModelo;
    private JTextField txtNewMarca;
    private JTextField txtNewTipo;
    private JTextField txtNewCorrea;
    private JTextField txtNewUrlImg;
    private JButton btnDelete;
    private JButton btnUpdate;


    private GridLayout layout;

    public Ventana(String title) throws HeadlessException
    {
        super(title);
        this.setSize(1250,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);


        //panel 1
        panel1 = new JPanel();
        panel1.setBackground(new Color(242,34,83));
        this.getContentPane().add(panel1,0);

            //Etiquetas y botones
            lblId = new JLabel("Id:");
            lblMarca = new JLabel("Marca:");
            lblModelo = new JLabel("Modelo:");
            lblTipo = new JLabel("Tipo:");
            lblCorrea = new JLabel("Correa:");
            lblUrlImg = new JLabel("Url de imagen:");
            btnAgregar = new JButton("Agregar");

            //Campos de texto
            txtId = new JTextField(3);
                txtId.setText("0");
                txtId.setEnabled(false);
            txtMarca = new JTextField(10);
            txtModelo = new JTextField(10);
            txtTipo = new JTextField(10);
            txtCorrea = new JTextField(10);
            txtUrlImg = new JTextField(10);

                //Añadiendo etiquetas y botones
                panel1.add(lblId);
                    panel1.add(txtId);
                panel1.add(lblMarca);
                    panel1.add(txtMarca);
                panel1.add(lblModelo);
                    panel1.add(txtModelo);
                panel1.add(lblTipo);
                    panel1.add(txtTipo);
                panel1.add(lblCorrea);
                    panel1.add(txtCorrea);
                panel1.add(lblUrlImg);
                    panel1.add(txtUrlImg);
                panel1.add(btnAgregar);

        //panel 2
        panel2 = new JPanel();
        panel2.setBackground(new Color(145,52,232));
        this.getContentPane().add(panel2,1);

            //Tabla y boton
            tblReloj = new JTable();
            scrollPane = new JScrollPane(tblReloj);
            btnCargar = new JButton("Cargar");

                //Añadiendo el scroll
                panel2.add(scrollPane);
                panel2.add(btnCargar);

        //panel 3
        panel3 = new JPanel();
        panel3.setBackground(new Color(251,199,40));
        this.getContentPane().add(panel3,2);

            //Etiqueta
            lblImagenReloj = new JLabel("...");

                //Añadiendo
                panel3.add(lblImagenReloj);



        //panel 4
        panel4 = new JPanel();
        panel4.setBackground(new Color(40,163,251));
        this.getContentPane().add(panel4,3);

            //Etiquetas y botones
            lblNewMarca= new JLabel("Marca:");
            lblNewModelo = new JLabel("Modelo:");
            lblNewTipo = new JLabel("Tipo:");
            lblNewCorrea = new JLabel("Correa:");
            lblNewUrlImg = new JLabel("Url de imagen:");

            txtNewMarca = new JTextField(10);
            txtNewModelo = new JTextField(10);
            txtNewTipo = new JTextField(10);
            txtNewCorrea = new JTextField(10);
            txtNewUrlImg = new JTextField(10);

            btnUpdate = new JButton("Actualizar");
            btnDelete = new JButton("Borrar");

                //Añadiendo etiquetas y botones
                panel4.add(lblNewMarca);
                    panel4.add(txtNewMarca);
                panel4.add(lblNewModelo);
                    panel4.add(txtNewModelo);
                panel4.add(lblNewTipo);
                    panel4.add(txtNewTipo);
                panel4.add(lblNewCorrea);
                    panel4.add(txtNewCorrea);
                panel4.add(lblNewUrlImg);
                    panel4.add(txtNewUrlImg);

                panel4.add(btnUpdate);
                panel4.add(btnDelete);

        //Terminar programa al cerrar
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Hacer visible la ventana
        this.setVisible(true);
    }

    //Getters y Setters
    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblMarca() {
        return lblMarca;
    }

    public void setLblMarca(JLabel lblMarca) {
        this.lblMarca = lblMarca;
    }

    public JLabel getLblModelo() {
        return lblModelo;
    }

    public void setLblModelo(JLabel lblModelo) {
        this.lblModelo = lblModelo;
    }

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public void setLblTipo(JLabel lblTipo) {
        this.lblTipo = lblTipo;
    }

    public JLabel getLblCorrea() {
        return lblCorrea;
    }

    public void setLblCorrea(JLabel lblCorrea) {
        this.lblCorrea = lblCorrea;
    }

    public JLabel getLblUrlImg() {
        return lblUrlImg;
    }

    public void setLblUrlImg(JLabel lblUrlImg) {
        this.lblUrlImg = lblUrlImg;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtMarca() {
        return txtMarca;
    }

    public void setTxtMarca(JTextField txtMarca) {
        this.txtMarca = txtMarca;
    }

    public JTextField getTxtModelo() {
        return txtModelo;
    }

    public void setTxtModelo(JTextField txtModelo) {
        this.txtModelo = txtModelo;
    }

    public JTextField getTxtTipo() {
        return txtTipo;
    }

    public void setTxtTipo(JTextField txtTipo) {
        this.txtTipo = txtTipo;
    }

    public JTextField getTxtCorrea() {
        return txtCorrea;
    }

    public void setTxtCorrea(JTextField txtCorrea) {
        this.txtCorrea = txtCorrea;
    }

    public JTextField getTxtUrlImg() {
        return txtUrlImg;
    }

    public void setTxtUrlImg(JTextField txtUrlImg) {
        this.txtUrlImg = txtUrlImg;
    }

    public JTable getTblReloj() {
        return tblReloj;
    }

    public void setTblReloj(JTable tblReloj) {
        this.tblReloj = tblReloj;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public void setBtnUpdate(JButton btnUpdate) {
        this.btnUpdate = btnUpdate;
    }

    public JLabel getLblImagenReloj() {
        return lblImagenReloj;
    }

    public void setLblImagenReloj(JLabel lblImagenReloj) {
        this.lblImagenReloj = lblImagenReloj;
    }

    public JLabel getLblNewMarca() {
        return lblNewMarca;
    }

    public void setLblNewMarca(JLabel lblNewMarca) {
        this.lblNewMarca = lblNewMarca;
    }

    public JLabel getLblNewModelo() {
        return lblNewModelo;
    }

    public void setLblNewModelo(JLabel lblNewModelo) {
        this.lblNewModelo = lblNewModelo;
    }

    public JLabel getLblNewTipo() {
        return lblNewTipo;
    }

    public void setLblNewTipo(JLabel lblNewTipo) {
        this.lblNewTipo = lblNewTipo;
    }

    public JLabel getLblNewCorrea() {
        return lblNewCorrea;
    }

    public void setLblNewCorrea(JLabel lblNewCorrea) {
        this.lblNewCorrea = lblNewCorrea;
    }

    public JLabel getLblNewUrlImg() {
        return lblNewUrlImg;
    }

    public void setLblNewUrlImg(JLabel lblNewUrlImg) {
        this.lblNewUrlImg = lblNewUrlImg;
    }

    public JButton getBtnNewAgregar() {
        return btnNewAgregar;
    }

    public void setBtnNewAgregar(JButton btnNewAgregar) {
        this.btnNewAgregar = btnNewAgregar;
    }

    public JTextField getTxtNewModelo() {
        return txtNewModelo;
    }

    public void setTxtNewModelo(JTextField txtNewModelo) {
        this.txtNewModelo = txtNewModelo;
    }

    public JTextField getTxtNewMarca() {
        return txtNewMarca;
    }

    public void setTxtNewMarca(JTextField txtNewMarca) {
        this.txtNewMarca = txtNewMarca;
    }

    public JTextField getTxtNewTipo() {
        return txtNewTipo;
    }

    public void setTxtNewTipo(JTextField txtNewTipo) {
        this.txtNewTipo = txtNewTipo;
    }

    public JTextField getTxtNewCorrea() {
        return txtNewCorrea;
    }

    public void setTxtNewCorrea(JTextField txtNewCorrea) {
        this.txtNewCorrea = txtNewCorrea;
    }

    public JTextField getTxtNewUrlImg() {
        return txtNewUrlImg;
    }

    public void setTxtNewUrlImg(JTextField txtNewUrlImg) {
        this.txtNewUrlImg = txtNewUrlImg;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    public JLabel getLblNewId() {
        return lblNewId;
    }

    public void setLblNewId(JLabel lblNewId) {
        this.lblNewId = lblNewId;
    }

    public void limpiar()
    {
        txtMarca.setText("");
        txtModelo.setText("");
        txtTipo.setText("");
        txtCorrea.setText("");
        txtUrlImg.setText("");
    }

}

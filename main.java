import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;  


public class main{


    public static void main(String[] args){
    int width = 1000;
    int height = 1000;
    ArrayList<ArrayList<String>> shapesArr = new ArrayList<>();
    String shapeTypes[]={"Select Type", "Circle","Rectangle","Square"};

    ArrayList<Canvas> jj = new ArrayList<Canvas>();

    JFrame f = new JFrame();
    Canvas dc = new Canvas(0,0,"ctype");
    jj.add(dc);

    //Add New Shape
    JLabel AddLBL = new JLabel("Add New Shape", JLabel.CENTER);
    AddLBL.setBounds(0,10,width/2,30);
    AddLBL.setFont(new Font("Serif", Font.BOLD, 18));
    JComboBox addCombo = new JComboBox(shapeTypes);
    addCombo.setBounds(160,50,width/4,30); 
    JLabel comboLBL = new JLabel("Select Shape Type:", JLabel.LEFT);
    comboLBL.setBounds(20,50,150,30); 
    TextField lengthTXT = new TextField();    
    lengthTXT.setBounds(160, 100, width/4, 30);    
    JLabel lengthLBL = new JLabel("Enter Length:", JLabel.LEFT);
    lengthLBL.setBounds(20,100,100,30); 
    TextField widthTXT = new TextField();    
    widthTXT.setBounds(160, 150, width/4, 30); 
    JLabel widthLBL = new JLabel("Enter Width:", JLabel.LEFT);
    widthLBL.setBounds(20,150,100,30);
    TextField radiusTXT = new TextField();    
    radiusTXT.setBounds(160, 200, width/4, 30); 
    JLabel radiusLBL = new JLabel("Enter Radius:", JLabel.LEFT);
    radiusLBL.setBounds(20,200,100,30); 
    JButton add=new JButton("Add Shape");     
    add.setBounds(125,250,100,30);    
    add.setBackground(Color.yellow);
    JButton clearAdd=new JButton("Clear");     
    clearAdd.setBounds(235,250,100,30);    
    clearAdd.setBackground(Color.yellow);
    JLabel Error = new JLabel("", JLabel.CENTER);
    Error.setBounds(0,300,width/2,30);
    Error.setFont(new Font("Serif", Font.BOLD, 18));  
    Error.setForeground(Color.red);
    

    //View Shape
    JLabel viewLBL = new JLabel("View Shape", JLabel.CENTER);
    viewLBL.setBounds(0,350,width/2,30);
    viewLBL.setFont(new Font("Serif", Font.BOLD, 18));
    JComboBox viewCombo = new JComboBox();
    viewCombo.setBounds(160,390,width/4,30); 
    JLabel viewComboLBL = new JLabel("Select Shape:", JLabel.LEFT);
    viewComboLBL.setBounds(20,390,150,30);
    TextField lengtheTXT = new TextField();    
    lengtheTXT.setBounds(160, 430, width/4, 30);    
    JLabel lengtheLBL = new JLabel("Length:", JLabel.LEFT);
    lengtheLBL.setBounds(20,430,100,30); 
    TextField widtheTXT = new TextField();    
    widtheTXT.setBounds(160, 470, width/4, 30); 
    JLabel widtheLBL = new JLabel("Width:", JLabel.LEFT);
    widtheLBL.setBounds(20,470,100,30);
    TextField radiuseTXT = new TextField();    
    radiuseTXT.setBounds(160, 510, width/4, 30); 
    JLabel radiuseLBL = new JLabel("Radius:", JLabel.LEFT);
    radiuseLBL.setBounds(20,510,100,30); 
    TextField AreaTXT = new TextField();    
    AreaTXT.setBounds(160, 550, width/4, 30); 
    JLabel AreaLBL = new JLabel("Area:", JLabel.LEFT);
    AreaLBL.setBounds(20,550,100,30); 


    JButton view=new JButton("View Shape");     
    view.setBounds(30,590,150,30);    
    view.setBackground(Color.yellow); 
    JButton viewEdit=new JButton("Edit");     
    viewEdit.setBounds(190,590,150,30);    
    viewEdit.setBackground(Color.yellow); 
    JButton viewDelete=new JButton("Delete");     
    viewDelete.setBounds(350,590,150,30);    
    viewDelete.setBackground(Color.yellow); 


    JPanel panel1=new JPanel();  
    panel1.setBounds(0,0,width/2,height);     
    panel1.setBackground(new Color(0,153,204));       
    panel1.add(AddLBL);
    panel1.add(Error);
    panel1.add(comboLBL);
    panel1.add(lengthLBL);
    panel1.add(lengtheLBL);
    panel1.add(lengthTXT);
    panel1.add(lengtheTXT);
    panel1.add(widthLBL);
    panel1.add(widtheLBL);
    panel1.add(widthTXT);
    panel1.add(widtheTXT);
    panel1.add(radiusLBL);
    panel1.add(radiuseLBL);
    panel1.add(radiusTXT);
    panel1.add(radiuseTXT);
    panel1.add(AreaLBL);
    panel1.add(AreaTXT);
    panel1.add(add);
    panel1.add(clearAdd);
    panel1.setLayout(null);
    panel1.add(addCombo);
    panel1.add(viewCombo);
    panel1.add(viewLBL);
    panel1.add(viewComboLBL);
    panel1.add(view);
    panel1.add(viewEdit);
    panel1.add(viewDelete);

    f.add(panel1);
    f.add(dc);
    f.setSize(width,height);
    f.setTitle("Shapes in Java: Square, Rectangle & Circle Only!!");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);


//Logic
 
    add.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        Error.setText("");
        String type = String.valueOf(addCombo.getSelectedItem());
            String radius = radiusTXT.getText();
            String length = lengthTXT.getText();
            String width = widthTXT.getText();
            if(type.equals("Select Type")){
                Error.setText("Please Select Shape Type");
            }
            else{
                 try {
                    int len = Integer.parseInt(length);
                    int rad = Integer.parseInt(radius);
                    int wid = Integer.parseInt(width);
                    if(len>500 || rad>250 || wid>500){
                        Error.setText("Length and Width Max is 500, Radius Max is 250");
                    }
                    else{
                    if(type.equals("Rectangle")){
                        String finder = type+" Length of "+len+" & Width "+wid;
                        ArrayList<String> listelm = new ArrayList<>();
                        listelm.add(finder);
                        listelm.add(type);
                        listelm.add(length);
                        listelm.add(width);
                        shapesArr.add(listelm);
                    }
                   else if(type.equals("Square")){
                        String finder = type+" Length of "+len;
                        ArrayList<String> listelm = new ArrayList<>();
                        listelm.add(finder);
                        listelm.add(type);
                        listelm.add(""+len);
                        listelm.add(""+len);
                        shapesArr.add(listelm);
                    }
                    else{
                        String finder = type+" Radius of "+rad;
                        rad=rad*2;
                        ArrayList<String> listelm = new ArrayList<>();
                        listelm.add(finder);
                        listelm.add(type);
                        listelm.add(""+rad);
                        listelm.add(""+rad);
                        shapesArr.add(listelm);
                    }

                 int totsize = shapesArr.size();
                 viewCombo.removeAllItems();
                 for (int i = 0; i < totsize; i++) {
                    viewCombo.addItem(shapesArr.get(i).get(0));
                    }
                    addCombo.setSelectedIndex(0);
                    radiusTXT.setText("");
        lengthTXT.setText("");
        widthTXT.setText("");
        radiuseTXT.setText("");
        lengtheTXT.setText("");
        widtheTXT.setText("");
                }
             } 
                 catch (Exception ex) {
                    Error.setText("Please Enter Integers");
                
            }
            }
           
    }
});
clearAdd.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {
        addCombo.setSelectedIndex(0);
        radiusTXT.setText("");
        lengthTXT.setText("");
        widthTXT.setText("");
        radiuseTXT.setText("");
        lengtheTXT.setText("");
        widtheTXT.setText("");
         Error.setText("");

   }
});

view.addActionListener(new ActionListener() {

    @Override
    public void actionPerformed(ActionEvent e) {

        addCombo.setSelectedIndex(0);
        radiusTXT.setText("");
        lengthTXT.setText("");
        widthTXT.setText("");
        radiuseTXT.setText("");
        lengtheTXT.setText("");
        widtheTXT.setText("");
         Error.setText("");

int totsize1 = jj.size();
                 for (int i = 0; i < totsize1; i++) {
                                        
        f.getContentPane().remove(jj.get(i));
        f.validate();
        f.repaint();}

        int cwidth, cheight;
        String findee = String.valueOf(viewCombo.getSelectedItem());
        String ctype;

        int totsize = shapesArr.size();
                 for (int i = 0; i < totsize; i++) {
                    if(shapesArr.get(i).get(0).equals(findee)){
                        cwidth=Integer.parseInt(shapesArr.get(i).get(2));
                        cheight=Integer.parseInt(shapesArr.get(i).get(3));
                        ctype=shapesArr.get(i).get(1);
                        
                       Canvas dc = new Canvas(cwidth,cheight,ctype);
                       jj.add(dc);
                       int index = jj.size()-1;
                        f.add(jj.get(index));
                        f.revalidate();
                        f.repaint();
                        i=totsize;
                        if(ctype.equals("Circle")){
                            
                            int rad = cwidth/2;
                            Double Area = rad*rad*3.142;
                            radiuseTXT.setText(""+rad);
                            AreaTXT.setText(""+Area);

                        }
                        else  if(ctype.equals("Square")){
                            int Area = cwidth*cwidth;
                            lengtheTXT.setText(""+cwidth);
                            AreaTXT.setText(""+Area);

                        }
                        else{
                            lengtheTXT.setText(""+cwidth);
                            widtheTXT.setText(""+cheight);
                            int Area = cwidth*cheight;
                            AreaTXT.setText(""+Area);

                        }
                        
                    }}

        

   }
});

}
}
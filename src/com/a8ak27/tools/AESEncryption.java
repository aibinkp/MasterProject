package com.a8ak27.tools;

import java.awt.EventQueue;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop.Action;

import net.miginfocom.swing.MigLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

//import com.a8ak27.tools.Main.ColoredItem;
//import com.a8ak27.tools.Main.ColoredItem;
import com.a8ak27.tools.Main.MyTableModel;
//import com.a8ak27.tools.TableExample.MyTableCellRenderer;
import com.a8ak27.tools.TableCellListener;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Dimension;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.AbstractListModel;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;

public class DeploymentValidater {

	private JFrame frmDeployementValidator;
	private JTable table;
	DefaultTableModel model = null;
	JTextField textBox=new JTextField();
	MyTableModel tableModel;
	private DefaultTableCellRenderer renderer;
	private int selectRow, selectColumn;
	/**
	 * Launch the application.
	 * @throws InterruptedException 
	 * @throws InvocationTargetException 
	 */
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
/*		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			}
		});*/
		
		
		SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
            	try {
					DeploymentValidater window = new DeploymentValidater();
					window.frmDeployementValidator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });	
		
		
	}

	/**
	 * Create the application.
	 */
	public DeploymentValidater() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeployementValidator = new JFrame();
		frmDeployementValidator.getContentPane().setPreferredSize(new Dimension(1024, 768));
		frmDeployementValidator.setTitle("Deployement Validator");
		//frmDeployementValidator.setBounds(0, 0, 1024, 768);
		frmDeployementValidator.setExtendedState(frmDeployementValidator.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		frmDeployementValidator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeployementValidator.getContentPane().setLayout(null);
		
		
		
		JButton btnNewButton_1 = new JButton("Start Validation");
		btnNewButton_1.setBounds(398, 83, 145, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				model.setValueAt("Aibin", 1, 1);
				selectRow = 1; // pick a row 0-2
				selectColumn = 1; // pick a column 0-2
				//renderer.setBackground(Color.red);
				renderer.setForeground(Color.red);
				table.getCellRenderer(0,0);
				table.repaint();
				//
				//table.getColumnModel().getColumn(1).setCellRenderer(new MyTableCellRenderer());
		        
				//DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
				 // table.prepareRenderer( table.getCellRenderer(0, 0),0, 0);
				// MyRenderer myRenderer = new MyRenderer();
				 // table.setDefaultRenderer(Object.class, myRenderer);
			/* boolean isSelected = table.isCellSelected(1, 1);
			 MyCellRenderer defRender = new MyCellRenderer();//(DefaultTableCellRenderer)
			    table.getCellRenderer(1, 1);
			        Component cellRenderer = defRender.getTableCellRendererComponent(table,
			                "Huml", isSelected, false, 1, 1);
			       */
				//textBox.setBackground(Color.RED);
				// table.getColumnModel().getColumn(1).setCellRenderer(new CustomTableCellRenderer());
	                //table.getColumnModel().getColumn(1).setCellRenderer(new CustomRenderer());
	               // table.getColumnModel().getColumn(2).setCellRenderer(new ColorRenderer());
		/*	DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
				 Component comp= table.prepareRenderer(cellRender,2, 2);
	             
	                     comp.setForeground(Color.GREEN);
	                     table.updateUI();*/
				
			}
		});
		frmDeployementValidator.getContentPane().add(btnNewButton_1);
		 model = new DefaultTableModel(new String[] { "EAR Name" },0);
		
		 
		 
		
		DefaultListModel<String> jmodel = new DefaultListModel<>();
		jmodel.addElement("RT21-01");
		jmodel.addElement("RT21-02");
		jmodel.addElement("RT21-03");
		jmodel.addElement("RT21-04");
		jmodel.addElement("RT21-05");
		jmodel.addElement("RT21-06");
		jmodel.addElement("RT23-01");
		jmodel.addElement("RT23-02");
		jmodel.addElement("RT23-03");
		jmodel.addElement("RT61-01");
		jmodel.addElement("RT03-02");
		jmodel.addElement("FT01-01");
		jmodel.addElement("RT64-01");
		jmodel.addElement("RT64-02");
		jmodel.addElement("RT61-01");
	
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(32, 14, 108, 152);
		frmDeployementValidator.getContentPane().add(scrollPane_1);
		JList list_1 = new JList(jmodel);
		scrollPane_1.setViewportView(list_1);
		
		DefaultListModel<String> jmodel2 = new DefaultListModel<>();
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(268, 14, 108, 152);
		frmDeployementValidator.getContentPane().add(scrollPane_2);
		JList list = new JList(jmodel2);
		scrollPane_2.setViewportView(list);
		
		
		
		
		JButton btnNewButton_2 = new JButton(">>");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Object[] oarr = list_1.getSelectedValues();
	            for (int i=0; i<oarr.length; i++) {
	               //System.out.println(oarr[i]);
	              if(!jmodel2.contains(oarr[i]))
	              { jmodel2.addElement(oarr[i].toString());
	               
	                  model.addColumn(oarr[i]);

	              }
					 
	            }
				
			}
		});
		btnNewButton_2.setBounds(171, 67, 71, 23);
		frmDeployementValidator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("<<");
		btnNewButton_3.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				//TableColumn index=null;
				//String strVal="";
				Object[] oarr = list.getSelectedValues();
	            for (int i=0; i<oarr.length; i++) {
	              
	             jmodel2.removeElement(oarr[i]);
	           
	     	 //System.out.println("oarr[i] : " + oarr[i].toString());
	     	 TableColumn column1 = table.getColumn(oarr[i].toString());
	     	 int index = table.convertColumnIndexToView(column1.getModelIndex());
	     	// System.out.println("index : " + index);
	     	
	     	  removeColumn(index, table);
					 //model.getColumnModel().getColumn(0).setPreferredWidth(27);
	            }
				
				
			}
		});
		btnNewButton_3.setBounds(171, 97, 71, 23);
		frmDeployementValidator.getContentPane().add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(7, 177, 1013, 418);
		frmDeployementValidator.getContentPane().add(scrollPane);
		
		renderer = new DefaultTableCellRenderer();
		table = new JTable() {
			public TableCellRenderer getCellRenderer(int row, int column) {	
				
				if ((row == selectRow) && (column == selectColumn) )				
		    		return renderer;				
				else   				
					return super.getCellRenderer(row, column);
	    }
			
			};
		table.setEnabled(false);
	 
	
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(table);
		table.setModel(model);
		
		AbstractAction action = new AbstractAction()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		        TableCellListener tcl = (TableCellListener)e.getSource();
		        System.out.println("Row   : " + tcl.getRow());
		        System.out.println("Column: " + tcl.getColumn());
		        System.out.println("Old   : " + tcl.getOldValue());
		        System.out.println("New   : " + tcl.getNewValue());
		    }
		};

		TableCellListener tcl = new TableCellListener(table, action); 	   
	 
		
		
		JMenuBar menuBar = new JMenuBar();
		frmDeployementValidator.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmImport = new JMenuItem("Import");
		mnFile.add(mntmImport);
		mntmImport.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent ev) {

	        	JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

	    		int returnValue = jfc.showOpenDialog(null);
	    		// int returnValue = jfc.showSaveDialog(null);

	    		if (returnValue == JFileChooser.APPROVE_OPTION) {
	    			File selectedFile = jfc.getSelectedFile();
	    			String strFile = selectedFile.getAbsolutePath();
	    			  //System.out.println(strFile.substring(strFile.length() - 4));
	    			if(strFile.substring(strFile.length() - 4).trim().equals(".txt"))
	    			 { 
	    				

	    		        try {
	    		        	BufferedReader bufferreader = new BufferedReader(new FileReader(strFile));
		    		        String line  ="";
		    		        while ((line = bufferreader.readLine()) != null) {     
							  //do whatever here 
								if(!line.trim().equals(""))
								{//System.out.println(line);
				
								model.addRow(new Object[]{ line});

								
								}	
								
							}
		    		        
		    		    	//table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	    				
	    				
	    			 }   
	    			else
	    			{
	    				System.out.println("only text file is allowed!!");
	    			}
	 
	    		
	    		}
	        	
	        	
	        }
	    });
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		mntmExit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ev) {
                System.exit(0);
        }
    });
	}
	
	
	
    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex,
            int columnIndex) {
        JComponent component = (JComponent) table.prepareRenderer(renderer, rowIndex, columnIndex);  

        System.out.println(model.getValueAt(rowIndex, 0).toString());
        if(model.getValueAt(rowIndex, 0).toString().equalsIgnoreCase("Failed") && columnIndex == 0) {
            component.setBackground(Color.RED);
        } else if(model.getValueAt(rowIndex, 1).toString().equalsIgnoreCase("j2ee") && columnIndex == 1){
            component.setBackground(Color.GREEN);
        }

        return component;
    }
	
	
	
	
	
	public void removeColumn(int index, JTable myTable){
		
		
		  int nRow= myTable.getRowCount();
		    int nCol= myTable.getColumnCount()-1;
		    Object[][] cells= new Object[nRow][nCol];
		    String[] names= new String[nCol];

		    for(int j=0; j<nCol; j++){
		        if(j<index){
		            names[j]= myTable.getColumnName(j);
		            for(int i=0; i<nRow; i++){
		                cells[i][j]= myTable.getValueAt(i, j);
		            }
		        }else{
		            names[j]= myTable.getColumnName(j+1);
		            for(int i=0; i<nRow; i++){
		                cells[i][j]= myTable.getValueAt(i, j+1);
		            }
		        }
		    }

		  model= new DefaultTableModel(cells, names);
		    myTable.setModel(model); 
		
	
		
	}
	
	/*public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
	    setText(value.toString());
	    if (row==12 && column==2) {
	        setBackground(Color.RED);
	    }
	    return this;
	}*/
	
/*	
	TableModel tm = t.getModel();
	for (int i = 0; i < tm.getRowCount(); i++) {
	  for (int j = 0; j < tm.getColumnCount(); j++) {
	    Object o = tm.getValueAt(i, j);
	    if (o instanceof Integer) {
	      System.out.println((Integer)o);
	    } else if (o instanceof String) {
	      System.out.println((String)o);
	    }
	  }
	}
	*/
	
}

class MyTableCellRenderer extends DefaultTableCellRenderer 
{
    public Component getTableCellRendererComponent(JTable table,Object oValue, boolean isSelected, boolean hasFocus, int row, int column) 
    {
        Component c = super.getTableCellRendererComponent(table, oValue,isSelected, hasFocus,row, column);
        String value = (String)oValue;
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("<HTML><BODY>");
        StringTokenizer tokenizer = new StringTokenizer(value,",");
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            int index = token.indexOf("[");
            if (index != -1)
            {
                sBuilder.append(token.substring(0,index));
                int lastIndex = token.lastIndexOf(']');
                String subValue = token.substring(index + 1,lastIndex);
                sBuilder.append("[<FONT color = red>"+subValue+"</FONT>]");
                if (lastIndex < token.length() -1)
                {
                    sBuilder.append(token.substring(lastIndex+1,token.length()));
                }
                sBuilder.append(",");
            }
            else
            {
                sBuilder.append(token+",");
            }
        }
        if (sBuilder.lastIndexOf(",") == sBuilder.length() - 1)
        {
            sBuilder.deleteCharAt(sBuilder.length() - 1 );
        }
        sBuilder.append("</BODY></HTML>");
        value = sBuilder.toString(); ;
        JLabel label =(JLabel)c;
        label.setText(value);
        return label;
    }
}




class MyRenderer extends DefaultTableCellRenderer  
{ 
    public Component getTableCellRendererComponent(JTable table, Object value, boolean   isSelected, boolean hasFocus, int row, int column) 
{ 
    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
    //System.out.println(row);
   //System.out.println(column);
 	 String s =  table.getModel().getValueAt(row, column ).toString();
 	if(s.equalsIgnoreCase("Failed")) 
    {
 		  c.setBackground(new java.awt.Color(0, 0, 255)); 
        //comp.setForeground(Color.red);
    }// if(row == 0 && column == 0)
      

    return c; 
} 

} 


 class ColorRenderer extends JLabel implements TableCellRenderer  {
	 
    public ColorRenderer() {
        setOpaque(true); //MUST do this for background to show up.
    }
 
    public Component getTableCellRendererComponent(
                            JTable table, Object value,
                            boolean isSelected, boolean hasFocus,
                            int row, int column) {
 
        //if(column == 4){
  
 
            if (Integer.valueOf(table.getValueAt(row, column).toString()) > 0)
            {
                setBackground(Color.BLUE);
                //setForeground(Color.BLACK);
            }
            else
            {
                setBackground(Color.RED);
                //setForeground(Color.BLACK);
            }
        //}
        return this;
    }
}

class CustomRenderer extends DefaultTableCellRenderer 
{
//private static final long serialVersionUID = 6703872492730589499L;

    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if(table.getValueAt(row, column).equals("Y")){
            cellComponent.setBackground(Color.YELLOW);
        } else if(table.getValueAt(row, column).equals("N")){
            cellComponent.setBackground(Color.GRAY);
        }
        return cellComponent;
    }
}


 class ColoredItem {
    private Object object;
    private Color foreground;
    private Color background;

    public ColoredItem(Object object, Color foreground, Color background) {
       this.object = object;
       this.foreground = foreground;
       this.background = background;
    }
 
    public void setObject(Object object) {
       this.object = object;
    }
 
    public void setForeground(Color foreground) {
       this.foreground = foreground;
    }

    public void setBackground(Color background) {
       this.background = background;
    }

    public Object getObject() {
       return object;
    }

    public Color getForeground() {
       return foreground;
    }

    public Color getBackground() {
       return background;
    }

    public String toString() {
       return object.toString();
    }
 }

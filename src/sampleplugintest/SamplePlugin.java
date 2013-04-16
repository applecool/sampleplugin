package sampleplugintest;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import org.pathvisio.desktop.PvDesktop;
import org.pathvisio.desktop.plugin.Plugin;

public class SamplePlugin implements Plugin {

	private PvDesktop desktop;
	
	public void init(PvDesktop desktop){
		
		this.desktop = desktop;
		
		JPanel mySideBarPanel = new JPanel ();
		mySideBarPanel.setLayout (new BorderLayout());
		
		 mySideBarPanel.add (new JLabel ("Hello SideBar"), BorderLayout.CENTER);
		 
		 JTabbedPane sidebarTabbedPane = desktop.getSideBarTabbedPane();
		 
		 sidebarTabbedPane.add("DataNode", mySideBarPanel);
	}
	
	 public void done() {
		 
	 }
}

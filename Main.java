import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Main {
	public static void main(String[] args) {
		Connection con = ConnectToMySQL.connectToDB("THUCHANH");
		EmployeeInfo eInfo = new EmployeeInfo();
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				eInfo.setVisible(true);
				try {
					ResultSet rs = getData(con);
					while(rs.next()) {
						String eID, name, department, dob;
						eID = rs.getString(1);
						name = rs.getString(2);
						dob = rs.getString(8);
						department = "";
						Vector<String> listE = new Vector<String>();
						listE.add(eID);
						listE.add(name);
						listE.add(dob);
						listE.add(department);
						System.out.println(eID);
						DefaultTableModel model = (DefaultTableModel) eInfo.getjTable1().getModel();
						model.addRow(listE);
					}
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		});
	}
	public static ResultSet getData(Connection con) {
		try {
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery("Select * from thuchanh.tlb_nhanvien");
			return rs;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}


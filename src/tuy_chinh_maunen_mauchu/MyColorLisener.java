package tuy_chinh_maunen_mauchu;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorLisener implements ActionListener{
private MyColorView mclv;
	public MyColorLisener(MyColorView mclv) {
	this.mclv = mclv;
}
	@Override
	public void actionPerformed(ActionEvent e) {
		String src =e.getActionCommand();
		if(src.equals("Red Text")) {
			this.mclv.changeTextColor(Color.RED);
		}else if(src.equals("Green Text")) {
			this.mclv.changeTextColor(Color.GREEN);
		}else if(src.equals("Yellow Text")) {
			this.mclv.changeTextColor(Color.YELLOW);
		}else if(src.equals("Background Red")) {
			this.mclv.changeBackgroundColor(Color.RED);
		}else if(src.equals("Background Green")) {
			this.mclv.changeBackgroundColor(Color.GREEN);
		}else if(src.equals("Background Yellow")) {
			this.mclv.changeBackgroundColor(Color.YELLOW);
		}
		
	}
	

}

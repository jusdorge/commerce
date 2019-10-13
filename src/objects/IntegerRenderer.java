package objects;
import java.text.*;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer; 
import java.util.Locale;
public class IntegerRenderer extends DefaultTableCellRenderer {
    
	public IntegerRenderer() { super(); }
	
    public void setValue(Object value) {
	String pattern = "#0";
	Locale loc = Locale.US;
        NumberFormat nf = NumberFormat.getNumberInstance(loc);
	DecimalFormat df = (DecimalFormat)nf;
	df.applyPattern(pattern);
	String output = df.format(value);
	setHorizontalAlignment(SwingConstants.RIGHT);
	setText(output);
    }
}

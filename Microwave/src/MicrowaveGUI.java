import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class MicrowaveGUI {

	protected Shell shlMicrowave;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MicrowaveGUI window = new MicrowaveGUI();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlMicrowave.open();
		shlMicrowave.layout();
		while (!shlMicrowave.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMicrowave = new Shell();
		shlMicrowave.setSize(450, 300);
		shlMicrowave.setText("Mircowave by Johanthan Meloche");
		shlMicrowave.setLayout(null);
		
		Label lblNumber = new Label(shlMicrowave, SWT.NONE);
		lblNumber.setBounds(36, 91, 106, 15);
		lblNumber.setText("Number of items");
		
		Spinner spnItems = new Spinner(shlMicrowave, SWT.BORDER);
		spnItems.setMaximum(3);
		spnItems.setMinimum(1);
		spnItems.setBounds(184, 84, 47, 22);
		
		Button btnPizza = new Button(shlMicrowave, SWT.NONE);
		btnPizza.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnPizza.setBounds(36, 31, 75, 25);
		btnPizza.setText("Pizza");
		
		Button btnSub = new Button(shlMicrowave, SWT.NONE);
		btnSub.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnSub.setBounds(146, 31, 75, 25);
		btnSub.setText("Sub");
		
		Button btnSoup = new Button(shlMicrowave, SWT.NONE);
		btnSoup.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		btnSoup.setBounds(261, 31, 75, 25);
		btnSoup.setText("Soup");

	}
}

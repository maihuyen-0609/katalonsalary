package paygroup

import java.awt.AWTException
import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent

import com.kms.katalon.core.annotation.Keyword

public class PayGroup {
	@Keyword
	def UploadFile(String FilePath) {
		Thread.sleep(3);

		// Khởi tạo Robot class
		Robot rb = null;
		try {
			rb = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		// Copy File path vào Clipboard
		StringSelection str = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		Thread.sleep(1000);

		// Nhấn Control+V để dán
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// Xác nhận Control V trên
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		Thread.sleep(1000);

		// Nhấn Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(4000);

	}
}

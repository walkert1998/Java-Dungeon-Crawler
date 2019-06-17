import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;

import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.TransferHandler;

import org.eclipse.swt.graphics.Rectangle;

public class IconTransferHandler extends TransferHandler
{
    int action;

    public IconTransferHandler(int action) {
      this.action = action;
    }
    
    public int getSourceActions(JComponent c) {
        return COPY | MOVE;
    }

    public boolean canImport(TransferHandler.TransferSupport support) {
      // for the demo, we'll only support drops (not clipboard paste)
      if (!support.isDrop()) {
        return false;
      }

      // we only import Strings
      if (!support.isDataFlavorSupported(DataFlavor.stringFlavor)) {
        return false;
      }

      boolean actionSupported = (action & support.getSourceDropActions()) == action;
      if (actionSupported) {
        support.setDropAction(action);
        return true;
      }

      return false;
    }

    public boolean importData(TransferHandler.TransferSupport support) {
      // if we can't handle the import, say so
      if (!canImport(support)) {
        return false;
      }

      // fetch the drop location
      JList.DropLocation dl = (JList.DropLocation) support.getDropLocation();

      int index = dl.getIndex();

      // fetch the data and bail if this fails
      String data;
      try {
        data = (String) support.getTransferable().getTransferData(
            DataFlavor.stringFlavor);
      } catch (UnsupportedFlavorException e) {
        return false;
      } catch (java.io.IOException e) {
        return false;
      }

      JList list = (JList) support.getComponent();
      DefaultListModel model = (DefaultListModel) list.getModel();
      model.insertElementAt(data, index);

      java.awt.Rectangle rect = list.getCellBounds(index, index);
      list.scrollRectToVisible(rect);
      list.setSelectedIndex(index);
      list.requestFocusInWindow();

      return true;
    }
}

import javax.swing.event.MenuDragMouseEvent;
import javax.swing.event.MenuDragMouseListener;
import javax.swing.event.MouseInputListener;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.events.MouseEvent;
import org.w3c.dom.views.AbstractView;

public class Mouse implements MouseInputListener, MenuDragMouseListener, MouseEvent {


    private int mouseX = 1;
    private int mouseY = 1;
    private int mouseB = -1;
    private int scroll = 0;

    public int getX(){
        return this.mouseX;
    }

    public int getY(){
        return this.mouseY;
    }

    public int getB(){
        return this.mouseB;
    }

    public void resetButton(){
        mouseB = -1;
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        this.mouseB = e.getButton();
        this.mouseX = e.getX();
        this.mouseY = e.getY();
        System.out.println(e.getButton());
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        this.mouseB = -1;

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        this.mouseX = e.getX();
        this.mouseY = e.getY();

    }

    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public AbstractView getView() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getDetail() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void initUIEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, AbstractView viewArg,
            int detailArg) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EventTarget getTarget() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EventTarget getCurrentTarget() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public short getEventPhase() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean getBubbles() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean getCancelable() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public long getTimeStamp() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void stopPropagation() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void preventDefault() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void initEvent(String eventTypeArg, boolean canBubbleArg, boolean cancelableArg) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int getScreenX() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getScreenY() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getClientX() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getClientY() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean getCtrlKey() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean getShiftKey() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean getAltKey() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean getMetaKey() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public short getButton() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public EventTarget getRelatedTarget() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void initMouseEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, AbstractView viewArg,
            int detailArg, int screenXArg, int screenYArg, int clientXArg, int clientYArg, boolean ctrlKeyArg,
            boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, short buttonArg, EventTarget relatedTargetArg) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void menuDragMouseEntered(MenuDragMouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void menuDragMouseExited(MenuDragMouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void menuDragMouseDragged(MenuDragMouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void menuDragMouseReleased(MenuDragMouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}

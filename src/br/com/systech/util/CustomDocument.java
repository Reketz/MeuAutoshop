package br.com.systech.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class CustomDocument extends PlainDocument{

    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        super.insertString(i, string.toUpperCase(), as); //To change body of generated methods, choose Tools | Templates.
    }
    
}

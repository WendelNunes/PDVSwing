/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.wendel.pdv.util;

import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author Wendel Nunes Donizete
 * @since 17/01/2013
 */
public class DocumentFilterText extends DocumentFilter {

    private final boolean upperCase;
    private Integer tamanhoMaximo = 60;

    public DocumentFilterText(boolean upperCase) {
        super();
        this.upperCase = upperCase;
    }

    public DocumentFilterText(boolean upperCase, Integer tamanhoMaximo) {
        super();
        this.upperCase = upperCase;
        this.tamanhoMaximo = tamanhoMaximo;
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String string, AttributeSet attrs) throws BadLocationException {
        if ((fb.getDocument().getLength() + string.length() - length) <= tamanhoMaximo) {
            super.replace(fb, offset, length, (upperCase ? string.toUpperCase() : string), attrs);
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
    }

    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attrs) throws BadLocationException {
        if ((fb.getDocument().getLength() + string.length()) <= tamanhoMaximo) {
            super.insertString(fb, offset, (upperCase ? string.toUpperCase() : string), attrs);
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
    }
}

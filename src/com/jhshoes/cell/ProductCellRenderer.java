/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhshoes.cell;

import com.jhshoes.Product;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

/**
 *
 * @author narissacooney
 */
public class ProductCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(JList<?> list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Product) {
            Product product = (Product) value;
            setText(product.getProductDescription());
            setToolTipText(String.valueOf(product.getProductPrice()));
            // setIcon(ingredient.getIcon());
        }
        return this;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekendatberniescastle.model;

import java.util.Objects;

/**
 *
 * @author Phillip
 */
public class InventoryItem {
    
    Object InventoryItem;
    int quantityInStock;
    String description;
    int requiredAmount;

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.InventoryItem, other.InventoryItem)) {
            return false;
        }
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        return true;
    }
    

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }
    

    public InventoryItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getInventoryItem() {
        return InventoryItem;
    }

    public void setInventoryItem(Object InventoryItem) {
        this.InventoryItem = InventoryItem;
    }

    public InventoryItem(Object InventoryItem) {
        this.InventoryItem = InventoryItem;
    }

   
}

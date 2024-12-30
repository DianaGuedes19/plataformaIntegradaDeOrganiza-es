package org.example;

import java.util.List;

public class Inventory {

    private String _itemName;
    private int _quantity;
    private String _location;



    private Organization _organization;

    public Inventory (String itemName, int quantity, String location, Organization organization){
        if (itemName == null || itemName.isBlank()){throw new IllegalArgumentException("Insert a valid Itemname");}
        _itemName=itemName;

        if (quantity <0 ){throw new IllegalArgumentException("Insert a valid quantity");}
        _quantity=quantity;

        if (location == null || location.isBlank()){throw new IllegalArgumentException("Insert a valid location");}
        _location=location;

        if (organization == null ){throw new IllegalArgumentException("Insert a valid organization");}
        _organization=organization;
    }

    protected List <Inventory> _listaDeItens;

    // Adicionar itens à lista
    public void adicionarItem (Inventory inventory){
        _listaDeItens.add(inventory);
    }

    //Aumentar ou diminuir a quantidade
    protected void changeQuantity (int quantity){
        if (quantity<0){
            _quantity=quantity;
        }
    }


    //Eliminar itens que não estão mais disponíveis
    public boolean removeItem (Inventory inventory){
        if (inventory._quantity <= 0){
            _listaDeItens.remove(inventory);
            return true;
        }
        return false;
    }

}

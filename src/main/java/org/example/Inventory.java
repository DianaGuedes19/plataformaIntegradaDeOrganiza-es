package org.example;

import java.util.List;

public class Inventory {

    private String _itemName;
    private int _quantity;
    private String _location;

    private List <Inventory> _listaDeItens;

    private Organization _organization;

    public Inventory (String itemName, int quantity, String location, Organization organization){
        _itemName=itemName;
        _quantity=quantity;
        _location=location;
        _organization=organization;
    }

    // Adicionar itens à lista
    public void adicionarItem (Inventory inventory){
        _listaDeItens.add(inventory);
    }

    //Aumentar ou diminuir a quantidade
    public void changeQuantity (int quantity){
        if (quantity<0){
            _quantity=quantity;
        }
    }


    //Eliminar itens que não estão mais disponíveis
    public boolean removeItem (Inventory inventory){
        if (inventory._quantity <= 0){
            return _listaDeItens.remove(inventory);
        }
        return false;
    }

    //Mostrar itens armazenados com quantidade e localização
    @Override
    public String toString() {
        return "Inventory{" +
                "_itemName='" + _itemName + '\'' +
                ", _quantity=" + _quantity +
                ", _location='" + _location + '\'' +
                '}';
    }
}

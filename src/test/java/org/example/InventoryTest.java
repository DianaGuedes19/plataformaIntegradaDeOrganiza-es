package org.example;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryTest {

    // Criar o objeto
    @Test
    public void NormalInvetoryObject() throws Exception {

        //arrange
        Organization organization1 = new Organization("ISEP");

        //act + assert
        Inventory inventory1= new Inventory("Cadeira1",2,"Porto",organization1);

    }

    // Criar o objeto com null
    @Test
    public void NullInvetoryNameDontCreateInventory() throws Exception {

        //arrange
        Organization organization1 = new Organization("ISEP");

        //act + assert
        assertThrows(Exception.class, () -> new Inventory(null,10, "Porto",organization1));

    }

    // Criar o objeto com name blank
    @Test
    public void BlankInvetoryNameDontCreateInventory() throws Exception {

        //arrange
        Organization organization1 = new Organization("ISEP");

        //act + assert
        assertThrows(Exception.class, () -> new Inventory("",10, "Porto",organization1));

    }

    // Criar o objeto com minus 0 quantity
    @Test
    public void Minus0InvetoryQuantityDontCreateInventory() throws Exception {

        //arrange
        Organization organization1 = new Organization("ISEP");

        //act + assert
        assertThrows(Exception.class, () -> new Inventory("Cadeira1",-1, "Porto",organization1));

    }

    // Criar o objeto com null location
    @Test
    public void NullInvetoryLocationDontCreateInventory() throws Exception {

        //arrange
        Organization organization1 = new Organization("ISEP");

        //act + assert
        assertThrows(Exception.class, () -> new Inventory("Cadeira1",10, null,organization1));

    }

    // Criar o objeto com Blank location
    @Test
    public void BlankInvetoryLocationDontCreateInventory() throws Exception {

        //arrange
        Organization organization1 = new Organization("ISEP");

        //act + assert
        assertThrows(Exception.class, () -> new Inventory("Cadeira1",10, "",organization1));

    }

    // Criar o objeto com null organization
    @Test
    public void NullInvetoryOrganizationDontCreateInventory() throws Exception {

        //arrange

        //act + assert
        assertThrows(Exception.class, () -> new Inventory("Cadeira1",10, "Porto",null));

    }

    @Test
    public void addElementToInvetory() throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");

        Inventory inventory1= new Inventory("Cadeira1",2,"Porto",organization1);
        inventory1._listaDeItens = new ArrayList<>();

        // act
        inventory1.adicionarItem(inventory1);

        //Assert
        assertTrue(inventory1._listaDeItens.contains(inventory1), "The item was added to list.");}

    @Test
    public void changeElementToInvetory() throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");

        Inventory inventory1= new Inventory("Cadeira1",2,"Porto",organization1);

        // act
        inventory1.changeQuantity(4);

        //Assert
        assertEquals(4,inventory1.get_quantity());
    }

    @Test
    public void removeElementToInvetory() throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");
        Inventory inventory1= new Inventory("Cadeira1",2,"Porto",organization1);
        inventory1._listaDeItens = new ArrayList<>();


        // act
        inventory1._listaDeItens.add(inventory1);
        inventory1.changeQuantity(-1);
        Boolean result = inventory1.removeItem(inventory1);

        //Assert
        assertTrue(result);
    }

    @Test
    public void DontremoveElementOfInvetory() throws Exception{
        //arrange
        Organization organization1 = new Organization("ISEP");
        Inventory inventory1= new Inventory("Cadeira1",2,"Porto",organization1);
        inventory1._listaDeItens = new ArrayList<>();


        // act
        inventory1._listaDeItens.add(inventory1);
        inventory1.changeQuantity(10);
        Boolean result = inventory1.removeItem(inventory1);

        //Assert
        assertFalse(result);
    }
    }




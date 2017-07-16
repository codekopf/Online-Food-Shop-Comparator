package Item;

import java.util.List;

public class ItemDaoImp implements ItemDao {

   List<Item> items;
   
   @Override
   public void deleteItem(Item item) {
      items.remove(item.getId());
      System.out.println("Item: Id " + item.getId() + ", deleted from database");
   }

   @Override
   public List<Item> getAllItems() {
      return items;
   }

   @Override
   public Item getItem(int id) {
      return items.get(id);
   }

   @Override
   public void updateItem(Item item) {
      items.get(item.getId()).setName(item.getName());
      System.out.println("Item: Id " + item.getId() + ", updated in the database");
   }
}
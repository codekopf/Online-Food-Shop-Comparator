package Item;

import java.util.List;

public interface ItemDao {
	public List<Item> getAllItems();
	public Item getItem(int id);
	public void updateItem(Item item);
	public void deleteItem(Item item);
}

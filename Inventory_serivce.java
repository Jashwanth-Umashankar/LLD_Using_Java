class InventoryService {
    private Map<String, Integer> inventory = new HashMap<>();

    public void addItem(String item, int quantity) {
        inventory.put(item, inventory.getOrDefault(item, 0) + quantity);
    }

    public void updateItem(String item, int quantity) {
        if (inventory.containsKey(item)) {
            inventory.put(item, quantity);
        }
    }

    public Map<String, Integer> listInventory() {
        return inventory;
    }
}

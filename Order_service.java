class OrderService {
    private InventoryService inventoryService;
    private List<String> cart = new ArrayList<>();

    public OrderService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public void addToCart(String item) {
        cart.add(item);
    }

    public boolean buyItem() {
        for (String item : cart) {
            if (!inventoryService.listInventory().containsKey(item) || inventoryService.listInventory().get(item) <= 0) {
                return false;
            }
        }
        for (String item : cart) {
            inventoryService.updateItem(item, inventoryService.listInventory().get(item) - 1);
        }
        cart.clear();
        return true;
    }
}

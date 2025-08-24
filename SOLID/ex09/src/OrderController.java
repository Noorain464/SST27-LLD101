public class OrderController {
    OrderRepository repo;
    public OrderController(OrderRepository repo){
        this.repo = repo;
    }
    void create(String id){
        // SqlOrderRepository repo = new SqlOrderRepository(); // hard dependency
        repo.save(id);
        System.out.println("Created order: " + id);
    }
}
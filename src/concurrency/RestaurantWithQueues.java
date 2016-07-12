package concurrency;
//This is given to the waiter, who gives it to the chef:
public class RestaurantWithQueues {
	class order { // (A data-transfer object)
		private static int counter = 0;
		private final Customer customer;
		private final WaitPerson waitPerson;
		private final Food  food;
		public Order(Customer custome, WaitPerson wp, Food f) {
				this.customer = customer;
				waitPerson = wp;
				food = f;
		}
	}

}
//This is what comes back from the chef:
 class Plate {
	 private final Order order;
	 private final Food food;
	 public Plate(Order ord, Food f) {
		 order = ord;
		 food = f;
	 }
	 public Order getOrder() {return order;}
	 public Food getFood() {
		 return food;
	 }
	 public String toString() {
		 return food.toString();
	 }
	 
 }
 
 class Customer implements Runnable {
	 
 }
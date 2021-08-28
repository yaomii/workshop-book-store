package demo;

public class Customer {
    public static void main(String[] arg) {

        Customer customer = new Customer();

        BookStore bookstore = new BookStore();
        bookStore.buy(customer);
    }

    private void buy(Customer customer) {
        Book book1 = new book();
        Book book2 = new book();

        // Add book to cart
        Cart cart = new Cart();


        // Calculate max discount
        Discount discount = new Discount();
        int maxDiscountPrice = discount.calculate(cart);

        // CheckOut
        Checkout checkout = new Checkout();
        checkout.process(cart, new Payment(), new Shiping());
    }
}

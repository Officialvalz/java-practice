enum ProductCategory {
    ELECTRONICS, GROCERIES, UTENSILS, CLOTHING
}

enum CardType {
    MASTERCARD, VISA, VERVE, AMERICAN_EXPRESS
}

class Address {
    String cityName;
    String countryName;
    String houseNumber;
    String street;
    String state;
}

class CreditCard {
    String cvv;
    int expiryMonth;
    int expiryYear;
    String cardNumber;
    String nameOnCard;
    CardType cardType;
}

class BillingInfo {
    String receiverPhone;
    String receiverName;
    Address deliveryAddress;
    CreditCard creditCard;
}

class Product {
    String productId;
    String productName;
    double price;
    String description;
    ProductCategory category;
}

class Item {
    int quantity;
    Product product;
}

class ShoppingCart {
    Item[] items;
}

class User {
    int age;
    String email;
    Address homeAddress;
    String name;
    String password;
    String phone;
}

class Customer extends User {
    BillingInfo[] billingInfos;
    ShoppingCart cart;
}

class Seller extends User {
}

class Admin extends User {
}

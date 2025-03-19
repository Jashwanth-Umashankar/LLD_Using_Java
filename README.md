# LLD_Using_Java
The main concept here is to create a Low Level design Model using java.
This project features an Online Shoping interface Where there exists four different modules.

1.Profile Service
  We have implemented three different method in this class:
  method-1:register()
      To register a new user to the interface.
      Using java Hashmap to store user_id and encrypted password.
  method-2:login()
      to login a new user if the provided value mayches the data in dictionary.
      Compares the user_id and password to the one that is stored in the Hashmap.
  method-3:encryptpassword()
      to encrypt the password using base64 method.
      for security purpose.
      
2.Inventory Service
  This class is used for managing the intems in the inventory.
  method-1:additem()
      used to add items to the inventory with the help of a Hashmap with Item and Quantity.
  method-2: updateitem()
      This method is used to update the items in the inventory.
  method-3:Inventory()
      This method is used to view the Inventory.
      
3.Order Service
  The OrderService class is responsible for handling the shopping cart and purchasing process in our online      shopping platform. It consists of two main methods.
  method-1:addtocart()
      This method is used to add items to the shopping cart.
  method-2:buyitem()
      this method is used to but the items from the cart which reduces the quantity of the items from the  
      inventory
      
4.Payment Service
  The payment service class is responsible for making payment to the items bought
  method-1:makepayment()
      This method helps to make payment and verify the payment.

package com.sua.pizza_pos_fp_modular
package pos

import pos.models._
import pos.services.PizzaService

object MainDriver extends App {
  // Create a PizzaService instance to call its functions
  object PizzaService extends PizzaService
  import PizzaService._

  // a. Create a sample address
  val address = Address(
    "1 Main Street",
    None,
    "Talkeetna",
    "AK",
    "99676"
  )

  // b. Create a sample customer
  val customer = Customer(
    "Sergio Benitez",
    "907-555-2121",
    address
  )

  // c. Create an order for the customer
  val orderNo1 = Order(
    Seq[Pizza](),
    customer
  )

  // d. Create a pizzas
  val pizzaNo1 = Pizza(
    MediumCrustSize,
    RegularCrustType,
    Seq(Cheese)
  )

  val pizzaNo2 = Pizza(
    SmallCrustSize,
    RegularCrustType,
    Seq(Cheese)
  )

  // e. Add a new pizza to the an existing order.
  val pizzas1 = orderNo1.pizzas :+ pizzaNo1

  // f. Create a second order as copy of the first one
  val orderNo2 = orderNo1.copy(pizzas = pizzas1)

  // g. Test the PizzaServices function
  val pizzaNo2WithPepperoni = addTopping(pizzaNo2, Pepperoni)
  val pizzaNo2WithPepperoniAndMushrooms = addTopping(
    pizzaNo2WithPepperoni,
    Mushrooms
  )
  val pizzaNo2WithPepperoniAndMushroomsOverThickCrust = updateCrustType(
    pizzaNo2WithPepperoniAndMushrooms,
    ThickCrustType
  )
  val pizzaNo2WithPepperoniAndMushroomsOverThickAndLargeCrust = updateCrustSize(
    pizzaNo2WithPepperoniAndMushroomsOverThickCrust,
    LargeCrustSize
  )
  // h. Update the second order with the pepperoni/mushrooms toppings and the
  // thick/large crust
  val pizzas2 = orderNo2.pizzas :+ pizzaNo2WithPepperoniAndMushroomsOverThickAndLargeCrust

  // i. Create a third order and check their contents
  val orderNo3 = orderNo2.copy(pizzas = pizzas2)
  println(orderNo3)

  // j. Test function composition.
  val pizzaComposition = updateCrustSize(
    updateCrustType(
      addTopping(
        addTopping(pizzaNo2, Pepperoni),
        Mushrooms
      ),
      ThickCrustType
    ),
    LargeCrustSize
  )

  // k. Calculate the price of the current order (o3) using the
  import com.sua.pizza_pos_fp_modular.pos.services.MockDatabaseOrderService.calculateOrderPrice

  val orderPrice = calculateOrderPrice(orderNo3)
  println(s"Order Price = $orderPrice")

  // l. Remove a topping
  val completePizza = Pizza(
      MediumCrustSize,
      RegularCrustType,
      Seq(Cheese, Pepperoni, Pepperoni, Sausage)
  )

  val pizzaWithounPepperoni = removeTopping(completePizza, Pepperoni)
  println("\nSHOULD BE Cheese/Pepperoni/Sausage:")
  println(pizzaWithounPepperoni)
}
package com.sua.pizza_pos_oop
package simple_oop

import scala.collection.mutable.ArrayBuffer

class Order {
  // an order contains a list of pizzas
  val pizzas = ArrayBuffer[Pizza]()

  // could be a constructor parameter *if* you always create
  // a costumer before creating an order
  var customer: Customer = null

  def addPizzaToOrder(p: Pizza): Unit = {
    pizzas += p
  }

  def removePizzaFromOrder(p: Pizza): Unit = {
    pizzas -= p
  }

  def calculateOrderPrice(): Money = ???
  def getBasePrice(): Money = ???
  def getTaxes(): Money = ???
  def getTotalPrice(): Money = ???
}

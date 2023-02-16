package com.sua.pizza_pos_fp_modular
package pos.services

import pos.database.PizzaDaoInterface
import com.sua.pizza_pos_fp_modular.Money
import pos.models.{CrustSize, CrustType, Order, Topping}

trait OrderServiceInterface {
  /**
   * Implementing classes should provide their own database
   * that is an instance of the PizzaDaoInterface, such as
   * MockPizzaDao, TestPizzaDao, or PorductPizzaDao
   * @return
   */
  protected def database: PizzaDaoInterface

  def calculatorOrderPrice(o: Order): Money
}
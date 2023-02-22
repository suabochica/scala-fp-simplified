package com.sua.pizza_pos_fp_modular.pos
package services

import com.sua.pizza_pos_fp_modular.Money
import com.sua.pizza_pos_fp_modular.pos.database.MockPizzaDao
import com.sua.pizza_pos_fp_modular.pos.models.Order

object MockDatabaseOrderService extends AbstractOrderService {
  val database = MockPizzaDao

  override def calculateOrderPrice(o: Order): Money = ???
}
